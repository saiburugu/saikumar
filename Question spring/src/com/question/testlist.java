package com.question;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testlist {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
	    Question c=(Question) context.getBean("question");
		System.out.println(c);
	}

}
