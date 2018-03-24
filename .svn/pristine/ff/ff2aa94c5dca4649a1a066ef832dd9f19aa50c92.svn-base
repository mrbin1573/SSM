package com.saitejn.services;

import java.util.List;

import com.saitejn.pojo.JfRawdataHandle1;
import com.saitejn.pojo.JfUploadMiddle;
import com.saitejn.pojo.JyRawdataHandle1;
import com.saitejn.pojo.JyUploadMiddle;

public interface JY_UploadServices {
		//读取建峰Excel数据
		public List<JyUploadMiddle> readExcel_jy(String filePath, String year) throws Exception;
		//增加数据到中间表中
		public void insertDataToMiddle_jy(JyUploadMiddle jyUploadMiddle) throws Exception; 
		//保存数据到原始表中
		public void insertDataToExcel_jy(JyUploadMiddle jyUploadMiddle) throws Exception; 
		//将计算后的数据保存到能耗数据集中
		public void  insertDataToHand1_jy()throws Exception;
		//保存数据到干净数据集
		public void  insertDataToHand2_jy()throws Exception;
		//删除数据
		public void deleteUploadMiddle_jy()throws Exception;
		//删除数据
		public void deleterawdataMiddle_jy()throws Exception;
		//查询能耗数据库中最后一条的数据集的时间
		public JyRawdataHandle1 getLastTime_jy() throws Exception;
}
