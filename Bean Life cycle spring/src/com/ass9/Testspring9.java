package com.ass9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Testspring9 {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("ass9.xml");
		((AbstractApplicationContext) ac).registerShutdownHook();
		BeanLifecycle a=(BeanLifecycle) ac.getBean("question");
		System.out.println(a);
}
}