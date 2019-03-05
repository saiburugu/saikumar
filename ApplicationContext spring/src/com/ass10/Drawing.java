package com.ass10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Drawing  {
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("ass10.xml");
		Square s=(Square) context.getBean("square");
		s.draw();
	}

}

