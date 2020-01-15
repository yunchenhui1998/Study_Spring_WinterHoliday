package com.xzy.asp;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	
	
	   @AfterReturning(pointcut="execution(* com.xzy.dao.*.counter(..))",returning="retVal")
	    public void doAccessCheck(Object retVal) {
	        
		    if(retVal instanceof Integer)
		    {
		    	System.out.println("^-^::"+(((Integer)retVal)+30));
		    }
	    }
	   
	   @AfterThrowing(
		        pointcut="execution(* com.xzy.dao.*.div(..))",
		        throwing="ex")
		    public void doRecoveryActions(Exception ex) {
		        
		   System.out.println("出错了，除数不能为零...");
		    }
	   
	   
	   @Around("execution(* com.xzy.dao.*.counter(..))")
	    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
	        // start stopwatch
	        Object retVal = pjp.proceed();//真正执行目标方法
		   //System.out.println("我们发邮件吧...");
	        // stop stopwatch
	        return ((Integer)retVal)+200;
	    }

}
