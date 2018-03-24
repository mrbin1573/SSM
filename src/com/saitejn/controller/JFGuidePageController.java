package com.saitejn.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.saitejn.pojo.Adminguideifo;
import com.saitejn.pojo.JbGuiImg;
import com.saitejn.pojo.JbUserifo;
import com.saitejn.pojo.Jb_feedback01;
import com.saitejn.pojo.Jb_feedback02;
import com.saitejn.pojo.Jb_feedback05;
import com.saitejn.pojo.JfGuiImg;
import com.saitejn.pojo.Messageleaving;
import com.saitejn.services.JF_guidePageServices;

/**
 * 建峰指导文件查看页面
 * @author Administrator
 *
 */
@Controller
public class JFGuidePageController {
	@Autowired
	private JF_guidePageServices jF_guidePageServices;
	@RequestMapping("/jf_showTrackUnCheck")
	public void showBefoFile(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		String name = jF_guidePageServices.showBefoFile("跟踪分析");
		if(name == null ){
			response.sendRedirect("/pic/guide/erorr.html");
		}
		String guidename = "/pic/guide/"+name;
		response.sendRedirect(guidename);
	}
	@RequestMapping("/jf_optpar")
	public void optpar(Model model,HttpServletResponse response)throws Exception{
		String name = jF_guidePageServices.showBefoFile("优化工艺");
		if(name == null ){
			response.sendRedirect("/pic/guide/erorr.html");
		}
		String guidename = "/pic/guide/"+name;
		response.sendRedirect(guidename);
	}
	@RequestMapping("/jf_showoptimizationUnCheck")
	public void showoptimizationUnCheck(Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		String name = jF_guidePageServices.showBefoFile("变量关联");
		if(name == null ){
			response.sendRedirect("/pic/guide/erorr.html");
		}
		String guidename = "/pic/guide/"+name;
		response.sendRedirect(guidename);
		
	}
	@RequestMapping("/jf_showDynreg")
	public void showshowDynreg(Model model,HttpServletResponse response)throws Exception{
		String name = jF_guidePageServices.showBefoFile("动态调控");
		if(name == null ){
			response.sendRedirect("/pic/guide/erorr.html");
		}
		String guidename = "/pic/guide/"+name;
		response.sendRedirect(guidename);
	}
	//历史列表
	@RequestMapping("/jf_showguidehist")
	public String showguidehist(Model model,@RequestParam(value="page", defaultValue="1") Integer page)throws Exception{
		PageHelper.startPage(page, 15);
		List<Adminguideifo> adminguideifos = jF_guidePageServices.getAllAdminGuideifo();
		model.addAttribute("adminguideifos", adminguideifos);
		model.addAttribute("page", page);
		PageInfo<Adminguideifo> pageInfo = new PageInfo<Adminguideifo>(adminguideifos);
		Long count = pageInfo.getTotal();
		model.addAttribute("count", count);
		int pages = pageInfo.getPages();
		model.addAttribute("pages", pages);
		return "jf/jf_history";
		}
	//查看历史记录
	@RequestMapping("/jf_showguidehis")
	public void showguidehis(int gid,HttpServletResponse response,Model model)throws Exception{
		String guidename = jF_guidePageServices.showguidehis(gid);
		List<JfGuiImg> list1 = jF_guidePageServices.getGuideImage(gid, 1);
		model.addAttribute("list1", list1);
		response.sendRedirect(guidename);
	}
	@RequestMapping("/jf_backTable")
	public String tobackTable(Model model )throws Exception{
		List<Jb_feedback02> feedback02s = jF_guidePageServices.selectVar();
		if(feedback02s !=null){
			model.addAttribute("feedback02s", feedback02s);
			Date date = jF_guidePageServices.selectCheckTime();
			model.addAttribute("cdate", date);
		}
		return "jf/jf_backtable";
	}
	@RequestMapping("/jf_backTableHistory")
	public String jb_backTableHistory(Model model ,@RequestParam(value="page", defaultValue="1") Integer page)throws Exception{
		PageHelper.startPage(page, 20);
		List<Jb_feedback01> feedback01s = jF_guidePageServices.selectAllfeedback();
		model.addAttribute("feedback01s", feedback01s);
		model.addAttribute("page", page);
		PageInfo<Jb_feedback01> pageInfo = new PageInfo<Jb_feedback01>(feedback01s);
		Long count = pageInfo.getTotal();
		model.addAttribute("count", count);
		int pages = pageInfo.getPages();
		model.addAttribute("pages", pages);
		return "jf/jf_backTablHistory";
	}
	@RequestMapping("/jf_doUserVar")
	public void doUserVar(HttpServletResponse response, @RequestBody List<Jb_feedback05> xg)throws Exception{
		jF_guidePageServices.updatefeedbacktype();
		for(int i = 0 ; i <xg.size();i++){
			for(int j = 0;j<xg.get(i).getUservar().size();j++){
				Jb_feedback05 jb_feedback05 = new Jb_feedback05();
				jb_feedback05.setParid(xg.get(i).getId());
				jb_feedback05.setUseractive(xg.get(i).getUservar().get(j));
				jF_guidePageServices.insertUserVar(jb_feedback05);
			}
		}
	}
	@RequestMapping("/jf_updateUserVar")
	public String jf_updateUserVar(HttpServletResponse response, @RequestBody List<Jb_feedback05> xg)throws Exception{
	    int supid = xg.get(1).getSupid();
	    jF_guidePageServices.updatefeedbacktype1(supid);
		jF_guidePageServices.insertfeedback01(supid);
		for(int i = 0 ; i <xg.size();i++){
			jF_guidePageServices.insertfeedback02(xg.get(i).getParName());
			String a1 = " " ;
			String a2 = " " ;
			String a3 = " " ;
			List<String> xgbl = new ArrayList<String>();
			xgbl.add(a1);
			xgbl.add(a2);
			xgbl.add(a3);
			for(int j = 0 ;j<xgbl.size();j++){
				jF_guidePageServices.insertfeedback03(xgbl.get(j));
			}
		}
		List<Jb_feedback02> feedback02s = jF_guidePageServices.selectVar();
		for(int i = 0 ; i <xg.size();i++){
			for(int j = 0;j<xg.get(i).getUservar().size();j++){
				Jb_feedback05 jb_feedback05 = new Jb_feedback05();
				jb_feedback05.setParid(feedback02s.get(i).getId());
				jb_feedback05.setUseractive(xg.get(i).getUservar().get(j));
				jF_guidePageServices.insertUserVar(jb_feedback05);
			}
		}
		jF_guidePageServices.updatefeedtype();
		return "redirect:/jf_backTableHistory.action";
	}
	@RequestMapping("/jf_dofeedbackhis")
	public String dofeedbackhis_jb(Model model ,String fid,HttpServletRequest request)throws Exception{
		int id = Integer.parseInt(fid);
		List<Jb_feedback01> feedback01s = jF_guidePageServices.selectAllfeedback();
		if(feedback01s != null){
			for(int i = 0;i <feedback01s.size();i++){
				if(id==feedback01s.get(i).getId()){
				Date cdate = feedback01s.get(i).getTime();
				model.addAttribute("cdate", cdate);
				}
			}
		}
		List<Jb_feedback02> feedback02s = jF_guidePageServices.selectFeedbackforhis(id);
		model.addAttribute("feedback02s", feedback02s);
		return "jf/jf_backtableWrited";
	}
	@RequestMapping("/jf_updatefeedbackhis")
	public String jf_updatefeedbackhis(Model model ,String fid,HttpServletRequest request)throws Exception{
		int id = Integer.parseInt(fid);
		List<Jb_feedback01> feedback01s = jF_guidePageServices.selectAllfeedback();
		if(feedback01s != null){
			for(int i = 0;i <feedback01s.size();i++){
				if(id==feedback01s.get(i).getId()){
				Date cdate = feedback01s.get(i).getTime();
				model.addAttribute("cdate", cdate);
				}
			}
		}
		List<Jb_feedback02> feedback02s = jF_guidePageServices.selectFeedbackforhis(id);
		model.addAttribute("feedback02s", feedback02s);
		return "jf/jf_updatebacktable";
	}
	@RequestMapping("/jf_showMessage")
	public String showmessage(HttpSession session,Model model,@RequestParam(value="page", defaultValue="1") Integer page)throws Exception{
		JbUserifo jbUserifo = (JbUserifo) session.getAttribute("user");
		PageHelper.startPage(page, 15);
		List<Messageleaving> messageList = jF_guidePageServices.selectMessageByConpany(jbUserifo.getCompany());
		model.addAttribute("messageList", messageList);
		model.addAttribute("page", page);
		PageInfo<Messageleaving> pageInfo = new PageInfo<Messageleaving>(messageList);
		Long count = pageInfo.getTotal();
		model.addAttribute("count", count);
		int pages = pageInfo.getPages();
		model.addAttribute("pages", pages);
		jF_guidePageServices.updateMessage();
		return "jf/jf_message_list";
	}
	
}
