package com.saitejn.controller;


import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.saitejn.pojo.JbClassinfor;
import com.saitejn.pojo.JbUserifo;
import com.saitejn.pojo.JbuserInfoVo;
import com.saitejn.services.UserServices;
import com.saitejn.services.impl.RegisterValidateService;

/**
 * 用户信息控制类
 * @class UserController.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-9-14
 */
@Controller
public class UserController {
	@Autowired
	private UserServices userServices;
	@Resource  
    private RegisterValidateService service;  
	private String classinfo;
	private String jy_classinfo;
	@RequestMapping("/tologin")
	public String tologin ()throws Exception{
		return "login";
	}
	@RequestMapping("/dologin")
	public String dologin(Model model ,HttpSession session,JbUserifo jbUserifo,HttpServletRequest request, HttpServletResponse response)throws Exception{
		boolean logintype = userServices.login(jbUserifo.getUloginname(), jbUserifo.getUloginpass());
		JbUserifo jbuser = userServices.ulogin(jbUserifo.getUloginname());
			if(logintype){
				session.setAttribute("user", jbuser);
				Date date = new Date();
				String sdate=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(date); 
				int uid = jbuser.getUid();
				userServices.updateloginTime(sdate, uid);
				Cookie cookie = new Cookie("user_name", jbuser.getUloginname());
				cookie.setMaxAge(43200);
				response.addCookie(cookie);
				return "redirect:/index.action";
			}else{
			 model.addAttribute("errorMessage", "提示 : 用户名或密码错误");
			request.setAttribute("message", "用户名密码错误");
			Cookie[] cookies = request.getCookies();
			if(cookies != null && cookies.length >0){
				for(Cookie cookie :cookies){
					String cookieName = cookie.getName();
					if("user_name".equals(cookieName)){
						String val = cookie.getValue();
					}
				}
		
			}
			 return "login";
		}
	}
	@RequestMapping("/loginout")
	public String loginout(HttpSession session)throws Exception{
		JbUserifo userifo = (JbUserifo) session.getAttribute("user");
		if(userifo !=null){
			Date date = new Date();
			String sdate=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(date); 
			int uid = userifo.getUid();
			userServices.updateExitTime(sdate, uid);
			session.removeAttribute("user");
		}
		return "redirect:/tologin.action";
	}
	@RequestMapping("/register")
	public String register()throws Exception{
		return "tregister";
	}
	@RequestMapping("/doregister")
	public String doregister(JbuserInfoVo jbuserInfoVo)throws Exception{
		jbuserInfoVo.setUloginname(jbuserInfoVo.getJbUserifo().getUloginname());
		jbuserInfoVo.setUloginpass(jbuserInfoVo.getJbUserifo().getUloginpass());
		jbuserInfoVo.setUtruename(jbuserInfoVo.getJbUserifo().getUtruename());
		jbuserInfoVo.setCompany(jbuserInfoVo.getJbUserifo().getCompany());
		userServices.register(jbuserInfoVo);
		return "redirect:/index.action";
	}
	@RequestMapping("/jy_toupUifo")
	public String tojyupUifo(HttpSession session)throws Exception{
		 JbUserifo userifo =  (JbUserifo) session.getAttribute("user");
		return "jy/jy_toupUifo";
	}
	@RequestMapping("/jy_tojyuppassUifo")
	public String tojyuppassUifo(HttpSession session)throws Exception{
		return "jy/jy_change_pass";
	}
	@RequestMapping("/doUpIfo")
	public String doUpIfo(JbUserifo jbUserifo,String userloginname,String username,String uloginpass,String morshi[],String aftshi[],String eveshi[],HttpSession session)throws Exception{
		 JbUserifo userifo =  (JbUserifo) session.getAttribute("user");
		   int uid = userifo.getUid();
		   userServices.updateUserifo(jbUserifo);
		return "redirect:/tologin.action";
	}
	@RequestMapping("/checkvaliateUserInpuName")
    public void checkUserName(String userloginname,HttpServletRequest request, HttpServletResponse response,HttpSession session)throws Exception{
		 JbUserifo userifo =  (JbUserifo) session.getAttribute("user");
		 String now_uname = userifo.getUloginname();
		List<JbUserifo> userList = userServices.selectAlljbUser();
		List<String> usernameList = new ArrayList<String>();	
		for(JbUserifo username:userList){
			usernameList.add(username.getUloginname());
			System.out.println(username.getUloginname());
		}
		usernameList.remove(now_uname);
		String username = request.getParameter("userloginname");
		String result = null;
		if(usernameList.contains(username)){
			result = "<font color = 'red'>用户名已存在</font>";
		}else{
			result = "<font color = 'green'>用户名可使用</font>";
		}
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(result);

	}
	@RequestMapping("/jy_doUpIfo")
	public String doJyUpIfo(@RequestParam("file") MultipartFile file,JbUserifo jbUserifo,
			String morshi[],String aftshi[],String eveshi[],HttpSession session)throws Exception{
	   JbUserifo userifo =  (JbUserifo) session.getAttribute("user");
	   int uid = userifo.getUid();
	   userifo.setUloginname(jbUserifo.getUloginname());
	   userifo.setUtruename(jbUserifo.getUtruename());
	   userifo.setSex(jbUserifo.getSex());
	   userifo.setUphone(jbUserifo.getUphone());
	   userifo.setEmail(jbUserifo.getEmail());
	  if(!file.isEmpty()){
			String file_path = "E:\\myeclipse10\\upload\\temp\\images\\";
			String OriginalFilename = file.getOriginalFilename();
			String newFileName = UUID.randomUUID()+OriginalFilename.substring(OriginalFilename.lastIndexOf("."));
			File newFile = new File(file_path+newFileName);
			file.transferTo(newFile);
			userifo.setHeadimage(newFileName);
	  }
	   userServices.updateUserifo(userifo);
		return "redirect:/loginout.action";
	}
	@RequestMapping("/jf_doUponlyIfo")
	public void doJfUpIfo(@RequestParam("file") MultipartFile file,
			HttpSession session,HttpServletResponse response,
			String usercode ,String  utruename ,String sex ,String uphone ,String  email )throws Exception{
	   JbUserifo userifo =  (JbUserifo) session.getAttribute("user");
	   userifo.setUloginname(usercode);
	   userifo.setUtruename(utruename);
	   userifo.setSex(sex);
	   userifo.setUphone(uphone);
	   userifo.setEmail(email);
	  if(!file.isEmpty()){
			String file_path = "E:\\myeclipse10\\upload\\temp\\images\\";
			String OriginalFilename = file.getOriginalFilename();
			String newFileName = UUID.randomUUID()+OriginalFilename.substring(OriginalFilename.lastIndexOf("."));
			File newFile = new File(file_path+newFileName);
			file.transferTo(newFile);
			userifo.setHeadimage(newFileName);
	  }
	   userServices.updateUserifo(userifo);
	   String jsonstr = "ok";
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(jsonstr);
	  
	}
	public  void classplay(String dateFirst, String dateSecond){
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		  String mon = classinfo.substring(0,9);
		   String emon = mon.substring(0, 3);
		   System.out.println("======="+mon);
		   String aft = classinfo.substring(9, 18);
		   String eaft = aft.substring(0,3);
		   System.out.println("======="+aft);
		   String eve = classinfo.substring(18,27);
		   String eeve = eve.substring(0,3);
		   System.out.println("======="+eve);
	        try{
	            Date dateOne = dateFormat.parse(dateFirst);
	            Date dateTwo = dateFormat.parse(dateSecond);
	            Calendar calendar = Calendar.getInstance();
	            calendar.setTime(dateOne);
	            int i = 0;
	            String classinfo = "";
	            System.out.println("时间日期"+"                   早班"+"          中班"+"           晚班");
	            while(calendar.getTime().before(dateTwo)){               
	             
	               i++;
	               if(i%9 ==7||i%9 ==8||i%9 ==0){
	            	   classinfo = eeve;
	   			}
	               if(i%9 ==1||i%9 ==2||i%9 ==3){
	   			 classinfo = emon;
	   			}
	   			if(i%9 ==4||i%9 ==5||i%9 ==6){
	   			 classinfo = eaft;
	   			}
	   			String eemon = classinfo.substring(0, 1);
	   			int cmon = Integer.parseInt(eemon);
	   			String eeaft = classinfo.substring(1, 2);
	   			int caft = Integer.parseInt(eeaft);
	   			String eeeve = classinfo.substring(2, 3);
	   			int ceve = Integer.parseInt(eeeve);
	   			System.out.println(dateFormat.format(calendar.getTime())+"        "+cmon+"             "+caft+"                   "+ceve);
	                JbClassinfor jbClassinfor = new JbClassinfor();
	                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	                Date date = sdf.parse(dateFormat.format(calendar.getTime()));
	                jbClassinfor.setClass_time(date);
	                jbClassinfor.setMorclass(cmon);
	                jbClassinfor.setAftclass(caft);
	                jbClassinfor.setEveclass(ceve);
	                userServices.saveClassifo(jbClassinfor);
	                calendar.add(Calendar.DAY_OF_MONTH, 1);               
	            }
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	      
	}
	public  void classjyplay(String dateFirst, String dateSecond){
		   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		   String mon = classinfo.substring(0,9);
		   String emon = mon.substring(0, 3);
		   System.out.println("======="+mon);
		   String aft = classinfo.substring(9, 18);
		   String eaft = aft.substring(0,3);
		   System.out.println("======="+aft);
		   String eve = classinfo.substring(18,27);
		   String eeve = eve.substring(0,3);
		   System.out.println("======="+eve);
	        try{
	            Date dateOne = dateFormat.parse(dateFirst);
	            Date dateTwo = dateFormat.parse(dateSecond);
	             
	            Calendar calendar = Calendar.getInstance();
	             
	            calendar.setTime(dateOne);
	            int i = 0;
	            String classinfo = "";
	            System.out.println("时间日期"+"                   早班"+"          中班"+"           晚班");
	            while(calendar.getTime().before(dateTwo)){               
	             
	               i++;
	               if(i%9 ==7||i%9 ==8||i%9 ==0){
	            	   classinfo = eeve;
	   			}
	               if(i%9 ==1||i%9 ==2||i%9 ==3){
	   			 classinfo = emon;
	   			}
	   			if(i%9 ==4||i%9 ==5||i%9 ==6){
	   			 classinfo = eaft;
	   			}
	   			String eemon = classinfo.substring(0, 1);
	   			int cmon = Integer.parseInt(eemon);
	   			String eeaft = classinfo.substring(1, 2);
	   			int caft = Integer.parseInt(eeaft);
	   			String eeeve = classinfo.substring(2, 3);
	   			int ceve = Integer.parseInt(eeeve);
	   			
	   			System.out.println(dateFormat.format(calendar.getTime())+"        "+cmon+"             "+caft+"                   "+ceve);
	                JbClassinfor jbClassinfor = new JbClassinfor();
	                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	                Date date = sdf.parse(dateFormat.format(calendar.getTime()));
	                jbClassinfor.setClass_time(date);
	                jbClassinfor.setMorclass(cmon);
	                jbClassinfor.setAftclass(caft);
	                jbClassinfor.setEveclass(ceve);
	                userServices.saveClassifo(jbClassinfor);
	                calendar.add(Calendar.DAY_OF_MONTH, 1);               
	            }
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	      
	}
	@RequestMapping("/tosendemail")
	public String testsendemail(Model model )throws Exception{
		return  "registerEmailValidae";
	}
	 @RequestMapping("/uppassword")  
	    public ModelAndView  load(HttpServletRequest request,HttpServletResponse response) throws ParseException{  
	    	    ModelAndView mav=new ModelAndView();  
	             //数据库根据账户查询邮箱，
	            //注册  
	            String email = request.getParameter("email");  
	            service.processregister(email);//发邮箱激活  
	            mav.addObject("text","注册成功");  
	            mav.setViewName("register_success");  
	        return mav;  
	    }  
	    @RequestMapping("/updatePassord")
	    public String updatePassord()throws Exception{
	    	return "activate_success";
	    }
	

}
