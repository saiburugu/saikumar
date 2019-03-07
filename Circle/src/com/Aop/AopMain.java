package com.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Shape.Shape;

public class AopMain {

	public static void main(String[] args)
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	
	Shape ss=(Shape) context.getBean("shape");
	System.out.println(ss.getcircle().getName());
	System.out.println(ss.gettriangle().getName());

	}

}
