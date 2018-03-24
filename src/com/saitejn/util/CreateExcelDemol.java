package com.saitejn.util;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.saitejn.test.User;

/**
 * 创建Excel文件的一个Demo
 * @class CreateExcelDemol.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-11-9
 */
public class CreateExcelDemol {
     public static void createExcel()throws Exception{
    	 List list = new ArrayList();  
         SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");  
         User user1 = new User(1, "张三", 16,true, df.parse("1997-03-12"));  
         User user2 = new User(2, "李四", 17,true, df.parse("1996-08-12"));  
         User user3 = new User(3, "王五", 26,false, df.parse("1985-11-12"));  
         list.add(user1);  
         list.add(user2);  
         list.add(user3);  
      // 第一步，创建一个webbook，对应一个Excel文件  
         HSSFWorkbook wb = new HSSFWorkbook();  
         // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet  
         HSSFSheet sheet = wb.createSheet("学生表一");  
         // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short  
         HSSFRow row = sheet.createRow((int) 0);  
         // 第四步，创建单元格，并设置值表头 设置表头居中  
         HSSFCellStyle style = wb.createCellStyle();  
         style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式  

         HSSFCell cell = row.createCell((short) 0);  
         cell.setCellValue("学号");  
         cell.setCellStyle(style);  
         cell = row.createCell((short) 1);  
         cell.setCellValue("姓名");  
         cell.setCellStyle(style);  
         cell = row.createCell((short) 2);  
         cell.setCellValue("年龄");  
         cell.setCellStyle(style);  
         cell = row.createCell((short) 3);  
         cell.setCellValue("性别");  
         cell.setCellStyle(style);  
         cell = row.createCell((short) 4);  
         cell.setCellValue("生日");  
         cell.setCellStyle(style); 
         for (int i = 0; i < list.size(); i++)  
         {  
             row = sheet.createRow((int) i + 1);  
             User stu = (User) list.get(i);  
             // 第四步，创建单元格，并设置值  
             row.createCell((short) 0).setCellValue((double) stu.getNumber());  
             row.createCell((short) 1).setCellValue(stu.getName());  
             row.createCell((short) 2).setCellValue((double) stu.getAge());  
              
             cell = row.createCell((short) 4);  
             cell.setCellValue(new SimpleDateFormat("yyyy-mm-dd").format(stu  
                     .getBirthday()));  
         }  
         // 第六步，将文件存到指定位置  
         try  
         {  
             FileOutputStream fout = new FileOutputStream("E:/students.xls");  
             wb.write(fout);  
             fout.close();  
         }  
         catch (Exception e)  
         {  
             e.printStackTrace();  
         }  
     }
}
