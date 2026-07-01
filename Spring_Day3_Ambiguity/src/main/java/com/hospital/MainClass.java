package com.hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		
		Person p = context.getBean(Person.class);
		
		System.out.println(p.getHs().book());
		System.out.println(p.getSs().book());
	}
}
