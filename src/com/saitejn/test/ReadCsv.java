package com.saitejn.test;

import java.io.IOException;
import java.nio.charset.Charset;

import com.csvreader.CsvReader;

public class ReadCsv {
	public static void main(String[] args) throws IOException {
				//生成CsvReader对象，以，为分隔符，GBK编码方式
		       /*   CsvReader r = new CsvReader("F://csv//2017年测试报表.csv", ',',Charset.forName("UTF-8"));*/
		          CsvReader r = new CsvReader("F://csv//2017年5月30日报表.csv", ',',Charset.forName("UTF-8"));
		        /*  CsvReader r = new CsvReader("F://csv//FT_81151105.csv", ',',Charset.forName("UTF-8"));*/
		         //读取表头
		          r.readHeaders();
		          //逐条读取记录，直至读完
		          while (r.readRecord()) {
		        	  if (r.getCurrentRecord()>0) {
		        		  System.out.println(r.getRawRecord());
					}
		             //读取一条记录
		          
		              //按列名读取这条记录的值
		            /* System.out.println(r.get("Name"));
		             System.out.println(r.get("class"));
		             System.out.println(r.get("number"));
		             System.out.println(r.get("sex"));*/
		         }
		        r.close();
	}

}
