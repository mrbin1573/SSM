package com.saitejn.mapper;

import java.util.List;

import com.saitejn.pojo.FileUpInfo;
import com.saitejn.pojo.Fileupifo;
import com.saitejn.pojo.JbExcelInput;
import com.saitejn.pojo.JbExcelMiddle;
import com.saitejn.pojo.JbMiddle;
import com.saitejn.pojo.JbRawdataHandle1;
import com.saitejn.pojo.JbRawdataHandle2;
import com.saitejn.pojo.JfRawdataHandle1;

/**
 * Excel数据扩展类
 * @class JbExcelInputCustomerMapper.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-9-18
 */
public interface JbExcelInputCustomerMapper {
	//保存数据到数据表中
	public void saveDate(JbExcelInput jbExcelInput) throws Exception; 
	//保存数据到数据表中
	public void saveDatetomiddle(JbExcelMiddle jbExcelMiddle) throws Exception; 
	//保存干净数据到数据库中
	public void saveNewDate() throws Exception;
	//根据开始结束时间获取对应时间段的用户上传的数据信息
	public List<JbExcelInput> selectDateByTime(String sdate,String edate)throws Exception;
	//获取所有的原始数据，用于计算，剔除异常点数据
	public List<JbExcelInput> selectAll()throws Exception;
	//保存文件上传信息
	public void saveUpFileIfo(FileUpInfo fileupifo)throws Exception;
	//查询input表的记录数
	public int selectcount()throws Exception;
	//查询handle1表的记录数
	public int selecthand1count()throws Exception;
	//根据时间查询数据库是否有重复记录，用于剔除上传的时候的重复记录
	public int fingInputByJbtime(String jytime)throws Exception;
	//取出excel表中的最后一条记录
	public JbExcelMiddle selectTopInput()throws Exception;
	//查询所有的中间表的数据
	public List<JbExcelMiddle> selectAllMiddle()throws Exception;
	//保存数据到excel表中
	public void savetoexcel(JbExcelInput jbExcelInput)throws Exception;
	//保存数据到handle1表中去
	public void savatohandle1(JbRawdataHandle1 jbRawdataHandle1)throws Exception;
	//保存数据到handle1表中去
	public void savatomiddel1(JbRawdataHandle1 jbRawdataHandle1)throws Exception;
	//保存数据到handle1表中去
	public void savatohandle2(JbRawdataHandle2 jbRawdataHandle2)throws Exception;
	public List<JbRawdataHandle1> selectMidleList ()throws Exception;
	public void deletemiddle1()throws Exception;
	public void deletemiddle2()throws Exception;
	public JbRawdataHandle1 getLastTime() throws Exception;
	
}
