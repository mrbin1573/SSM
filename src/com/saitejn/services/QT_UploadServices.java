package com.saitejn.services;

import java.util.List;

import com.saitejn.pojo.JfRawdataHandle1;
import com.saitejn.pojo.JfUploadMiddle;

public interface QT_UploadServices {
	    //读取建峰Excel数据
		public List<JfUploadMiddle> readExcel_jf(String filePath) throws Exception;
		//增加数据到中间表中
		public void insertDataToMiddle_jf(JfUploadMiddle jfUploadMiddle) throws Exception; 
		public void saveCopyAs(String xlsfile, String saveAsFile)throws Exception;
		public JfRawdataHandle1 getLastTime_jf() throws Exception;

}
