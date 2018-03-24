package com.saitejn.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.saitejn.pojo.JbClassinfor;
import com.saitejn.pojo.Jfclassinfo;

/**
 * 建峰4班三运转6月26为231
 * 231 234 124 123 413 412 342 341
 * @Dbb43
 * @Description
 * @author 罗康元
 * @company 成都赛特工信科技有限公司
 * @date 2017-6-30
 */
public class Dbb43 {
	private static String classinfo="231234124123413412342341";
	public static void main(String[] args) {
		classplay("2017-06-26", "2018-10-24");
	}
	
	public static  void classplay(String dateFirst, String dateSecond){
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        //获取用户班次信息，并截取字符串
		   String jf1 = classinfo.substring(0,3);
		   String jf2 = classinfo.substring(3, 6);
		   String jf3 = classinfo.substring(6,9);
		   String jf4 = classinfo.substring(9,12);
		   String jf5 = classinfo.substring(12,15);
		   String jf6 = classinfo.substring(15,18);
		   String jf7 = classinfo.substring(18,21);
		   String jf8 = classinfo.substring(21,24);
		  
	        try{
	            Date dateOne = dateFormat.parse(dateFirst);
	            Date dateTwo = dateFormat.parse(dateSecond);
	             
	            Calendar calendar = Calendar.getInstance();
	             
	            calendar.setTime(dateOne);
	            int i = 0;
	            String classinfo = "";
	            System.out.println("时间日期"+"                   早班"+"          中班"+"           晚班");
	            while(calendar.getTime().before(dateTwo)){               
	             
	               i++;
	               if(i%8 ==1){
	            	   classinfo = jf1;
	   			}
	               if(i%8 ==2){
	   			 classinfo = jf2;
	   			}
	   			if(i%8 ==3){
	   			 classinfo = jf3;
	   			}
	   			if(i%8 ==4){
		   			 classinfo = jf4;
		   			}
	   			if(i%8 ==5){
		   			 classinfo = jf5;
		   			}
	   			if(i%8 ==6){
		   			 classinfo = jf6;
		   			}
	   			if(i%8 ==7){
		   			 classinfo = jf7;
		   			}
	   			if(i%8 ==0){
		   			 classinfo = jf8;
		   			}
	   			String eemon = classinfo.substring(0, 1);
	   			int cmon = Integer.parseInt(eemon);
	   			String eeaft = classinfo.substring(1, 2);
	   			int caft = Integer.parseInt(eeaft);
	   			String eeeve = classinfo.substring(2, 3);
	   			int ceve = Integer.parseInt(eeeve);
	   			
	   			System.out.println(dateFormat.format(calendar.getTime())+"        "+cmon+"             "+caft+"                   "+ceve);
	                JbClassinfor jbClassinfor = new JbClassinfor();
	                //将String装换为Date,
	                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	                Date date = sdf.parse(dateFormat.format(calendar.getTime()));
	                jbClassinfor.setClass_time(date);
	                jbClassinfor.setMorclass(cmon);
	                jbClassinfor.setAftclass(caft);
	                jbClassinfor.setEveclass(ceve);
	                //userServices.saveClassifo(jbClassinfor);
	                //保存班次记录
	                 
	                calendar.add(Calendar.DAY_OF_MONTH, 1);               
	            }
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	      
	}
}
