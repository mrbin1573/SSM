package com.saitejn.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDateSum {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date begin=dfs.parse("2004-11-08 00:00:00");
		java.util.Date end = dfs.parse("2004-11-12 00:00:00");
		long between=(end.getTime()-begin.getTime())/1000;//除以1000是为了转换成秒
		long day1=between/(24*3600);
		long hour1=between%(24*3600)/3600;
		long minute1=between%3600/60;
		long second1=between%60/60;
		System.out.println(""+day1+"天"+hour1+"小时"+minute1+"分"+second1+"秒"); 
	}

}
