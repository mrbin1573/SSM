package com.saitejn.services;

import java.util.Date;
import java.util.List;

import com.saitejn.pojo.Adminguideifo;
import com.saitejn.pojo.Jb_feedback01;
import com.saitejn.pojo.Jb_feedback02;
import com.saitejn.pojo.Jb_feedback05;
import com.saitejn.pojo.JfGuiImg;
import com.saitejn.pojo.Messageleaving;

public interface JF_guidePageServices {
	public String showBefoFile(String filename)throws Exception;
	public List<Adminguideifo> getAllAdminGuideifo ()throws Exception;
	public String showguidehis(int gid)throws Exception;
	public List<JfGuiImg>getGuideImage(Integer fid,Integer imgid)throws Exception;
	
	public List<Jb_feedback02> selectVar()throws Exception;
	public Date selectCheckTime()throws Exception;
	public void insertUserVar(Jb_feedback05 jb_feedback05)throws Exception;
	public List<Jb_feedback01>selectAllfeedback()throws Exception;
	public void updatefeedbacktype()throws Exception;
	public void updatefeedbacktype1(int id )throws Exception;
	public void updatefeedtype()throws Exception;
	public List<Jb_feedback02> selectFeedbackforhis(int pid)throws Exception;
	public List<Messageleaving>selectMessageByConpany(String company)throws Exception;
	public void updateMessage()throws Exception;
	public void insertfeedback01(int id)throws Exception;
	public void insertfeedback02(String par)throws Exception;
	public void insertfeedback03(String actvar)throws Exception;
}
