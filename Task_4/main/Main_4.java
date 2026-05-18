package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Student;

public class Main_4 {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("resources/application.xml");

Student s=context.getBean("std1",Student.class);
s.display();
	}

}
