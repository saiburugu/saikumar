package com.spring;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class Test {

	public static void main(String[] args) {  

		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");  
		Object ob=ac.getBean("customer");
		Customer c=(Customer)ob;
		System.out.println(c);		
	}
}
