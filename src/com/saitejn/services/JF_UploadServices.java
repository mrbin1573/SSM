package com.saitejn.services;

import java.util.List;

import com.saitejn.pojo.JbRawdataHandle1;
import com.saitejn.pojo.JbUserifo;
import com.saitejn.pojo.JfRawdataHandle1;
import com.saitejn.pojo.JfUploadMiddle;
import com.saitejn.pojo.JyRawdataHandle1;

/**
 * 建峰数据上传
 * @class JF_UploadServices.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2017-1-16
 */
public interface JF_UploadServices {
	//读取建峰Excel数据
	public List<JfUploadMiddle> readExcel_jf(String filePath) throws Exception;
	//增加数据到中间表中
	public void insertDataToMiddle_jf(JfUploadMiddle jfUploadMiddle) throws Exception; 
	//保存数据到原始表中
	public void insertDataToExcel_jf(JfUploadMiddle jfUploadMiddle) throws Exception; 
	//将计算后的数据保存到能耗数据集中
	public void  insertDataToHand1_jf()throws Exception;
	//保存数据到干净数据集
	public void  insertDataToHand2_jf()throws Exception;
	//删除数据
	public void deleteUploadMiddle_jf()throws Exception;
	//删除数据
	public void deleterawdataMiddle_jf()throws Exception;
	//按用户输入的条件查询日报表.按班来查看
	public List<JfRawdataHandle1> selectDataForClass_jf(String stime,String btime)throws Exception;
	//查询能耗数据库中最后一条的数据集的时间
	public JfRawdataHandle1 getLastTime_jf() throws Exception;
	//日报表查看适应工厂的时间daunting
	public List<JfRawdataHandle1> selectDataForDayByContidion_jf(String stime,String btime )throws Exception;
	//月报表按日查看
	public List<JfRawdataHandle1> selectDataForMouthByContidion_jf(String stime,String btime )throws Exception;
	//季度报表
	public List<JfRawdataHandle1> selectDataForQuarterByContidion_jf(String stime,String btime )throws Exception;
	//查询所有的用户信息
	public List<JbUserifo> selectAllUser_jf()throws Exception;
	//修改用户密码信息
	public void updatePassword_jf(JbUserifo jbUserifo)throws Exception;
	//转换为标准文件
	public void saveCopyAs(String xlsfile, String saveAsFile)throws Exception;
	
	//建峰月报表的分班查看不统计数据
	public List<JfRawdataHandle1> selectclass_1(String stime,String btim)throws Exception;
	
	
}
