package com.saitejn.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.saitejn.pojo.FileUpInfo;
import com.saitejn.pojo.JbUserifo;
import com.saitejn.pojo.JyFileupifo;
import com.saitejn.pojo.JyRawdataHandle1;
import com.saitejn.pojo.JyUploadMiddle;
import com.saitejn.services.JY_UploadServices;
import com.saitejn.services.JyRawdataHandle1Services;

/**
 * 玖源
 * @author Administrator
 *
 */
@Controller
public class JYUploadController {
	@Autowired
	private JY_UploadServices jy_UploadServices;
	@Autowired
	private JyRawdataHandle1Services jyRawdataHandle1Services;
	 int number =0;
	   //去文件上传页面
		@RequestMapping("/jytoupload")
		public String toupload()throws Exception{
			return "jy/jy_upload";
		}
		@RequestMapping("/jyfileUpload")
		public String TestUpload(@RequestParam("file") MultipartFile[] file,Model model,HttpSession session)throws Exception{
			//判断文件是否为空
			//int number = jyDataServices.isSameDate("2015-09-10 08:00:03");
			System.out.println(number);
			if(file != null){
				//存储文件的 路径
				String file_path = "E:\\myeclipse10\\upload\\temp\\file\\jy\\";
				for(int i = 0; i<file.length;i++){
					String OriginalFilename = file[i].getOriginalFilename();
					String newFileName = UUID.randomUUID()+OriginalFilename.substring(OriginalFilename.lastIndexOf("."));
					File newFile = new File(file_path+newFileName);
					file[i].transferTo(newFile);
					Date nowtime  = new Date();
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String uptime =   format.format(nowtime);
					JbUserifo user = (JbUserifo) session.getAttribute("user");
					String upperson = user.getUtruename();
					String upname = OriginalFilename;
					String fileename = newFileName;
					String filtype = "未处理";
					JyFileupifo fileupifo = new JyFileupifo();
					fileupifo.setFileename(fileename);
					fileupifo.setFiltype(filtype);
					fileupifo.setUpname(upname);
					fileupifo.setUpperson(upperson);
					fileupifo.setUptime(uptime);
				}
			}
		
			return "redirect:/jytoupload.action";
		}
	/*去文件的上传页面*/
	@RequestMapping("/jy_toUpload")
	public String jy_toUpload(Model model,HttpSession session)throws Exception{
		JyRawdataHandle1 jyRawdataHandle1 = jy_UploadServices.getLastTime_jy();
		if(jyRawdataHandle1 != null){
			Date time =  jyRawdataHandle1.get时间();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
			String db_endtime = sdf.format(time);
			session.setAttribute("db_endtime", db_endtime);
		}
		return "jy/jy_toUpload";
	}
	/*文件上传完成后*/
	@RequestMapping("jy_toUploadType")
	public String jy_toUploadType(Model model)throws Exception{
		JyRawdataHandle1 jyRawdataHandle1 = jy_UploadServices.getLastTime_jy();
		if(jyRawdataHandle1 != null){
			Date time =  jyRawdataHandle1.get时间();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
			String db_newendtime = sdf.format(time);
			model.addAttribute("db_newendtime",db_newendtime);
		}
		return "jy/jy_toUploadType";
	}
	//处理文件上传
	@RequestMapping("/jy_doUploadFile")
	public void jy_doUploadFile(@RequestParam("jy_file") MultipartFile[] file,Model model,HttpSession session)throws Exception{
		if(file != null){
			String file_path = "E:\\myeclipse10\\upload\\temp\\file\\jy\\";
			for(int i = 0; i<file.length;i++){
				String OriginalFilename = file[i].getOriginalFilename();
				String preff = OriginalFilename.substring(0,OriginalFilename.lastIndexOf("."));
				String newFileName =preff+UUID.randomUUID()+OriginalFilename.substring(OriginalFilename.lastIndexOf("."));
				File newFile = new File(file_path+newFileName);
				file[i].transferTo(newFile);
				Date nowtime  = new Date();
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String uptime =   format.format(nowtime);
				JbUserifo user = (JbUserifo) session.getAttribute("user");
				String upperson = user.getUtruename();
				String upname = OriginalFilename;
				String fileename = newFileName;
				String filtype = "未处理";
				FileUpInfo fileupifo = new FileUpInfo();
				fileupifo.setFileename(fileename);
				fileupifo.setFiltype(filtype);
				fileupifo.setUpname(upname);
				fileupifo.setUpperson(upperson);
				fileupifo.setUptime(uptime);
				String filePath = newFile.toString();
				String fileyear = upname.substring(17, 21);
				 List<JyUploadMiddle> datalist =  jy_UploadServices.readExcel_jy(filePath,fileyear);
				 for(JyUploadMiddle jb : datalist){
					 JyUploadMiddle jbExcelMiddle = jb;
					 jy_UploadServices.insertDataToMiddle_jy(jbExcelMiddle);
					 jy_UploadServices.insertDataToExcel_jy(jbExcelMiddle);
				 }
			}
		}
		jy_UploadServices.insertDataToHand1_jy();
		jy_UploadServices.insertDataToHand2_jy();
		jy_UploadServices.deleterawdataMiddle_jy();
		jy_UploadServices.deleteUploadMiddle_jy();
		
	}
	 //处理日报表(页面已加载后表格中的数据)
	@RequestMapping("/jy_to_show_day_data")
	public String selectDataForDay(String date_begin,String date_end,Model model,@RequestParam(value="page", defaultValue="1") Integer page )throws Exception{
		if(date_begin == null && date_end == null ){
			JyRawdataHandle1 jyRawdataHandle1 = jyRawdataHandle1Services.getLastTime();
			if(jyRawdataHandle1 != null){
				Date time =  jyRawdataHandle1.get时间();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
				String db_endtime = sdf.format(time);
				String year_mouth = db_endtime.substring(0,7);
				String n_begin_time = year_mouth+"-01 00:00:00";
				String n_end_time = db_endtime;
				List<JyRawdataHandle1> dayList = jyRawdataHandle1Services.selectDataByContidion(n_begin_time, n_end_time);
				if(dayList.size()>0){
					model.addAttribute("dayList", dayList);
					//按班查看
					List<JyRawdataHandle1> monList = jyRawdataHandle1Services.selectDataByContidionAndClass(n_begin_time, n_end_time);
					model.addAttribute("monList", monList);
					model.addAttribute("edate_begin", n_begin_time.substring(0, 10));
					model.addAttribute("edate_end", n_end_time.substring(0, 10));
				}
			}
		}
		return "jy/jy_chart_day";
	}
	//处理月报表(页面已加载后表格中的数据)
	@RequestMapping("/jy_do_select_Mouth")
	public String selectDataByMouth(String mouth_date_begin,Model model)throws Exception{
		//获取用户输入的年月
		//截取字符串，分别获取年，和 月
		if(mouth_date_begin == null){
			JyRawdataHandle1 jfRawdataHandle1 = jyRawdataHandle1Services.getLastTime();
			if(jfRawdataHandle1 != null){
				Date time =  jfRawdataHandle1.get时间();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
				String db_endtime = sdf.format(time);
				String year_mouth = db_endtime.substring(0,7);
				String n_begin_time = year_mouth+"-01 00:00:00";
				String n_end_time = db_endtime;
				List<JyRawdataHandle1> mouthList = jyRawdataHandle1Services.selectDataByMouth(n_begin_time, n_end_time);
				model.addAttribute("mouthList", mouthList);
				//用户输入查询条件为空
				List<JyRawdataHandle1> mouthClassList = jyRawdataHandle1Services.selectDataByMouthAndClass(n_begin_time, n_end_time);
				model.addAttribute("mouthClassList", mouthClassList);
				model.addAttribute("edate_begin", n_begin_time.substring(0, 7));
			}
		}
		return "jy/jy_chart_month";
		
	}
	//处理年报表(页面已加载后表格中的数据)
	@RequestMapping("/jy_do_select_Year")
	public String selectDataByYear(String Year_data_begin,Model model)throws Exception{
		if(Year_data_begin == null){
			JyRawdataHandle1 jbRawdataHandle1 = jyRawdataHandle1Services.getLastTime();
			if(jbRawdataHandle1 != null){
				Date time =  jbRawdataHandle1.get时间();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
				String db_endtime = sdf.format(time);
				String year_mouth = db_endtime.substring(0,4);
				String begin_time = year_mouth+"-01-01 00:00:00";
				String end_time = year_mouth+"-12-31 23:59:59";
				List<JyRawdataHandle1> yearList = jyRawdataHandle1Services.selectDataByYear(begin_time, end_time);
				model.addAttribute("yearList", yearList);
				model.addAttribute("year_db", year_mouth);
			}
			
		}
		return "jy/jy_chart_year";
	}
	//处理季度报表(页面已加载后表格中的数据)
	@RequestMapping("/jy_do_select_Quarter")
	public String selectDateByQuarter(String Quarter_year,String Quarter,Model model)throws Exception{
	if((Quarter_year==null)||(Quarter == null)){
			JyRawdataHandle1 jyRawdataHandle1 = jyRawdataHandle1Services.getLastTime();
			if(jyRawdataHandle1 != null){
				Date time =  jyRawdataHandle1.get时间();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
				String db_endtime = sdf.format(time);
				String year_mouth = db_endtime.substring(5,7);
				Integer quarter_u = Integer.parseInt(year_mouth);
				
				if(1 <= quarter_u && quarter_u <= 3 ){
					String new_end_QueryTime = db_endtime;
					String end_QueryTime = db_endtime.substring(0, 4);
					String new_begin_query_time = end_QueryTime+"-01-01 00:00:00";
					List<JyRawdataHandle1> quaryList = jyRawdataHandle1Services.selectDataByQuarter(new_begin_query_time, new_end_QueryTime);
					model.addAttribute("quaryList", quaryList);
					model.addAttribute("quarter_text", "第一季度");
					model.addAttribute("year_text", end_QueryTime);
				}
				if(4 <= quarter_u && quarter_u <= 6 ){
					String new_end_QueryTime = db_endtime;
					String end_QueryTime = db_endtime.substring(0, 4);
					String new_begin_query_time = end_QueryTime+"-04-01 00:00:00";
					List<JyRawdataHandle1> quaryList = jyRawdataHandle1Services.selectDataByQuarter(new_begin_query_time, new_end_QueryTime);
					model.addAttribute("quaryList", quaryList);
					model.addAttribute("quarter_text", "第二季度");
					model.addAttribute("year_text", end_QueryTime);
				}
				if(7 <= quarter_u && quarter_u <= 9 ){
					String new_end_QueryTime = db_endtime;
					String end_QueryTime = db_endtime.substring(0, 4);
					String new_begin_query_time = end_QueryTime+"-07-01 00:00:00";
					List<JyRawdataHandle1> quaryList = jyRawdataHandle1Services.selectDataByQuarter(new_begin_query_time, new_end_QueryTime);
					model.addAttribute("quaryList", quaryList);
					model.addAttribute("quarter_text", "第三季度");
					model.addAttribute("year_text", end_QueryTime);
				}
				if(10 <= quarter_u && quarter_u <= 12 ){
					String new_end_QueryTime = db_endtime;
					String end_QueryTime = db_endtime.substring(0, 4);
					String new_begin_query_time = end_QueryTime+"-10-01 00:00:00";
					List<JyRawdataHandle1> quaryList = jyRawdataHandle1Services.selectDataByQuarter(new_begin_query_time, new_end_QueryTime);
					model.addAttribute("quaryList", quaryList);
					model.addAttribute("quarter_text", "第四季度");
					model.addAttribute("year_text", end_QueryTime);
				}
			}
			
		}
		return "jy/jy_chart_season";
	}
	
