package com.saitejn.services.impl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import com.saitejn.mapper.AdminCustomerMapper;
import com.saitejn.mapper.AdminDataMapper;
import com.saitejn.mapper.AdminGuideDataMapper;
import com.saitejn.mapper.AdminguideifoMapper;
import com.saitejn.mapper.FileupifoCustomerMapper;
import com.saitejn.mapper.JB_EnergyMapper;
import com.saitejn.mapper.JbExcelInputCustomerMapper;
import com.saitejn.mapper.JbExceluploadCustomerMapper;
import com.saitejn.mapper.JbRawdataHandle1CustomerMapper;
import com.saitejn.mapper.JbRawdataHandle2Mapper;
import com.saitejn.pojo.Adminguideifo;
import com.saitejn.pojo.FileUpInfo;
import com.saitejn.pojo.JbClassinfor;
import com.saitejn.pojo.JbExcelInput;
import com.saitejn.pojo.JbExcelMiddle;
import com.saitejn.pojo.JbGuiImg;
import com.saitejn.pojo.JbRawdataHandle1;
import com.saitejn.pojo.JbRawdataHandle2;
import com.saitejn.pojo.JbUploadMiddle;
import com.saitejn.pojo.Jb_csv;
import com.saitejn.pojo.Jb_feedback01;
import com.saitejn.pojo.Jb_feedback02;
import com.saitejn.pojo.Jb_feedback05;
import com.saitejn.pojo.Messageleaving;
import com.saitejn.services.JB_UploadServices;
import com.saitejn.util.SheetCopy;

public class JB_UploadServicesImpl implements JB_UploadServices{
	@Autowired
	private JbExceluploadCustomerMapper jbExcelloadCustomerMapper;
	@Autowired
	private AdminDataMapper adminDataMapper;
	@Autowired
	private AdminCustomerMapper jbPushgrid11CustomerMapper;
	@Autowired
	private JbExcelInputCustomerMapper jbExcelInputCustomerMapper;
	@Autowired
	private JbRawdataHandle1CustomerMapper jbRawdataHandle1CustomerMapper;
	@Autowired JbRawdataHandle2Mapper jbRawdataHandle2Mapper;
	@Autowired
	private JB_EnergyMapper jb_EnergyMapper;
	@Autowired
	private AdminGuideDataMapper adminGuideDataMapper;
	@Autowired
	private AdminguideifoMapper adminguideifoMapper;
	@Autowired
	private FileupifoCustomerMapper fileupifoCustomerMapper;

