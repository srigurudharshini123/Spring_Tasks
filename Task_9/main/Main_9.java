package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Library;

public class Main_9 {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("resources/application.xml");

Library l1=context.getBean("lib1",Library.class);
l1.display();

	}

}
