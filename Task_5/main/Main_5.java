package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Employee;

public class Main_5 {
 
	public static void main(String [] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("resources/application.xml");

Employee emp=context.getBean("emp1",Employee.class);


emp.display();
	}
}
