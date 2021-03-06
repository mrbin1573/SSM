package com.saitejn.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.saitejn.pojo.Adminguideifo;
import com.saitejn.pojo.JbGuiImg;
import com.saitejn.pojo.JbUserifo;
import com.saitejn.pojo.Messageleaving;
import com.saitejn.services.JB_UploadServices;

@Controller
public class JBGuidePageController {
	
	@Autowired
	private JB_UploadServices jb_UploadServices;
	
	private String guide;
	//管理页面未审核数据
	//变量关联分析文件
	
	@RequestMapping("/showTrackUnCheck")
	public void showBefoFile(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		String name = jb_UploadServices.showBefoFile("跟踪分析");
		if(name == null ){
			response.sendRedirect("/pic/guide/erorr.html");
		}
		String guidename = "/pic/guide/"+name;
		response.sendRedirect(guidename);
		
	}
	@RequestMapping("/optpar")
	public void optpar(Model model,HttpServletResponse response)throws Exception{
		String name = jb_UploadServices.showBefoFile("优化工艺");
		if(name == null ){
			response.sendRedirect("/pic/guide/erorr.html");
		}
		String guidename = "/pic/guide/"+name;
		response.sendRedirect(guidename);
	}
	@RequestMapping("/showoptimizationUnCheck")
	public void showoptimizationUnCheck(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		String name = jb_UploadServices.showBefoFile("变量关联");
		if(name == null ){
			response.sendRedirect("/pic/guide/erorr.html");
		}
		String guidename = "/pic/guide/"+name;
		response.sendRedirect(guidename);
		
	}
	@RequestMapping("/showDynreg")
	public void showshowDynreg(Model model,HttpServletResponse response)throws Exception{
		String name = jb_UploadServices.showBefoFile("动态调控");
		if(name == null ){
			response.sendRedirect("/pic/guide/erorr.html");
		}
		String guidename = "/pic/guide/"+name;
		response.sendRedirect(guidename);
	}
	//历史列表
	@RequestMapping("/history")
	public String showguidehistory(Model model ,@RequestParam(value="page", defaultValue="1") Integer page)throws Exception{
		PageHelper.startPage(page, 5);
		List<Adminguideifo> adminguideifos = jb_UploadServices.getAllAdminGuideifo();
		model.addAttribute("adminguideifos", adminguideifos);
		model.addAttribute("page", page);
		//获取分页结果
		PageInfo<Adminguideifo> pageInfo = new PageInfo<Adminguideifo>(adminguideifos);
		//总记录数
		Long count = pageInfo.getTotal();
		model.addAttribute("count", count);
		//总页数
		int pages = pageInfo.getPages();
		model.addAttribute("pages", pages);
		return "admin/history";
	}
	//查看历史记录
	@RequestMapping("/showguidehis")
	public void showguidehis(int gid,HttpServletResponse response,Model model)throws Exception{
		String guidename = jb_UploadServices.showguidehis(gid);
		List<JbGuiImg> list1 = jb_UploadServices.getGuideImage(gid, 1);
		model.addAttribute("list1", list1);
		response.sendRedirect(guidename);
	}
	//留言管理
	@RequestMapping("/showMessage")
	public String showmessage(HttpSession session,Model model,@RequestParam(value="page", defaultValue="1") Integer page)throws Exception{
		JbUserifo jbUserifo = (JbUserifo) session.getAttribute("user");
		PageHelper.startPage(page, 12);
		List<Messageleaving> messageList = jb_UploadServices.selectMessageByConpany(jbUserifo.getCompany());
		model.addAttribute("messageList", messageList);
		model.addAttribute("page", page);
		//获取分页结果
		PageInfo<Messageleaving> pageInfo = new PageInfo<Messageleaving>(messageList);
		//总记录数
		Long count = pageInfo.getTotal();
		model.addAttribute("count", count);
		//总页数
		int pages = pageInfo.getPages();
		model.addAttribute("pages", pages);
		//修改留言状态
		jb_UploadServices.updateMessage();
		return "message_list";
	}
	//查看消息
	@RequestMapping("/lookmessage")
	public String lookmessage(int mid)throws Exception{
		//adminDataServices.updateMessage(mid);
		return  "redirect:/showMessage.action";
	}
	
	@RequestMapping("/toguide")
	public String toguide()throws Exception{
		return "use_guide";
	}
	int count = 0;
	//统计打印次数
	@RequestMapping("/CountPrintNumber")
	public void CountPrintNumber(Integer  printnumber,HttpServletRequest request, HttpServletResponse response)throws Exception{
		count+=printnumber;
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(count);
	}
	
		
	
}
