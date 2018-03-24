package com.saitejn.services.impl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import com.saitejn.mapper.JfExcelInputCustomerMapper;
import com.saitejn.pojo.JfRawdataHandle1;
import com.saitejn.pojo.JfUploadMiddle;
import com.saitejn.services.QT_UploadServices;
import com.saitejn.util.SheetCopy;

public class QT_UploadServicesImpl implements QT_UploadServices {
	@Autowired
	private JfExcelInputCustomerMapper jfExcelInputCustomerMapper;
	@Override
	public List<JfUploadMiddle> readExcel_jf(String filePath) throws Exception {
		String excelPath =filePath;
		InputStream is = new FileInputStream(excelPath);//读取文件路径
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		
		JfUploadMiddle jfUploadMiddle = null;
		List<JfUploadMiddle> list = new ArrayList<JfUploadMiddle>();
		//循环工作表
		for(int numSheet = 0 ; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++){
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if(hssfSheet == null){
				continue;
			}
			//循环Row
			for(int rowNum = 4; rowNum <hssfSheet.getLastRowNum()-1; rowNum ++){
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				if(hssfRow != null){
					jfUploadMiddle = new JfUploadMiddle();
					/*HSSFCell time = hssfRow.getCell(0);*/
				if(1==1){
					/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
					SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String datetime = getValues(time);*/
					if(1==1){
						/*Date date = sdf.parse(datetime);
						String timeis = sdf1.format(date);*/
						int isdate = 0;
						if(isdate==0){
						/*jfUploadMiddle.setData_time(date);*/
						HSSFCell FI100 = hssfRow.getCell(1);
						if(!(FI100==null||FI100.equals("")||FI100.getCellType() ==HSSFCell.CELL_TYPE_BLANK)){
						jfUploadMiddle.setFI100(Double.valueOf(getValues(FI100)));
						HSSFCell FC101 = hssfRow.getCell(2);
						jfUploadMiddle.setFC101(Double.valueOf(getValues(FC101)));
						HSSFCell FC105 = hssfRow.getCell(3);
						jfUploadMiddle.setFC105(Double.valueOf(getValues(FC105)));
						HSSFCell FFY101 = hssfRow.getCell(4);
						jfUploadMiddle.setFFY101(Double.valueOf(getValues(FFY101)));
						HSSFCell FFY105 = hssfRow.getCell(5);
						jfUploadMiddle.setFFY105(Double.valueOf(getValues(FFY105)));
						HSSFCell FI203 = hssfRow.getCell(6);
						jfUploadMiddle.setFI203(Double.valueOf(getValues(FI203)));
						HSSFCell PC167 = hssfRow.getCell(7);
						jfUploadMiddle.setPC167(Double.valueOf(getValues(PC167)));
						HSSFCell FI175 = hssfRow.getCell(8);
						jfUploadMiddle.setFI175(Double.valueOf(getValues(FI175)));
						HSSFCell FI172 = hssfRow.getCell(9);
						jfUploadMiddle.setFI172(Double.valueOf(getValues(FI172)));
						HSSFCell FC191 = hssfRow.getCell(10);
	                    jfUploadMiddle.setFC191(Double.valueOf(getValues(FC191)));
						HSSFCell FC133 = hssfRow.getCell(11);
						jfUploadMiddle.setFC133(Double.valueOf(getValues(FC133)));
						HSSFCell FI162	= hssfRow.getCell(12);
						jfUploadMiddle.setFI162(Double.valueOf(getValues(FI162)));
						HSSFCell FI107	= hssfRow.getCell(13);
						jfUploadMiddle.setFI107(Double.valueOf(getValues(FI107)));
						HSSFCell FI207	= hssfRow.getCell(14);
						jfUploadMiddle.setFI207(Double.valueOf(getValues(FI207)));
						HSSFCell FI180	= hssfRow.getCell(15);
						jfUploadMiddle.setFI180(Double.valueOf(getValues(FI180)));
						HSSFCell FI177	= hssfRow.getCell(16);
						jfUploadMiddle.setFI177(Double.valueOf(getValues(FI177)));
						HSSFCell FI9005	= hssfRow.getCell(17);
						jfUploadMiddle.setFI9005(Double.valueOf(getValues(FI9005)));
						HSSFCell FI147	= hssfRow.getCell(18);
						jfUploadMiddle.setFI147(Double.valueOf(getValues(FI147)));
						HSSFCell FI199	= hssfRow.getCell(19);
						jfUploadMiddle.setFI199(Double.valueOf(getValues(FI199)));
						HSSFCell TI106	= hssfRow.getCell(20);
						if(!(TI106==null||TI106.equals("")||TI106.getCellType() ==HSSFCell.CELL_TYPE_BLANK)){
						
							jfUploadMiddle.setTI106(Double.valueOf(getValues(TI106)));
						}else{
							jfUploadMiddle.setTI106(9999999999999.99);
						}
						
						HSSFCell TI240	= hssfRow.getCell(21);
						jfUploadMiddle .setTI240(Double.valueOf(getValues(TI240)));
						HSSFCell TI107	= hssfRow.getCell(22);
						jfUploadMiddle.setTI107(Double.valueOf(getValues(TI107)));
						HSSFCell TI124	= hssfRow.getCell(23);
						jfUploadMiddle.setTI124(Double.valueOf(getValues(TI124)));
						
						
						list.add(jfUploadMiddle);
						}
					 
			
			}else {
				continue;
			}
					}
					
				}
					
				}
			}
			
		}
		return list;
	}
	private String getValues(HSSFCell hssfCell){
		if(hssfCell.getCellType()== hssfCell.CELL_TYPE_BOOLEAN){
			//返回布尔类型的值
			return  String.valueOf(hssfCell.getBooleanCellValue());
			}else if(hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC){
				//返回数值类型的值
				return String.valueOf(hssfCell.getNumericCellValue());
			}
			else{
				//返回字符串类型的值
			
				return String.valueOf(hssfCell.getStringCellValue());
			}
	}
	@Override
	public void insertDataToMiddle_jf(JfUploadMiddle jfUploadMiddle)
			throws Exception {
		
		jfExcelInputCustomerMapper.qt_saveDatetomiddle(jfUploadMiddle);
	}
	@Override
	public void saveCopyAs(String xlsfile, String saveAsFile) throws Exception {
		SheetCopy sc = new SheetCopy();
		sc.setXlsfile(xlsfile);
		sc.setSaveAsFile(saveAsFile);
		Thread t = new Thread(sc,"sc"+System.currentTimeMillis());
		Thread tmain = Thread.currentThread();
		try{
			t.start();
			while(sc.getIsContinue() != 1){
				tmain.sleep(100);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			t.stop();
		}
	}
	@Override
	public JfRawdataHandle1 getLastTime_jf() throws Exception {
		return jfExcelInputCustomerMapper.qt_getLastTime();
	}

}
