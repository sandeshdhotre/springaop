package org.javaindeapth.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Employee e1 = (Employee) context.getBean("e1");
		
		System.out.println("e1 id:"+e1.getId());
		System.out.println("e1 name:"+e1.getName());
		
		Employee e2 = (Employee) context.getBean("e2");
		
		System.out.println("e2 id:"+e2.getId());
		System.out.println("e2 name:"+e2.getName());
	}
}
