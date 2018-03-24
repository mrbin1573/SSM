package com.saitejn.util;

public class Testfile {
	public static void main(String[] args) {
		
		String OriginalFilename = "2017年6月1日报表.csv";
		System.out.println(OriginalFilename.substring(OriginalFilename.lastIndexOf(".")));
	}
}
