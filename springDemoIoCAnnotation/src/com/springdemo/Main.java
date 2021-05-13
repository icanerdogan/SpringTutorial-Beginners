package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		
		// "context" diğer context dosyasından aldığımız için refresh yaptık!
		//context.refresh();
		
		//IocConfig.java dosyasında "database" fonksiyonu oluşturduk
		// CustomerDalService customerDalService = context.getBean("database", CustomerDalService.class);
		// customerDalService.add();
		
		CustomerManagerService customerManagerService = context.getBean("service",CustomerManagerService.class);
		customerManagerService.add();
	}

}
