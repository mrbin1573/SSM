package com.saitejn.mapper;

import java.util.List;

import com.saitejn.pojo.FileUpInfo;
import com.saitejn.pojo.Fileupifo;
import com.saitejn.pojo.JbExcelInput;
import com.saitejn.pojo.JfRawdataHandle1;
import com.saitejn.pojo.JyExcelInput;
import com.saitejn.pojo.JyFileupifo;
import com.saitejn.pojo.JyRawdataHandle1;
import com.saitejn.pojo.JyRawdataHandle2;
import com.saitejn.pojo.JyUploadMiddle;

/**
 * Excel数据扩展类
 * @class JbExcelInputCustomerMapper.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-9-18
 */
public interface JyExcelInputCustomerMapper {
	//根据时间查询数据可是否有重复记录
	public int findInputByTime_jy(String time)throws Exception;
	//保存数据到上传中间表中
	public void insertDataToUoloadMiddle_jy(JyUploadMiddle jyUploadMiddle)throws Exception;
	//保存数据到Excel表中
	public void insertDataToExcel_jy(JyUploadMiddle jyUploadMiddle)throws Exception;
	//按时间查询所有的中间表的数据
	public List<JyRawdataHandle1> selectUploadMiddle_jy()throws Exception;
	//保存数据到能耗数据表中
	public void insertDataToHandle1_jy(JyRawdataHandle1 jyRawdataHandle1)throws Exception;
	//保存数据到计算后的中间表中
	public void insertDataToHandlMiddle_jy(JyRawdataHandle1 jyRawdataHandle1)throws Exception;
	//查询计算后中转表中的数据
	public List<JyRawdataHandle2> selectHandlMiddle_jy()throws Exception;
	//保存到干净数据表中
	public void insertDataToHandle2_jy(JyRawdataHandle2 jyRawdataHandle2) throws Exception;
	//删除中间表的数据
	public void deleteDataForUploadMiddle_jy()throws Exception;
	//删除计算后中转数据
	public void deleteDataForHandlMiddle_jy()throws Exception;
	//查询handle1中最后一条数据
	public JyRawdataHandle1 selectTopOneHandle1_jy()throws Exception;
	//查询最后一条记录的时间
	public JyRawdataHandle1 getLastTime() throws Exception;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 保存数据到数据表中
	 * @param jbExcelInput
	 * @throws Exception
	 */
	/*public void saveDate(JyExcelInput jyExcelInput) throws Exception; 
	
	*//**
	 * 保存干净数据到数据库中
	 * 计算后不剔除异常点的数据集，用于生成能耗监测报表
	 * @throws Exception
	 *//*
	//public void saveNewDate() throws Exception;
	*//**
	 * 根据开始结束时间获取对应时间段的用户上传的数据信息
	 * @param sdate开始时间年月日
	 * @param edate结束时间年月日
	 * @param stime开始时间时分秒
	 * @param etime结束时间时分秒
	 * @return 返回用户上传数据集合
	 * @throws Exception
	 *//*
	//public List<JbExcelInput> selectDateByTime(String sdate,String edate)throws Exception;
	*//**
	 * 获取所有的原始数据，用于计算，剔除异常点数据
	 * @return
	 * @throws Exception
	 *//*
	public List<JyExcelInput> selectAll()throws Exception;
	*//**
	 * 保存文件上传信息
	 * @param fileupifo
	 * @throws Exception
	 *//*
	public void saveUpFileIfo(JyFileupifo jyFileupifo)throws Exception;
	*//**
	 * 查询input表的记录数
	 * @return
	 * @throws Exception
	 *//*
	public int selectcount()throws Exception;
	*//**
	 * 查询handle1表的记录数
	 * @return
	 * @throws Exception
	 *//*
	public int selecthand1count()throws Exception;
	*//**
	 * 根据时间查询数据库是否有重复记录，用于剔除上传的时候的重复记录
	 * @param jytime
	 * @return
	 * @throws Exception
	 *//*
	public int fingInputByJytime(String jbtime)throws Exception;*/
}
