package com.saitejn.mapper;

import java.util.List;

import com.saitejn.pojo.FileUpInfo;
import com.saitejn.pojo.Fileupifo;
import com.saitejn.pojo.JbClassinfor;
import com.saitejn.pojo.JbExcelInput;
import com.saitejn.pojo.JbExcelMiddle;
import com.saitejn.pojo.JbIpq;
import com.saitejn.pojo.JbMiddle;
import com.saitejn.pojo.JbRawdataHandle1;
import com.saitejn.pojo.JbRawdataHandle2;
import com.saitejn.pojo.JbUploadMiddle;
import com.saitejn.pojo.Jb_csv;
import com.saitejn.pojo.JfRawdataHandle1;
import com.saitejn.pojo.JfRawdataHandle2;
import com.saitejn.pojo.JfUploadMiddle;

/**
 * Excel数据扩展类
 * @class JbExcelInputCustomerMapper.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-9-18
 */
public interface JbExceluploadCustomerMapper {
	//根据时间查询数据库是否有重复记录，用于剔除上传的时候的重复记录
	public int fingInputByJbtime(String jbtime)throws Exception;

	//保存数据到数据表中间表
	public void saveDatetomiddle(JbUploadMiddle jbUploadMiddle) throws Exception; 
	//保存数据到数据表Excel表
	public void saveDatetoExcel(JbRawdataHandle1 jbUploadMiddle) throws Exception; 
	//按时间查询所有的中甲表的数据
	public List<JbRawdataHandle1> selectAllJbMiddle()throws Exception;
	//保存数据到数据表handl1表
	public void saveDatetoHandl1(JbRawdataHandle1 jbRawdataHandle1) throws Exception;
	//保存数据到数据表handl1表
	public void saveDatetoHandlMiddle(JbRawdataHandle1 jbRawdataHandle1) throws Exception;
	//按时间查询randatahandlmiddle的数据
	public List<JbRawdataHandle2> selectAllHandleMiddle()throws Exception;
	//保存数据到数据表handl2表
	public void saveDatetoHandl2(JbRawdataHandle2 jbRawdataHandle2) throws Exception;
	//删除数据
	public void deleteUploadMiddle()throws Exception;
	//删除数据
	public void deleterawdataMiddle()throws Exception;
	//取得handl1中最后一条数据，与新上传的形成一个list,在计算
	public JbRawdataHandle1 selectTopOneHandl1()throws Exception;
	//查询时间
	public JbClassinfor seclectByTime(String time) throws Exception;
	//向原始数据表中插如电耗数据
	public void insertExcel_jb(Jb_csv Jb_csv)throws Exception;
	//查询缓冲数据库是否有重复记录
	public int selectCountforupmiddle(String jbtime)throws Exception;


	
	
	
}