	//AJAX处理日报表
    //处理日报表,AJAX按日查看
		@RequestMapping("/jy_to_show_day_day_ajax")
		public void selectDataForDayAjax(String isdate,HttpServletResponse response,String date_begin,String date_end,Model model,@RequestParam(value="message", defaultValue="1") String message )throws Exception{
			//拼接字符串
			if(date_begin != null && date_end != null ){
			String edate_begin = date_begin+" 00:00:00";
			String edate_end = date_end+" 23:59:59";
			List<JyRawdataHandle1> dayList = jyRawdataHandle1Services.selectDataByContidion(edate_begin, edate_end);
			ObjectMapper mapper =  new ObjectMapper();
			String jsonstr = mapper.writeValueAsString(dayList);
			response.setContentType("text/javascript;charset=UTF-8");
			response.getWriter().print(jsonstr);
			}else if(isdate.equals("1")){
				JyRawdataHandle1 jyRawdataHandle1 = jyRawdataHandle1Services.getLastTime();
				if(jyRawdataHandle1 != null){
					Date time =  jyRawdataHandle1.get时间();
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
					String db_endtime = sdf.format(time);
					String year_mouth = db_endtime.substring(0,7);
					String n_begin_time = year_mouth+"-01 00:00:00";
					String n_end_time = db_endtime;
					List<JyRawdataHandle1> dayList = jyRawdataHandle1Services.selectDataByContidion(n_begin_time, n_end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(dayList);
					response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
					
				}
			}
		}
		//AJAX处理按班查看
		@RequestMapping("/jy_to_show_day_data_ajax")
		public void selectDataForDayAJAX(String isdate,HttpServletResponse response,String date_begin,String date_end,Model model,@RequestParam(value="message", defaultValue="1") String message )throws Exception{
			//拼接字符串
			if(date_begin != null && date_end != null ){
			String edate_begin = date_begin+" 00:00:00";
			String edate_end = date_end+" 23:59:59";
			//按班查看
			List<JyRawdataHandle1> monList = jyRawdataHandle1Services.selectDataByContidionAndClass(edate_begin, edate_end);
			ObjectMapper mapper =  new ObjectMapper();
			String jsonstr = mapper.writeValueAsString(monList);
			response.setContentType("text/javascript;charset=UTF-8");
			response.getWriter().print(jsonstr);
			}else  if(isdate.equals("1")){
				JyRawdataHandle1 jyRawdataHandle1 = jyRawdataHandle1Services.getLastTime();
				if(jyRawdataHandle1 != null){
					Date time =  jyRawdataHandle1.get时间();
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
					String db_endtime = sdf.format(time);
					String year_mouth = db_endtime.substring(0,7);
					String n_begin_time = year_mouth+"-01 00:00:00";
					String n_end_time = db_endtime;
					//按班查看
					List<JyRawdataHandle1> monList = jyRawdataHandle1Services.selectDataByContidionAndClass(n_begin_time, n_end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(monList);
					response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
					}
				}
			}
		
		
		//处理月报表,按班查看指定年月，查询该月下的每一日AJAx
		@RequestMapping("/jy_to_show_month_class_ajax")
		public void selectDataByMouthAjax(String isdate,HttpServletResponse response,String mouth_date_begin,Model model)throws Exception{
			if(mouth_date_begin != null){
			String year = mouth_date_begin.substring(0,4);
			String mouth = mouth_date_begin.substring(5, 7);
			//字符串转为int
			int years = Integer.parseInt(year);
			int mouths = Integer.parseInt(mouth);
			System.out.println(year+mouth);
			//判断年是否为闰年
			if(years % 4 == 0 && years % 100 != 0 || years % 400 == 0){
				//如果为瑞年，判断用户输入的月是否为二月，29天
				if(mouths==2){
					String begin_time = mouth_date_begin+"-01 00:00:00";
					String end_time = mouth_date_begin+"-29 23:59:59";
					List<JyRawdataHandle1> mouthClassList = jyRawdataHandle1Services.selectDataByMouthAndClass(begin_time, end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(mouthClassList);
				response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
				}
				if(mouths == 1||mouths == 3||mouths == 5 || mouths == 7 || mouths == 8 || mouths == 10 || mouths == 12){
					String begin_time = mouth_date_begin+"-01 00:00:00";
					String end_time = mouth_date_begin+"-31 23:59:59";
					List<JyRawdataHandle1> mouthClassList = jyRawdataHandle1Services.selectDataByMouthAndClass(begin_time, end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(mouthClassList);
				response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
				}
				if(mouths == 4||mouths == 6|| mouths == 9|| mouths == 11){
					String begin_time = mouth_date_begin+"-01 00:00:00";
					String end_time = mouth_date_begin+"-30 23:59:59";
					
					List<JyRawdataHandle1> mouthClassList = jyRawdataHandle1Services.selectDataByMouthAndClass(begin_time, end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(mouthClassList);
				response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
				}
		       
			}else{
				//如果不为瑞年，判断用户输入的月是否为二月，28天
				if(mouths==2){
					String begin_time = mouth_date_begin+"-01 00:00:00";
					String end_time = mouth_date_begin+"-28 23:59:59";
					List<JyRawdataHandle1> mouthClassList = jyRawdataHandle1Services.selectDataByMouthAndClass(begin_time, end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(mouthClassList);
				response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
				}
				if(mouths == 1||mouths == 3||mouths == 5 || mouths == 7 || mouths == 8 || mouths == 10 || mouths == 12){
					String begin_time = mouth_date_begin+"-01 00:00:00";
					String end_time = mouth_date_begin+"-31 23:59:59";
					
					List<JyRawdataHandle1> mouthClassList = jyRawdataHandle1Services.selectDataByMouthAndClass(begin_time, end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(mouthClassList);
				response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
				}
				if(mouths == 4||mouths == 6|| mouths == 9|| mouths == 11){
					String begin_time = mouth_date_begin+"-01 00:00:00";
					String end_time = mouth_date_begin+"-30 23:59:59";
					List<JyRawdataHandle1> mouthClassList = jyRawdataHandle1Services.selectDataByMouthAndClass(begin_time, end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(mouthClassList);
				 response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
				}
			}
			}else  if(isdate.equals("1")){
				JyRawdataHandle1 jfRawdataHandle1 = jyRawdataHandle1Services.getLastTime();
				if(jfRawdataHandle1 != null){
					Date time =  jfRawdataHandle1.get时间();
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
					String db_endtime = sdf.format(time);
					String year_mouth = db_endtime.substring(0,7);
					String n_begin_time = year_mouth+"-01 00:00:00";
					String n_end_time = db_endtime;
					//用户输入查询条件为空
					List<JyRawdataHandle1> mouthClassList = jyRawdataHandle1Services.selectDataByMouthAndClass(n_begin_time, n_end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(mouthClassList);
				  response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
				}
			}
		}

		//处理月报表按日查看Ajax
		@RequestMapping("/jy_to_show_month_data_ajax")
		public void selectDataByMouthAjax_day(String isdate,HttpServletResponse response,String mouth_date_begin,Model model)throws Exception{
			if(mouth_date_begin != null){
			String year = mouth_date_begin.substring(0,4);
			String mouth = mouth_date_begin.substring(5, 7);
			//字符串转为int
			int years = Integer.parseInt(year);
			int mouths = Integer.parseInt(mouth);
			System.out.println(year+mouth);
			//判断年是否为闰年
			if(years % 4 == 0 && years % 100 != 0 || years % 400 == 0){
				//如果为瑞年，判断用户输入的月是否为二月，29天
				if(mouths==2){
					String begin_time = mouth_date_begin+"-01 00:00:00";
					String end_time = mouth_date_begin+"-29 23:59:59";
					List<JyRawdataHandle1> mouthList = jyRawdataHandle1Services.selectDataByMouth(begin_time, end_time);
					
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(mouthList);
				response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
				}
				if(mouths == 1||mouths == 3||mouths == 5 || mouths == 7 || mouths == 8 || mouths == 10 || mouths == 12){
					String begin_time = mouth_date_begin+"-01 00:00:00";
					String end_time = mouth_date_begin+"-31 23:59:59";
					List<JyRawdataHandle1> mouthList = jyRawdataHandle1Services.selectDataByMouth(begin_time, end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(mouthList);
				response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
					
				}
				if(mouths == 4||mouths == 6|| mouths == 9|| mouths == 11){
					String begin_time = mouth_date_begin+"-01 00:00:00";
					String end_time = mouth_date_begin+"-30 23:59:59";
					List<JyRawdataHandle1> mouthList = jyRawdataHandle1Services.selectDataByMouth(begin_time, end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(mouthList);
				response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
				}
		       
			}else{
				//如果不为瑞年，判断用户输入的月是否为二月，28天
				if(mouths==2){
					String begin_time = mouth_date_begin+"-01 00:00:00";
					String end_time = mouth_date_begin+"-28 23:59:59";
					List<JyRawdataHandle1> mouthList = jyRawdataHandle1Services.selectDataByMouth(begin_time, end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(mouthList);
				response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
				}
				if(mouths == 1||mouths == 3||mouths == 5 || mouths == 7 || mouths == 8 || mouths == 10 || mouths == 12){
					String begin_time = mouth_date_begin+"-01 00:00:00";
					String end_time = mouth_date_begin+"-31 23:59:59";
					List<JyRawdataHandle1> mouthList = jyRawdataHandle1Services.selectDataByMouth(begin_time, end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(mouthList);
				response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
					
				}
				if(mouths == 4||mouths == 6|| mouths == 9|| mouths == 11){
					String begin_time = mouth_date_begin+"-01 00:00:00";
					String end_time = mouth_date_begin+"-30 23:59:59";
					List<JyRawdataHandle1> mouthList = jyRawdataHandle1Services.selectDataByMouth(begin_time, end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(mouthList);
				  response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
				}
			}
			}else  if(isdate.equals("1")){
				JyRawdataHandle1 jfRawdataHandle1 = jyRawdataHandle1Services.getLastTime();
				if(jfRawdataHandle1 != null){
					Date time =  jfRawdataHandle1.get时间();
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
					String db_endtime = sdf.format(time);
					String year_mouth = db_endtime.substring(0,7);
					String n_begin_time = year_mouth+"-01 00:00:00";
					String n_end_time = db_endtime;
					List<JyRawdataHandle1> mouthList = jyRawdataHandle1Services.selectDataByMouth(n_begin_time, n_end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(mouthList);
				   response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
				}
			}
		}
		
		//处理年报表Ajax
		@RequestMapping("/jy_do_select_year_ajax")
		public void selectDataByYearAjax(String isdate,HttpServletResponse response,String Year_data_begin,Model model)throws Exception{
			//用户输入查询条件
			if(Year_data_begin != null){
			String begin_time = Year_data_begin+"-01-01 00:00:00";
			String end_time = Year_data_begin+"-12-31 23:59:59";
			List<JyRawdataHandle1> yearList = jyRawdataHandle1Services.selectDataByYear(begin_time, end_time);
			ObjectMapper mapper =  new ObjectMapper();
			String jsonstr = mapper.writeValueAsString(yearList);
		response.setContentType("text/javascript;charset=UTF-8");
			response.getWriter().print(jsonstr);
			}else  if(isdate.equals("1")){
				JyRawdataHandle1 jbRawdataHandle1 = jyRawdataHandle1Services.getLastTime();
				 if(jbRawdataHandle1 != null){
					Date time =  jbRawdataHandle1.get时间();
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
					String db_endtime = sdf.format(time);
					String year_mouth = db_endtime.substring(0,4);
					String begin_time = year_mouth+"-01-01 00:00:00";
					String end_time = year_mouth+"-12-31 23:59:59";
					List<JyRawdataHandle1> yearList = jyRawdataHandle1Services.selectDataByYear(begin_time, end_time);
					ObjectMapper mapper =  new ObjectMapper();
					String jsonstr = mapper.writeValueAsString(yearList);
				  response.setContentType("text/javascript;charset=UTF-8");
					response.getWriter().print(jsonstr);
				}
				
			}
			
		}
		//处理季度报表AJAX
		@RequestMapping("/jy_do_select_Quarter_ajax")
		public void selectDateByQuarterAJAX(String isdate,HttpServletResponse response,String Quarter_year,String Quarter,Model model)throws Exception{
			//用户没有输入查询条件
			
			//用户输入查询条件
			if((Quarter_year!=null)&&(Quarter != null)){
			if(Quarter.equals("第一季度")){
				String begin_QueryTime = Quarter_year+"-01-01 00:00:00";
				String end_QueryTime = Quarter_year+"-03-31 23:59:59";
				List<JyRawdataHandle1> quaryList = jyRawdataHandle1Services.selectDataByQuarter(begin_QueryTime, end_QueryTime);
				ObjectMapper mapper =  new ObjectMapper();
				String jsonstr = mapper.writeValueAsString(quaryList);
				response.setContentType("text/javascript;charset=UTF-8");
				response.getWriter().print(jsonstr);
			}
			if(Quarter.equals("第二季度")){
				//查询的时间区间为Quarter_year-01-01 00:00:00至Quarter_year-03-31 23:59:59
			
				String begin_QueryTime = Quarter_year+"-04-01 00:00:00";
				String end_QueryTime = Quarter_year+"-06-30 23:59:59";
				List<JyRawdataHandle1> quaryList = jyRawdataHandle1Services.selectDataByQuarter(begin_QueryTime, end_QueryTime);
				ObjectMapper mapper =  new ObjectMapper();
				String jsonstr = mapper.writeValueAsString(quaryList);
				response.setContentType("text/javascript;charset=UTF-8");
				response.getWriter().print(jsonstr);
			}
			if(Quarter.equals("第三季度")){
				//查询的时间区间为Quarter_year-01-01 00:00:00至Quarter_year-03-31 23:59:59
				
				String begin_QueryTime = Quarter_year+"-07-01 00:00:00";
				String end_QueryTime = Quarter_year+"-09-30 23:59:59";
				List<JyRawdataHandle1> quaryList = jyRawdataHandle1Services.selectDataByQuarter(begin_QueryTime, end_QueryTime);
				ObjectMapper mapper =  new ObjectMapper();
				String jsonstr = mapper.writeValueAsString(quaryList);
			response.setContentType("text/javascript;charset=UTF-8");
				response.getWriter().print(jsonstr);
			}
			if(Quarter.equals("第四季度")){
				//查询的时间区间为Quarter_year-01-01 00:00:00至Quarter_year-03-31 23:59:59
				String begin_QueryTime = Quarter_year+"-10-01 00:00:00";
				String end_QueryTime = Quarter_year+"-12-31 23:59:59";
				List<JyRawdataHandle1> quaryList = jyRawdataHandle1Services.selectDataByQuarter(begin_QueryTime, end_QueryTime);
				ObjectMapper mapper =  new ObjectMapper();
				String jsonstr = mapper.writeValueAsString(quaryList);
				response.setContentType("text/javascript;charset=UTF-8");
				response.getWriter().print(jsonstr);
			}
			}else  if(isdate.equals("1")){
				JyRawdataHandle1 jyRawdataHandle1 = jyRawdataHandle1Services.getLastTime();
				if(jyRawdataHandle1 != null){
					Date time =  jyRawdataHandle1.get时间();
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
					String db_endtime = sdf.format(time);
					String year_mouth = db_endtime.substring(5,7);
					Integer quarter_u = Integer.parseInt(year_mouth);
					
					if(1 <= quarter_u && quarter_u <= 3 ){
						String new_end_QueryTime = db_endtime;
						String end_QueryTime = db_endtime.substring(0, 4);
						String new_begin_query_time = end_QueryTime+"-01-01 00:00:00";
						List<JyRawdataHandle1> quaryList = jyRawdataHandle1Services.selectDataByQuarter(new_begin_query_time, new_end_QueryTime);
						ObjectMapper mapper =  new ObjectMapper();
						String jsonstr = mapper.writeValueAsString(quaryList);
						response.setContentType("text/javascript;charset=UTF-8");
						response.getWriter().print(jsonstr);
					}
					if(4 <= quarter_u && quarter_u <= 6 ){
						String new_end_QueryTime = db_endtime;
						String end_QueryTime = db_endtime.substring(0, 4);
						String new_begin_query_time = end_QueryTime+"-04-01 00:00:00";
						List<JyRawdataHandle1> quaryList = jyRawdataHandle1Services.selectDataByQuarter(new_begin_query_time, new_end_QueryTime);
						ObjectMapper mapper =  new ObjectMapper();
						String jsonstr = mapper.writeValueAsString(quaryList);
						response.setContentType("text/javascript;charset=UTF-8");
						response.getWriter().print(jsonstr);
					}
					if(7 <= quarter_u && quarter_u <= 9 ){
						String new_end_QueryTime = db_endtime;
						String end_QueryTime = db_endtime.substring(0, 4);
						String new_begin_query_time = end_QueryTime+"-07-01 00:00:00";
						List<JyRawdataHandle1> quaryList = jyRawdataHandle1Services.selectDataByQuarter(new_begin_query_time, new_end_QueryTime);
						ObjectMapper mapper =  new ObjectMapper();
						String jsonstr = mapper.writeValueAsString(quaryList);
						response.setContentType("text/javascript;charset=UTF-8");
						response.getWriter().print(jsonstr);						}
					if(10 <= quarter_u && quarter_u <= 12 ){
						String new_end_QueryTime = db_endtime;
						String end_QueryTime = db_endtime.substring(0, 4);
						String new_begin_query_time = end_QueryTime+"-10-01 00:00:00";
						List<JyRawdataHandle1> quaryList = jyRawdataHandle1Services.selectDataByQuarter(new_begin_query_time, new_end_QueryTime);
						ObjectMapper mapper =  new ObjectMapper();
						String jsonstr = mapper.writeValueAsString(quaryList);
						response.setContentType("text/javascript;charset=UTF-8");
						response.getWriter().print(jsonstr);
					}
				}
			}
			
		}
	
}
