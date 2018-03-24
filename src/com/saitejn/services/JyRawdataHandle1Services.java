package com.saitejn.services;

import java.util.List;

import com.saitejn.pojo.JyRawdataHandle1;

/**
 * 原始数据业务层
 * @class JbRawdataHandle1Services.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-9-23
 */
public interface JyRawdataHandle1Services {
	/**
	 * 清除Hand1中的数据
	 */
	public void deleteHand1();
	/**
	 * 清除Hand1中的数据
	 */
	public void deleteHand2();
	/**
	 * 存储计算后的原始数据
	 * @param jbRawdataHandle1CustomerMapper
	 * @throws Exception
	 */
	//public void saveDate(int ecount,int bcount)throws Exception;
	/**
	 * 存储计算后的剔除异常数据的数据
	 * @param jbRawdataHandle1CustomerMapper
	 * @throws Exception
	 */
	//public void saveToDate2(int ycount,int upcount)throws Exception;
	/**
	 * 按用户输入的条件查询日报表
	 * @param stime 开始日期
	 * @param btime 结束日期
	 * @return 返回一个数据集合
	 * @throws Exception
	 */
	public List<JyRawdataHandle1> selectDataByContidion(String stime,String btime )throws Exception;
	/**
	 * 按用户输入的条件查询月报表
	 * @param stime 开始月份
	 * @param btime 结束月份
	 * @return 返回一个数据集合
	 * @throws Exception
	 */
	public List<JyRawdataHandle1> selectDataByMouth(String stime,String btime )throws Exception;
	/**
	 * 按用户输入的条件查询年报表
	 * @param stime 开始年
	 * @param btime 结束年
	 * @return 返回一个数据集合
	 * @throws Exception
	 */
	public List<JyRawdataHandle1> selectDataByYear(String stime,String btime )throws Exception;
	/**
	 * 按用户输入的条件查询季度报表
	 * @param stime 开始时间
	 * @param btime 结束时间
	 * @return 返回一个数据集合
	 * @throws Exception
	 */
	public List<JyRawdataHandle1> selectDataByQuarter(String stime,String btime )throws Exception;
	/**
	 * 根据时间来查询班次表
	 * @param time
	 * @return
	 * @throws Exception
	 */
	//public JbClassinfor seclectByTime(String time) throws Exception;
	/**
	 * 按用户输入的条件查询日报表.按班来查看
	 * @param stime
	 * @param btime
	 * @param cifo
	 * @return
	 * @throws Exception
	 */
	public List<JyRawdataHandle1> selectDataByContidionAndClass(String stime,String btime)throws Exception;
	/**
	 * 按用户输入的条件查询月报表.按班来查看
	 * @param stime
	 * @param btime
	 * @param cifo
	 * @return
	 * @throws Exception
	 */
	public List<JyRawdataHandle1> selectDataByMouthAndClass(String stime,String btime)throws Exception;
	//查询能耗数据库中最后一条的数据集的时间
	public JyRawdataHandle1 getLastTime() throws Exception;



}
