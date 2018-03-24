package com.saitejn.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TestDateBettem {
	
	public static void main(String[] args) throws Exception {
		TestDateBettem testDateBettem = new TestDateBettem();
		List<String> strings = testDateBettem.getMonthBetween("2017-05-01 00:00:00", "2017-12-31 23:59:59");
		for(int i = 0;i<strings.size();i++){
			System.out.println(strings.get(i));
		}
		System.out.println(strings.size());
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
