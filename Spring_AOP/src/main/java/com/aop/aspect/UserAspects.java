package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspects {
	
	//Join Point Represents Current Executing method
	
	@Before("execution(* com.aop.service.UserService.*(..))")
	public void before(JoinPoint join) {
		System.out.println("Before : Executing:  " + join.getSignature().getName());
	}
	

	@After("execution(* com.aop.service.UserService.*(..))")
	public void after(JoinPoint join) {
		System.out.println("After : Execution Completed..." + join.getSignature().getName() );
	}
	
	@AfterReturning(pointcut = "execution(* com.aop.service.UserService.*(..))", returning = "returnValue")
	public void afterReturn(Object returnValue) {
		System.out.println("AfterReturn : Execution Completed with Returned Value : " + returnValue);
	}
	
	@AfterThrowing(pointcut = "execution(* com.aop.service.UserService.*(..))", throwing = "exception")
	public void afterThrowing(Throwable exception) {
		System.out.println("AfterThrowing : Execution Completed with an Exception : " + exception);
	}
	
	
	@Around("execution(* com.aop.service.UserService.*(..))")
	public void around(ProceedingJoinPoint pro) throws Throwable {
	System.out.println("Around Before : Executing .....");
	pro.proceed();
	System.out.println("Around After : Exection Completed");
	}
}
