package com.saitejn.mapper;

import java.util.List;

import com.saitejn.pojo.JyAdminguideifo;
import com.saitejn.pojo.JyRawdataHandle1;
import com.saitejn.pojo.JyRawdataHandle2;

/**
 * 原始数据接口扩展
 * @class JbRawdataHandle1CustomerMapper.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-9-23
 */
public interface JyRawdataHandle1CustomerMapper {
	//清除Hand1中的数据
	public void deleteHand1();
	//清除Hand1中的数据
	public void deleteHand2();
	//存储计算后的原始数据
	public void saveDate(JyRawdataHandle1 jyRawdataHandle1)throws Exception;
	//查询所有的原始数据
	public List<JyRawdataHandle1> selectAllhandle1()throws Exception;
	//保存到干净数据集中
	public void saveToHandl2(JyRawdataHandle2 jyRawdataHandle2)throws Exception;
	//按用户输入的条件查询日报表
	public List<JyRawdataHandle1> selectDataByContidion(String stime,String btime )throws Exception;
	//按用户输入的条件查询日报表.按班来查看
	public List<JyRawdataHandle1> selectDataByContidionAndClass4(String stime,String btime)throws Exception;
	public List<JyRawdataHandle1> selectDataByContidionAndClass1(String stime,String btime)throws Exception;
	public List<JyRawdataHandle1> selectDataByContidionAndClass2(String stime,String btime)throws Exception;
	public List<JyRawdataHandle1> selectDataByContidionAndClass3(String stime,String btime)throws Exception;
	//按用户输入的条件查询月报表
	public List<JyRawdataHandle1> selectDataByMouth(String stime,String btime )throws Exception;
	//按用户输入的条件查询yue报表.按班来查看
	public List<JyRawdataHandle1> selectDataByMouthAndClass(String stime,String btime)throws Exception;
	public List<JyRawdataHandle1> selectDataByMouthAndClass1(String stime,String btime)throws Exception;
	public List<JyRawdataHandle1> selectDataByMouthAndClass2(String stime,String btime)throws Exception;
	//按用户输入的条件查询年报表
	public List<JyRawdataHandle1> selectDataByYear(String stime,String btime )throws Exception;
	public JyRawdataHandle1 selectDataByYearnext(String stime,String btime )throws Exception;
	//按用户输入的条件查询季度报表
	public List<JyRawdataHandle1> selectDataByQuarter(String stime,String btime )throws Exception;
	//前台指导文件的查看
	public String BeforFileShow(String filename)throws Exception;
	//查询所有的推送记录
	public List<JyAdminguideifo> getAllAdminGuideifo ()throws Exception;
	//根据时间删除异常数据
	public void deleteByTime(String time)throws Exception;
	//查询干净数据库中最后一条的干净数据集的时间
	public JyRawdataHandle1 getLastTime() throws Exception;
	
	



}
