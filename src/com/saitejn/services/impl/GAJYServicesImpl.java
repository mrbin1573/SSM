package com.saitejn.services.impl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import com.saitejn.mapper.GajyMapper;
import com.saitejn.pojo.GajyUploadMiddle;
import com.saitejn.pojo.JfUploadMiddle;
import com.saitejn.services.GAJYServices;
import com.saitejn.util.SheetCopy;

/**
 * 广安玖源业务实现
 * @GAJYServicesImpl
 * @Description
 * @author 罗康元
 * @company 成都赛特工信科技有限公司
 * @date 2017-8-8
 */
public class GAJYServicesImpl implements GAJYServices {
	@Autowired 
	private GajyMapper gajyMapper;
	
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
	public List<GajyUploadMiddle> gajy_readExcel(String filePath)
			throws Exception {
		String excelPath =filePath;
		InputStream is = new FileInputStream(excelPath);//读取文件路径
		XSSFWorkbook wb = new XSSFWorkbook(is);
		GajyUploadMiddle gajyUploadMiddle = null;
		List<GajyUploadMiddle> list = new ArrayList<GajyUploadMiddle>();
		//循环工作表
		for(int numSheet = 0 ; numSheet < wb.getNumberOfSheets(); numSheet++){
			XSSFSheet st = wb.getSheetAt(numSheet);
			if(st == null){
				continue;
			}
			//循环Row
			for(int rowNum = 1; rowNum <st.getLastRowNum()+1; rowNum ++){
				XSSFRow hssfRow = st.getRow(rowNum);
				if(hssfRow != null){
					gajyUploadMiddle = new GajyUploadMiddle();
					XSSFCell time = hssfRow.getCell(0);
				if(time !=null || time.getCellType()!= HSSFCell.CELL_TYPE_BLANK){
				SimpleDateFormat gajysdf =new SimpleDateFormat("yyyy/MM/dd");
				Date ymddate = time.getDateCellValue();
				String ymdStr = gajysdf.format(ymddate);
				
				XSSFCell timem = hssfRow.getCell(1);
				String timeStr = parseExcel(timem);
				String datatime = ymdStr+" "+timeStr;
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					if(ymdStr.length()>0){
						Date date = sdf.parse(datatime);
						String timeis = sdf1.format(date);
						int isdate = gajyMapper.gajyfindInputByTime(timeis);
						if(isdate==0){
						gajyUploadMiddle.setData_time(date);
						XSSFCell FIC_101_6 = hssfRow.getCell(2);
						gajyUploadMiddle.setFIC_101_6(Double.valueOf(getValues(FIC_101_6)));
						XSSFCell FIC_102_2 = hssfRow.getCell(3);
						gajyUploadMiddle.setFIC_102_2(Double.valueOf(getValues(FIC_102_2)));
						XSSFCell FI_104_6 = hssfRow.getCell(4);
						gajyUploadMiddle.setFI_104_6(Double.valueOf(getValues(FI_104_6)));
						XSSFCell TI_104_12 = hssfRow.getCell(5);
						gajyUploadMiddle.setTI_104_12(Double.valueOf(getValues(TI_104_12)));
						XSSFCell FFI_103_4 = hssfRow.getCell(6);
						gajyUploadMiddle.setFFI_103_4(Double.valueOf(getValues(FFI_103_4)));
						XSSFCell TI_104_10 = hssfRow.getCell(7);
						gajyUploadMiddle.setTI_104_10(Double.valueOf(getValues(TI_104_10)));
						XSSFCell TI_124_1 = hssfRow.getCell(8);
						gajyUploadMiddle.setTI_124_1(Double.valueOf(getValues(TI_124_1)));
						XSSFCell FI_101_6 = hssfRow.getCell(9);
						gajyUploadMiddle.setFI_101_6(Double.valueOf(getValues(FI_101_6)));
						XSSFCell FI_161_2 = hssfRow.getCell(10);
	                    gajyUploadMiddle.setFI_161_2(Double.valueOf(getValues(FI_161_2)));
						XSSFCell TI_131_2 = hssfRow.getCell(11);
						gajyUploadMiddle.setTI_131_2(Double.valueOf(getValues(TI_131_2)));
						XSSFCell TI_132_2	= hssfRow.getCell(12);
						gajyUploadMiddle.setTI_132_2(Double.valueOf(getValues(TI_132_2)));
						XSSFCell FIC_311_2	= hssfRow.getCell(13);
						if(FIC_311_2 != null && FIC_311_2.getCellType()!= XSSFCell.CELL_TYPE_BLANK){
							gajyUploadMiddle.setFIC_311_2(Double.valueOf(getValues(FIC_311_2)));
						}else{
							gajyUploadMiddle.setFIC_311_2(null);
						}
						XSSFCell FI_8007	= hssfRow.getCell(14);
						gajyUploadMiddle.setFI_8007(Double.valueOf(getValues(FI_8007)));
						XSSFCell PI_165_8	= hssfRow.getCell(15);
						gajyUploadMiddle.setPI_165_8(Double.valueOf(getValues(PI_165_8)));
						XSSFCell FIC_162_1	= hssfRow.getCell(16);
						gajyUploadMiddle.setFIC_162_1(Double.valueOf(getValues(FIC_162_1)));
						XSSFCell FIC_201_7	= hssfRow.getCell(17);
						gajyUploadMiddle.setFIC_201_7(Double.valueOf(getValues(FIC_201_7)));
						XSSFCell TI_423_1	= hssfRow.getCell(18);
						gajyUploadMiddle.setTI_423_1(Double.valueOf(getValues(TI_423_1)));
						XSSFCell AI_141_4C	= hssfRow.getCell(19);
						gajyUploadMiddle.setAI_141_4C(Double.valueOf(getValues(AI_141_4C)));
						XSSFCell AI_141_4A	= hssfRow.getCell(20);
						gajyUploadMiddle.setAI_141_4A(Double.valueOf(getValues(AI_141_4A)));
						XSSFCell TI_122_1	= hssfRow.getCell(21);
						gajyUploadMiddle .setTI_122_1(Double.valueOf(getValues(TI_122_1)));
						XSSFCell TI_122_2	= hssfRow.getCell(22);
						gajyUploadMiddle.setTI_122_2(Double.valueOf(getValues(TI_122_2)));
						XSSFCell TI_122_3	= hssfRow.getCell(23);
						gajyUploadMiddle.setTI_122_3(Double.valueOf(getValues(TI_122_3)));
						XSSFCell TI_122_5	= hssfRow.getCell(24);
						gajyUploadMiddle.setTI_122_5(Double.valueOf(getValues(TI_122_5)));
						XSSFCell TI_122_8	= hssfRow.getCell(25);
						gajyUploadMiddle.setTI_122_8(Double.valueOf(getValues(TI_122_8)));
						XSSFCell TI_122_11	= hssfRow.getCell(26);
						gajyUploadMiddle.setTI_122_11(Double.valueOf(getValues(TI_122_11)));
						XSSFCell TI_140_11	= hssfRow.getCell(27);
						gajyUploadMiddle.setTI_140_11(Double.valueOf(getValues(TI_140_11)));
						XSSFCell TI_140_17	= hssfRow.getCell(28);
						gajyUploadMiddle.setTI_140_17(Double.valueOf(getValues(TI_140_17)));
						XSSFCell TI_141_6	= hssfRow.getCell(29);
						gajyUploadMiddle.setTI_141_6(Double.valueOf(getValues(TI_141_6)));
						XSSFCell FI_140_4	= hssfRow.getCell(30);
						gajyUploadMiddle.setFI_140_4(Double.valueOf(getValues(FI_140_4)));
						XSSFCell KE_140_70	= hssfRow.getCell(31);
						gajyUploadMiddle.setKE_140_70(Double.valueOf(getValues(KE_140_70)));
						XSSFCell FI_140_3	= hssfRow.getCell(32);
						gajyUploadMiddle.setFI_140_3(Double.valueOf(getValues(FI_140_3)));
						XSSFCell KE_140_90	= hssfRow.getCell(33);
						gajyUploadMiddle.setKE_140_90(Double.valueOf(getValues(KE_140_90)));
						XSSFCell HIC_140_5	= hssfRow.getCell(34);
						gajyUploadMiddle.setHIC_140_5(Double.valueOf(getValues(HIC_140_5)));
						XSSFCell HIC_140_7 = hssfRow.getCell(35);
						gajyUploadMiddle.setHIC_140_7(Double.valueOf(getValues(HIC_140_7)));
						XSSFCell PIC_163_5	= hssfRow.getCell(36);
						gajyUploadMiddle.setPIC_163_5(Double.valueOf(getValues(PIC_163_5)));
						XSSFCell SI_221_2	= hssfRow.getCell(37);
						gajyUploadMiddle.setSI_221_2(Double.valueOf(getValues(SI_221_2)));
						XSSFCell FIC_221_4	= hssfRow.getCell(38);
						gajyUploadMiddle.setFIC_221_4(Double.valueOf(getValues(FIC_221_4)));
						XSSFCell FI_221_5 =  hssfRow.getCell(39);
						gajyUploadMiddle.setFI_221_5(Double.valueOf(getValues(FI_221_5)));
						XSSFCell PI_220_0	= hssfRow.getCell(40);
						gajyUploadMiddle.setPI_220_0(Double.valueOf(getValues(PI_220_0)));
						XSSFCell FIC_133_3	= hssfRow.getCell(41);
						gajyUploadMiddle.setFIC_133_3(Double.valueOf(getValues(FIC_133_3)));
						XSSFCell SI_221_5	= hssfRow.getCell(42);
						gajyUploadMiddle.setSI_221_5(Double.valueOf(getValues(SI_221_5)));
						XSSFCell PIC_210_4	= hssfRow.getCell(43);
						gajyUploadMiddle.setPIC_210_4(Double.valueOf(getValues(PIC_210_4)));
						XSSFCell FI_210_5	= hssfRow.getCell(44);
						gajyUploadMiddle.setFI_210_5(Double.valueOf(getValues(FI_210_5)));
						XSSFCell TI_301_6	= hssfRow.getCell(45);
						gajyUploadMiddle.setTI_301_6(Double.valueOf(getValues(TI_301_6)));
						XSSFCell TIC_301_1	= hssfRow.getCell(46);
						gajyUploadMiddle.setTIC_301_1(Double.valueOf(getValues(TIC_301_1)));
						XSSFCell TI_302_34	= hssfRow.getCell(47);
						gajyUploadMiddle.setTI_302_34(Double.valueOf(getValues(TI_302_34)));
						XSSFCell PI_130_4	= hssfRow.getCell(48);
						gajyUploadMiddle.setPI_130_4(Double.valueOf(getValues(PI_130_4)));
						XSSFCell FI_121_1	= hssfRow.getCell(49);
						gajyUploadMiddle.setFI_121_1(Double.valueOf(getValues(FI_121_1)));
						XSSFCell TI_303_22	= hssfRow.getCell(50);
						gajyUploadMiddle.setTI_303_22(Double.valueOf(getValues(TI_303_22)));
						XSSFCell TI_303_30	= hssfRow.getCell(51);
						gajyUploadMiddle.setTI_303_30(Double.valueOf(getValues(TI_303_30)));
						XSSFCell TI_303_36	= hssfRow.getCell(52);
						gajyUploadMiddle.setTI_303_36(Double.valueOf(getValues(TI_303_36)));
						XSSFCell TI_302_17	= hssfRow.getCell(53);
						gajyUploadMiddle.setTI_302_17(Double.valueOf(getValues(TI_302_17)));
						XSSFCell TI_310_3	= hssfRow.getCell(54);
						gajyUploadMiddle.setTI_310_3(Double.valueOf(getValues(TI_310_3)));
						XSSFCell FI_311_5	= hssfRow.getCell(55);
						gajyUploadMiddle.setFI_311_5(Double.valueOf(getValues(FI_311_5)));
						XSSFCell FI_312_5	= hssfRow.getCell(56);
						gajyUploadMiddle.setFI_312_5(Double.valueOf(getValues(FI_312_5)));
						XSSFCell FIC_312_6	= hssfRow.getCell(57);
						gajyUploadMiddle.setFIC_312_6(Double.valueOf(getValues(FIC_312_6)));
						XSSFCell FIC_410_2	= hssfRow.getCell(58);
						gajyUploadMiddle.setFIC_410_2(Double.valueOf(getValues(FIC_410_2)));
						XSSFCell SI_150_1 = hssfRow.getCell(59);
						gajyUploadMiddle.setSI_150_1(Double.valueOf(getValues(SI_150_1)));
						XSSFCell FI_150_8 = hssfRow.getCell(60);
						gajyUploadMiddle.setFI_150_8(Double.valueOf(getValues(FI_150_8)));
						XSSFCell SI_150_5 = hssfRow.getCell(61);
						gajyUploadMiddle.setSI_150_5(Double.valueOf(getValues(SI_150_5)));
						XSSFCell FI_150_9 = hssfRow.getCell(62);
						gajyUploadMiddle.setFI_150_9(Double.valueOf(getValues(FI_150_9)));
						XSSFCell PDIC_133_4 = hssfRow.getCell(63);
						gajyUploadMiddle.setPDIC_133_4(Double.valueOf(getValues(PDIC_133_4)));
						XSSFCell PIC_521_2_2 = hssfRow.getCell(65);
						gajyUploadMiddle.setPIC_521_2_2(Double.valueOf(getValues(PIC_521_2_2)));
						XSSFCell PIC_221_1 = hssfRow.getCell(66);
						gajyUploadMiddle.setPIC_221_1(Double.valueOf(getValues(PIC_221_1)));
						XSSFCell FI_211_2 = hssfRow.getCell(67);
						gajyUploadMiddle.setFI_211_2(Double.valueOf(getValues(FI_211_2)));
						XSSFCell TIC_302_10 = hssfRow.getCell(68);
						gajyUploadMiddle.setTIC_302_10(Double.valueOf(getValues(TIC_302_10)));
						XSSFCell TI_302_60 = hssfRow.getCell(69);
						gajyUploadMiddle.setTI_302_60(Double.valueOf(getValues(TI_302_60)));
						XSSFCell PI_521_2 = hssfRow.getCell(70);
						gajyUploadMiddle.setPI_521_2(Double.valueOf(getValues(PI_521_2)));
						XSSFCell PIC_521_1 = hssfRow.getCell(71);
						gajyUploadMiddle.setPIC_521_1(Double.valueOf(getValues(PIC_521_1)));
						XSSFCell FI_109_1 = hssfRow.getCell(72);
						gajyUploadMiddle.setFI_109_1(Double.valueOf(getValues(FI_109_1)));
						XSSFCell TI_109_5 = hssfRow.getCell(73);
						gajyUploadMiddle.setTI_109_5(Double.valueOf(getValues(TI_109_5)));
						XSSFCell FI_109_2 = hssfRow.getCell(74);
						gajyUploadMiddle.setFI_109_2(Double.valueOf(getValues(FI_109_2)));
						XSSFCell FIC_109_3 = hssfRow.getCell(75);
						gajyUploadMiddle.setFIC_109_3(Double.valueOf(getValues(FIC_109_3)));
						XSSFCell FI_1602 = hssfRow.getCell(76);
						gajyUploadMiddle.setFI_1602(Double.valueOf(getValues(FI_1602)));
						XSSFCell FIQ_1602 = hssfRow.getCell(77);
						gajyUploadMiddle.setFIQ_1602(Double.valueOf(getValues(FIQ_1602)));
						XSSFCell FIQ_161_2 = hssfRow.getCell(78);
						gajyUploadMiddle.setFIQ_161_2(Double.valueOf(getValues(FIQ_161_2)));
						XSSFCell FIQ_101_6 = hssfRow.getCell(79);
						gajyUploadMiddle.setFIQ_101_6(Double.valueOf(getValues(FIQ_101_6)));
						XSSFCell FIQ_312_5 = hssfRow.getCell(80);
						gajyUploadMiddle.setFIQ_312_5(Double.valueOf(getValues(FIQ_312_5)));
						XSSFCell FI_8235 = hssfRow.getCell(81);
						if(FI_8235 !=null && FI_8235.getCellType()!= XSSFCell.CELL_TYPE_BLANK){
							gajyUploadMiddle.setFI_8235(Double.valueOf(getValues(FI_8235)));
						}else{
							gajyUploadMiddle.setFI_8235(null);
						}
						XSSFCell FI_8202 = hssfRow.getCell(82);
						gajyUploadMiddle.setFI_8202(Double.valueOf(getValues(FI_8202)));
						XSSFCell FI_8234 = hssfRow.getCell(83);
						gajyUploadMiddle.setFI_8234(Double.valueOf(getValues(FI_8234)));
						XSSFCell FIQ_8235 = hssfRow.getCell(84);
						gajyUploadMiddle.setFIQ_8235(Double.valueOf(getValues(FIQ_8235)));
						XSSFCell FIQ_8202 = hssfRow.getCell(85);
						gajyUploadMiddle.setFIQ_8202(Double.valueOf(getValues(FIQ_8202)));
						XSSFCell FIQ_8234 = hssfRow.getCell(86);
						gajyUploadMiddle.setFIQ_8234(Double.valueOf(getValues(FIQ_8234)));
						
						list.add(gajyUploadMiddle);
					 
			
			}else {
				continue;
			}
					}
					
				}
					
				}
			}
			
		}
		 Collections.sort(list,new Comparator<GajyUploadMiddle>() {

				@Override
				public int compare(GajyUploadMiddle o1, GajyUploadMiddle o2) {
					if(o1.getData_time().getTime() > o2.getData_time().getTime()){
						return 1;
					}
					if(o1.getData_time().getTime() == o2.getData_time().getTime()){
						return 0;
					}
					
					return -1;
				}
			});
		return list;
	}
	
	private String getValues(XSSFCell hssfCell){
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
	public void gajy_insertToUploadMiddle(GajyUploadMiddle gajyUploadMiddle)throws Exception {
		
		gajyMapper.gajyInsertToMiddle(gajyUploadMiddle);
	}

	@Override
	public void gajy_insertToExcel(GajyUploadMiddle gajyUploadMiddle)
			throws Exception {
		gajyMapper.gajyInsertToExcel(gajyUploadMiddle);
	}

    private String parseExcel(XSSFCell cell) {  
    	
    	
    
    	  short format = cell.getCellStyle().getDataFormat();
         
    	 double a = cell.getNumericCellValue();
    	 Date data = DateUtil.getJavaDate(a);
    	 SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    	 String str = sdf.format(data.getTime());
    	 return str;
        }

	@Override
	public void gajy_deleteUploadMiddle() throws Exception {
		gajyMapper.gajyDeleteUploadMiddle();
	}  

}
