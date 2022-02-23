package com.mondee;


	
	
	import org.aspectj.lang.JoinPoint;
	import org.aspectj.lang.ProceedingJoinPoint;
	import org.aspectj.lang.annotation.Around;
	import org.aspectj.lang.annotation.Aspect;
	import org.aspectj.lang.annotation.Pointcut;

	@Aspect
	public class AroundAdvice_Demo {
			
		@Pointcut("execution(* Student.*(..))")
		public void pc() {}
		
		@Around("pc()")
		public Object adviceDemo(ProceedingJoinPoint pjp) throws Throwable
		{
			System.out.println("BEFORE METHOD FROM adviceDemo ...  ");
			
			Object ob=pjp.proceed();
			
			System.out.println("AFTER METHOD FROM adviceDemo ... \n\n");

			return ob;
		}
		
	}
