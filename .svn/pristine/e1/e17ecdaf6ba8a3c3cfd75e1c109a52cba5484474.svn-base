package com.saitejn.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.saitejn.pojo.JbClassinfor;
/**
 * 金杯三班三运转倒班表
 * @Dbb
 * @Description
 * @author 罗康元
 * @company 成都赛特工信科技有限公司
 * @date 2017-6-27
 */
public class Dbb {
	private static String classinfo="123123123231231231312312312";
	public static void main(String[] args) {
		classplay("2016-04-22", "2018-10-24");
	}
	
	public static  void classplay(String dateFirst, String dateSecond){
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        //获取用户班次信息，并截取字符串
		  String mon = classinfo.substring(0,9);
		   String emon = mon.substring(0, 3);
		   System.out.println("======="+mon);
		   String aft = classinfo.substring(9, 18);
		   String eaft = aft.substring(0,3);
		   System.out.println("======="+aft);
		   String eve = classinfo.substring(18,27);
		   String eeve = eve.substring(0,3);
		   System.out.println("======="+eve);
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
	               if(i%9 ==7||i%9 ==8||i%9 ==0){
	            	   classinfo = eeve;
	   			}
	               if(i%9 ==1||i%9 ==2||i%9 ==3){
	   			 classinfo = emon;
	   			}
	   			if(i%9 ==4||i%9 ==5||i%9 ==6){
	   			 classinfo = eaft;
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
