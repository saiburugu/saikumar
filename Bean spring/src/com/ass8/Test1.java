package com.ass8;



import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class Test1 {

	public static void main(String[] args) {  

		ApplicationContext ac=new ClassPathXmlApplicationContext("ass8.xml");  
		Object ob=ac.getBean("customer");
		Customer c=(Customer)ob;
		c.getCustomer();
		//System.out.println(c);		
	}
}
