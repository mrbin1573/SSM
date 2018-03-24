package com.saitejn.util;

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
import org.springframework.stereotype.Component;

import com.saitejn.pojo.JbExcelInput;
import com.saitejn.pojo.JyExcelInput;
import com.saitejn.services.JB_UploadServices;

/**
 * 读取Excel
 * @class ReadExcel.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-9-12
 */
@Component
public class ReadExcel {
	@Autowired
	private JB_UploadServices jb_UploadServices;
	
	public List<JbExcelInput> readXls(String filePath) throws Exception{
		
		String excelPath =filePath;
		/*String excelPath = "E:\\myeclipse10\\upload\\temp\\0160426000001.xls";*/
		/*String excelPath = "webRoot/WEB-INF/lib/0160426000001.xls";*/
		InputStream is = new FileInputStream(excelPath);//读取文件路径
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		JbExcelInput jbExcelInput = null;
		List<JbExcelInput> list = new ArrayList<JbExcelInput>();
		//循环工作表
	
		for(int numSheet = 0 ; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++){
			System.out.println(hssfWorkbook.getNumberOfSheets());
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if(hssfSheet == null){
				continue;
			}
			//循环Row
			for(int rowNum = 3; rowNum <hssfSheet.getLastRowNum()+1; rowNum ++){
				System.out.println(hssfSheet.getLastRowNum());
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				
				
				
				
				if(hssfRow != null){
					jbExcelInput = new JbExcelInput();
					HSSFCell time = hssfRow.getCell(0);
				if(time !=null || time.getCellType()!= HSSFCell.CELL_TYPE_BLANK){
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
					
					SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					
					String datetime = getValues(time);
					
					
					
					
					if(datetime.length()>0){
						Date date = sdf.parse(datetime);
						
						
						int isdate = jb_UploadServices.isSameDate(datetime);
						
						if(isdate==0){
						jbExcelInput.setData_time(date);
						HSSFCell fi103 = hssfRow.getCell(1);
						jbExcelInput.setFi_103(Double.valueOf(getValues(fi103)));
						HSSFCell fi000 = hssfRow.getCell(2);
						jbExcelInput.setFi_000(Double.valueOf(getValues(fi000)));
						HSSFCell fi104 = hssfRow.getCell(3);
						jbExcelInput.setFi_104(Double.valueOf(getValues(fi104)));
						HSSFCell fi101 = hssfRow.getCell(4);
						jbExcelInput.setFi_101(Double.valueOf(getValues(fi101)));
						HSSFCell fi106 = hssfRow.getCell(5);
						jbExcelInput.setFi_106(Double.valueOf(getValues(fi106)));
						HSSFCell fi109 = hssfRow.getCell(6);
						jbExcelInput.setFi_109(Double.valueOf(getValues(fi109)));
						HSSFCell fr401 = hssfRow.getCell(7);
						jbExcelInput.setFr_401(Double.valueOf(getValues(fr401)));
						HSSFCell fr402 = hssfRow.getCell(8);
						jbExcelInput.setFr_402(Double.valueOf(getValues(fr402)));
						HSSFCell fr405 = hssfRow.getCell(9);
						jbExcelInput.setFr_405(Double.valueOf(getValues(fr405)));
						HSSFCell fr406 = hssfRow.getCell(10);
						jbExcelInput.setFr_406(Double.valueOf(getValues(fr406)));
						HSSFCell fr407 = hssfRow.getCell(11);
	                    jbExcelInput.setFr_407(Double.valueOf(getValues(fr407)));
						HSSFCell fr408 = hssfRow.getCell(12);
						jbExcelInput.setFr_408(Double.valueOf(getValues(fr408)));
						HSSFCell fi410	= hssfRow.getCell(13);
						jbExcelInput.setFi_410(Double.valueOf(getValues(fi410)));
						HSSFCell finh3	= hssfRow.getCell(14);
						jbExcelInput.setFi_NH3(Double.valueOf(getValues(finh3)));
						HSSFCell fr141	= hssfRow.getCell(15);
						jbExcelInput.setFr_141(Double.valueOf(getValues(fr141)));
						HSSFCell fr142	= hssfRow.getCell(16);
						jbExcelInput.setFr_142(Double.valueOf(getValues(fr142)));
						HSSFCell fr143	= hssfRow.getCell(17);
						jbExcelInput.setFr_143(Double.valueOf(getValues(fr143)));
						HSSFCell ti122	= hssfRow.getCell(18);
						jbExcelInput.setTi_122(Double.valueOf(getValues(ti122)));
						HSSFCell ti123	= hssfRow.getCell(19);
						jbExcelInput.setTi_123(Double.valueOf(getValues(ti123)));
						HSSFCell ti164	= hssfRow.getCell(20);
						jbExcelInput.setTi_164(Double.valueOf(getValues(ti164)));
						HSSFCell ti131	= hssfRow.getCell(21);
						jbExcelInput.setTi_131(Double.valueOf(getValues(ti131)));
						HSSFCell ti132	= hssfRow.getCell(22);
						jbExcelInput.setTi_132(Double.valueOf(getValues(ti132)));
						HSSFCell ti211	= hssfRow.getCell(23);
						jbExcelInput.setTi_211(Double.valueOf(getValues(ti211)));
						HSSFCell ti210a	= hssfRow.getCell(24);
						jbExcelInput.setTi_210a(Double.valueOf(getValues(ti210a)));
						HSSFCell ti134	= hssfRow.getCell(25);
						jbExcelInput.setTi_134(Double.valueOf(getValues(ti134)));
						HSSFCell ti215	= hssfRow.getCell(26);
						jbExcelInput .setTi_215(Double.valueOf(getValues(ti215)));
						HSSFCell tr413	= hssfRow.getCell(27);
						jbExcelInput.setTr_413(Double.valueOf(getValues(tr413)));
						HSSFCell tr403	= hssfRow.getCell(28);
						jbExcelInput.setTr_403(Double.valueOf(getValues(tr403)));
						HSSFCell tr407	= hssfRow.getCell(29);
						jbExcelInput.setTr_407(Double.valueOf(getValues(tr407)));
						HSSFCell ti407a	= hssfRow.getCell(30);
						jbExcelInput.setTi_407a(Double.valueOf(getValues(ti407a)));
						HSSFCell ti407b	= hssfRow.getCell(31);
						jbExcelInput.setTi_407b(Double.valueOf(getValues(ti407b)));
						HSSFCell pi213	= hssfRow.getCell(32);
						jbExcelInput.setPi_213(Double.valueOf(getValues(pi213)));
						HSSFCell pi105	= hssfRow.getCell(33);
						jbExcelInput.setPi_105(Double.valueOf(getValues(pi105)));
						HSSFCell pi112	= hssfRow.getCell(34);
						jbExcelInput.setPi_112(Double.valueOf(getValues(pi112)));
						HSSFCell pi114	= hssfRow.getCell(35);
						jbExcelInput.setPi_114(Double.valueOf(getValues(pi114)));
						HSSFCell pi234	= hssfRow.getCell(36);
						jbExcelInput.setPi_234(Double.valueOf(getValues(pi234)));
						HSSFCell pr401	= hssfRow.getCell(37);
						jbExcelInput.setPr_401(Double.valueOf(getValues(pr401)));
						HSSFCell pr403	= hssfRow.getCell(38);
						jbExcelInput.setPr_403(Double.valueOf(getValues(pr403)));
						HSSFCell ipq003 = hssfRow.getCell(39);
						jbExcelInput.setIpq003(Double.valueOf(getValues(ipq003)));
						HSSFCell pi422	= hssfRow.getCell(40);
						
						jbExcelInput.setPi_422(Double.valueOf(getValues(pi422)));
						HSSFCell pr416	= hssfRow.getCell(41);
						jbExcelInput.setPr_416(Double.valueOf(getValues(pr416)));
						HSSFCell pi288	= hssfRow.getCell(42);
						jbExcelInput.setPi_288(Double.valueOf(getValues(pi288)));
						HSSFCell ipq004 =  hssfRow.getCell(43);
						jbExcelInput.setIpq004(Double.valueOf(getValues(ipq004)));
						HSSFCell ar101	= hssfRow.getCell(44);
						jbExcelInput.setAr_101(Double.valueOf(getValues(ar101)));
						HSSFCell ar109	= hssfRow.getCell(45);
						jbExcelInput.setAr_109(Double.valueOf(getValues(ar109)));
						HSSFCell ar110	= hssfRow.getCell(46);
						jbExcelInput.setAr_110(Double.valueOf(getValues(ar110)));
						HSSFCell ai104	= hssfRow.getCell(47);
						jbExcelInput.setAi_104(Double.valueOf(getValues(ai104)));
						HSSFCell ai103	= hssfRow.getCell(48);
						jbExcelInput.setAi_103(Double.valueOf(getValues(ai103)));
						HSSFCell ar111	= hssfRow.getCell(49);
						jbExcelInput.setAr_111(Double.valueOf(getValues(ar111)));
						HSSFCell ar112	= hssfRow.getCell(50);
						jbExcelInput.setAr_112(Double.valueOf(getValues(ar112)));
						HSSFCell ar113	= hssfRow.getCell(51);
						jbExcelInput.setAr_113(Double.valueOf(getValues(ar113)));
						HSSFCell ar114	= hssfRow.getCell(52);
						jbExcelInput.setAr_114(Double.valueOf(getValues(ar114)));
						HSSFCell k001	= hssfRow.getCell(53);
						jbExcelInput.setK_001(Double.valueOf(getValues(k001)));
						HSSFCell h2oc	= hssfRow.getCell(54);
						jbExcelInput.setH2oc(Double.valueOf(getValues(h2oc)));
						HSSFCell lr403	= hssfRow.getCell(55);
						jbExcelInput.setLr_403(Double.valueOf(getValues(lr403)));
						HSSFCell lr402	= hssfRow.getCell(56);
						jbExcelInput.setLr_402(Double.valueOf(getValues(lr402)));
						HSSFCell fiqnh3	= hssfRow.getCell(57);
						jbExcelInput.setFiqnh3(Double.valueOf(getValues(fiqnh3)));
						HSSFCell fiq000	= hssfRow.getCell(58);
						jbExcelInput.setFiq000(Double.valueOf(getValues(fiq000)));
						HSSFCell ipq001	= hssfRow.getCell(59);
						jbExcelInput.setIpq001(Double.valueOf(getValues(ipq001)));
						HSSFCell ipq002	= hssfRow.getCell(60);
						jbExcelInput.setIpq002(Double.valueOf(getValues(ipq002)));
						HSSFCell fiq101	= hssfRow.getCell(61);
						jbExcelInput.setFiq101(Double.valueOf(getValues(fiq101)));
						HSSFCell ftq109	= hssfRow.getCell(62);
						jbExcelInput.setFtq109(Double.valueOf(getValues(ftq109)));
						HSSFCell sysload = hssfRow.getCell(63);
						jbExcelInput.setSystem_load(Double.valueOf(getValues(sysload)));
			
					  list.add(jbExcelInput);
					  Collections.sort(list,new Comparator<JbExcelInput>() {

						@Override
						public int compare(JbExcelInput o1, JbExcelInput o2) {
							if(o1.getData_time().getTime() > o2.getData_time().getTime()){
								return 1;
							}
							if(o1.getData_time().getTime() == o2.getData_time().getTime()){
								return 0;
							}
							
							return -1;
						}
					});
			
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
	
	/*读取玖源数据文件*/
		/*public List<JyExcelInput> readJyXls(String filePath,String year) throws Exception{
		
		String excelPath =filePath;
		String excelPath = "E:\\myeclipse10\\upload\\temp\\0160426000001.xls";
		String excelPath = "webRoot/WEB-INF/lib/0160426000001.xls";
		InputStream is = new FileInputStream(excelPath);//读取文件路径
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		JyExcelInput jyExcelInput = null;
		List<JyExcelInput> list = new ArrayList<JyExcelInput>();
		//循环工作表
	
		for(int numSheet = 0 ; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++){
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if(hssfSheet == null){
				continue;
			}
		
			
			
			//循环Row
			for(int rowNum = 5; rowNum < hssfSheet.getLastRowNum()+1; rowNum ++){
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				
				
				
				
				if(hssfRow != null){
					jyExcelInput = new JyExcelInput();
					HSSFCell time = hssfRow.getCell(0);
					if(time !=null || time.getCellType()!= HSSFCell.CELL_TYPE_BLANK){
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
					SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
					String datetime = getValues(time);
					if(datetime.length()>0){
					String yearmd = year+"年"+datetime;
					
					Date date2 = sdf.parse(yearmd);
					String timeis = sdf1.format(date2);
					
					
					//int isdate = jyDataServices.isSameDate(timeis);
					//ReadExcel readExcel = new ReadExcel();
					//boolean islistdate = readExcel.idsamedates(list, yearmd);
					
						if(isdate==0){
						Date date = sdf.parse(yearmd);
						jyExcelInput.setJytime(date);
						
						HSSFCell FIQ_6003 = hssfRow.getCell(1);
						jyExcelInput.setFIQ_6003(Double.valueOf(getValues(FIQ_6003)));
						
						HSSFCell TI_501 = hssfRow.getCell(2);
						
							jyExcelInput.setTI_501(Double.valueOf(getValues(TI_501)));
							HSSFCell FIQ_6002 = hssfRow.getCell(3);
							jyExcelInput.setFIQ_6002(Double.valueOf(getValues(FIQ_6002)));
							HSSFCell TI_1_51 = hssfRow.getCell(4);
							jyExcelInput.setTI_1_51(Double.valueOf(getValues(TI_1_51)));
							HSSFCell TI_1_85 = hssfRow.getCell(5);
							jyExcelInput.setTI_1_85(Double.valueOf(getValues(TI_1_85)));
							HSSFCell TI_1_90 = hssfRow.getCell(6);
							jyExcelInput.setTI_1_90(Double.valueOf(getValues(TI_1_90)));
							HSSFCell TI_10 = hssfRow.getCell(7);
							jyExcelInput.setTI_10(Double.valueOf(getValues(TI_10)));
							HSSFCell TI_281 = hssfRow.getCell(8);
							jyExcelInput.setTI_281(Double.valueOf(getValues(TI_281)));
							HSSFCell TI_111 = hssfRow.getCell(9);
							jyExcelInput.setTI_111(Double.valueOf(getValues(TI_111)));
							HSSFCell TI_19 = hssfRow.getCell(10);
							jyExcelInput.setTI_19(Double.valueOf(getValues(TI_19)));
							HSSFCell TI_272 = hssfRow.getCell(11);
							jyExcelInput.setTI_272(Double.valueOf(getValues(TI_272)));
							HSSFCell TI_22 = hssfRow.getCell(12);
							jyExcelInput.setTI_22(Double.valueOf(getValues(TI_22)));
							HSSFCell TI_24	= hssfRow.getCell(13);
							jyExcelInput.setTI_24(Double.valueOf(getValues(TI_24)));
							HSSFCell TI_266	= hssfRow.getCell(14);
							jyExcelInput.setTI_266(Double.valueOf(getValues(TI_266)));
							HSSFCell TI_31	= hssfRow.getCell(15);
							jyExcelInput.setTI_31(Double.valueOf(getValues(TI_31)));
							HSSFCell TI_70	= hssfRow.getCell(16);
							jyExcelInput.setTI_70(Double.valueOf(getValues(TI_70)));
							HSSFCell TI_267	= hssfRow.getCell(17);
							jyExcelInput.setTI_267(Double.valueOf(getValues(TI_267)));
							HSSFCell TI_85A	= hssfRow.getCell(18);
							jyExcelInput.setTI_85A(Double.valueOf(getValues(TI_85A)));
							HSSFCell TI_522	= hssfRow.getCell(19);
							jyExcelInput.setTI_522(Double.valueOf(getValues(TI_522)));
							HSSFCell TI_81	= hssfRow.getCell(20);
							jyExcelInput.setTI_81(Double.valueOf(getValues(TI_81)));
							HSSFCell TI_45	= hssfRow.getCell(21);
							jyExcelInput.setTI_45(Double.valueOf(getValues(TI_45)));
							HSSFCell TI_12	= hssfRow.getCell(22);
							jyExcelInput.setTI_12(Double.valueOf(getValues(TI_12)));
							HSSFCell FI_1	= hssfRow.getCell(23);
							jyExcelInput.setFI_1(Double.valueOf(getValues(FI_1)));
							HSSFCell FI_2	= hssfRow.getCell(24);
							jyExcelInput.setFI_2(Double.valueOf(getValues(FI_2)));
							HSSFCell FI_3	= hssfRow.getCell(25);
							jyExcelInput.setFI_3(Double.valueOf(getValues(FI_3)));
							HSSFCell FI_51	= hssfRow.getCell(26);
							jyExcelInput.setFI_51(Double.valueOf(getValues(FI_51)));
							HSSFCell FI_4001	= hssfRow.getCell(27);
							jyExcelInput.setFI_4001(Double.valueOf(getValues(FI_4001)));
							HSSFCell FI_63	= hssfRow.getCell(28);
							jyExcelInput.setFI_63(Double.valueOf(getValues(FI_63)));
							HSSFCell FI_27	= hssfRow.getCell(29);
							jyExcelInput.setFI_27(Double.valueOf(getValues(FI_27)));
							HSSFCell FI_5	= hssfRow.getCell(30);
							jyExcelInput.setFI_5(Double.valueOf(getValues(FI_5)));
							HSSFCell W_C	= hssfRow.getCell(31);
							jyExcelInput.setW_C(Double.valueOf(getValues(W_C)));
							HSSFCell A_C	= hssfRow.getCell(32);
							jyExcelInput.setA_C(Double.valueOf(getValues(A_C)));
							HSSFCell FI_2000	= hssfRow.getCell(33);
							jyExcelInput.setFI_2000(Double.valueOf(getValues(FI_2000)));
							HSSFCell FI_7	= hssfRow.getCell(34);
							jyExcelInput.setFI_7(Double.valueOf(getValues(FI_7)));
							HSSFCell FI_84	= hssfRow.getCell(35);
							jyExcelInput.setFI_84(Double.valueOf(getValues(FI_84)));
							HSSFCell FI_84A	= hssfRow.getCell(36);
							jyExcelInput.setFI_84A(Double.valueOf(getValues(FI_84A)));
							HSSFCell FI_84B	= hssfRow.getCell(37);
							jyExcelInput.setFI_84B(Double.valueOf(getValues(FI_84B)));
							HSSFCell FI_314	= hssfRow.getCell(38);
							jyExcelInput.setFI_314(Double.valueOf(getValues(FI_314)));
							HSSFCell FI_3110 = hssfRow.getCell(39);
							jyExcelInput.setFI_3110(Double.valueOf(getValues(FI_3110)));
							HSSFCell FI_3116	= hssfRow.getCell(40);
							
							jyExcelInput.setFI_3116(Double.valueOf(getValues(FI_3116)));
							HSSFCell FI_3117	= hssfRow.getCell(41);
							jyExcelInput.setFI_3117(Double.valueOf(getValues(FI_3117)));
							
							HSSFCell FI_2301	= hssfRow.getCell(42);
							jyExcelInput.setFI_2301(Double.valueOf(getValues(FI_2301)));
							
							HSSFCell FI_50 =  hssfRow.getCell(43);
							jyExcelInput.setFI_50(Double.valueOf(getValues(FI_50)));
							HSSFCell FI_1502	= hssfRow.getCell(44);
							jyExcelInput.setFI_1502(Double.valueOf(getValues(FI_1502)));
							HSSFCell PI_657	= hssfRow.getCell(45);
							jyExcelInput.setPI_657(Double.valueOf(getValues(PI_657)));
							HSSFCell PI_4	= hssfRow.getCell(46);
							jyExcelInput.setPI_4(Double.valueOf(getValues(PI_4)));
							HSSFCell PI_5	= hssfRow.getCell(47);
							jyExcelInput.setPI_5(Double.valueOf(getValues(PI_5)));
							HSSFCell PI_6	= hssfRow.getCell(48);
							jyExcelInput.setPI_6(Double.valueOf(getValues(PI_6)));
							HSSFCell PI_80	= hssfRow.getCell(49);
							jyExcelInput.setPI_80(Double.valueOf(getValues(PI_80)));
							HSSFCell PI_82	= hssfRow.getCell(50);
							jyExcelInput.setPI_82(Double.valueOf(getValues(PI_82)));
							HSSFCell PI_9	= hssfRow.getCell(51);
							jyExcelInput.setPI_9(Double.valueOf(getValues(PI_9)));
							HSSFCell PI_19	= hssfRow.getCell(52);
							jyExcelInput.setPI_19(Double.valueOf(getValues(PI_19)));
							HSSFCell PI_25	= hssfRow.getCell(53);
							jyExcelInput.setPI_25(Double.valueOf(getValues(PI_25)));
							HSSFCell AIA_5	= hssfRow.getCell(54);
							jyExcelInput.setAIA_5(Double.valueOf(getValues(AIA_5)));
							HSSFCell AIA_5A	= hssfRow.getCell(55);
							jyExcelInput.setAIA_5A(Double.valueOf(getValues(AIA_5A)));
							HSSFCell AI_1	= hssfRow.getCell(56);
							jyExcelInput.setAI_1(Double.valueOf(getValues(AI_1)));
							HSSFCell AI_1B	= hssfRow.getCell(57);
							jyExcelInput.setAI_1B(Double.valueOf(getValues(AI_1B)));
							HSSFCell AI_1401	= hssfRow.getCell(58);
							jyExcelInput.setAI_1401(Double.valueOf(getValues(AI_1401)));
							HSSFCell AI_1401HN	= hssfRow.getCell(59);
							jyExcelInput.setAI_1401HN(Double.valueOf(getValues(AI_1401HN)));
							HSSFCell FIQ_6001	= hssfRow.getCell(60);
							jyExcelInput.setFIQ_6001(Double.valueOf(getValues(FIQ_6001)));
							HSSFCell FIQ_1502	= hssfRow.getCell(61);
							jyExcelInput.setFIQ_1502(Double.valueOf(getValues(FIQ_1502)));
							HSSFCell FIQ_1	= hssfRow.getCell(62);
							jyExcelInput.setFIQ_1(Double.valueOf(getValues(FIQ_1)));
							HSSFCell FIQ_32 = hssfRow.getCell(63);
							jyExcelInput.setFIQ_32(Double.valueOf(getValues(FIQ_32)));
							HSSFCell FI_1_FH = hssfRow.getCell(64);
							jyExcelInput.setFI_1_FH(Double.valueOf(getValues(FI_1_FH)));
							list.add(jyExcelInput);
							Collections.sort(list,new Comparator<JyExcelInput>() {

								@Override
								public int compare(JyExcelInput o1, JyExcelInput o2) {
									if(o1.getJytime().getTime() > o2.getJytime().getTime()){
										return 1;
									}
									if(o1.getJytime().getTime() == o2.getJytime().getTime()){
										return 0;
									}
									
									return -1;
								}
							});
					
					}else{
						continue;
					}
					}
					
				}
					
				}
			}
			
		}
		return list;
		
	}
	*/

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
	public boolean idsamedates(List<JyExcelInput> list,String sametime){
		boolean isdates=true;
		for (JyExcelInput temp : list) {
			Date date = temp.getJytime();
			String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
			if (dateStr.contains(sametime)) {
				isdates= false;
			}else{
				isdates = true; 
				}
			}
		return isdates;
	}

}
