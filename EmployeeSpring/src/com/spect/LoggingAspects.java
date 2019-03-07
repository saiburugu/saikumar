package com.spect;


public class LoggingAspects{
	 @Before("execution public * get *()")
	public void loggingAdvice()
	{
	System.out.println("advice run");
	}
	}





