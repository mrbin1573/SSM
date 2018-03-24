package com.saitejn.mapper;

import java.util.List;

import com.saitejn.pojo.Adminguideifo;
import com.saitejn.pojo.Jb_feedback01;
import com.saitejn.pojo.Jb_feedback02;
import com.saitejn.pojo.Jb_feedback03;
import com.saitejn.pojo.Jb_feedback05;
import com.saitejn.pojo.JfGuiImg;
import com.saitejn.pojo.Messageleaving;

public interface JF_guidePageMapper {
	public String BeforFileShow(String filename)throws Exception;
	public List<Adminguideifo> getAllAdminGuideifo ()throws Exception;
	public List<JfGuiImg>getGuideImage(Integer fid,Integer imgid)throws Exception;
	public Adminguideifo selectByPrimaryKey(Integer id);
	
	public Jb_feedback01 selectFeedBack01()throws Exception;
	public List<Jb_feedback02> selectvarByid(int id)throws Exception;
	public void insertUserVar(Jb_feedback05 jb_feedback05)throws Exception;
	public List<Jb_feedback01>selectAllfeedback()throws Exception;
	public void updatefeedbacktype(int id ,String backtime)throws Exception;
	public void updatefeedbacktype1(int id, String backtime)throws Exception;
	public void updatefeedbacktype2(int id, String backtime )throws Exception;
	public List<Jb_feedback02> selectFeedbackforhis(int pid)throws Exception;
	public List<Messageleaving>selectMessageByConpany(String company)throws Exception;
	public void updateMessByid() throws Exception;
	public void insertfeedback01(Jb_feedback01 jb_feedback01)throws Exception;
	public int selectfeedback01id()throws Exception;
	public void insertfeedback02(Jb_feedback02 jb_feedback02)throws Exception;
	public void insertfeedback03(Jb_feedback03 jb_feedback03)throws Exception;
	public int selectfeedback02id()throws Exception;
	public Jb_feedback01 selectFeedBack01ById(int id)throws Exception;
}
