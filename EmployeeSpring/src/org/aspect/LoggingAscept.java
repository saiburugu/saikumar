package org.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class LoggingAscept {
	
	@Around("@annotation(com.org.myAnnotation.Loggable)")
    public void loggingAdvice(ProceedingJoinPoint joinpoint)
    {
		
		//System.out.println("before inserting data");
		try {
			System.out.println("before inserting data");
			joinpoint.proceed();
			System.out.println("after inserting data");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
    }
}