	private Double average;
	@Override
	public List<JbUploadMiddle> readJbXls(String filePath) throws Exception {
		String excelPath =filePath;
		InputStream is = new FileInputStream(excelPath);//读取文件路径
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		JbUploadMiddle jbUploadMiddle = null;
		List<JbUploadMiddle> list = new ArrayList<JbUploadMiddle>();
		for(int numSheet = 0 ; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++){
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if(hssfSheet == null){
				continue;
			}
			for(int rowNum = 1; rowNum <hssfSheet.getLastRowNum()+1; rowNum ++){
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				if(hssfRow != null){
					jbUploadMiddle = new JbUploadMiddle();
					HSSFCell time = hssfRow.getCell(0);
				if(!(time==null||time.equals("")||time.getCellType() ==HSSFCell.CELL_TYPE_BLANK)){
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
					SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String datetime = getValues(time);
					if(datetime.length()>0){
						Date date = sdf.parse(datetime);
						String timeis = sdf1.format(date);
						int isdate = jbExcelloadCustomerMapper.fingInputByJbtime(timeis);
						if(isdate==0){
							int hdate = jbExcelloadCustomerMapper.selectCountforupmiddle(timeis);
							if(hdate==0){
							jbUploadMiddle.setData_time(date);
							HSSFCell fi103 = hssfRow.getCell(1);
							if(!(fi103==null||fi103.equals("")||fi103.getCellType() ==HSSFCell.CELL_TYPE_BLANK)){
								jbUploadMiddle.setFi_103(Double.valueOf(getValues(fi103)));
								HSSFCell fi000 = hssfRow.getCell(2);
								jbUploadMiddle.setFi_000(Double.valueOf(getValues(fi000)));
								HSSFCell fi104 = hssfRow.getCell(3);
								jbUploadMiddle.setFi_104(Double.valueOf(getValues(fi104)));
								HSSFCell fi101 = hssfRow.getCell(4);
								jbUploadMiddle.setFi_101(Double.valueOf(getValues(fi101)));
								HSSFCell fi106 = hssfRow.getCell(5);
								jbUploadMiddle.setFi_106(Double.valueOf(getValues(fi106)));
								HSSFCell fi109 = hssfRow.getCell(6);
								jbUploadMiddle.setFi_109(Double.valueOf(getValues(fi109)));
								HSSFCell fr401 = hssfRow.getCell(7);
								jbUploadMiddle.setFr_401(Double.valueOf(getValues(fr401)));
								HSSFCell fr402 = hssfRow.getCell(8);
								jbUploadMiddle.setFr_402(Double.valueOf(getValues(fr402)));
								HSSFCell fr405 = hssfRow.getCell(9);
								jbUploadMiddle.setFr_405(Double.valueOf(getValues(fr405)));
								HSSFCell fr406 = hssfRow.getCell(10);
								jbUploadMiddle.setFr_406(Double.valueOf(getValues(fr406)));
								HSSFCell fr407 = hssfRow.getCell(11);
			                    jbUploadMiddle.setFr_407(Double.valueOf(getValues(fr407)));
								HSSFCell fr408 = hssfRow.getCell(12);
								jbUploadMiddle.setFr_408(Double.valueOf(getValues(fr408)));
								HSSFCell fi410	= hssfRow.getCell(13);
								jbUploadMiddle.setFi_410(Double.valueOf(getValues(fi410)));
								HSSFCell finh3	= hssfRow.getCell(14);
								jbUploadMiddle.setFi_NH3(Double.valueOf(getValues(finh3)));
								HSSFCell fr141	= hssfRow.getCell(15);
								jbUploadMiddle.setFr_141(Double.valueOf(getValues(fr141)));
								HSSFCell fr142	= hssfRow.getCell(16);
								jbUploadMiddle.setFr_142(Double.valueOf(getValues(fr142)));
								HSSFCell fr143	= hssfRow.getCell(17);
								jbUploadMiddle.setFr_143(Double.valueOf(getValues(fr143)));
								HSSFCell ti122	= hssfRow.getCell(18);
								jbUploadMiddle.setTi_122(Double.valueOf(getValues(ti122)));
								HSSFCell ti123	= hssfRow.getCell(19);
								jbUploadMiddle.setTi_123(Double.valueOf(getValues(ti123)));
								HSSFCell ti164	= hssfRow.getCell(20);
								jbUploadMiddle.setTi_164(Double.valueOf(getValues(ti164)));
								HSSFCell ti131	= hssfRow.getCell(21);
								jbUploadMiddle.setTi_131(Double.valueOf(getValues(ti131)));
								HSSFCell ti132	= hssfRow.getCell(22);
								jbUploadMiddle.setTi_132(Double.valueOf(getValues(ti132)));
								HSSFCell ti211	= hssfRow.getCell(23);
								jbUploadMiddle.setTi_211(Double.valueOf(getValues(ti211)));
								HSSFCell ti210a	= hssfRow.getCell(24);
								jbUploadMiddle.setTi_210a(Double.valueOf(getValues(ti210a)));
								HSSFCell ti134	= hssfRow.getCell(25);
								jbUploadMiddle.setTi_134(Double.valueOf(getValues(ti134)));
								HSSFCell ti215	= hssfRow.getCell(26);
								jbUploadMiddle .setTi_215(Double.valueOf(getValues(ti215)));
								HSSFCell tr413	= hssfRow.getCell(27);
								jbUploadMiddle.setTr_413(Double.valueOf(getValues(tr413)));
								HSSFCell tr403	= hssfRow.getCell(28);
								jbUploadMiddle.setTr_403(Double.valueOf(getValues(tr403)));
								HSSFCell tr407	= hssfRow.getCell(29);
								jbUploadMiddle.setTr_407(Double.valueOf(getValues(tr407)));
								HSSFCell ti407a	= hssfRow.getCell(30);
								jbUploadMiddle.setTi_407a(Double.valueOf(getValues(ti407a)));
								HSSFCell ti407b	= hssfRow.getCell(31);
								jbUploadMiddle.setTi_407b(Double.valueOf(getValues(ti407b)));
								HSSFCell pi213	= hssfRow.getCell(32);
								jbUploadMiddle.setPi_213(Double.valueOf(getValues(pi213)));
								HSSFCell pi105	= hssfRow.getCell(33);
								jbUploadMiddle.setPi_105(Double.valueOf(getValues(pi105)));
								HSSFCell pi112	= hssfRow.getCell(34);
								jbUploadMiddle.setPi_112(Double.valueOf(getValues(pi112)));
								HSSFCell pi114	= hssfRow.getCell(35);
								jbUploadMiddle.setPi_114(Double.valueOf(getValues(pi114)));
								HSSFCell pi234	= hssfRow.getCell(36);
								jbUploadMiddle.setPi_234(Double.valueOf(getValues(pi234)));
								HSSFCell pr401	= hssfRow.getCell(37);
								jbUploadMiddle.setPr_401(Double.valueOf(getValues(pr401)));
								HSSFCell pr403	= hssfRow.getCell(38);
								jbUploadMiddle.setPr_403(Double.valueOf(getValues(pr403)));
								HSSFCell ipq003 = hssfRow.getCell(39);
								jbUploadMiddle.setIpq003(Double.valueOf(getValues(ipq003)));
								HSSFCell pi422	= hssfRow.getCell(40);
								jbUploadMiddle.setPi_422(Double.valueOf(getValues(pi422)));
								HSSFCell pr416	= hssfRow.getCell(41);
								jbUploadMiddle.setPr_416(Double.valueOf(getValues(pr416)));
								HSSFCell pi288	= hssfRow.getCell(42);
								jbUploadMiddle.setPi_288(Double.valueOf(getValues(pi288)));
								HSSFCell ipq004 =  hssfRow.getCell(43);
								jbUploadMiddle.setIpq004(Double.valueOf(getValues(ipq004)));
								HSSFCell ar101	= hssfRow.getCell(44);
								jbUploadMiddle.setAr_101(Double.valueOf(getValues(ar101)));
								HSSFCell ar109	= hssfRow.getCell(45);
								jbUploadMiddle.setAr_109(Double.valueOf(getValues(ar109)));
								HSSFCell ar110	= hssfRow.getCell(46);
								jbUploadMiddle.setAr_110(Double.valueOf(getValues(ar110)));
								HSSFCell ai104	= hssfRow.getCell(47);
								jbUploadMiddle.setAi_104(Double.valueOf(getValues(ai104)));
								HSSFCell ai103	= hssfRow.getCell(48);
								jbUploadMiddle.setAi_103(Double.valueOf(getValues(ai103)));
								HSSFCell ar111	= hssfRow.getCell(49);
								jbUploadMiddle.setAr_111(Double.valueOf(getValues(ar111)));
								HSSFCell ar112	= hssfRow.getCell(50);
								jbUploadMiddle.setAr_112(Double.valueOf(getValues(ar112)));
								HSSFCell ar113	= hssfRow.getCell(51);
								jbUploadMiddle.setAr_113(Double.valueOf(getValues(ar113)));
								HSSFCell ar114	= hssfRow.getCell(52);
								jbUploadMiddle.setAr_114(Double.valueOf(getValues(ar114)));
								HSSFCell k001	= hssfRow.getCell(53);
								jbUploadMiddle.setK_001(Double.valueOf(getValues(k001)));
								HSSFCell h2oc	= hssfRow.getCell(54);
								String h = getValues(h2oc);
								if(h.equals("1.#I")){
									jbUploadMiddle.setH2oc(99999999.9);
								}else{
								jbUploadMiddle.setH2oc(Double.valueOf(getValues(h2oc)));
								}
								HSSFCell lr403	= hssfRow.getCell(55);
								jbUploadMiddle.setLr_403(Double.valueOf(getValues(lr403)));
								HSSFCell lr402	= hssfRow.getCell(56);
								jbUploadMiddle.setLr_402(Double.valueOf(getValues(lr402)));
								HSSFCell fiqnh3	= hssfRow.getCell(57);
								jbUploadMiddle.setFiqnh3(Double.valueOf(getValues(fiqnh3)));
								HSSFCell fiq000	= hssfRow.getCell(58);
								jbUploadMiddle.setFiq000(Double.valueOf(getValues(fiq000)));
								HSSFCell ipq001	= hssfRow.getCell(59);
								jbUploadMiddle.setIpq001(Double.valueOf(getValues(ipq001)));
								HSSFCell ipq002	= hssfRow.getCell(60);
								jbUploadMiddle.setIpq002(Double.valueOf(getValues(ipq002)));
								HSSFCell fiq101	= hssfRow.getCell(61);
								jbUploadMiddle.setFiq101(Double.valueOf(getValues(fiq101)));
								HSSFCell ftq109	= hssfRow.getCell(62);
								jbUploadMiddle.setFtq109(Double.valueOf(getValues(ftq109)));
								HSSFCell sysload = hssfRow.getCell(63);
								jbUploadMiddle.setSystem_load(Double.valueOf(getValues(sysload)));
								list.add(jbUploadMiddle);
							}
					  Collections.sort(list,new Comparator<JbUploadMiddle>() {
						@Override
						public int compare(JbUploadMiddle o1, JbUploadMiddle o2) {
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
	public void saveDatetomiddle(JbUploadMiddle jbUploadMiddle)
			throws Exception {
		
		jbExcelloadCustomerMapper.saveDatetomiddle(jbUploadMiddle);
	}
		@Override
	public void saveDatetoHandl1()
			throws Exception {
		List<JbRawdataHandle1> jbRawdataHandle1s = jbExcelloadCustomerMapper.selectAllJbMiddle();
		//先转换数据
		for(int h = 0;h <jbRawdataHandle1s.size();h++){
			JbRawdataHandle1 jbRawdataHandle1 = jbRawdataHandle1s.get(h);
			jbRawdataHandle1.setIpq001(jbRawdataHandle1.getQ1());
			jbRawdataHandle1.setIpq002(jbRawdataHandle1.getQ2());
			jbRawdataHandle1.setIpq003(jbRawdataHandle1.getQ3());
			jbRawdataHandle1.setIpq004(jbRawdataHandle1.getQ4());
		}
		
		JbRawdataHandle1 jbRawdataHandle1 = jbExcelloadCustomerMapper.selectTopOneHandl1();
		if(jbRawdataHandle1 != null){
			jbRawdataHandle1s.add(jbRawdataHandle1);
			 Collections.sort(jbRawdataHandle1s,new Comparator<JbRawdataHandle1>() {

					@Override
					public int compare(JbRawdataHandle1 o1, JbRawdataHandle1 o2) {
						if(o1.getData_time().getTime() > o2.getData_time().getTime()){
							return 1;
						}
						if(o1.getData_time().getTime() == o2.getData_time().getTime()){
							return 0;
						}
						
						return -1;
					}
				});
		}
		 
		if(jbRawdataHandle1s.size() >0){
			 for(int i = 0 ;i<jbRawdataHandle1s.size()-1;i++){
				 JbRawdataHandle1 ftime = jbRawdataHandle1s.get(i);
				 JbRawdataHandle1 btime = jbRawdataHandle1s.get(i+1);
				//计算后的时段氨产量，没有精确度
					Double timeNh3 = btime.getFiqnh3()-ftime.getFiqnh3();
					BigDecimal b = new BigDecimal(timeNh3);
					//四舍五入后，保留三位小数的时段氨产量
					Double etimeNh3 = b.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
					btime.setTime_nh3_yield(etimeNh3);
					
					//时段电耗计算
					//时段电耗1
					Double timeIpq01 = btime.getIpq001()-ftime.getIpq001();
					//时段电耗2
					Double timeIpq02 = btime.getIpq002()-ftime.getIpq002();
					
					//时段电耗3
					Double timeIpq03 = btime.getIpq003()-ftime.getIpq003();
					
					//时段电耗4
					Double timeIpq04 = btime.getIpq004()-ftime.getIpq004();
					//时段电耗
					Double ebIpq = timeIpq01+timeIpq02-timeIpq03-timeIpq04;
					//四舍五入保留两位小数时段电耗
					BigDecimal bi = new BigDecimal(ebIpq);
					Double eebIpq = bi.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
					btime.setTime_electric_consume(eebIpq);
					
					//时段原料气耗计算
					Double timefiq = btime.getFiq101()-ftime.getFiq101();
					BigDecimal bf = new BigDecimal(timefiq);
					Double etimefiq = bf.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
					btime.setTime_raw_gas_consume(etimefiq);
					//时段燃料气耗
					Double timeftq = btime.getFtq109()-ftime.getFtq109();
					BigDecimal bt = new BigDecimal(timeftq);
					Double etimeftq = bt.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
					btime.setTime_fuel_consume(etimeftq);
					//时段气耗
					Double timefiq000 = btime.getFiq000()-ftime.getFiq000();
					BigDecimal biq = new BigDecimal(timefiq000);
					Double etimefiq000 = biq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
					btime.setTime_gas_consume(etimefiq000);
					//系统负荷
					
					Double sysload = btime.getFi_101()/5600*100;
					BigDecimal bfi = new BigDecimal(sysload);
					Double esysload = bfi.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
					btime.setSystem_load(esysload);
					//小时氨产量计算
					Double hourNh3 = 6*timeNh3;
					BigDecimal bhn = new BigDecimal(hourNh3);
					Double ehourNh3 = bhn.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
					btime.setHour_nh3_yield(ehourNh3);
					//吨氨气耗计算
					Double tFiq = 0.0;
					Double etFiq = 0.0;
					 Double tIpq = 0.0;
					 Double etIpq = 0.0 ;
					 Double etftq = 0.0;
					if(timeNh3 != 0){
						 tFiq = timefiq000/timeNh3;
						BigDecimal bfiq = new BigDecimal(tFiq);
						 etFiq = bfiq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
						  tIpq = ebIpq/timeNh3;
						BigDecimal bipq = new BigDecimal(tIpq);
						 etIpq = bipq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
						 Double tfiq = timefiq/timeNh3;
						BigDecimal btfiq = new BigDecimal(tfiq);
						Double etfiq = btfiq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
						btime.setTonnh3_raw_gas_consume(etfiq);
						//吨氨燃料气耗
						Double tftq = timeftq/timeNh3;
						BigDecimal btftq = new BigDecimal(tftq);
						etftq = btftq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							
					}else{
						btime.setTonnh3_raw_gas_consume(0.0);
					}
					
					//吨氨电耗计算
					
					//吨氨综合消耗计算
					Double tNh3 = (1.2143*tFiq+0.1229*tIpq);
					BigDecimal btnh3 = new BigDecimal(tNh3);
					Double etNh3 = btnh3.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
					btime.setTonnh3_compre_consume(etNh3);
					btime.setTonnh3_gas_consume(etFiq);
					//吨氨原料气耗计算
					
					
					btime.setTonnh3_fuel_consume(etftq);
					btime.setTonnh3_electric_consume(etIpq);
					//班次计算
					//获取用户信息里的班次信息
					
					//根据时间获取对应的班次信息
					Date date = btime.getData_time();
					String classtime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
					//截取年
					String year = classtime.substring(0, 10);
					JbClassinfor jbClassinfor = jbExcelloadCustomerMapper.seclectByTime(year);
				
					//截取时分秒
					String mdate = classtime.substring(11, 19);
					
					
					if(isInTime("00:00-08:01", mdate)){
						Calendar mvc = Calendar.getInstance(); 
						mvc.setTime(date); 
						mvc.set(Calendar.DATE, mvc.get(Calendar.DATE) - 1);
						Date date2 = mvc.getTime();
						String newclasstime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date2);
						//截取年
						String nyear = newclasstime.substring(0, 10);
						JbClassinfor njbClassinfor = jbExcelloadCustomerMapper.seclectByTime(nyear);
						int m = njbClassinfor.getAftclass();
						btime.setShift(m);
						
					}
					
					
					if(isInTime("08:01-20:01", mdate)){
						int m = jbClassinfor.getMorclass();
						btime.setShift(m);
					}
					if(isInTime("20:01-23:59", mdate)){
						int a = jbClassinfor.getAftclass();
						btime.setShift(a);
					}
					
				 jbExcelloadCustomerMapper.saveDatetoHandl1(btime);
				 jbExcelloadCustomerMapper.saveDatetoHandlMiddle(btime);
				 
			 }
		 }
		
	}
	@Override
	public void saveDatetoHandl2() throws Exception {
	
		List<JbRawdataHandle2> jbRawdataHandle2s = jbExcelloadCustomerMapper.selectAllHandleMiddle();
		 //定义总的小时氨产量
		Double total_hour_nh3_yield = 0.0;
		
       //获取平均值
       for(int k = 0; k<jbRawdataHandle2s.size();k++){
    	   JbRawdataHandle2 handle1 = jbRawdataHandle2s.get(k);
    	
	  	   //小时氨产量
	  	   Double hour_nh3_yield = handle1.getHour_nh3_yield();
	  	   //小时氨产量的总数
	  	   total_hour_nh3_yield += hour_nh3_yield;
	  	   //平均氨产量
	  	   Double average = total_hour_nh3_yield/jbRawdataHandle2s.size();
	  	  
	  	   BigDecimal baverage = new BigDecimal(average);
				Double eaverage = baverage.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
	  	   this.average = eaverage;
		       }
		if(jbRawdataHandle2s.size()>0){
			for(int i = 0; i<jbRawdataHandle2s.size();i++){
				JbRawdataHandle2 etime = jbRawdataHandle2s.get(i);
				
		    	   //小时氨产量
		    	   Double hour_nh3_yield = etime.getHour_nh3_yield();
		    	   double systemload = etime.getSystem_load();
		    	  if(hour_nh3_yield == 0 ){
		    		  continue;
		    		 
		    	  }
		    	  if(systemload < 45 &&hour_nh3_yield > 5 ){
		    		  continue;
		    		 
		    	  }
		    	  if(systemload > 70 &&hour_nh3_yield > 8 ){
		    		  continue;
		    		 
		    	  }
		    	  if(hour_nh3_yield > 8){
		    		  continue;
		    	  }
		    	  
		    	  //小时氨产量”数据与平均值误差绝对值超过平均值35%时
		    	  Double aver = hour_nh3_yield-average;
		    	  aver = new Double(Math.abs(aver.doubleValue()));
		    	 
		    	 /* if((aver>average*0.35)){
		    		  //获取异常ID
		    		 // int orig_id = handle1.getOrig_id();
		    		
		    		  //jbRawdataHandle2Mapper.deleteByPrimaryKey(orig_id);
		    		  continue;
		    	  }*/
		    	   //吨氨综合消耗
		    	   Double tonnh3_compre_consume = etime.getTonnh3_compre_consume();
		    	   if(tonnh3_compre_consume == 0){
			    		  continue;
			    	  }
		    	   if(tonnh3_compre_consume < 0){
			    		  continue;
			    	  }
		    	   if(tonnh3_compre_consume > 1980){
			    		  continue;
			    	  }
		    	   if(tonnh3_compre_consume < 810){
			    		  continue;
			    	  }
		    	  
		    	   if(systemload < 35.0){
		    		   continue; 
		    	   }
		    	   /*if(systemload>50.0&& systemload <65 && hour_nh3_yield> 6.0){
		    		   continue;
		    	   }
		    	   if(systemload>56.0&& systemload <65 && hour_nh3_yield< 3.7){
		    		   continue;
		    	   }
		    	   if(systemload>68.0&& systemload <82 && hour_nh3_yield< 5.2){
		    		   continue;
		    	   }*/
		    	   //吨氨气耗
		    	   Double  tonnh3_gas_consume = etime.getTonnh3_gas_consume();
		    	  /* if(tonnh3_gas_consume == 0){
			    		  //获取异常ID
			    		  //int orig_id = etime.getOrig_id();
			    		 // System.out.println("吨氨气耗异常数据编号"+orig_id+"==================================");
			    		  //根据异常ID删除异常记录
			    		  //jbRawdataHandle2Mapper.deleteByPrimaryKey(orig_id);
			    		  continue;
			    	  }*/
		    	   //吨氨原料气耗
		    	   Double tonnh3_raw_gas_consume = etime.getTonnh3_raw_gas_consume();
		    	  /* if(tonnh3_raw_gas_consume == 0){
			    		  //获取异常ID
			    		  //int orig_id = handle1.getOrig_id();
			    		 // System.out.println("吨氨原料气耗异常数据编号"+orig_id+"==================================");
			    		  //根据异常ID删除异常记录
			    		  //jbRawdataHandle2Mapper.deleteByPrimaryKey(orig_id);
			    		  continue;
			    	  }*/
		    	   //吨氨燃料气耗
		    	   Double tonnh3_fuel_consume = etime.getTonnh3_fuel_consume();
		    	  /* if(tonnh3_fuel_consume == 0){
			    		  //获取异常ID
			    		  //int orig_id = handle1.getOrig_id();
			    		  //System.out.println("吨氨燃料气耗异常数据编号"+orig_id+"==================================");
			    		  //根据异常ID删除异常记录
			    		  //jbRawdataHandle2Mapper.deleteByPrimaryKey(orig_id);
			    		  continue;
			    	  }*/
		    	   //吨氨电耗
		    	   Double tonnh3_electric_consume = etime.getTonnh3_electric_consume();
		    	   if(tonnh3_electric_consume == 0){
			    		  continue;
			    	  }
		    	   if(tonnh3_electric_consume < 0){
			    		  continue;
			    	  }
		    	   if(tonnh3_electric_consume > 1800){
			    		  continue;
			    	  }
				jbExcelloadCustomerMapper.saveDatetoHandl2(etime);
			}
		}
	}
	@Override
	public void deleteUploadMiddle() throws Exception {
		jbExcelloadCustomerMapper.deleteUploadMiddle();
	}
	@Override
	public void deleterawdataMiddle() throws Exception {
		jbExcelloadCustomerMapper.deleterawdataMiddle();
	}
	
	@Override
	public JbRawdataHandle1 getLastTimeWithhand() throws Exception {
		
		return jbExcelloadCustomerMapper.selectTopOneHandl1();
	}
	@Override
	public List<Jb_csv> readJbcsv(String filePath) throws Exception {
		String excelPath =filePath;
		InputStream is = new FileInputStream(excelPath);//读取文件路径
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		
		Jb_csv jbUploadMiddle = null;
		List<Jb_csv> list = new ArrayList<Jb_csv>();
		//循环工作表
		for(int numSheet = 0 ; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++){
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if(hssfSheet == null){
				continue;
			}
			//循环Row
			for(int rowNum = 2; rowNum <hssfSheet.getLastRowNum()+1; rowNum ++){
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				if(hssfRow != null){
					jbUploadMiddle = new Jb_csv();
					HSSFCell time = hssfRow.getCell(0);
				if(time !=null || time.getCellType()!= HSSFCell.CELL_TYPE_BLANK){
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
					SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String datetime = getValues(time);
					if(datetime.length()>0){
						Date date = sdf.parse(datetime);
					
							jbUploadMiddle.setData_time(date);
							
							
							HSSFCell q1 = hssfRow.getCell(1);
							jbUploadMiddle.setQ1(Double.valueOf(getValues(q1)));
							
							HSSFCell q2 = hssfRow.getCell(2);
							jbUploadMiddle.setQ1(Double.valueOf(getValues(q2)));
							HSSFCell q3 = hssfRow.getCell(3);
							jbUploadMiddle.setQ1(Double.valueOf(getValues(q3)));
							HSSFCell q4 = hssfRow.getCell(4);
							jbUploadMiddle.setQ1(Double.valueOf(getValues(q4)));
							
							Jb_csv jb_csv = new Jb_csv();
							jb_csv.setData_time(date);
							jb_csv.setQ1(Double.valueOf(getValues(q1)));
							jb_csv.setQ2(Double.valueOf(getValues(q2)));
							jb_csv.setQ3(Double.valueOf(getValues(q3)));
							jb_csv.setQ4(Double.valueOf(getValues(q4)));
							jbExcelloadCustomerMapper.insertExcel_jb(jb_csv);
							
							
			
					  list.add(jbUploadMiddle);
					 
			
			
					}
					
				}
					
				}
			}
			
		}
		return list;
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
	public void insertExcel_jb(Jb_csv jbIpq) throws Exception {
		jbExcelloadCustomerMapper.insertExcel_jb(jbIpq);
	}
	@Override
	public void inserttoExcel_jb()
			throws Exception {
		List<JbRawdataHandle1> jbRawdataHandle1s = jbExcelloadCustomerMapper.selectAllJbMiddle();
		for(int i = 0; i<jbRawdataHandle1s.size();i++){
			jbExcelloadCustomerMapper.saveDatetoExcel(jbRawdataHandle1s.get(i));
		}
		
	}
	@Override
	public void updatejb_pushgrid_1_1(int id)
			throws Exception {
		adminDataMapper.updatejb_pushgrid_1_1(id);
		
	}
	@Override
	public void updatejb_pushgrid_1_2(int id) throws Exception {
		adminDataMapper.updatejb_pushgrid_1_2(id);
	}
	@Override
	public List<Messageleaving> selectMessageByConpany(String company)
			throws Exception {
		// TODO Auto-generated method stub
		return adminDataMapper.selectMessageByConpany(company);
	}
	@Override
	public int selectMessageNumber(String company) throws Exception {
		
		return adminDataMapper.selectMessageNumber(company);
	}
	@Override
	public void updateMessage() throws Exception {
		adminDataMapper.updateMessByid();
	}
	@Override
	public List<Messageleaving> selectMessageCount(String company) throws Exception {
		// TODO Auto-generated method stub
		return adminDataMapper.selectMessageCount(company);
	}
	@Override
	public void saveDate(JbExcelInput jbExcelInput) throws Exception {
		jbExcelInputCustomerMapper.saveDate(jbExcelInput);
	}
	@Override
	public List<JbExcelInput> selectDateByTime(String sdate, String edate) throws Exception {
		return jbExcelInputCustomerMapper.selectDateByTime(sdate, edate);
	}
	@Override
	public List<JbExcelInput> selectAll() throws Exception {
		
		return jbExcelInputCustomerMapper.selectAll();
	}
	@Override
	public void saveUpFileIfo(FileUpInfo fileupifo) throws Exception {
		jbExcelInputCustomerMapper.saveUpFileIfo(fileupifo);
		
	}
	@Override
	public int selectcount() throws Exception {
		
		return jbExcelInputCustomerMapper.selectcount();
	}
	@Override
	public int selecthand1count() throws Exception {
		
		return jbExcelInputCustomerMapper.selecthand1count();
	}
	@Override
	public int isSameDate(String jbtime) throws Exception {
		int number = jbExcelInputCustomerMapper.fingInputByJbtime(jbtime);
		return number;
	}
	@Override
	public List<JbExcelMiddle> readJyXls(String filePath) throws Exception {
		String excelPath =filePath;
		InputStream is = new FileInputStream(excelPath);//读取文件路径
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		JbExcelMiddle jbExcelInput = null;
		List<JbExcelMiddle> list = new ArrayList<JbExcelMiddle>();
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
					jbExcelInput = new JbExcelMiddle();
					HSSFCell time = hssfRow.getCell(0);
				if(time !=null || time.getCellType()!= HSSFCell.CELL_TYPE_BLANK){
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
					SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String datetime = getValues(time);
					if(datetime.length()>0){
						Date date = sdf.parse(datetime);
						String timeis = sdf1.format(date);
						int isdate = jbExcelInputCustomerMapper.fingInputByJbtime(timeis);
						if(isdate==0){
						jbExcelInput.setJbtime(date);
						HSSFCell fi103 = hssfRow.getCell(1);
						jbExcelInput.setFi103(Double.valueOf(getValues(fi103)));
						HSSFCell fi000 = hssfRow.getCell(2);
						jbExcelInput.setFi000(Double.valueOf(getValues(fi000)));
						HSSFCell fi104 = hssfRow.getCell(3);
						jbExcelInput.setFi104(Double.valueOf(getValues(fi104)));
						HSSFCell fi101 = hssfRow.getCell(4);
						jbExcelInput.setFi101(Double.valueOf(getValues(fi101)));
						HSSFCell fi106 = hssfRow.getCell(5);
						jbExcelInput.setFi106(Double.valueOf(getValues(fi106)));
						HSSFCell fi109 = hssfRow.getCell(6);
						jbExcelInput.setFi109(Double.valueOf(getValues(fi109)));
						HSSFCell fr401 = hssfRow.getCell(7);
						jbExcelInput.setFr401(Double.valueOf(getValues(fr401)));
						HSSFCell fr402 = hssfRow.getCell(8);
						jbExcelInput.setFr402(Double.valueOf(getValues(fr402)));
						HSSFCell fr405 = hssfRow.getCell(9);
						jbExcelInput.setFr405(Double.valueOf(getValues(fr405)));
						HSSFCell fr406 = hssfRow.getCell(10);
						jbExcelInput.setFr406(Double.valueOf(getValues(fr406)));
						HSSFCell fr407 = hssfRow.getCell(11);
	                    jbExcelInput.setFr407(Double.valueOf(getValues(fr407)));
						HSSFCell fr408 = hssfRow.getCell(12);
						jbExcelInput.setFr408(Double.valueOf(getValues(fr408)));
						HSSFCell fi410	= hssfRow.getCell(13);
						jbExcelInput.setFi410(Double.valueOf(getValues(fi410)));
						HSSFCell finh3	= hssfRow.getCell(14);
						jbExcelInput.setFinh3(Double.valueOf(getValues(finh3)));
						HSSFCell fr141	= hssfRow.getCell(15);
						jbExcelInput.setFr141(Double.valueOf(getValues(fr141)));
						HSSFCell fr142	= hssfRow.getCell(16);
						jbExcelInput.setFr142(Double.valueOf(getValues(fr142)));
						HSSFCell fr143	= hssfRow.getCell(17);
						jbExcelInput.setFr143(Double.valueOf(getValues(fr143)));
						HSSFCell ti122	= hssfRow.getCell(18);
						jbExcelInput.setTi122(Double.valueOf(getValues(ti122)));
						HSSFCell ti123	= hssfRow.getCell(19);
						jbExcelInput.setTi123(Double.valueOf(getValues(ti123)));
						HSSFCell ti164	= hssfRow.getCell(20);
						jbExcelInput.setTi164(Double.valueOf(getValues(ti164)));
						HSSFCell ti131	= hssfRow.getCell(21);
						jbExcelInput.setTi131(Double.valueOf(getValues(ti131)));
						HSSFCell ti132	= hssfRow.getCell(22);
						jbExcelInput.setTi132(Double.valueOf(getValues(ti132)));
						HSSFCell ti211	= hssfRow.getCell(23);
						jbExcelInput.setTi211(Double.valueOf(getValues(ti211)));
						HSSFCell ti210a	= hssfRow.getCell(24);
						jbExcelInput.setTi210a(Double.valueOf(getValues(ti210a)));
						HSSFCell ti134	= hssfRow.getCell(25);
						jbExcelInput.setTi134(Double.valueOf(getValues(ti134)));
						HSSFCell ti215	= hssfRow.getCell(26);
						jbExcelInput .setTi215(Double.valueOf(getValues(ti215)));
						HSSFCell tr413	= hssfRow.getCell(27);
						jbExcelInput.setTr413(Double.valueOf(getValues(tr413)));
						HSSFCell tr403	= hssfRow.getCell(28);
						jbExcelInput.setTr403(Double.valueOf(getValues(tr403)));
						HSSFCell tr407	= hssfRow.getCell(29);
						jbExcelInput.setTr407(Double.valueOf(getValues(tr407)));
						HSSFCell ti407a	= hssfRow.getCell(30);
						jbExcelInput.setTi407a(Double.valueOf(getValues(ti407a)));
						HSSFCell ti407b	= hssfRow.getCell(31);
						jbExcelInput.setTi407b(Double.valueOf(getValues(ti407b)));
						HSSFCell pi213	= hssfRow.getCell(32);
						jbExcelInput.setPi213(Double.valueOf(getValues(pi213)));
						HSSFCell pi105	= hssfRow.getCell(33);
						jbExcelInput.setPi105(Double.valueOf(getValues(pi105)));
						HSSFCell pi112	= hssfRow.getCell(34);
						jbExcelInput.setPi112(Double.valueOf(getValues(pi112)));
						HSSFCell pi114	= hssfRow.getCell(35);
						jbExcelInput.setPi114(Double.valueOf(getValues(pi114)));
						HSSFCell pi234	= hssfRow.getCell(36);
						jbExcelInput.setPi234(Double.valueOf(getValues(pi234)));
						HSSFCell pr401	= hssfRow.getCell(37);
						jbExcelInput.setPr401(Double.valueOf(getValues(pr401)));
						HSSFCell pr403	= hssfRow.getCell(38);
						jbExcelInput.setPr403(Double.valueOf(getValues(pr403)));
						HSSFCell ipq003 = hssfRow.getCell(39);
						jbExcelInput.setIpq003(Double.valueOf(getValues(ipq003)));
						HSSFCell pi422	= hssfRow.getCell(40);
						jbExcelInput.setPi422(Double.valueOf(getValues(pi422)));
						HSSFCell pr416	= hssfRow.getCell(41);
						jbExcelInput.setPr416(Double.valueOf(getValues(pr416)));
						HSSFCell pi288	= hssfRow.getCell(42);
						jbExcelInput.setPi288(Double.valueOf(getValues(pi288)));
						HSSFCell ipq004 =  hssfRow.getCell(43);
						jbExcelInput.setIpq004(Double.valueOf(getValues(ipq004)));
						HSSFCell ar101	= hssfRow.getCell(44);
						jbExcelInput.setAr101(Double.valueOf(getValues(ar101)));
						HSSFCell ar109	= hssfRow.getCell(45);
						jbExcelInput.setAr109(Double.valueOf(getValues(ar109)));
						HSSFCell ar110	= hssfRow.getCell(46);
						jbExcelInput.setAr110(Double.valueOf(getValues(ar110)));
						HSSFCell ai104	= hssfRow.getCell(47);
						jbExcelInput.setAi104(Double.valueOf(getValues(ai104)));
						HSSFCell ai103	= hssfRow.getCell(48);
						jbExcelInput.setAi103(Double.valueOf(getValues(ai103)));
						HSSFCell ar111	= hssfRow.getCell(49);
						jbExcelInput.setAr111(Double.valueOf(getValues(ar111)));
						HSSFCell ar112	= hssfRow.getCell(50);
						jbExcelInput.setAr112(Double.valueOf(getValues(ar112)));
						HSSFCell ar113	= hssfRow.getCell(51);
						jbExcelInput.setAr113(Double.valueOf(getValues(ar113)));
						HSSFCell ar114	= hssfRow.getCell(52);
						jbExcelInput.setAr114(Double.valueOf(getValues(ar114)));
						HSSFCell k001	= hssfRow.getCell(53);
						jbExcelInput.setK001(Double.valueOf(getValues(k001)));
						HSSFCell h2oc	= hssfRow.getCell(54);
						jbExcelInput.setH2oc(Double.valueOf(getValues(h2oc)));
						HSSFCell lr403	= hssfRow.getCell(55);
						jbExcelInput.setLr403(Double.valueOf(getValues(lr403)));
						HSSFCell lr402	= hssfRow.getCell(56);
						jbExcelInput.setLr402(Double.valueOf(getValues(lr402)));
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
						jbExcelInput.setSysload(Double.valueOf(getValues(sysload)));
			
					  list.add(jbExcelInput);
					  Collections.sort(list,new Comparator<JbExcelMiddle>() {

						@Override
						public int compare(JbExcelMiddle o1, JbExcelMiddle o2) {
							if(o1.getJbtime().getTime() > o2.getJbtime().getTime()){
								return 1;
							}
							if(o1.getJbtime().getTime() == o2.getJbtime().getTime()){
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
	
	@Override
	public void saveDatetomiddle(JbExcelMiddle jbExcelMiddle) throws Exception {
		jbExcelInputCustomerMapper.saveDatetomiddle(jbExcelMiddle);
	}
	@Override
	public JbExcelMiddle selectTopInput() throws Exception {
		
		return jbExcelInputCustomerMapper.selectTopInput();
	}
	@Override
	public List<JbExcelMiddle> selectAllMiddle() throws Exception {
		// TODO Auto-generated method stub
		return jbExcelInputCustomerMapper.selectAllMiddle();
	}
	@Override
	public void savetoexcel() throws Exception {
		 List<JbExcelMiddle> cdataList = jbExcelInputCustomerMapper.selectAllMiddle();
		
		    	   for(int g = 0; g < cdataList.size(); g++){
						 JbExcelInput jbExcelInput = new JbExcelInput();
						 JbExcelMiddle btime = cdataList.get(g);//后一刻时间
						//原始基本数据
						Date datetimeDate = btime.getJbtime();
						jbExcelInput.setData_time(datetimeDate);
						jbExcelInput.setFi_103(btime.getFi103());
						jbExcelInput.setFi_000(btime.getFi000());
						jbExcelInput.setFi_104(btime.getFi104());
						jbExcelInput.setFi_101(btime.getFi101());
						jbExcelInput.setFi_106(btime.getFi106());
						jbExcelInput.setFi_109(btime.getFi109());
						jbExcelInput.setFr_401(btime.getFr401());
						jbExcelInput.setFr_402(btime.getFr402());
						jbExcelInput.setFr_405(btime.getFr405());
						jbExcelInput.setFr_406(btime.getFr406());
						jbExcelInput.setFr_407(btime.getFr407());
						jbExcelInput.setFr_408(btime.getFr408());
						jbExcelInput.setFi_410(btime.getFi410());
						jbExcelInput.setFi_NH3(btime.getFinh3());
						jbExcelInput.setFr_141(btime.getFr141());
						jbExcelInput.setFr_142(btime.getFr142());
						jbExcelInput.setFr_143(btime.getFr143());
						jbExcelInput.setTi_122(btime.getTi122());
						jbExcelInput.setTi_123(btime.getTi123());
						jbExcelInput.setTi_164(btime.getTi164());
						jbExcelInput.setTi_131(btime.getTi131());
						jbExcelInput.setTi_132(btime.getTi132());
						jbExcelInput.setTi_211(btime.getTi211());
						jbExcelInput.setTi_210a(btime.getTi210a());
						jbExcelInput.setTi_134(btime.getTi134());
						jbExcelInput.setTi_215(btime.getTi215());
						jbExcelInput.setTr_413(btime.getTr413());
						jbExcelInput.setTr_403(btime.getTr403());
						jbExcelInput.setTr_407(btime.getTr407());
						jbExcelInput.setTi_407a(btime.getTi407a());
						jbExcelInput.setTi_407b(btime.getTi407b());
						jbExcelInput.setPi_213(btime.getPi213());
						jbExcelInput.setPi_105(btime.getPi105());
						jbExcelInput.setPi_112(btime.getPi112());
						jbExcelInput.setPi_114(btime.getPi114());
						jbExcelInput.setPi_234(btime.getPi234());
						jbExcelInput.setPr_401(btime.getPr401());
						jbExcelInput.setPr_403(btime.getPr403());
						jbExcelInput.setPi_422(btime.getPi422());
						jbExcelInput.setPr_416(btime.getPr416());
						jbExcelInput.setPi_288(btime.getPi288());
						jbExcelInput.setAr_101(btime.getAr101());
						jbExcelInput.setAr_109(btime.getAr109());
						jbExcelInput.setAr_110(btime.getAr110());
						jbExcelInput.setAi_104(btime.getAi104());
						jbExcelInput.setAi_103(btime.getAi103());
						jbExcelInput.setAr_111(btime.getAr111());
						jbExcelInput.setAr_112(btime.getAr112());
						jbExcelInput.setAr_113(btime.getAr113());
						jbExcelInput.setAr_114(btime.getAr114());
						jbExcelInput.setK_001(btime.getK001());
						jbExcelInput.setH2oc(btime.getH2oc());
						jbExcelInput.setLr_403(btime.getLr403());
						jbExcelInput.setLr_402(btime.getLr402());
						jbExcelInput.setFiqnh3(btime.getFiqnh3());
						jbExcelInput.setIpq001(btime.getIpq001());
						jbExcelInput.setIpq002(btime.getIpq002());
						jbExcelInput.setIpq003(btime.getIpq003());
						jbExcelInput.setIpq004(btime.getIpq004());
						jbExcelInput.setFiq101(btime.getFiq101());
						jbExcelInput.setFtq109(btime.getFtq109());
						jbExcelInput.setFiq000(btime.getFiq000());
						jbExcelInput.setSystem_load(btime.getSysload());
						//保存到数据库
				       jbExcelInputCustomerMapper.savetoexcel(jbExcelInput);
				       //问题所在
				       
		       }
		       
			
		
	}
	@SuppressWarnings("unused")
	@Override
	public void savatohandle1() throws Exception {
		//1.取出excel中的按时间的最后一条记录
		JbExcelMiddle jbExcelMiddle = jbExcelInputCustomerMapper.selectTopInput();
		System.out.println(jbExcelMiddle.getAi103());
		if(jbExcelMiddle != null){
			List<JbExcelMiddle> list = jbExcelInputCustomerMapper.selectAllMiddle();
			list.add(jbExcelMiddle);
			 Collections.sort(list,new Comparator<JbExcelMiddle>() {
				@Override
				public int compare(JbExcelMiddle o1, JbExcelMiddle o2) {
					if(o1.getJbtime().getTime() > o2.getJbtime().getTime()){
						return 1;
					}
					if(o1.getJbtime().getTime() == o2.getJbtime().getTime()){
						return 0;
					}
					
					return -1;
				}
			});
			/* 计算保存到excel表中*/
			//获取用户上传的数据
			    	   for(int g = 0; g <list.size()-1; g++){
							 JbRawdataHandle1 jbRawdataHandle1 = new JbRawdataHandle1();
							
							JbExcelMiddle ftime = list.get(g);//前一刻时间
							JbExcelMiddle btime = list.get(g+1);//后一刻时间
							//原始基本数据
							Date datetimeDate = btime.getJbtime();
							jbRawdataHandle1.setData_time(datetimeDate);
							jbRawdataHandle1.setFi_103(btime.getFi103());
							jbRawdataHandle1.setFi_000(btime.getFi000());
							jbRawdataHandle1.setFi_104(btime.getFi104());
							jbRawdataHandle1.setFi_101(btime.getFi101());
							jbRawdataHandle1.setFi_106(btime.getFi106());
							jbRawdataHandle1.setFi_109(btime.getFi109());
							jbRawdataHandle1.setFr_401(btime.getFr401());
							jbRawdataHandle1.setFr_402(btime.getFr402());
							jbRawdataHandle1.setFr_405(btime.getFr405());
							jbRawdataHandle1.setFr_406(btime.getFr406());
							jbRawdataHandle1.setFr_407(btime.getFr407());
							jbRawdataHandle1.setFr_408(btime.getFr408());
							jbRawdataHandle1.setFi_410(btime.getFi410());
							jbRawdataHandle1.setFi_NH3(btime.getFinh3());
							jbRawdataHandle1.setFr_141(btime.getFr141());
							jbRawdataHandle1.setFr_142(btime.getFr142());
							jbRawdataHandle1.setFr_143(btime.getFr143());
							jbRawdataHandle1.setTi_122(btime.getTi122());
							jbRawdataHandle1.setTi_123(btime.getTi123());
							jbRawdataHandle1.setTi_164(btime.getTi164());
							jbRawdataHandle1.setTi_131(btime.getTi131());
							jbRawdataHandle1.setTi_132(btime.getTi132());
							jbRawdataHandle1.setTi_211(btime.getTi211());
							jbRawdataHandle1.setTi_210a(btime.getTi210a());
							jbRawdataHandle1.setTi_134(btime.getTi134());
							jbRawdataHandle1.setTi_215(btime.getTi215());
							jbRawdataHandle1.setTr_413(btime.getTr413());
							jbRawdataHandle1.setTr_403(btime.getTr403());
							jbRawdataHandle1.setTr_407(btime.getTr407());
							jbRawdataHandle1.setTi_407a(btime.getTi407a());
							jbRawdataHandle1.setTi_407b(btime.getTi407b());
							jbRawdataHandle1.setPi_213(btime.getPi213());
							jbRawdataHandle1.setPi_105(btime.getPi105());
							jbRawdataHandle1.setPi_112(btime.getPi112());
							jbRawdataHandle1.setPi_114(btime.getPi114());
							jbRawdataHandle1.setPi_234(btime.getPi234());
							jbRawdataHandle1.setPr_401(btime.getPr401());
							jbRawdataHandle1.setPr_403(btime.getPr403());
							jbRawdataHandle1.setPi_422(btime.getPi422());
							jbRawdataHandle1.setPr_416(btime.getPr416());
							jbRawdataHandle1.setPi_288(btime.getPi288());
							jbRawdataHandle1.setAr_101(btime.getAr101());
							jbRawdataHandle1.setAr_109(btime.getAr109());
							jbRawdataHandle1.setAr_110(btime.getAr110());
							jbRawdataHandle1.setAi_104(btime.getAi104());
							jbRawdataHandle1.setAi_103(btime.getAi103());
							jbRawdataHandle1.setAr_111(btime.getAr111());
							jbRawdataHandle1.setAr_112(btime.getAr112());
							jbRawdataHandle1.setAr_113(btime.getAr113());
							jbRawdataHandle1.setAr_114(btime.getAr114());
							jbRawdataHandle1.setK_001(btime.getK001());
							jbRawdataHandle1.setH2oc(btime.getH2oc());
							jbRawdataHandle1.setLr_403(btime.getLr403());
							jbRawdataHandle1.setLr_402(btime.getLr402());
							jbRawdataHandle1.setFiqnh3(btime.getFiqnh3());
							jbRawdataHandle1.setIpq001(btime.getIpq001());
							jbRawdataHandle1.setIpq002(btime.getIpq002());
							jbRawdataHandle1.setIpq003(btime.getIpq003());
							jbRawdataHandle1.setIpq004(btime.getIpq004());
							jbRawdataHandle1.setFiq101(btime.getFiq101());
							jbRawdataHandle1.setFtq109(btime.getFtq109());
							jbRawdataHandle1.setFiq000(btime.getFiq000());
							//原始计算后的数据
							//计算后的时段氨产量，没有精确度
							Double timeNh3 = btime.getFiqnh3()-ftime.getFiqnh3();
							BigDecimal b = new BigDecimal(timeNh3);
							//四舍五入后，保留三位小数的时段氨产量
							Double etimeNh3 = b.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setTime_nh3_yield(etimeNh3);
							//时段电耗计算
							//时段电耗1
							Double timeIpq01 = btime.getIpq001()-ftime.getIpq001();
							//时段电耗2
							Double timeIpq02 = btime.getIpq002()-ftime.getIpq002();
							//时段电耗3
							Double timeIpq03 = btime.getIpq003()-ftime.getIpq003();
							//时段电耗4
							Double timeIpq04 = btime.getIpq004()-ftime.getIpq004();
							//时段电耗
							Double ebIpq = timeIpq01+timeIpq02-timeIpq03-timeIpq04;
							//四舍五入保留两位小数时段电耗
							BigDecimal bi = new BigDecimal(ebIpq);
							Double eebIpq = bi.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setTime_electric_consume(eebIpq);
							//时段原料气耗计算
							Double timefiq = btime.getFiq101()-ftime.getFiq101();
							BigDecimal bf = new BigDecimal(timefiq);
							Double etimefiq = bf.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setTime_raw_gas_consume(etimefiq);
							//时段燃料气耗
							Double timeftq = btime.getFtq109()-ftime.getFtq109();
							BigDecimal bt = new BigDecimal(timeftq);
							Double etimeftq = bt.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setTime_fuel_consume(etimeftq);
							//时段气耗
							Double timefiq000 = btime.getFiq000()-ftime.getFiq000();
							BigDecimal biq = new BigDecimal(timefiq000);
							Double etimefiq000 = biq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setTime_gas_consume(etimefiq000);
							//系统负荷
							Double sysload = btime.getFi101()/5600*100;
							BigDecimal bfi = new BigDecimal(sysload);
							Double esysload = bfi.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setSystem_load(esysload);
							//小时氨产量计算
							Double hourNh3 = 6*timeNh3;
							BigDecimal bhn = new BigDecimal(hourNh3);
							Double ehourNh3 = bhn.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setHour_nh3_yield(ehourNh3);
							//吨氨气耗计算
							Double tFiq = 0.0;
							Double etFiq = 0.0;
							 Double tIpq = 0.0;
							 Double etIpq = 0.0 ;
							 Double etftq = 0.0;
							if(timeNh3 != 0){
								 tFiq = timefiq000/timeNh3;
								BigDecimal bfiq = new BigDecimal(tFiq);
								 etFiq = bfiq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
								  tIpq = ebIpq/timeNh3;
								BigDecimal bipq = new BigDecimal(tIpq);
								 etIpq = bipq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
								 Double tfiq = timefiq/timeNh3;
								BigDecimal btfiq = new BigDecimal(tfiq);
								Double etfiq = btfiq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
								jbRawdataHandle1.setTonnh3_raw_gas_consume(etfiq);
								//吨氨燃料气耗
								Double tftq = timeftq/timeNh3;
								BigDecimal btftq = new BigDecimal(tftq);
								etftq = btftq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
									
							}
							
							//吨氨电耗计算
							
							//吨氨综合消耗计算
							Double tNh3 = (1.2143*tFiq+0.1229*tIpq);
							BigDecimal btnh3 = new BigDecimal(tNh3);
							Double etNh3 = btnh3.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setTonnh3_compre_consume(etNh3);
							jbRawdataHandle1.setTonnh3_gas_consume(etFiq);
							//吨氨原料气耗计算
							
							
							jbRawdataHandle1.setTonnh3_fuel_consume(etftq);
							jbRawdataHandle1.setTonnh3_electric_consume(etIpq);
							//班次计算
							//获取用户信息里的班次信息
							
							//根据时间获取对应的班次信息
							Date date = btime.getJbtime();
							String classtime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
							//截取年
							String year = classtime.substring(0, 10);
							JbClassinfor jbClassinfor = seclectByTime(year);
						
							//截取时分秒
							String mdate = classtime.substring(11, 19);
							if(isInTime("16:09-00:01", mdate)){
								int m = jbClassinfor.getMorclass();
								jbRawdataHandle1.setShift(m);
							}
							if(isInTime("00:09-08:01", mdate)){
								int a = jbClassinfor.getAftclass();
								jbRawdataHandle1.setShift(a);
							}
							if(isInTime("08:09-16:01", mdate)){
								int e = jbClassinfor.getEveclass();
								jbRawdataHandle1.setShift(e);
							}
					       jbExcelInputCustomerMapper.savatohandle1(jbRawdataHandle1);
					       jbExcelInputCustomerMapper.savatomiddel1(jbRawdataHandle1);
			       }
			       
				
		}else{
			List<JbExcelMiddle> list = jbExcelInputCustomerMapper.selectAllMiddle();
			
			 Collections.sort(list,new Comparator<JbExcelMiddle>() {
				@Override
				public int compare(JbExcelMiddle o1, JbExcelMiddle o2) {
					if(o1.getJbtime().getTime() > o2.getJbtime().getTime()){
						return 1;
					}
					if(o1.getJbtime().getTime() == o2.getJbtime().getTime()){
						return 0;
					}
					
					return -1;
				}
			});
			/* 计算保存到excel表中*/
			//获取用户上传的数据
			    	   for(int g = 0; g <list.size()-1; g++){
							 JbRawdataHandle1 jbRawdataHandle1 = new JbRawdataHandle1();
							
							JbExcelMiddle ftime = list.get(g);//前一刻时间
							JbExcelMiddle btime = list.get(g+1);//后一刻时间
							//原始基本数据
							Date datetimeDate = btime.getJbtime();
							jbRawdataHandle1.setData_time(datetimeDate);
							jbRawdataHandle1.setFi_103(btime.getFi103());
							jbRawdataHandle1.setFi_000(btime.getFi000());
							jbRawdataHandle1.setFi_104(btime.getFi104());
							jbRawdataHandle1.setFi_101(btime.getFi101());
							jbRawdataHandle1.setFi_106(btime.getFi106());
							jbRawdataHandle1.setFi_109(btime.getFi109());
							jbRawdataHandle1.setFr_401(btime.getFr401());
							jbRawdataHandle1.setFr_402(btime.getFr402());
							jbRawdataHandle1.setFr_405(btime.getFr405());
							jbRawdataHandle1.setFr_406(btime.getFr406());
							jbRawdataHandle1.setFr_407(btime.getFr407());
							jbRawdataHandle1.setFr_408(btime.getFr408());
							jbRawdataHandle1.setFi_410(btime.getFi410());
							jbRawdataHandle1.setFi_NH3(btime.getFinh3());
							jbRawdataHandle1.setFr_141(btime.getFr141());
							jbRawdataHandle1.setFr_142(btime.getFr142());
							jbRawdataHandle1.setFr_143(btime.getFr143());
							jbRawdataHandle1.setTi_122(btime.getTi122());
							jbRawdataHandle1.setTi_123(btime.getTi123());
							jbRawdataHandle1.setTi_164(btime.getTi164());
							jbRawdataHandle1.setTi_131(btime.getTi131());
							jbRawdataHandle1.setTi_132(btime.getTi132());
							jbRawdataHandle1.setTi_211(btime.getTi211());
							jbRawdataHandle1.setTi_210a(btime.getTi210a());
							jbRawdataHandle1.setTi_134(btime.getTi134());
							jbRawdataHandle1.setTi_215(btime.getTi215());
							jbRawdataHandle1.setTr_413(btime.getTr413());
							jbRawdataHandle1.setTr_403(btime.getTr403());
							jbRawdataHandle1.setTr_407(btime.getTr407());
							jbRawdataHandle1.setTi_407a(btime.getTi407a());
							jbRawdataHandle1.setTi_407b(btime.getTi407b());
							jbRawdataHandle1.setPi_213(btime.getPi213());
							jbRawdataHandle1.setPi_105(btime.getPi105());
							jbRawdataHandle1.setPi_112(btime.getPi112());
							jbRawdataHandle1.setPi_114(btime.getPi114());
							jbRawdataHandle1.setPi_234(btime.getPi234());
							jbRawdataHandle1.setPr_401(btime.getPr401());
							jbRawdataHandle1.setPr_403(btime.getPr403());
							jbRawdataHandle1.setPi_422(btime.getPi422());
							jbRawdataHandle1.setPr_416(btime.getPr416());
							jbRawdataHandle1.setPi_288(btime.getPi288());
							jbRawdataHandle1.setAr_101(btime.getAr101());
							jbRawdataHandle1.setAr_109(btime.getAr109());
							jbRawdataHandle1.setAr_110(btime.getAr110());
							jbRawdataHandle1.setAi_104(btime.getAi104());
							jbRawdataHandle1.setAi_103(btime.getAi103());
							jbRawdataHandle1.setAr_111(btime.getAr111());
							jbRawdataHandle1.setAr_112(btime.getAr112());
							jbRawdataHandle1.setAr_113(btime.getAr113());
							jbRawdataHandle1.setAr_114(btime.getAr114());
							jbRawdataHandle1.setK_001(btime.getK001());
							jbRawdataHandle1.setH2oc(btime.getH2oc());
							jbRawdataHandle1.setLr_403(btime.getLr403());
							jbRawdataHandle1.setLr_402(btime.getLr402());
							jbRawdataHandle1.setFiqnh3(btime.getFiqnh3());
							jbRawdataHandle1.setIpq001(btime.getIpq001());
							jbRawdataHandle1.setIpq002(btime.getIpq002());
							jbRawdataHandle1.setIpq003(btime.getIpq003());
							jbRawdataHandle1.setIpq004(btime.getIpq004());
							jbRawdataHandle1.setFiq101(btime.getFiq101());
							jbRawdataHandle1.setFtq109(btime.getFtq109());
							jbRawdataHandle1.setFiq000(btime.getFiq000());
							//原始计算后的数据
							//计算后的时段氨产量，没有精确度
							Double timeNh3 = btime.getFiqnh3()-ftime.getFiqnh3();
							BigDecimal b = new BigDecimal(timeNh3);
							//四舍五入后，保留三位小数的时段氨产量
							Double etimeNh3 = b.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setTime_nh3_yield(etimeNh3);
							
							//时段电耗计算
							//时段电耗1
							Double timeIpq01 = btime.getIpq001()-ftime.getIpq001();
							//时段电耗2
							Double timeIpq02 = btime.getIpq002()-ftime.getIpq002();
							//时段电耗3
							Double timeIpq03 = btime.getIpq003()-ftime.getIpq003();
							//时段电耗4
							Double timeIpq04 = btime.getIpq004()-ftime.getIpq004();
							//时段电耗
							Double ebIpq = timeIpq01+timeIpq02-timeIpq03-timeIpq04;
							//四舍五入保留两位小数时段电耗
							BigDecimal bi = new BigDecimal(ebIpq);
							Double eebIpq = bi.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setTime_electric_consume(eebIpq);
							
							//时段原料气耗计算
							Double timefiq = btime.getFiq101()-ftime.getFiq101();
							BigDecimal bf = new BigDecimal(timefiq);
							Double etimefiq = bf.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setTime_raw_gas_consume(etimefiq);
							//时段燃料气耗
							Double timeftq = btime.getFtq109()-ftime.getFtq109();
							BigDecimal bt = new BigDecimal(timeftq);
							Double etimeftq = bt.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setTime_fuel_consume(etimeftq);
							//时段气耗
							Double timefiq000 = btime.getFiq000()-ftime.getFiq000();
							BigDecimal biq = new BigDecimal(timefiq000);
							Double etimefiq000 = biq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setTime_gas_consume(etimefiq000);
							//系统负荷
							Double sysload = btime.getFi101()/5600*100;
							BigDecimal bfi = new BigDecimal(sysload);
							Double esysload = bfi.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setSystem_load(esysload);
							//小时氨产量计算
							Double hourNh3 = 6*timeNh3;
							BigDecimal bhn = new BigDecimal(hourNh3);
							Double ehourNh3 = bhn.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setHour_nh3_yield(ehourNh3);
							//吨氨气耗计算
							Double tFiq = timefiq000/timeNh3;
							BigDecimal bfiq = new BigDecimal(tFiq);
							Double etFiq = bfiq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							//吨氨电耗计算
							Double tIpq = ebIpq/timeNh3;
							BigDecimal bipq = new BigDecimal(tIpq);
							Double etIpq = bipq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							
							//吨氨综合消耗计算
							Double tNh3 = (1.2143*tFiq+0.1229*tIpq);
							BigDecimal btnh3 = new BigDecimal(tNh3);
							Double etNh3 = btnh3.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setTonnh3_compre_consume(etNh3);
							jbRawdataHandle1.setTonnh3_gas_consume(etFiq);
							//吨氨原料气耗计算
							Double tfiq = timefiq/timeNh3;
							BigDecimal btfiq = new BigDecimal(tfiq);
							Double etfiq = btfiq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							jbRawdataHandle1.setTonnh3_raw_gas_consume(etfiq);
							//吨氨燃料气耗
							Double tftq = timeftq/timeNh3;
							BigDecimal btftq = new BigDecimal(tftq);
							Double etftq = btftq.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
							
							jbRawdataHandle1.setTonnh3_fuel_consume(etftq);
							jbRawdataHandle1.setTonnh3_electric_consume(etIpq);
							//班次计算
							//获取用户信息里的班次信息
							//根据时间获取对应的班次信息
							Date date = btime.getJbtime();
							String classtime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
							//截取年
							String year = classtime.substring(0, 10);
							JbClassinfor jbClassinfor = seclectByTime(year);
						
							//截取时分秒
							String mdate = classtime.substring(11, 19);
							if(isInTime("16:09-00:01", mdate)){
								int m = jbClassinfor.getMorclass();
								jbRawdataHandle1.setShift(m);
							}
							if(isInTime("00:09-08:01", mdate)){
								int a = jbClassinfor.getAftclass();
								jbRawdataHandle1.setShift(a);
							}
							if(isInTime("08:09-16:01", mdate)){
								int e = jbClassinfor.getEveclass();
								jbRawdataHandle1.setShift(e);
							}
					       jbExcelInputCustomerMapper.savatohandle1(jbRawdataHandle1);
					       jbExcelInputCustomerMapper.savatomiddel1(jbRawdataHandle1);
			       }
		}
	}
	
	
		@Override
		public void savatohandle2() throws Exception {
		   List<JbRawdataHandle1> jbRawdataHandle1s = jbExcelInputCustomerMapper.selectMidleList();//全部上传的数据
	    	 int upcount = jbRawdataHandle1s.size();
	        JbRawdataHandle2 jbRawdataHandle2 = new JbRawdataHandle2();
		       //定义总的小时氨产量
		       Double total_hour_nh3_yield = 0.0;
		       //获取平均值
		       for(int k = 0; k<jbRawdataHandle1s.size();k++){
		    	   JbRawdataHandle1 handle1 = jbRawdataHandle1s.get(k);
			  	   //小时氨产量
			  	   Double hour_nh3_yield = handle1.getHour_nh3_yield();
			  	   //小时氨产量的总数
			  	   total_hour_nh3_yield += hour_nh3_yield;
			  	   //平均氨产量
			  	   Double average = total_hour_nh3_yield/upcount;
			  	  
			  	   BigDecimal baverage = new BigDecimal(average);
						Double eaverage = baverage.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
			  	   this.average = eaverage;
				       }
				       //剔除异常数据
				       for(int h= 0; h<jbRawdataHandle1s.size(); h++){
				    	   JbRawdataHandle1 handle1 = jbRawdataHandle1s.get(h);
				    	   //小时氨产量
				    	   Double hour_nh3_yield = handle1.getHour_nh3_yield();
				    	  if(hour_nh3_yield == 0){
				    		  //获取异常ID
				    		  int orig_id = handle1.getOrig_id();
				    		  //根据异常ID删除异常记录
				    		  jbRawdataHandle2Mapper.deleteByPrimaryKey(orig_id);
				    		 
				    	  }
				    	  //小时氨产量”数据与平均值误差绝对值超过平均值35%时
				    	  Double aver = hour_nh3_yield-average;
				    	  aver = new Double(Math.abs(aver.doubleValue()));
				    	 
				    	  if((aver>average*0.35)){
				    		  //获取异常ID
				    		  int orig_id = handle1.getOrig_id();
				    		
				    		  jbRawdataHandle2Mapper.deleteByPrimaryKey(orig_id);
				    		  continue;
				    	  }
				    	   //吨氨综合消耗
				    	   Double tonnh3_compre_consume = handle1.getTonnh3_compre_consume();
				    	   if(tonnh3_compre_consume == 0){
					    		  //获取异常ID
					    		  int orig_id = handle1.getOrig_id();
					    		
					    		  //根据异常ID删除异常记录
					    		  jbRawdataHandle2Mapper.deleteByPrimaryKey(orig_id);
					    		  continue;
					    	  }
				    	   //吨氨气耗
				    	   Double  tonnh3_gas_consume = handle1.getTonnh3_gas_consume();
				    	   if(tonnh3_gas_consume == 0){
					    		  //获取异常ID
					    		  int orig_id = handle1.getOrig_id();
					    		
					    		  //根据异常ID删除异常记录
					    		  jbRawdataHandle2Mapper.deleteByPrimaryKey(orig_id);
					    		  continue;
					    	  }
				    	   //吨氨原料气耗
				    	   Double tonnh3_raw_gas_consume = handle1.getTonnh3_raw_gas_consume();
				    	   if(tonnh3_raw_gas_consume == 0){
					    		  //获取异常ID
					    		  int orig_id = handle1.getOrig_id();
					    		 
					    		  //根据异常ID删除异常记录
					    		  jbRawdataHandle2Mapper.deleteByPrimaryKey(orig_id);
					    		  continue;
					    	  }
				    	   //吨氨燃料气耗
				    	   Double tonnh3_fuel_consume = handle1.getTonnh3_fuel_consume();
				    	   if(tonnh3_fuel_consume == 0){
					    		  //获取异常ID
					    		  int orig_id = handle1.getOrig_id();
					    		  //根据异常ID删除异常记录
					    		  jbRawdataHandle2Mapper.deleteByPrimaryKey(orig_id);
					    		  continue;
					    	  }
				    	   //吨氨电耗
				    	   Double tonnh3_electric_consume = handle1.getTonnh3_electric_consume();
				    	   if(tonnh3_electric_consume == 0){
					    		  //获取异常ID
					    		  int orig_id = handle1.getOrig_id();
					    		  //根据异常ID删除异常记录
					    		  jbRawdataHandle2Mapper.deleteByPrimaryKey(orig_id);
					    		  continue;
					    	  }
				    	  
					    	 //基本数据获取开始
					    	   Date datetime = handle1.getData_time();
					    	   jbRawdataHandle2.setData_time(datetime);
					    	   jbRawdataHandle2.setFi_103(handle1.getFi_103());
					    	   jbRawdataHandle2.setFi_000(handle1.getFi_000());
					    	   jbRawdataHandle2.setFi_104(handle1.getFi_104());
					    	   jbRawdataHandle2.setFi_101(handle1.getFi_101());
					    	   jbRawdataHandle2.setFi_106(handle1.getFi_106());
					    	   jbRawdataHandle2.setFi_109(handle1.getFi_109());
					    	   jbRawdataHandle2.setFr_401(handle1.getFr_401());
					    	   jbRawdataHandle2.setFr_402(handle1.getFr_402());
					    	   jbRawdataHandle2.setFr_405(handle1.getFr_405());
					    	   jbRawdataHandle2.setFr_406(handle1.getFr_406());
					    	   jbRawdataHandle2.setFr_407(handle1.getFr_407());
					    	   jbRawdataHandle2.setFr_408(handle1.getFr_408());
					    	   jbRawdataHandle2.setFi_410(handle1.getFi_410());
					    	   jbRawdataHandle2.setFi_NH3(handle1.getFi_NH3());
					    	   jbRawdataHandle2.setFr_141(handle1.getFr_141());
					    	   jbRawdataHandle2.setFr_142(handle1.getFr_142());
					    	   jbRawdataHandle2.setFr_143(handle1.getFr_143());
					    	   jbRawdataHandle2.setTi_122(handle1.getTi_122());
					    	   jbRawdataHandle2.setTi_123(handle1.getTi_123());
					    	   jbRawdataHandle2.setTi_164(handle1.getTi_164());
					    	   jbRawdataHandle2.setTi_131(handle1.getTi_131());
					    	   jbRawdataHandle2.setTi_132(handle1.getTi_132());
					    	   jbRawdataHandle2.setTi_211(handle1.getTi_211());
					    	   jbRawdataHandle2.setTi_210a(handle1.getTi_210a());
					    	   jbRawdataHandle2.setTi_134(handle1.getTi_134());
					    	   jbRawdataHandle2.setTi_215(handle1.getTi_215());
					    	   jbRawdataHandle2.setTr_413(handle1.getTr_413());
					    	   jbRawdataHandle2.setTr_403(handle1.getTr_403());
					    	   jbRawdataHandle2.setTr_407(handle1.getTr_407());
					    	   jbRawdataHandle2.setTi_407a(handle1.getTi_407a());
					    	   jbRawdataHandle2.setTi_407b(handle1.getTi_407b());
					    	   jbRawdataHandle2.setPi_213(handle1.getPi_213());
					    	   jbRawdataHandle2.setPi_105(handle1.getPi_105());
					    	   jbRawdataHandle2.setPi_112(handle1.getPi_112());
					    	   jbRawdataHandle2.setPi_114(handle1.getPi_114());
					    	   jbRawdataHandle2.setPi_234(handle1.getPi_234());
					    	   jbRawdataHandle2.setPr_401(handle1.getPr_401());
					    	   jbRawdataHandle2.setPr_403(handle1.getPr_403());
					    	   jbRawdataHandle2.setPi_422(handle1.getPi_422());
					    	   jbRawdataHandle2.setPr_416(handle1.getPr_416());
					    	   jbRawdataHandle2.setPi_288(handle1.getPi_288());
					    	   jbRawdataHandle2.setAr_101(handle1.getAr_101());
					    	   jbRawdataHandle2.setAr_109(handle1.getAr_109());
					    	   jbRawdataHandle2.setAr_110(handle1.getAr_110());
					    	   jbRawdataHandle2.setAi_104(handle1.getAi_104());
					    	   jbRawdataHandle2.setAi_103(handle1.getAi_103());
					    	   jbRawdataHandle2.setAr_111(handle1.getAr_111());
					    	   jbRawdataHandle2.setAr_112(handle1.getAr_112());
					    	   jbRawdataHandle2.setAr_113(handle1.getAr_113());
					    	   jbRawdataHandle2.setAr_114(handle1.getAr_114());
					    	   jbRawdataHandle2.setK_001(handle1.getK_001());
					    	   jbRawdataHandle2.setH2oc(handle1.getH2oc());
					    	   jbRawdataHandle2.setLr_403(handle1.getLr_403());
					    	   jbRawdataHandle2.setLr_402(handle1.getLr_402());
					    	   jbRawdataHandle2.setFiqnh3(handle1.getFiqnh3());
					    	   jbRawdataHandle2.setIpq001(handle1.getIpq001());
					    	   jbRawdataHandle2.setIpq002(handle1.getIpq002());
					    	   jbRawdataHandle2.setIpq003(handle1.getIpq003());
					    	   jbRawdataHandle2.setIpq004(handle1.getIpq004());
					    	   jbRawdataHandle2.setFiq101(handle1.getFiq101());
					    	   jbRawdataHandle2.setFtq109(handle1.getFtq109());
					    	   jbRawdataHandle2.setFiq000(handle1.getFiq000());
					    	   jbRawdataHandle2.setTime_nh3_yield(handle1.getTime_nh3_yield());
					    	   jbRawdataHandle2.setTime_electric_consume(handle1.getTime_electric_consume());
					    	   jbRawdataHandle2.setTime_raw_gas_consume(handle1.getTime_raw_gas_consume());
					    	   jbRawdataHandle2.setTime_fuel_consume(handle1.getTime_fuel_consume());
					    	   jbRawdataHandle2.setTime_gas_consume(handle1.getTime_gas_consume());
					    	   jbRawdataHandle2.setSystem_load(handle1.getSystem_load());
					    	   jbRawdataHandle2.setHour_nh3_yield(handle1.getHour_nh3_yield());
					    	   jbRawdataHandle2.setTonnh3_compre_consume(handle1.getTonnh3_compre_consume());
					    	   jbRawdataHandle2.setTonnh3_gas_consume(handle1.getTonnh3_gas_consume());
					    	   jbRawdataHandle2.setTonnh3_raw_gas_consume(handle1.getTonnh3_raw_gas_consume());
					    	   jbRawdataHandle2.setTonnh3_fuel_consume(handle1.getTonnh3_fuel_consume());
					    	   jbRawdataHandle2.setTonnh3_electric_consume(handle1.getTonnh3_electric_consume());
					    	   jbRawdataHandle2.setShift(handle1.getShift());
					    	   jbExcelInputCustomerMapper.savatohandle2(jbRawdataHandle2);
		}
			      

}
		@Override
		public void deletemiddle1() throws Exception {
			// TODO Auto-generated method stub
			jbExcelInputCustomerMapper.deletemiddle1();
		}
		@Override
		public void deletemiddle2() throws Exception {
			jbExcelInputCustomerMapper.deletemiddle2();
			
		}
		@Override
		public List<JbRawdataHandle1> selectDailyreport_jb(String btime,
				String etime) throws Exception {
			List<JbRawdataHandle1> list1 = jb_EnergyMapper.selectDailyreportFortime1_jb(btime, etime);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date newdate1 = sdf.parse(btime);
			Calendar c1 = Calendar.getInstance(); 
			c1.setTime(newdate1);  
			c1.set(Calendar.DATE, c1.get(Calendar.DATE) + 1);
			Date data1 = c1.getTime();
	        Date newdate2 = sdf.parse(etime);
			Calendar c2 = Calendar.getInstance(); 
			c2.setTime(newdate2);  
			c2.set(Calendar.DATE, c2.get(Calendar.DATE) + 1);
	        Date data2= c2.getTime();
	        String dayBefore = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(data1);
	        String dayend = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(data2);
			List<JbRawdataHandle1> list2 = jb_EnergyMapper.selectDailyreportFortime2_jb(dayBefore, dayend);
			List<JbRawdataHandle1> list3 = new ArrayList<JbRawdataHandle1>();
			List<JbRawdataHandle1> list4 = new ArrayList<JbRawdataHandle1>();
			if(list2.size()>0){
				 for(int i = 0 ;i < list2.size(); i++){
					 JbRawdataHandle1 jb= list2.get(i);
					 Date date = jb.getData_time();
					 Calendar date1 = Calendar.getInstance();
					 date1.setTime(date);
					 date1.set(Calendar.DATE, date1.get(Calendar.DATE) - 1);
					 Date date2 = date1.getTime();
					 jb.setData_time(date2);
					 list3.add(jb);
				 }
				 for(JbRawdataHandle1 l1:list3){
						for(JbRawdataHandle1 l2:list1){
							if(l1.getData_time().getTime()==l2.getData_time().getTime()){
								JbRawdataHandle1 jbRawdataHandle1 = new JbRawdataHandle1();
								jbRawdataHandle1.setData_time(l2.getData_time());
								jbRawdataHandle1.setTime_nh3_yield(l1.getTime_nh3_yield()+l2.getTime_nh3_yield());
								jbRawdataHandle1.setTime_electric_consume(l1.getTime_electric_consume()+l2.getTime_electric_consume());
								jbRawdataHandle1.setTime_raw_gas_consume(l1.getTime_raw_gas_consume()+l2.getTime_raw_gas_consume());
								jbRawdataHandle1.setOrig_id(l1.getOrig_id()+l2.getOrig_id());
								jbRawdataHandle1.setClassNumber(l1.getClassNumber());
								list4.add(jbRawdataHandle1);
								break;
							}
						}
					}
					for(JbRawdataHandle1 l1:list3){
						for(JbRawdataHandle1 l2:list1){
							if(l1.getData_time().getTime()==l2.getData_time().getTime()){
							     list1.remove(l2);
								break;
							}
						}
					}
			 }
			list4.addAll(list1);
			Collections.sort(list4,new Comparator<JbRawdataHandle1>() {

				@Override
				public int compare(JbRawdataHandle1 o1, JbRawdataHandle1 o2) {
					if(o1.getData_time().getTime() > o2.getData_time().getTime()){
						return 1;
					}
					if(o1.getData_time().getTime() == o2.getData_time().getTime()){
						return 0;
					}
					
					return -1;
				}
			});
			return list4;
		}
		@Override
		public List<JbRawdataHandle1> selectDailyreportForClass_jb(String btime,
				String etime) throws Exception {
			List<JbRawdataHandle1> list1 = jb_EnergyMapper.selectDailyReportForClass1_jb(btime, etime);
			List<JbRawdataHandle1> list9 = new ArrayList<JbRawdataHandle1>();
			for(int i = 0; i<list1.size()-1;i++){
				JbRawdataHandle1 jbRawdataHandle1 = list1.get(i);
				JbRawdataHandle1 jbRawdataHandle2 = list1.get(i+1);
				Date jbtime = jbRawdataHandle1.getData_time();
				Date jbtime2 = jbRawdataHandle2.getData_time();
				long between=(jbtime2.getTime()-jbtime.getTime())/1000;//除以1000是为了转换成秒
				long day1=between/(24*3600);
				if(day1>1){
					//说明之间有缺失的早班，则添加
					for(int j = 1;j<day1;j++){
						//添加
						JbRawdataHandle1 jb = new JbRawdataHandle1();
						Calendar date1 = Calendar.getInstance();
						date1.setTime(jbtime);
						date1.set(Calendar.DATE, date1.get(Calendar.DATE) +j);
						Date date2 = date1.getTime();
						jb.setData_time(date2);
						jb.setTime_nh3_yield(0.0);
						jb.setTime_electric_consume(0.0);
						jb.setTime_raw_gas_consume(0.0);
						jb.setOrig_id(0);
						jb.setShift(0);
						jb.setClassNumber(1);
						list9.add(jb);
					}
				}
			}
			list1.addAll(list9);
			List<JbRawdataHandle1> list2_1 = jb_EnergyMapper.selectDailyReportForClass2_1_jb(btime, etime);
			List<JbRawdataHandle1> list10 = new ArrayList<JbRawdataHandle1>();
			for(int i = 0; i<list2_1.size()-1;i++){
				JbRawdataHandle1 jbRawdataHandle1 = list2_1.get(i);
				JbRawdataHandle1 jbRawdataHandle2 = list2_1.get(i+1);
				Date jbtime = jbRawdataHandle1.getData_time();
				Date jbtime2 = jbRawdataHandle2.getData_time();
				long between=(jbtime2.getTime()-jbtime.getTime())/1000;//除以1000是为了转换成秒
				long day1=between/(24*3600);
				if(day1>1){
					//说明之间有缺失的早班，则添加
					for(int j = 1;j<day1;j++){
						//添加
						JbRawdataHandle1 jb = new JbRawdataHandle1();
						Calendar date1 = Calendar.getInstance();
						date1.setTime(jbtime);
						date1.set(Calendar.DATE, date1.get(Calendar.DATE) +j);
						Date date2 = date1.getTime();
						jb.setData_time(date2);
						jb.setTime_nh3_yield(0.0);
						jb.setTime_electric_consume(0.0);
						jb.setTime_raw_gas_consume(0.0);
						jb.setOrig_id(0);
						jb.setShift(0);
						jb.setClassNumber(2);
						list10.add(jb);
					}
				}
			}
			list2_1.addAll(list10);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date newdate1 = sdf.parse(btime);
			Calendar c1 = Calendar.getInstance(); 
			c1.setTime(newdate1);  
			c1.set(Calendar.DATE, c1.get(Calendar.DATE) + 1);
			Date data1 = c1.getTime();
	        Date newdate2 = sdf.parse(etime);
			Calendar c2 = Calendar.getInstance(); 
			c2.setTime(newdate2);  
			c2.set(Calendar.DATE, c2.get(Calendar.DATE) + 1);
	        Date data2= c2.getTime();
	        String dayBefore = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(data1);
	        String dayend = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(data2);
	        List<JbRawdataHandle1> list2_2 = jb_EnergyMapper.selectDailyReportForClass2_2_jb(dayBefore, dayend);
	        List<JbRawdataHandle1> list3 = new ArrayList<JbRawdataHandle1>();
	        List<JbRawdataHandle1> list4 = new ArrayList<JbRawdataHandle1>();
	        if(list2_2.size()>0){
				 for(int i = 0 ;i < list2_2.size(); i++){
					 JbRawdataHandle1 jb= list2_2.get(i);
					 Date date = jb.getData_time();
					 Calendar date1 = Calendar.getInstance();
					 date1.setTime(date);
					 date1.set(Calendar.DATE, date1.get(Calendar.DATE) - 1);
					 Date date2 = date1.getTime();
					 jb.setData_time(date2);
					 list3.add(jb);
				 }
				 for(JbRawdataHandle1 l1:list3){
						for(JbRawdataHandle1 l2:list2_1){
							if(l1.getData_time().getTime()==l2.getData_time().getTime()){
								JbRawdataHandle1 jbRawdataHandle1 = new JbRawdataHandle1();
								jbRawdataHandle1.setData_time(l2.getData_time());
								jbRawdataHandle1.setTime_nh3_yield(l1.getTime_nh3_yield()+l2.getTime_nh3_yield());
								jbRawdataHandle1.setTime_electric_consume(l1.getTime_electric_consume()+l2.getTime_electric_consume());
								jbRawdataHandle1.setTime_raw_gas_consume(l1.getTime_raw_gas_consume()+l2.getTime_raw_gas_consume());
								jbRawdataHandle1.setOrig_id(l1.getOrig_id()+l2.getOrig_id());
								jbRawdataHandle1.setShift(l1.getShift()+l2.getShift());
								jbRawdataHandle1.setClassNumber(l1.getClassNumber());
								list4.add(jbRawdataHandle1);
								break;
							}
						}
					}
					for(JbRawdataHandle1 l1:list3){
						for(JbRawdataHandle1 l2:list2_1){
							if(l1.getData_time().getTime()==l2.getData_time().getTime()){
								list2_1.remove(l2);
								break;
							}
						}
					}
			 }
	        list4.addAll(list2_1);
	        list1.addAll(list4);
	        Collections.sort(list1,new Comparator<JbRawdataHandle1>() {
				@Override
				public int compare(JbRawdataHandle1 o1, JbRawdataHandle1 o2) {
					if(o1.getData_time().getTime() > o2.getData_time().getTime()){
						return 1;
					}
					if(o1.getData_time().getTime() == o2.getData_time().getTime()){
						return 0;
					}
					return -1;
				}
			});
			return list1;
		}
		@Override
		public List<JbRawdataHandle1> selectQuarterreport_jb(String btime,
				String etime) throws Exception {
			List<JbRawdataHandle1> list1 = jb_EnergyMapper.selectQuarterForMouth_1_jb(btime, etime);
			List<JbRawdataHandle1>list2 = jb_EnergyMapper.selectQuarterForMouth_2_jb(btime, etime);
			for(JbRawdataHandle1 l1:list1){
				for(JbRawdataHandle1 l2:list2){
					
					Date l1time = l1.getData_time();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
					String lintime = sdf.format(l1time);
					Date listNextTime = l2.getData_time();
					String liNeTime = sdf.format(listNextTime);
					
					if(lintime.equals(liNeTime)){
						l1.setData_time(l1.getData_time());
						l1.setTime_nh3_yield(l1.getTime_nh3_yield()+l2.getTime_nh3_yield());
						l1.setTime_electric_consume(l1.getTime_electric_consume()+l2.getTime_electric_consume());
						l1.setTime_raw_gas_consume(l1.getTime_raw_gas_consume()+l2.getTime_raw_gas_consume());
						l1.setOrig_id(l1.getOrig_id()+l2.getOrig_id());
						break;
					}
				}
			}
			//得到用户输入的时间区域中有哪些月份
			List<String> Utime = this.getMonthBetween(btime, etime);
			List<JbRawdataHandle1>list3 = new ArrayList<JbRawdataHandle1>();
			List<JbRawdataHandle1>list4 = new ArrayList<JbRawdataHandle1>();
			//查询下一个月月份的00：00：00-8：00：00的数据
			for(int i =0;i<Utime.size();i++){
				String time = Utime.get(i);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
				Date userDate = sdf.parse(time);
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(userDate); 
				calendar.add(Calendar.MONTH, +1);
				Date newDate = calendar.getTime();
				String rtime = sdf.format(newDate);	
				String betime = rtime+"-01 00:00:00";
				String entime = rtime+"-01 23:59:59";
				JbRawdataHandle1 jbRawdataHandle1 = jb_EnergyMapper.selectQuarterForMouth_3_jb(betime, entime);
				if(jbRawdataHandle1 != null){
				list3.add(jbRawdataHandle1);
				}
			}
			for(int i =0;i<Utime.size();i++){
				String time = Utime.get(i);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
				Date userDate = sdf.parse(time);
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(userDate); 
				calendar.add(Calendar.MONTH, +0);
				Date newDate = calendar.getTime();
				String rtime = sdf.format(newDate);	
				String betime = rtime+"-01 00:00:00";
				String entime = rtime+"-01 23:59:59";
				JbRawdataHandle1 jbRawdataHandle1 = jb_EnergyMapper.selectQuarterForMouth_3_jb(betime, entime);
				if(jbRawdataHandle1 != null){
				list4.add(jbRawdataHandle1);
				}
			}
				for(JbRawdataHandle1 l1:list1){
					for(JbRawdataHandle1 l2:list3){
						Date l1time = l1.getData_time();
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
						String lintime = sdf.format(l1time);
						
						Date listNextTime = l2.getData_time();
						Calendar calendar = Calendar.getInstance();
						calendar.setTime(listNextTime); 
						calendar.add(Calendar.MONTH, -1);
						Date newDate = calendar.getTime();
						String liNeTime = sdf.format(newDate);
						
						if(lintime.equals(liNeTime)){
							l1.setData_time(l1.getData_time());
							l1.setTime_nh3_yield(l1.getTime_nh3_yield()+l2.getTime_nh3_yield());
							l1.setTime_electric_consume(l1.getTime_electric_consume()+l2.getTime_electric_consume());
							l1.setTime_raw_gas_consume(l1.getTime_raw_gas_consume()+l2.getTime_raw_gas_consume());
							l1.setOrig_id(l1.getOrig_id()+l2.getOrig_id());
							break;
						}
					}
				}
				for(JbRawdataHandle1 l1:list1){
					for(JbRawdataHandle1 l2:list4){
						Date l1time = l1.getData_time();
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
						String lintime = sdf.format(l1time);
						Date listNextTime = l2.getData_time();
						Calendar calendar = Calendar.getInstance();
						calendar.setTime(listNextTime); 
						calendar.add(Calendar.MONTH, -0);
						Date newDate = calendar.getTime();
						
						String liNeTime = sdf.format(newDate);
						
						
						if(lintime.equals(liNeTime)){
							l1.setData_time(l1.getData_time());
							l1.setTime_nh3_yield(l1.getTime_nh3_yield()+l2.getTime_nh3_yield());
							l1.setTime_electric_consume(l1.getTime_electric_consume()+l2.getTime_electric_consume());
							l1.setTime_raw_gas_consume(l1.getTime_raw_gas_consume()+l2.getTime_raw_gas_consume());
							l1.setOrig_id(l1.getOrig_id()-l2.getOrig_id());
							
							break;
						}
					}
				}
				
			
				Collections.sort(list1,new Comparator<JbRawdataHandle1>() {

					@Override
					public int compare(JbRawdataHandle1 o1, JbRawdataHandle1 o2) {
						if(o1.getData_time().getTime() > o2.getData_time().getTime()){
							return 1;
						}
						if(o1.getData_time().getTime() == o2.getData_time().getTime()){
							return 0;
						}
						
						return -1;
					}
				});
	        
				/*if(list2.size()>0){
				 for(JbRawdataHandle1 l1:list1){
						for(JbRawdataHandle1 l2:list2){
							Date l1time = l1.getData_time();
							SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM");
							String lintime = sdf2.format(l1time);
							
							Date listNextTime = l2.getData_time();
							
							String liNeTime = sdf2.format(listNextTime);
							
							if(lintime.equals(liNeTime)){
								JbRawdataHandle1 jbRawdataHandle1 = new JbRawdataHandle1();
								jbRawdataHandle1.setData_time(l2.getData_time());
								jbRawdataHandle1.setTime_nh3_yield(l1.getTime_nh3_yield()+l2.getTime_nh3_yield());
								jbRawdataHandle1.setTime_electric_consume(l1.getTime_electric_consume()+l2.getTime_electric_consume());
								jbRawdataHandle1.setTime_raw_gas_consume(l1.getTime_raw_gas_consume()+l2.getTime_raw_gas_consume());
								jbRawdataHandle1.setOrig_id(l1.getOrig_id()+l2.getOrig_id());
								list4.add(jbRawdataHandle1);
								break;
							}
						}
					}
					
			 }*/
	       
			return list1;
		}
		
		@Override
		public void insertUpInfo(Adminguideifo adminguideifo) throws Exception {
			adminGuideDataMapper.insertUpInfo(adminguideifo);
			
		}
		
			
			
		
		//前台指导文件查看
		@Override
		public String showBefoFile(String filename) throws Exception {
			
			if(filename.equals("优化工艺")){
				String guidename = 	adminGuideDataMapper.BeforFileShow("优化工艺");
				if(guidename == null){
					guidename = "erorr.html";
					return guidename;
				}else{
					 return  guidename ;
				}
				
				}
			if(filename.equals("变量关联")){
			String guidename = 	adminGuideDataMapper.BeforFileShow("变量关联");
			if(guidename == null){
				guidename = "erorr.html";
				return guidename;
			}else{
				 return  guidename ;
			}
			
			}
			if(filename.equals("动态调控")){
				String guidename = 	adminGuideDataMapper.BeforFileShow("动态调控");
				if(guidename == null){
					guidename = "erorr.html";
					return guidename;
				}else{
					 return  guidename ;
				}
				
				}
			else{
				String guidename = 	adminGuideDataMapper.BeforFileShow("跟踪分析");
				if(guidename == null){
					guidename = "erorr.html";
					return guidename;
				}else{
					 return  guidename ;
				}
				
				}
			
		}
		@Override
		public List<Adminguideifo> getAllAdminGuideifo() throws Exception {
			
			return adminGuideDataMapper.getAllAdminGuideifo();
		}
		@Override
		public String showguidehis(int gid) throws Exception {
			Adminguideifo adminguideifo = adminguideifoMapper.selectByPrimaryKey(gid);
			String name = adminguideifo.getNewname();
			String guidename = "/pic/guide/"+name;
			return guidename;
		}
		@Override
		public void deleteuserByid(int uid) throws Exception {
			adminGuideDataMapper.deleteuserByid(uid);
		}




		@Override
		public List<JbGuiImg> getGuideImage(Integer fid, Integer imgid)
				throws Exception {
			// TODO Auto-generated method stub
			return adminGuideDataMapper.getGuideImage(fid, imgid);
		}




		@Override
		public List<Jb_feedback02> selectVar_jb() throws Exception {
			Jb_feedback01 jb_feedback01 = adminGuideDataMapper.selectFeedBack01();
			if(jb_feedback01 !=null){
				int id  = jb_feedback01.getId();
				List<Jb_feedback02> feedback02s = adminGuideDataMapper.selectvarByid_jb(id);
				return feedback02s;
			}
			else{
				return null;
			}
		}
		@Override
		public Date selectCheckTime() throws Exception {
			Jb_feedback01 jb_feedback01 = adminGuideDataMapper.selectFeedBack01();
			if(jb_feedback01 != null){
				return jb_feedback01.getChecktime();
			}else{
				return null;
			}
			
		}




		@Override
		public void insertUserVar_jb(Jb_feedback05 jb_feedback05) throws Exception {
			adminGuideDataMapper.insertUserVar_jb(jb_feedback05);
		}




		@Override
		public List<Jb_feedback01> selectAllfeedback_jb() throws Exception {
			return adminGuideDataMapper.selectAllfeedback_jb();
		}




		@Override
		public void updatefeedbacktype_jb() throws Exception {
			Jb_feedback01 jb_feedback01 = adminGuideDataMapper.selectFeedBack01();
			if(jb_feedback01 != null){
				int id = jb_feedback01.getId();
				adminGuideDataMapper.updatefeedbacktype_jb(id);
			}
			
		}

		@Override
		public List<Jb_feedback02> selectFeedbackforhis_jb(int pid)
				throws Exception {
			return adminGuideDataMapper.selectFeedbackforhis_jb(pid);
		}
		@Override
		public List<FileUpInfo> selectFileAll() throws Exception {
			
			return fileupifoCustomerMapper.selectAll();
		}
		
		@Override
		public List<JbRawdataHandle1> selectDataByContidion(String stime,
				String btime) throws Exception {
			List<JbRawdataHandle1> list1 = jbRawdataHandle1CustomerMapper.selectDataByContidion(stime, btime);//时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date newdate = sdf.parse(btime);
			Calendar c = Calendar.getInstance(); 
			c.setTime(newdate);  
			c.set(Calendar.DATE, c.get(Calendar.DATE) + 1);
	        Date data2 = c.getTime();
	        String dayBefore = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(data2);
			List<JbRawdataHandle1>list3 = jbRawdataHandle1CustomerMapper.selectDataByContidionAndClass3(stime, dayBefore);
			
			List<JbRawdataHandle1>list5 = new ArrayList<JbRawdataHandle1>();
			List<JbRawdataHandle1>list6 = new ArrayList<JbRawdataHandle1>();
			List<JbRawdataHandle1>list7 = new ArrayList<JbRawdataHandle1>();
			if(list3.size()>0){
			for(int i = 0; i <list3.size(); i++){
				
				JbRawdataHandle1 jb = list3.get(i);
				Date date = jb.getData_time();
				Calendar date1 = Calendar.getInstance();
				date1.setTime(date);
				date1.set(Calendar.DATE, date1.get(Calendar.DATE) - 1);
				Date date2 = date1.getTime();
				jb.setData_time(date2);
				list5.add(jb);
			}
			
			//将两个集合相同就相加list5(输入的时间一天的所有的0点)和list2
			for(JbRawdataHandle1 l1:list5){
				for(JbRawdataHandle1 l2:list1){
					if(l1.getData_time().getTime()==l2.getData_time().getTime()){
						JbRawdataHandle1 jbRawdataHandle1 = new JbRawdataHandle1();
						jbRawdataHandle1.setData_time(l2.getData_time());
						jbRawdataHandle1.setTime_nh3_yield(l1.getTime_nh3_yield()+l2.getTime_nh3_yield());
						jbRawdataHandle1.setTime_electric_consume(l1.getTime_electric_consume()+l2.getTime_electric_consume());
						jbRawdataHandle1.setTime_raw_gas_consume(l1.getTime_raw_gas_consume()+l2.getTime_raw_gas_consume());
						jbRawdataHandle1.setOrig_id(l1.getOrig_id()+l2.getOrig_id());
						jbRawdataHandle1.setClassNumber(l1.getClassNumber());
						list6.add(jbRawdataHandle1);
						break;
					}
				}
			}
			for(JbRawdataHandle1 l1:list5){
				for(JbRawdataHandle1 l2:list1){
					if(l1.getData_time().getTime()==l2.getData_time().getTime()){
					     list1.remove(l2);
						break;
					}
				}
			}

			
			
			}
			
			list6.addAll(list1);
			Collections.sort(list6,new Comparator<JbRawdataHandle1>() {

				@Override
				public int compare(JbRawdataHandle1 o1, JbRawdataHandle1 o2) {
					if(o1.getData_time().getTime() > o2.getData_time().getTime()){
						return 1;
					}
					if(o1.getData_time().getTime() == o2.getData_time().getTime()){
						return 0;
					}
					
					return -1;
				}
			});
			return list6;
		}
		@Override
		public List<JbRawdataHandle1> selectDataByMouth(String stime, String btime)
				throws Exception {
			
			List<JbRawdataHandle1> list1 =  jbRawdataHandle1CustomerMapper.selectDataByMouth(stime, btime);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date newdate = sdf.parse(btime);
			Calendar c = Calendar.getInstance(); 
			c.setTime(newdate);  
			c.set(Calendar.DATE, c.get(Calendar.DATE) + 1);
	        Date data2 = c.getTime();
	        String dayBefore = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(data2);
			List<JbRawdataHandle1>list3 = jbRawdataHandle1CustomerMapper.selectDataByContidionAndClass3(stime, dayBefore);
			
			List<JbRawdataHandle1>list5 = new ArrayList<JbRawdataHandle1>();
			List<JbRawdataHandle1>list6 = new ArrayList<JbRawdataHandle1>();
			if(list3.size()>0){
			for(int i = 0; i <list3.size(); i++){
				
				JbRawdataHandle1 jb = list3.get(i);
				Date date = jb.getData_time();
				Calendar date1 = Calendar.getInstance();
				date1.setTime(date);
				date1.set(Calendar.DATE, date1.get(Calendar.DATE) - 1);
				Date date2 = date1.getTime();
				jb.setData_time(date2);
				list5.add(jb);
			}
			//将两个集合相同就相加list5和list2
			for(JbRawdataHandle1 l1:list5){
				for(JbRawdataHandle1 l2:list1){
					if(l1.getData_time().getTime()==l2.getData_time().getTime()){
						JbRawdataHandle1 jbRawdataHandle1 = new JbRawdataHandle1();
						jbRawdataHandle1.setData_time(l2.getData_time());
						jbRawdataHandle1.setTime_nh3_yield(l1.getTime_nh3_yield()+l2.getTime_nh3_yield());
						jbRawdataHandle1.setTime_electric_consume(l1.getTime_electric_consume()+l2.getTime_electric_consume());
						jbRawdataHandle1.setTime_raw_gas_consume(l1.getTime_raw_gas_consume()+l2.getTime_raw_gas_consume());
						jbRawdataHandle1.setOrig_id(l1.getOrig_id()+l2.getOrig_id());
						jbRawdataHandle1.setClassNumber(l1.getClassNumber());
						list6.add(jbRawdataHandle1);
						break;
					}
				}
			}
			for(JbRawdataHandle1 l1:list5){
				for(JbRawdataHandle1 l2:list1){
					if(l1.getData_time().getTime()==l2.getData_time().getTime()){
						 list1.remove(l2);
						break;
					}
				}
			}
			
			
			}
			list6.addAll(list1);
			Collections.sort(list6,new Comparator<JbRawdataHandle1>() {
				@Override
				public int compare(JbRawdataHandle1 o1, JbRawdataHandle1 o2) {
					if(o1.getData_time().getTime() > o2.getData_time().getTime()){
						return 1;
					}
					if(o1.getData_time().getTime() == o2.getData_time().getTime()){
						return 0;
					}
					
					return -1;
				}
			});
			return list6;
		}
		@Override
		public List<JbRawdataHandle1> selectDataByYear(String stime, String btime)
				throws Exception {
			List<JbRawdataHandle1> list1 =  jbRawdataHandle1CustomerMapper.selectDataByYear(stime, btime);
			List<String> Utime = this.getMonthBetween(stime, btime);
			List<JbRawdataHandle1>listNext = new ArrayList<JbRawdataHandle1>();
			
			for(int i =0;i<Utime.size();i++){
				String time = Utime.get(i);
				String betime = time+"-01 00:00:00";
				String entime = time+"-01 00:01:00";
				JbRawdataHandle1 jbRawdataHandle1 = jbRawdataHandle1CustomerMapper.selectDateByYearNext(betime, entime);
				if(jbRawdataHandle1 != null){
				listNext.add(jbRawdataHandle1);
				}
			}
			for(JbRawdataHandle1 l1:list1){
				for(JbRawdataHandle1 l2:listNext){
					Date l1time = l1.getData_time();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
					String lintime = sdf.format(l1time);
					
					Date listNextTime = l2.getData_time();
					
					String liNeTime = sdf.format(listNextTime);
					
					if(lintime.equals(liNeTime)){
						
						l1.setData_time(l1.getData_time());
						l1.setTime_nh3_yield(l1.getTime_nh3_yield()-l2.getTime_nh3_yield());
						l1.setTime_electric_consume(l1.getTime_electric_consume()-l2.getTime_electric_consume());
						l1.setTime_raw_gas_consume(l1.getTime_raw_gas_consume()-l2.getTime_raw_gas_consume());
						l1.setOrig_id(l1.getOrig_id()-1);
						l1.setClassNumber(l1.getClassNumber());
						break;
					}
				}
			}
			for(JbRawdataHandle1 l1:list1){
				for(JbRawdataHandle1 l2:listNext){
					Date l1time = l1.getData_time();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
					String lintime = sdf.format(l1time);
					
					Date listNextTime = l2.getData_time();
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(listNextTime); 
					calendar.add(Calendar.MONTH, -1);
					Date newDate = calendar.getTime();
					
					String liNeTime = sdf.format(newDate);
					
					
					if(lintime.equals(liNeTime)){
						l1.setData_time(l1.getData_time());
						l1.setTime_nh3_yield(l1.getTime_nh3_yield()+l2.getTime_nh3_yield());
						l1.setTime_electric_consume(l1.getTime_electric_consume()+l2.getTime_electric_consume());
						l1.setTime_raw_gas_consume(l1.getTime_raw_gas_consume()+l2.getTime_raw_gas_consume());
						l1.setOrig_id(l1.getOrig_id()+1);
						l1.setClassNumber(l1.getClassNumber());
						break;
					}
				}
			}
					
			Collections.sort(list1,new Comparator<JbRawdataHandle1>() {

				@Override
				public int compare(JbRawdataHandle1 o1, JbRawdataHandle1 o2) {
					if(o1.getData_time().getTime() > o2.getData_time().getTime()){
						return 1;
					}
					if(o1.getData_time().getTime() == o2.getData_time().getTime()){
						return 0;
					}
					
					return -1;
				}
			});
			
			return list1;
			
			
		}
		@Override
		public List<JbRawdataHandle1> selectDataByQuarter(String stime, String btime)
				throws Exception {
			List<JbRawdataHandle1> list1 =  jbRawdataHandle1CustomerMapper.selectDataByQuarter(stime, btime);
			
			List<String> Utime = this.getMonthBetween(stime, btime);
			List<JbRawdataHandle1>listNext = new ArrayList<JbRawdataHandle1>();
			//查询月份的00：00：00的数据
			for(int i =0;i<Utime.size();i++){
				String time = Utime.get(i);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
				Date userDate = sdf.parse(time);
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(userDate); 
				calendar.add(Calendar.MONTH, +1);
				Date newDate = calendar.getTime();
				String rtime = sdf.format(newDate);		
				String betime = rtime+"-01 00:00:00";
				String entime = rtime+"-01 00:01:00";
				JbRawdataHandle1 jbRawdataHandle1 = jbRawdataHandle1CustomerMapper.selectDateByYearNext(betime, entime);
				if(jbRawdataHandle1 != null){
				listNext.add(jbRawdataHandle1);
				}
			}
			for(JbRawdataHandle1 l1:list1){
				for(JbRawdataHandle1 l2:listNext){
					Date l1time = l1.getData_time();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
					String lintime = sdf.format(l1time);
					
					Date listNextTime = l2.getData_time();
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(listNextTime); 
					calendar.add(Calendar.MONTH, -1);
					Date newDate = calendar.getTime();
					String liNeTime = sdf.format(newDate);
					
					if(lintime.equals(liNeTime)){
						
						l1.setData_time(l1.getData_time());
						l1.setTime_nh3_yield(l1.getTime_nh3_yield()+l2.getTime_nh3_yield());
						l1.setTime_electric_consume(l1.getTime_electric_consume()+l2.getTime_electric_consume());
						l1.setTime_raw_gas_consume(l1.getTime_raw_gas_consume()+l2.getTime_raw_gas_consume());
						l1.setOrig_id(l1.getOrig_id()+1);
						l1.setClassNumber(l1.getClassNumber());
						break;
					}
				}
			}
			for(JbRawdataHandle1 l1:list1){
				for(JbRawdataHandle1 l2:listNext){
					Date l1time = l1.getData_time();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
					String lintime = sdf.format(l1time);
					
					Date listNextTime = l2.getData_time();
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(listNextTime); 
					calendar.add(Calendar.MONTH, -0);
					Date newDate = calendar.getTime();
					String liNeTime = sdf.format(newDate);
					
					if(lintime.equals(liNeTime)){
						
						l1.setData_time(l1.getData_time());
						l1.setTime_nh3_yield(l1.getTime_nh3_yield()-l2.getTime_nh3_yield());
						l1.setTime_electric_consume(l1.getTime_electric_consume()-l2.getTime_electric_consume());
						l1.setTime_raw_gas_consume(l1.getTime_raw_gas_consume()-l2.getTime_raw_gas_consume());
						l1.setOrig_id(l1.getOrig_id()-1);
						l1.setClassNumber(l1.getClassNumber());
						break;
					}
				}
			}
			Collections.sort(list1,new Comparator<JbRawdataHandle1>() {

				@Override
				public int compare(JbRawdataHandle1 o1, JbRawdataHandle1 o2) {
					if(o1.getData_time().getTime() > o2.getData_time().getTime()){
						return 1;
					}
					if(o1.getData_time().getTime() == o2.getData_time().getTime()){
						return 0;
					}
					
					return -1;
				}
			});
			
			return list1;
			
			
		}
		@Override
		public JbClassinfor seclectByTime(String time) throws Exception {
			
			return jbRawdataHandle1CustomerMapper.seclectByTime(time);
		}
		//判断时间是否在区间里面
		public static boolean isInTime(String sourceTime, String curTime) {
		    if (sourceTime == null || !sourceTime.contains("-") || !sourceTime.contains(":")) {
		        throw new IllegalArgumentException("Illegal Argument arg:" + sourceTime);
		    }
		    if (curTime == null || !curTime.contains(":")) {
		        throw new IllegalArgumentException("Illegal Argument arg:" + curTime);
		    }
		    String[] args = sourceTime.split("-");
		    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		    try {
		        long now = sdf.parse(curTime).getTime();
		        long start = sdf.parse(args[0]).getTime();
		        long end = sdf.parse(args[1]).getTime();
		        if (args[1].equals("00:00")) {
		            args[1] = "24:00";
		        }
		        if (end < start) {
		            if (now >= end && now < start) {
		                return false;
		            } else {
		                return true;
		            }
		        } 
		        else {
		            if (now >= start && now < end) {
		                return true;
		            } else {
		                return false;
		            }
		        }
		    } catch (ParseException e) {
		        e.printStackTrace();
		        throw new IllegalArgumentException("Illegal Argument arg:" + sourceTime);
		    }

		}
		@Override
		public List<JbRawdataHandle1> selectDataByContidionAndClass(String stime,
				String btime) throws Exception {
			//早班
			List<JbRawdataHandle1>list1 = jbRawdataHandle1CustomerMapper.selectDataByContidionAndClass1(stime, btime);
			//添加缺失的早班
			List<JbRawdataHandle1> list9 = new ArrayList<JbRawdataHandle1>();
			for(int i = 0; i<list1.size()-1;i++){
				JbRawdataHandle1 jbRawdataHandle1 = list1.get(i);
				JbRawdataHandle1 jbRawdataHandle2 = list1.get(i+1);
				Date jbtime = jbRawdataHandle1.getData_time();
				Date jbtime2 = jbRawdataHandle2.getData_time();
				long between=(jbtime2.getTime()-jbtime.getTime())/1000;//除以1000是为了转换成秒
				long day1=between/(24*3600);
				if(day1>1){
					//说明之间有缺失的早班，则添加
					for(int j = 1;j<day1;j++){
						//添加
						JbRawdataHandle1 jb = new JbRawdataHandle1();
						Calendar date1 = Calendar.getInstance();
						date1.setTime(jbtime);
						date1.set(Calendar.DATE, date1.get(Calendar.DATE) +j);
						Date date2 = date1.getTime();
						jb.setData_time(date2);
						jb.setTime_nh3_yield(0.0);
						jb.setTime_electric_consume(0.0);
						jb.setTime_raw_gas_consume(0.0);
						jb.setOrig_id(0);
						list9.add(jb);
					}
				}
			}
			list1.addAll(list9);
			//中班
			List<JbRawdataHandle1>list2 = jbRawdataHandle1CustomerMapper.selectDataByContidionAndClass2(stime, btime);
			List<JbRawdataHandle1> list10 = new ArrayList<JbRawdataHandle1>();
			for(int i = 0; i<list2.size()-1;i++){
				JbRawdataHandle1 jbRawdataHandle1 = list2.get(i);
				JbRawdataHandle1 jbRawdataHandle2 = list2.get(i+1);
				
				Date jytime = jbRawdataHandle1.getData_time();
				Date jytime2 = jbRawdataHandle2.getData_time();
				long between=(jytime2.getTime()-jytime.getTime())/1000;//除以1000是为了转换成秒
				long day1=between/(24*3600);
				if(day1>1){
					//说明之间有缺失的中班，则添加
					for(int j = 1;j<day1;j++){
						//添加
						JbRawdataHandle1 jb = new JbRawdataHandle1();
						Calendar date1 = Calendar.getInstance();
						date1.setTime(jytime);
						date1.set(Calendar.DATE, date1.get(Calendar.DATE) +j);
						Date date2 = date1.getTime();
						jb.setData_time(date2);
						jb.setTime_nh3_yield(0.0);
						jb.setTime_electric_consume(0.0);
						jb.setTime_raw_gas_consume(0.0);
						jb.setOrig_id(0);
						jb.setClassNumber(2);
						list10.add(jb);
					}
				}
			}
			list2.addAll(list10);
			//晚班
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date evbdate = sdf2.parse(btime);
			Calendar evc = Calendar.getInstance(); 
			evc.setTime(evbdate);  
			evc.set(Calendar.DATE, evc.get(Calendar.DATE) + 1);
	        Date evbdata = evc.getTime();
	        String dayev = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(evbdata);
	        
	        Date mvfdate = sdf2.parse(stime);
			Calendar mvc = Calendar.getInstance(); 
			mvc.setTime(mvfdate);  
			mvc.set(Calendar.DATE, mvc.get(Calendar.DATE) + 1);
	        Date mvbdata = mvc.getTime();
	        String daymv = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mvbdata);
			
	        List<JbRawdataHandle1>list4 = jbRawdataHandle1CustomerMapper.selectDataByContidionAndClass4(daymv, dayev);
	        List<JbRawdataHandle1> list17 = new ArrayList<JbRawdataHandle1>();
			for(int i = 0; i <list4.size(); i++){
								
				JbRawdataHandle1 jb4 = list4.get(i);
				Date date4 = jb4.getData_time();
				Calendar date14 = Calendar.getInstance();
				date14.setTime(date4);
				date14.set(Calendar.DATE, date14.get(Calendar.DATE) - 1);
				Date date24 = date14.getTime();
				jb4.setData_time(date24);
				list17.add(jb4);
			}
			List<JbRawdataHandle1> list11 = new ArrayList<JbRawdataHandle1>();
			for(int i = 0; i<list17.size()-1;i++){
				JbRawdataHandle1 jbRawdataHandle1 = list17.get(i);
				JbRawdataHandle1 jbRawdataHandle2 = list17.get(i+1);
				
				Date jytime = jbRawdataHandle1.getData_time();
				Date jytime2 = jbRawdataHandle2.getData_time();
				long between=(jytime2.getTime()-jytime.getTime())/1000;//除以1000是为了转换成秒
				long day1=between/(24*3600);
				if(day1>1){
					//说明之间有缺失的早班，则添加
					for(int j = 1;j<day1;j++){
						//添加
						JbRawdataHandle1 jb = new JbRawdataHandle1();
						Calendar date1 = Calendar.getInstance();
						date1.setTime(jytime);
						date1.set(Calendar.DATE, date1.get(Calendar.DATE) +j);
						Date date2 = date1.getTime();
						jb.setData_time(date2);
						jb.setTime_nh3_yield(0.0);
						jb.setTime_electric_consume(0.0);
						jb.setTime_raw_gas_consume(0.0);
						jb.setOrig_id(0);
						jb.setClassNumber(3);
						list11.add(jb);
					}
				}
			}
			list17.addAll(list11);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date newdate = sdf.parse(btime);
			Calendar c = Calendar.getInstance(); 
			c.setTime(newdate);  
			c.set(Calendar.DATE, c.get(Calendar.DATE) + 1);
	        Date data2 = c.getTime();
	        String dayBefore = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(data2);
	        
			//00-00
	        List<JbRawdataHandle1>list3 = jbRawdataHandle1CustomerMapper.selectDataByContidionAndClass3(stime, dayBefore);
			
			List<JbRawdataHandle1>list5 = new ArrayList<JbRawdataHandle1>();
			List<JbRawdataHandle1>list6 = new ArrayList<JbRawdataHandle1>();
			if(list3.size()>0){
			for(int i = 0; i <list3.size(); i++){
				
				JbRawdataHandle1 jb = list3.get(i);
				Date date = jb.getData_time();
				Calendar date1 = Calendar.getInstance();
				date1.setTime(date);
				date1.set(Calendar.DATE, date1.get(Calendar.DATE) - 1);
				Date date2 = date1.getTime();
				jb.setData_time(date2);
				list5.add(jb);
			}
			List<JbRawdataHandle1> list12 = new ArrayList<JbRawdataHandle1>();
			for(int i = 0; i<list5.size()-1;i++){
				JbRawdataHandle1 jbRawdataHandle1 = list5.get(i);
				JbRawdataHandle1 jbRawdataHandle2 = list5.get(i+1);
				
				Date jytime = jbRawdataHandle1.getData_time();
				Date jytime2 = jbRawdataHandle2.getData_time();
				long between=(jytime2.getTime()-jytime.getTime())/1000;//除以1000是为了转换成秒
				long day1=between/(24*3600);
				if(day1>1){
					//说明之间有缺失的早班，则添加
					for(int j = 1;j<day1;j++){
						//添加
						JbRawdataHandle1 jb = new JbRawdataHandle1();
						Calendar date1 = Calendar.getInstance();
						date1.setTime(jytime);
						date1.set(Calendar.DATE, date1.get(Calendar.DATE) +j);
						Date date2 = date1.getTime();
						jb.setData_time(date2);
						jb.setTime_nh3_yield(0.0);
						jb.setTime_electric_consume(0.0);
						jb.setTime_raw_gas_consume(0.0);
						jb.setOrig_id(0);
						jb.setClassNumber(2);
						list12.add(jb);
					}
				}
			}
			list5.addAll(list12);
			//将两个集合相同就相加list5和list2
			for(JbRawdataHandle1 l1:list5){
				for(JbRawdataHandle1 l2:list2){
					if(l1.getData_time().getTime()==l2.getData_time().getTime()){
						JbRawdataHandle1 jbRawdataHandle1 = new JbRawdataHandle1();
						jbRawdataHandle1.setData_time(l2.getData_time());
						jbRawdataHandle1.setTime_nh3_yield(l1.getTime_nh3_yield()+l2.getTime_nh3_yield());
						jbRawdataHandle1.setTime_electric_consume(l1.getTime_electric_consume()+l2.getTime_electric_consume());
						jbRawdataHandle1.setTime_raw_gas_consume(l1.getTime_raw_gas_consume()+l2.getTime_raw_gas_consume());
						jbRawdataHandle1.setOrig_id(l1.getOrig_id()+l2.getOrig_id());
						jbRawdataHandle1.setClassNumber(l1.getClassNumber());
						list6.add(jbRawdataHandle1);
						break;
					}
				}
			}
			
			list1.addAll(list6);
			list1.addAll(list17);
			}else{
				list1.addAll(list2);
				list1.addAll(list17);
			}
			Collections.sort(list1,new Comparator<JbRawdataHandle1>() {

				@Override
				public int compare(JbRawdataHandle1 o1, JbRawdataHandle1 o2) {
					if(o1.getData_time().getTime() > o2.getData_time().getTime()){
						return 1;
					}
					if(o1.getData_time().getTime() == o2.getData_time().getTime()){
						return 0;
					}
					
					return -1;
				}
			});
			for(int i = 0; i<list1.size();i++){
				JbRawdataHandle1 jb2 = list1.get(0);
				if(jb2.getClassNumber()==2){
					//说明查询的第一个只有中班，则添加早班
					JbRawdataHandle1 jb3 = new JbRawdataHandle1();
					jb3.setData_time(jb2.getData_time());
					jb3.setTime_nh3_yield(0.0);
					jb3.setTime_electric_consume(0.0);
					jb3.setTime_raw_gas_consume(0.0);
					jb3.setOrig_id(0);
					jb3.setClassNumber(1);
					list1.add(0, jb3);
				}
			}
			/*if(list1.size()>0){
				JbRawdataHandle1 jbRawdataHandle1 = list1.get(list1.size()-1);
				int eclassn = jbRawdataHandle1.getClassNumber();
				JbRawdataHandle1 jbRawdataHandle2 = list1.get(list1.size()-2);
				int eclassn2 = jbRawdataHandle2.getClassNumber();
				List<JbRawdataHandle1> qslist = new ArrayList<JbRawdataHandle1>();
				if(eclassn == 3 && eclassn2 == 3){
					
					//只有中班，则添加早班
					//说明查询的第一个只有中班，则添加早班
					JbRawdataHandle1 jb3 = new JbRawdataHandle1();
					jb3.setData_time(jbRawdataHandle1.getData_time());
					jb3.setTime_nh3_yield(0.0);
					jb3.setTime_electric_consume(0.0);
					jb3.setTime_raw_gas_consume(0.0);
					jb3.setOrig_id(0);
					jb3.setClassNumber(1);
					qslist.add(jb3);
					JbRawdataHandle1 jb4 = new JbRawdataHandle1();
					jb4.setData_time(jbRawdataHandle1.getData_time());
					jb4.setTime_nh3_yield(0.0);
					jb4.setTime_electric_consume(0.0);
					jb4.setTime_raw_gas_consume(0.0);
					jb4.setOrig_id(0);
					jb4.setClassNumber(2);
					qslist.add(jb4);
					
					qslist.add(jbRawdataHandle1);
				}
				if(qslist.size()>2){
					list1.remove(list1.get(list1.size()-1));
					list1.addAll(qslist);
				}
			}*/
			
			Collections.sort(list1,new Comparator<JbRawdataHandle1>() {
				@Override
				public int compare(JbRawdataHandle1 o1, JbRawdataHandle1 o2) {
					if(o1.getData_time().getTime() > o2.getData_time().getTime()){
						return 1;
					}
					if(o1.getData_time().getTime() == o2.getData_time().getTime()){
						return 0;
					}
					return -1;
				}
			});
			return list1;
		}
		@Override
		public List<JbRawdataHandle1> selectDataByMouthAndClass(String stime,
				String btime) throws Exception {
			List<JbRawdataHandle1>list1 = jbRawdataHandle1CustomerMapper.selectDataByMouthAndClass(stime, btime);
			List<JbRawdataHandle1>list2 = jbRawdataHandle1CustomerMapper.selectDataByMouthAndClass1(stime, btime);
			List<JbRawdataHandle1>list3 = jbRawdataHandle1CustomerMapper.selectDataByMouthAndClass2(stime, btime);
			List<JbRawdataHandle1>list4 = jbRawdataHandle1CustomerMapper.selectDataByMouthAndClass3(stime, btime);
			List<JbRawdataHandle1>list5 = new ArrayList<JbRawdataHandle1>();
			List<JbRawdataHandle1>list6 = new ArrayList<JbRawdataHandle1>();
			for(int i = 0; i <list3.size(); i++){
				
				JbRawdataHandle1 jb = list3.get(i);
				Date date = jb.getData_time();
				Calendar date1 = Calendar.getInstance();
				date1.setTime(date);
				date1.set(Calendar.DATE, date1.get(Calendar.DATE) + 1);
				Date date2 = date1.getTime();
				jb.setData_time(date2);
				list5.add(jb);
			}
			//将两个集合相同就相加list5和list2
			for(JbRawdataHandle1 l1:list5){
				for(JbRawdataHandle1 l2:list2){
					if(l1.getData_time().getTime()==l2.getData_time().getTime()){
						JbRawdataHandle1 jbRawdataHandle1 = new JbRawdataHandle1();
						jbRawdataHandle1.setData_time(l2.getData_time());
						jbRawdataHandle1.setTime_nh3_yield(l1.getTime_nh3_yield()+l2.getTime_nh3_yield());
						jbRawdataHandle1.setTime_electric_consume(l1.getTime_electric_consume()+l2.getTime_electric_consume());
						jbRawdataHandle1.setTime_raw_gas_consume(l1.getTime_raw_gas_consume()+l2.getTime_raw_gas_consume());
						jbRawdataHandle1.setOrig_id(l1.getOrig_id()+l2.getOrig_id());
						jbRawdataHandle1.setClassNumber(l1.getClassNumber());
						list6.add(jbRawdataHandle1);
						break;
					}
				}
			}
			list1.addAll(list6);
			list1.addAll(list4);
			Collections.sort(list1,new Comparator<JbRawdataHandle1>() {

				@Override
				public int compare(JbRawdataHandle1 o1, JbRawdataHandle1 o2) {
					if(o1.getData_time().getTime() > o2.getData_time().getTime()){
						return 1;
					}
					if(o1.getData_time().getTime() == o2.getData_time().getTime()){
						return 0;
					}
					return -1;
				}
			});
			
			
			return list1;
			
			
		}
		
		@Override
		public JbRawdataHandle1 getLastTime() throws Exception {
			
			return jbRawdataHandle1CustomerMapper.getLastTime();
		}
		
		 private static List<String> getMonthBetween(String minDate, String maxDate) throws Exception {
			    ArrayList<String> result = new ArrayList<String>();
			      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");//格式化为年月
			  
			      Calendar min = Calendar.getInstance();
			      Calendar max = Calendar.getInstance();
			  
			      min.setTime(sdf.parse(minDate));
			      min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);
			
			     max.setTime(sdf.parse(maxDate));
			     max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);
			 
			     Calendar curr = min;
		     while (curr.before(max)) {
			      result.add(sdf.format(curr.getTime()));
			      curr.add(Calendar.MONTH, 1);
			     }
			 
			     return result;
			   }



	
}
