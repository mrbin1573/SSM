package com.saitejn.mapper;

import java.util.List;

import com.saitejn.pojo.JbClassinfor;
import com.saitejn.pojo.JbRawdataHandle1;
import com.saitejn.pojo.JbRawdataHandle2;

/**
 * 原始数据接口扩展
 * @class JbRawdataHandle1CustomerMapper.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-9-23
 */
public interface JbRawdataHandle1CustomerMapper {
	
	//查询所有的原始数据
	public List<JbRawdataHandle1> selectAllhandle1()throws Exception;
	//查询所有的原始数据
	public List<JbRawdataHandle2> selectAllhandle2()throws Exception;
	//按用户输入的条件查询日报表
	public List<JbRawdataHandle1> selectDataByContidion(String stime,String btime )throws Exception;
	//按用户输入的条件查询日报表.按班来查看
	//public List<JbRawdataHandle1> selectDataByContidionAndClass(String stime,String btime)throws Exception;
	public List<JbRawdataHandle1> selectDataByContidionAndClass1(String stime,String btime)throws Exception;
	public List<JbRawdataHandle1> selectDataByContidionAndClass2(String stime,String btime)throws Exception;
	public List<JbRawdataHandle1> selectDataByContidionAndClass3(String stime,String btime)throws Exception;
	public List<JbRawdataHandle1> selectDataByContidionAndClass4(String stime,String btime)throws Exception;
	//按用户输入的条件查询月报表
	public List<JbRawdataHandle1> selectDataByMouth(String stime,String btime )throws Exception;
	//按用户输入的条件查询日报表.按班来查看
	public List<JbRawdataHandle1> selectDataByMouthAndClass(String stime,String btime)throws Exception;
	public List<JbRawdataHandle1> selectDataByMouthAndClass1(String stime,String btime)throws Exception;
	public List<JbRawdataHandle1> selectDataByMouthAndClass2(String stime,String btime)throws Exception;
	public List<JbRawdataHandle1> selectDataByMouthAndClass3(String stime,String btime)throws Exception;
	//按用户输入的条件查询年报表
	public List<JbRawdataHandle1> selectDataByYear(String stime,String btime )throws Exception;
	public JbRawdataHandle1 selectDateByYearNext(String stime,String btime )throws Exception;
	//按用户输入的条件查询季度报表
	public List<JbRawdataHandle1> selectDataByQuarter(String stime,String btime )throws Exception;
	//根据时间来查询班次表
	public JbClassinfor seclectByTime(String time) throws Exception;
	//查询干净数据库中最后一条的干净数据集的时间
	public JbRawdataHandle1 getLastTime() throws Exception;
	

}
