package com.saitejn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saitejn.mapper.UserCustomerMapper;
import com.saitejn.pojo.JbUserifo;

public class TestSeclect {
	  private static ApplicationContext ac;
	    static {
	        ac = new ClassPathXmlApplicationContext("spring/springmvc.xml");
	    }

	    public static void main(String[] args) throws Exception {
	        UserCustomerMapper mapper = (UserCustomerMapper) ac.getBean(" UserCustomerMapper");
	        System.out.println("获取alvin");
	        JbUserifo user = mapper.selectByName("12");

	      
	       

	    }

}
