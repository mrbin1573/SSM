package com.saitejn.services;

import java.util.Date;
import java.util.List;

import com.saitejn.pojo.Adminguideifo;
import com.saitejn.pojo.FileUpInfo;
import com.saitejn.pojo.JbClassinfor;
import com.saitejn.pojo.JbExcelInput;
import com.saitejn.pojo.JbExcelMiddle;
import com.saitejn.pojo.JbGuiImg;
import com.saitejn.pojo.JbIpq;
import com.saitejn.pojo.JbRawdataHandle1;
import com.saitejn.pojo.JbUploadMiddle;
import com.saitejn.pojo.Jb_csv;
import com.saitejn.pojo.Jb_feedback01;
import com.saitejn.pojo.Jb_feedback02;
import com.saitejn.pojo.Jb_feedback05;
import com.saitejn.pojo.JfRawdataHandle1;
import com.saitejn.pojo.Messageleaving;

/**
 * 建峰数据上传
 * @class JF_UploadServices.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2017-1-16
 */
public interface JB_UploadServices {
	public List<JbUploadMiddle> readJbXls(String filePath) throws Exception;
	public List<Jb_csv> readJbcsv(String filePath) throws Exception;
	public void saveDatetomiddle(JbUploadMiddle jbUploadMiddle) throws Exception; 
	public void  saveDatetoHandl1()throws Exception;
	public void  saveDatetoHandl2()throws Exception;
	public void deleteUploadMiddle()throws Exception;
	public void deleterawdataMiddle()throws Exception;
	public JbRawdataHandle1 getLastTimeWithhand() throws Exception;
	public void saveCopyAs(String xlsfile, String saveAsFile)throws Exception;
	public void insertExcel_jb(Jb_csv jbIpq)throws Exception;
	public void inserttoExcel_jb()throws Exception;
	public List<Messageleaving>selectMessageByConpany(String company)throws Exception;
	public int selectMessageNumber(String company)throws Exception;
	public List<Messageleaving> selectMessageCount(String company)throws Exception;
	public void updateMessage()throws Exception;
	public void updatejb_pushgrid_1_1(int id) throws Exception;
	public void updatejb_pushgrid_1_2(int id) throws Exception;
	public void saveDate(JbExcelInput jbExcelInput)throws Exception ;
	public void saveDatetomiddle(JbExcelMiddle jbExcelMiddle) throws Exception; 
	public List<JbExcelInput> selectDateByTime(String sdate,String edate)throws Exception;
	public List<JbExcelInput>selectAll()throws Exception;
	public void saveUpFileIfo(FileUpInfo fileupifo)throws Exception;
	public int selectcount()throws Exception;
	public int selecthand1count()throws Exception;
	public int isSameDate(String jbtime)throws Exception;
	public List<JbExcelMiddle> readJyXls(String filePath) throws Exception;
	public JbExcelMiddle selectTopInput()throws Exception;
	public List<JbExcelMiddle> selectAllMiddle()throws Exception;
	public void savetoexcel()throws Exception;
	public void savatohandle1()throws Exception;
	public void savatohandle2()throws Exception;
	public void deletemiddle1()throws Exception;
	public void deletemiddle2()throws Exception;
	public List<JbRawdataHandle1> selectDailyreport_jb(String btime,String etime)throws Exception;
	public List<JbRawdataHandle1> selectDailyreportForClass_jb(String btime,String etime)throws Exception;
	public List<JbRawdataHandle1> selectQuarterreport_jb(String btime,String etime)throws Exception;
	public void insertUpInfo(Adminguideifo adminguideifo) throws Exception;
	public String showBefoFile(String filename)throws Exception;
	public List<Adminguideifo> getAllAdminGuideifo ()throws Exception;
	public String showguidehis(int gid)throws Exception;
	public void deleteuserByid(int uid)throws Exception;
	public List<JbGuiImg>getGuideImage(Integer fid,Integer imgid)throws Exception;
	public List<Jb_feedback02> selectVar_jb()throws Exception;
	public Date selectCheckTime()throws Exception;
	public void insertUserVar_jb(Jb_feedback05 jb_feedback05)throws Exception;
	public List<Jb_feedback01>selectAllfeedback_jb()throws Exception;
    public void updatefeedbacktype_jb()throws Exception;
    public List<Jb_feedback02> selectFeedbackforhis_jb(int pid)throws Exception;
	public List<FileUpInfo> selectFileAll()throws Exception;
	public List<JbRawdataHandle1> selectDataByContidion(String stime,String btime )throws Exception;
	public List<JbRawdataHandle1> selectDataByMouth(String stime,String btime )throws Exception;
	public List<JbRawdataHandle1> selectDataByYear(String stime,String btime )throws Exception;
	public List<JbRawdataHandle1> selectDataByQuarter(String stime,String btime )throws Exception;
	public JbClassinfor seclectByTime(String time) throws Exception;
	public List<JbRawdataHandle1> selectDataByContidionAndClass(String stime,String btime)throws Exception;
	public List<JbRawdataHandle1> selectDataByMouthAndClass(String stime,String btime)throws Exception;
	public JbRawdataHandle1 getLastTime() throws Exception;
	
			
	
	
}
