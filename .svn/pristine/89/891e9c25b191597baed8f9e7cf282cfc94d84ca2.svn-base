package com.saitejn.util;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;

/**
 * 创建Excel
 * @class CreateExcelFile.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-11-9
 */
public class CreateExcelFile {
	public static void createExcel(){
		//创建Excel工作簿对象
		HSSFWorkbook wb = new HSSFWorkbook();
		//创建Excel工作表对象
		HSSFSheet sheet = wb.createSheet("new Sheet");
		//创建Excel工作表行
		HSSFRow row = sheet.createRow(6);
		//创建单元格样式
		CellStyle cellStyle = wb.createCellStyle();
		 cellStyle.setFillForegroundColor(HSSFColor.SKY_BLUE.index);  
         cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);  
         cellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
         cellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
         cellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);  
         cellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);  
         cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); 
         //创建Excel工作表指定行的单元格
         row.createCell(0).setCellStyle(cellStyle);
         //设置Excel工作表的值
         row.createCell(0).setCellValue("aaaaaa");
       //创建Excel工作表指定行的单元格
         row.createCell(1).setCellStyle(cellStyle);
         //设置Excel工作表的值
         row.createCell(1).setCellValue("666666");
         //设置sheet名称和单元格内容
         wb.setSheetName(0, "第一张工作表");
         //将文件保存到指定位置
         try {
			FileOutputStream fout = new FileOutputStream("E:/hellowold.xls");
			wb.write(fout);
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
