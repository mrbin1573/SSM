package com.saitejn.services.impl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
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
import org.springframework.transaction.annotation.Transactional;

import com.saitejn.mapper.JyExcelInputCustomerMapper;
import com.saitejn.pojo.JfRawdataHandle1;
import com.saitejn.pojo.JyRawdataHandle1;
import com.saitejn.pojo.JyRawdataHandle2;
import com.saitejn.pojo.JyUploadMiddle;
import com.saitejn.services.JY_UploadServices;

@Transactional
public class JY_UploadServicesImpl implements JY_UploadServices{
	@Autowired
	private JyExcelInputCustomerMapper jyExcelInputCustomerMapper;
	private Double average;
	@Override
	public List<JyUploadMiddle> readExcel_jy(String filePath, String year) throws Exception {
		String excelPath =filePath;
		InputStream is = new FileInputStream(excelPath);//读取文件路径
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		JyUploadMiddle jyUploadMiddle = null;
		List<JyUploadMiddle> list = new ArrayList<JyUploadMiddle>();
		for(int numSheet = 0 ; numSheet < hssfWorkbook.getNumberOfSheets();numSheet++){
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if(hssfSheet == null){
				continue;
			}
			for(int rowNum = 5; rowNum <hssfSheet.getLastRowNum()+1; rowNum ++){
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				if(hssfRow != null){
					jyUploadMiddle = new JyUploadMiddle();
					HSSFCell time = hssfRow.getCell(0);
					if(time !=null || time.getCellType()!= HSSFCell.CELL_TYPE_BLANK){
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
						SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						String datetime = getValues(time);
						if(datetime.length()>0){
							String yearmd = year+"年"+datetime;
							Date date2 = sdf.parse(yearmd);
							String timeis = sdf1.format(date2);
							int isdate = jyExcelInputCustomerMapper.findInputByTime_jy(timeis);
							if(isdate == 0){
								Date date = sdf.parse(yearmd);
								jyUploadMiddle.setJytime(date);
								HSSFCell FIQ_6003 = hssfRow.getCell(1);
								jyUploadMiddle.setFIQ_6003(Double.valueOf(getValues(FIQ_6003)));
								HSSFCell TI_501 = hssfRow.getCell(2);
									jyUploadMiddle.setTI_501(Double.valueOf(getValues(TI_501)));
									HSSFCell FIQ_6002 = hssfRow.getCell(3);
									jyUploadMiddle.setFIQ_6002(Double.valueOf(getValues(FIQ_6002)));
									HSSFCell TI_1_51 = hssfRow.getCell(4);
									jyUploadMiddle.setTI_1_51(Double.valueOf(getValues(TI_1_51)));
									HSSFCell TI_1_85 = hssfRow.getCell(5);
									jyUploadMiddle.setTI_1_85(Double.valueOf(getValues(TI_1_85)));
									HSSFCell TI_1_90 = hssfRow.getCell(6);
									jyUploadMiddle.setTI_1_90(Double.valueOf(getValues(TI_1_90)));
									HSSFCell TI_10 = hssfRow.getCell(7);
									jyUploadMiddle.setTI_10(Double.valueOf(getValues(TI_10)));
									HSSFCell TI_281 = hssfRow.getCell(8);
									jyUploadMiddle.setTI_281(Double.valueOf(getValues(TI_281)));
									HSSFCell TI_111 = hssfRow.getCell(9);
									jyUploadMiddle.setTI_111(Double.valueOf(getValues(TI_111)));
									HSSFCell TI_19 = hssfRow.getCell(10);
									jyUploadMiddle.setTI_19(Double.valueOf(getValues(TI_19)));
									HSSFCell TI_272 = hssfRow.getCell(11);
									jyUploadMiddle.setTI_272(Double.valueOf(getValues(TI_272)));
									HSSFCell TI_22 = hssfRow.getCell(12);
									jyUploadMiddle.setTI_22(Double.valueOf(getValues(TI_22)));
									HSSFCell TI_24	= hssfRow.getCell(13);
									jyUploadMiddle.setTI_24(Double.valueOf(getValues(TI_24)));
									HSSFCell TI_266	= hssfRow.getCell(14);
									jyUploadMiddle.setTI_266(Double.valueOf(getValues(TI_266)));
									HSSFCell TI_31	= hssfRow.getCell(15);
									jyUploadMiddle.setTI_31(Double.valueOf(getValues(TI_31)));
									HSSFCell TI_70	= hssfRow.getCell(16);
									jyUploadMiddle.setTI_70(Double.valueOf(getValues(TI_70)));
									HSSFCell TI_267	= hssfRow.getCell(17);
									jyUploadMiddle.setTI_267(Double.valueOf(getValues(TI_267)));
									HSSFCell TI_85A	= hssfRow.getCell(18);
									jyUploadMiddle.setTI_85A(Double.valueOf(getValues(TI_85A)));
									HSSFCell TI_522	= hssfRow.getCell(19);
									jyUploadMiddle.setTI_522(Double.valueOf(getValues(TI_522)));
									HSSFCell TI_81	= hssfRow.getCell(20);
									jyUploadMiddle.setTI_81(Double.valueOf(getValues(TI_81)));
									HSSFCell TI_45	= hssfRow.getCell(21);
									jyUploadMiddle.setTI_45(Double.valueOf(getValues(TI_45)));
									HSSFCell TI_12	= hssfRow.getCell(22);
									jyUploadMiddle.setTI_12(Double.valueOf(getValues(TI_12)));
									HSSFCell FI_1	= hssfRow.getCell(23);
									jyUploadMiddle.setFI_1(Double.valueOf(getValues(FI_1)));
									HSSFCell FI_2	= hssfRow.getCell(24);
									jyUploadMiddle.setFI_2(Double.valueOf(getValues(FI_2)));
									HSSFCell FI_3	= hssfRow.getCell(25);
									jyUploadMiddle.setFI_3(Double.valueOf(getValues(FI_3)));
									HSSFCell FI_51	= hssfRow.getCell(26);
									jyUploadMiddle.setFI_51(Double.valueOf(getValues(FI_51)));
									HSSFCell FI_4001	= hssfRow.getCell(27);
									jyUploadMiddle.setFI_4001(Double.valueOf(getValues(FI_4001)));
									HSSFCell FI_63	= hssfRow.getCell(28);
									jyUploadMiddle.setFI_63(Double.valueOf(getValues(FI_63)));
									HSSFCell FI_27	= hssfRow.getCell(29);
									jyUploadMiddle.setFI_27(Double.valueOf(getValues(FI_27)));
									HSSFCell FI_5	= hssfRow.getCell(30);
									jyUploadMiddle.setFI_5(Double.valueOf(getValues(FI_5)));
									HSSFCell W_C	= hssfRow.getCell(31);
									jyUploadMiddle.setW_C(Double.valueOf(getValues(W_C)));
									HSSFCell A_C	= hssfRow.getCell(32);
									jyUploadMiddle.setA_C(Double.valueOf(getValues(A_C)));
									HSSFCell FI_2000	= hssfRow.getCell(33);
									jyUploadMiddle.setFI_2000(Double.valueOf(getValues(FI_2000)));
									HSSFCell FI_7	= hssfRow.getCell(34);
									jyUploadMiddle.setFI_7(Double.valueOf(getValues(FI_7)));
									HSSFCell FI_84	= hssfRow.getCell(35);
									jyUploadMiddle.setFI_84(Double.valueOf(getValues(FI_84)));
									HSSFCell FI_84A	= hssfRow.getCell(36);
									jyUploadMiddle.setFI_84A(Double.valueOf(getValues(FI_84A)));
									HSSFCell FI_84B	= hssfRow.getCell(37);
									jyUploadMiddle.setFI_84B(Double.valueOf(getValues(FI_84B)));
									HSSFCell FI_314	= hssfRow.getCell(38);
									jyUploadMiddle.setFI_314(Double.valueOf(getValues(FI_314)));
									HSSFCell FI_3110 = hssfRow.getCell(39);
									jyUploadMiddle.setFI_3110(Double.valueOf(getValues(FI_3110)));
									HSSFCell FI_3116	= hssfRow.getCell(40);
									jyUploadMiddle.setFI_3116(Double.valueOf(getValues(FI_3116)));
									HSSFCell FI_3117	= hssfRow.getCell(41);
									jyUploadMiddle.setFI_3117(Double.valueOf(getValues(FI_3117)));
									HSSFCell FI_2301	= hssfRow.getCell(42);
									jyUploadMiddle.setFI_2301(Double.valueOf(getValues(FI_2301)));
									HSSFCell FI_50 =  hssfRow.getCell(43);
									jyUploadMiddle.setFI_50(Double.valueOf(getValues(FI_50)));
									HSSFCell FI_1502	= hssfRow.getCell(44);
									jyUploadMiddle.setFI_1502(Double.valueOf(getValues(FI_1502)));
									HSSFCell PI_657	= hssfRow.getCell(45);
									jyUploadMiddle.setPI_657(Double.valueOf(getValues(PI_657)));
									HSSFCell PI_4	= hssfRow.getCell(46);
									jyUploadMiddle.setPI_4(Double.valueOf(getValues(PI_4)));
									HSSFCell PI_5	= hssfRow.getCell(47);
									jyUploadMiddle.setPI_5(Double.valueOf(getValues(PI_5)));
									HSSFCell PI_6	= hssfRow.getCell(48);
									jyUploadMiddle.setPI_6(Double.valueOf(getValues(PI_6)));
									HSSFCell PI_80	= hssfRow.getCell(49);
									jyUploadMiddle.setPI_80(Double.valueOf(getValues(PI_80)));
									HSSFCell PI_82	= hssfRow.getCell(50);
									jyUploadMiddle.setPI_82(Double.valueOf(getValues(PI_82)));
									HSSFCell PI_9	= hssfRow.getCell(51);
									jyUploadMiddle.setPI_9(Double.valueOf(getValues(PI_9)));
									HSSFCell PI_19	= hssfRow.getCell(52);
									jyUploadMiddle.setPI_19(Double.valueOf(getValues(PI_19)));
									HSSFCell PI_25	= hssfRow.getCell(53);
									jyUploadMiddle.setPI_25(Double.valueOf(getValues(PI_25)));
									HSSFCell AIA_5	= hssfRow.getCell(54);
									jyUploadMiddle.setAIA_5(Double.valueOf(getValues(AIA_5)));
									HSSFCell AIA_5A	= hssfRow.getCell(55);
									jyUploadMiddle.setAIA_5A(Double.valueOf(getValues(AIA_5A)));
									HSSFCell AI_1	= hssfRow.getCell(56);
									jyUploadMiddle.setAI_1(Double.valueOf(getValues(AI_1)));
									HSSFCell AI_1B	= hssfRow.getCell(57);
									jyUploadMiddle.setAI_1B(Double.valueOf(getValues(AI_1B)));
									HSSFCell AI_1401	= hssfRow.getCell(58);
									jyUploadMiddle.setAI_1401(Double.valueOf(getValues(AI_1401)));
									HSSFCell AI_1401HN	= hssfRow.getCell(59);
									jyUploadMiddle.setAI_1401HN(Double.valueOf(getValues(AI_1401HN)));
									HSSFCell FIQ_6001	= hssfRow.getCell(60);
									jyUploadMiddle.setFIQ_6001(Double.valueOf(getValues(FIQ_6001)));
									HSSFCell FIQ_1502	= hssfRow.getCell(61);
									jyUploadMiddle.setFIQ_1502(Double.valueOf(getValues(FIQ_1502)));
									HSSFCell FIQ_1	= hssfRow.getCell(62);
									jyUploadMiddle.setFIQ_1(Double.valueOf(getValues(FIQ_1)));
									HSSFCell FIQ_32 = hssfRow.getCell(63);
									jyUploadMiddle.setFIQ_32(Double.valueOf(getValues(FIQ_32)));
									HSSFCell FI_1_FH = hssfRow.getCell(64);
									jyUploadMiddle.setFI_1_FH(Double.valueOf(getValues(FI_1_FH)));
									list.add(jyUploadMiddle);
									Collections.sort(list,new Comparator<JyUploadMiddle>() {
										@Override
										public int compare(JyUploadMiddle o1, JyUploadMiddle o2) {
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

	@Override
	public void insertDataToMiddle_jy(JyUploadMiddle jyUploadMiddle)
			throws Exception {
		jyExcelInputCustomerMapper.insertDataToUoloadMiddle_jy(jyUploadMiddle);
	}

	@Override
	public void insertDataToExcel_jy(JyUploadMiddle jyUploadMiddle)
			throws Exception {
		jyExcelInputCustomerMapper.insertDataToExcel_jy(jyUploadMiddle);
	}

	@Override
	public void insertDataToHand1_jy() throws Exception {
		List<JyRawdataHandle1> jyRawdataHandle1s = jyExcelInputCustomerMapper.selectUploadMiddle_jy();
		
		JyRawdataHandle1 jyRawdataHandle1 = jyExcelInputCustomerMapper.selectTopOneHandle1_jy();
		
		if(jyRawdataHandle1 != null){
			jyRawdataHandle1.setJytime(jyRawdataHandle1.get时间());
			jyRawdataHandle1.setFIQ_1(jyRawdataHandle1.get累积原料气耗());
			jyRawdataHandle1.setFIQ_32(jyRawdataHandle1.get累积燃料气耗());
			jyRawdataHandle1.setFIQ_6003(jyRawdataHandle1.get累积快锅燃气());
			jyRawdataHandle1.setFIQ_6002(jyRawdataHandle1.get累积快锅产汽());
			jyRawdataHandle1.setFIQ_6001(jyRawdataHandle1.get累积总气耗());
			jyRawdataHandle1.setFIQ_1502(jyRawdataHandle1.get累积氨产量()*1000);
			jyRawdataHandle1s.add(jyRawdataHandle1);
			 
			Collections.sort(jyRawdataHandle1s,new Comparator<JyRawdataHandle1>() {
				@Override
				public int compare(JyRawdataHandle1 o1, JyRawdataHandle1 o2) {
					if(o1.getJytime().getTime() > o2.getJytime().getTime()){
						return 1;
					}
					if(o1.getJytime().getTime() == o2.getJytime().getTime()){
						return 0;
					}
					return -1;
				}
			});
		}
		if(jyRawdataHandle1s.size()>0){
			for(int i = 0 ; i< jyRawdataHandle1s.size()-1;i++){
				JyRawdataHandle1 btime = jyRawdataHandle1s.get(i);
				JyRawdataHandle1 etime = jyRawdataHandle1s.get(i+1);
				Date datetimeDate = btime.getJytime();
				
				btime.set时间(datetimeDate);
				
				btime.set累积氨产量(btime.getFIQ_1502()/1000);
				btime.set累积总气耗(btime.getFIQ_6001());
				btime.set累积原料气耗(btime.getFIQ_1());
				btime.set累积燃料气耗(btime.getFIQ_32());
				btime.set累积快锅燃气(btime.getFIQ_6003());
				btime.set累积快锅产汽(btime.getFIQ_6002());
				//原始计算后的数据
				//计算后的时段氨产量，没有精确度
				Double timeNh3 = btime.getFIQ_1502()/1000-etime.getFIQ_1502()/1000;
				BigDecimal b = new BigDecimal(timeNh3);
				//四舍五入后，保留三位小数的时段氨产量
				Double etimeNh3 = b.setScale(4,BigDecimal.ROUND_HALF_UP).doubleValue();
				btime.set时段氨产量(etimeNh3);
				
				//时段总气耗计算
				Double timegascon = btime.getFIQ_6001()-etime.getFIQ_6001();
				BigDecimal btimegascon = new BigDecimal(timegascon);
				//四舍五入后，保留三位小数的时段氨产量
				Double etimegascon = btimegascon.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
				btime.set时段总气耗(etimegascon);
				
				//时段时段原料气耗计算
				Double timerawcon = btime.getFIQ_1()-etime.getFIQ_1();
				BigDecimal btimerawcon = new BigDecimal(timerawcon);
				//四舍五入后，保留三位小数的时段氨产量
				Double etimerawcon = btimerawcon.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
				btime.set时段原料气耗(etimerawcon);
				
				//时段时段燃料气耗计算
				Double timefuecon = btime.getFIQ_32()-etime.getFIQ_32();
				BigDecimal btimefuecon = new BigDecimal(timefuecon);
				//四舍五入后，保留三位小数的时段氨产量
				Double etimefuecon = btimefuecon.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
				btime.set时段燃料气耗(etimefuecon);
				
				//时段快锅气耗计算
				Double timefastgcon = btime.getFIQ_6003()-etime.getFIQ_6003();
				BigDecimal btimefastgcon = new BigDecimal(timefastgcon);
				//四舍五入后，保留三位小数的时段氨产量
				Double etimefastgcon = btimefastgcon.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
				btime.set时段快锅气耗(etimefastgcon);
				
				//时段净蒸汽耗計算
				Double timecleancon = btime.getFI_3110()*1000*0.1071/6-btime.getFI_3116()*1000*0.1071/6+btime.getFI_3117()*1000*0.0929/6+btime.getFI_2301()*1000*0.0929/6;
				BigDecimal btimecleancon = new BigDecimal(timecleancon);
				//四舍五入后，保留三位小数的时段氨产量
				Double etimecleancon = btimecleancon.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
				btime.set时段净蒸汽耗(etimecleancon);
				
				//时段气耗計算 时段总气耗-时段快锅气耗
				Double timeongas = timegascon-timefastgcon;
				BigDecimal btimeongas = new BigDecimal(timeongas);
				//四舍五入后，保留三位小数的时段氨产量
				Double etimeongas = btimeongas.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
				btime.set时段气耗(etimeongas);
				
				//时段气耗_含蒸汽折算计算   时段气耗+时段净蒸汽耗÷1.2143
			    Double timegasteamcon = timeongas+timecleancon/1.2143;
			    BigDecimal btimegasteamcon = new BigDecimal(timegasteamcon);
				//四舍五入后，保留三位小数的时段氨产量
				Double etimegasteamcon = btimegasteamcon.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
				btime.set时段气耗_含蒸汽折算(etimegasteamcon);
				
				//系统负荷计算
				btime.set系统负荷(btime.getFI_1_FH());
				
				//小时氨产量计算 时段氨产量×6
				Double hourNh3 = timeNh3*6;
				BigDecimal bhourNh3 = new BigDecimal(hourNh3);
				//四舍五入后，保留三位小数的时段氨产量
				Double ehourNh3 = bhourNh3.setScale(4,BigDecimal.ROUND_HALF_UP).doubleValue();
				btime.set小时氨产量(ehourNh3);
				
				//吨氨气耗_含蒸汽折算 计算  时段气耗（含蒸汽折算）÷ 时段氨产量
				Double tongascon = timegasteamcon/timeNh3;
				BigDecimal btongascon = new BigDecimal(tongascon);
				//四舍五入后，保留三位小数的时段氨产量
				Double etongascon = btongascon.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
				btime.set吨氨气耗_含蒸汽折算(etongascon);
				
				//吨氨综合消耗计算 1.2143×吨氨气耗（含蒸汽折算）
				Double tonNh3con= 1.2143*tongascon;
				BigDecimal btonNh3con = new BigDecimal(tonNh3con);
				//四舍五入后，保留三位小数的时段氨产量
				Double etonNh3con = btonNh3con.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
				btime.set吨氨综合消耗(etonNh3con);
				
				//吨氨气耗 计算 时段气耗÷ 时段氨产量
				Double tonNh3gascon = timeongas/timeNh3;
				BigDecimal btonNh3gascon = new BigDecimal(tonNh3gascon);
				//四舍五入后，保留三位小数的时段氨产量
				Double etonNh3gascon = btonNh3gascon.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
				btime.set吨氨气耗(etonNh3gascon);
				
				//吨氨原料气耗计算 时段原料气耗÷ 时段氨产量
				Double tonNh3rawcon = timerawcon/timeNh3;
				BigDecimal btonNh3rawcon = new BigDecimal(tonNh3rawcon);
				//四舍五入后，保留三位小数的时段氨产量
				Double etonNh3rawcon = btonNh3rawcon.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
				btime.set吨氨原料气耗(etonNh3rawcon);
				
				//吨氨燃料气耗计算  时段燃料气耗÷ 时段氨产量
				Double tonNh3fuecon = timefuecon/timeNh3;
				BigDecimal btonNh3fuecon = new BigDecimal(tonNh3fuecon);
				//四舍五入后，保留三位小数的时段氨产量
				Double etonNh3fuecon = btonNh3fuecon.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
				btime.set吨氨燃料气耗(etonNh3fuecon);
				
				//班次计算
				btime.set班次(1);
				jyExcelInputCustomerMapper.insertDataToHandle1_jy(btime);
				jyExcelInputCustomerMapper.insertDataToHandlMiddle_jy(btime);
			}
		}
		
	}
	 int ycxs=0;
	@Override
	public void insertDataToHand2_jy() throws Exception {
		List<JyRawdataHandle2> jyRawdataHandle2s = jyExcelInputCustomerMapper.selectHandlMiddle_jy();
		if(jyRawdataHandle2s.size()>0){
			 Double total_hour_nh3_yield = 0.0;
			for(int i = 0; i<jyRawdataHandle2s.size();i++){
				JyRawdataHandle2 handle2 = jyRawdataHandle2s.get(i);
				 Double hour_nh3_yield = handle2.get小时氨产量();
				  if(hour_nh3_yield >100.00){
			  		   ycxs++;
			  	   }else{
			  		 //小时氨产量的总数
				  	 total_hour_nh3_yield += hour_nh3_yield;
			  	   }
			}
			 //平均氨产量
	  	   Double average = total_hour_nh3_yield/jyRawdataHandle2s.size()-ycxs;
	  	   BigDecimal baverage = new BigDecimal(average);
				Double eaverage = baverage.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
	  	   this.average = eaverage;
		}
		for(int h = 0 ; h <jyRawdataHandle2s.size();h++){
			 
			JyRawdataHandle2 handle2 = jyRawdataHandle2s.get(h);
			  Double hour_nh3_yield = handle2.get小时氨产量();
			  Double aver = hour_nh3_yield-average;
	    	  aver = new Double(Math.abs(aver.doubleValue()));
	    	  /*if((aver>average*0.35)){
	    		  continue;
	    	  }else{*/
	    		 jyExcelInputCustomerMapper.insertDataToHandle2_jy(handle2);
	    	 /* }*/
		}
	}

	@Override
	public void deleteUploadMiddle_jy() throws Exception {
		jyExcelInputCustomerMapper.deleteDataForUploadMiddle_jy();
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
	public void deleterawdataMiddle_jy() throws Exception {
		jyExcelInputCustomerMapper.deleteDataForHandlMiddle_jy();
	}

	@Override
	public JyRawdataHandle1 getLastTime_jy() throws Exception {
		return jyExcelInputCustomerMapper.getLastTime();
	}

}
