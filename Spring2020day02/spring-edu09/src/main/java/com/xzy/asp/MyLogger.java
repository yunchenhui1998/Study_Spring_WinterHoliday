package com.xzy.asp;

import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MyLogger {
	
	    @Pointcut("execution(* com.xzy.dao.*.*(..))")
	    public void alldao() {}
	
	//@Before("execution(* com.xzy.dao.*.*(..))")
	@Before("alldao()")
	public void beforLog()
	{
		System.out.println(Thread.currentThread().getName()+"--"+new Date()+"..前日志");
	}
	
	//@After("execution(* com.xzy.dao.*.*(..))")
	@After("alldao()")
	public void afterLog()
	{
		System.out.println(Thread.currentThread().getName()+"--"+new Date()+"..后日志");
	}
}
