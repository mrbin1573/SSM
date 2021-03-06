package com.saitejn.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.saitejn.pojo.JfRawdataHandle1;

/**
 * 测试时间排序
 * @author Administrator
 *
 */
public class TestTimeSort {
	public static void main(String[] args) {
		//时间集合
		List<JfRawdataHandle1> list1 = new ArrayList<JfRawdataHandle1>();
		
		for(int i = 1; i<10; i++){
			Date date = new Date();
			 Calendar   calendar   =   new  GregorianCalendar(); 
		     calendar.setTime(date); 
		     calendar.add(calendar.DATE,i);//把日期往后增加一天.整数往后推,负数往前移动 
		     date=calendar.getTime();   //这个时间就是日期往后推一天的结果 
		     
		     Calendar nowTime = Calendar.getInstance();
		     nowTime.add(Calendar.MINUTE, 5);
		     JfRawdataHandle1 jfRawdataHandle1 = new JfRawdataHandle1();
		     jfRawdataHandle1.setData_time(date);
		     jfRawdataHandle1.setClassNumber(1);
		     list1.add(jfRawdataHandle1);
		}
		
		for(int j = 0 ; j<list1.size();j++){
			JfRawdataHandle1 jfRawdataHandle1 = list1.get(j);
			System.out.println(jfRawdataHandle1.getData_time()+"++++++++++++++++");
		}
	
	}
	
}
