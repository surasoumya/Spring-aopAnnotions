package com.mondee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	
	

		public static void main(String[] args) {
			ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
			
			Student s=ac.getBean(Student.class);
			
			s.demo();
			s.show();
		}
	}

