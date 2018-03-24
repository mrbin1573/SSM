package com.saitejn.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.saitejn.pojo.JbClassinfor;

public class Testtime {
	public static void main(String[] args) {
		isInTime("16:09-00:01", "00:00");
		System.out.println(isInTime("00:00-00:01", "00:00"));
		
		
		Date date = new Date();
		String classtime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		//截取年
		String year = classtime.substring(0, 10);
	
		//截取时分秒
		String mdate = classtime.substring(11, 19);
		System.out.println(mdate);
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

}
