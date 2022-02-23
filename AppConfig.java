package com.mondee;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


	@Configuration
	public class AppConfig {
		
		@Bean
		public Student getStudent()
		{
			return new Student();
		}
		
		@Bean
		public AroundAdvice_Demo getAroundAdvice_Demo()
		{
			return new AroundAdvice_Demo();
		}
		
		@Bean
		public AnnotationAwareAspectJAutoProxyCreator getAnnotationAwareAspectJAutoProxyCreator()
		{
			return new AnnotationAwareAspectJAutoProxyCreator();
		}
	}	
