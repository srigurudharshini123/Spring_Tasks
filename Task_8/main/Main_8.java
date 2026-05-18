package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.DatabaseConnection;

public class Main_8 {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("resources/aapplication.xml");

DatabaseConnection db=context.getBean("data1",DatabaseConnection.class);
db.connet();
db.end();


	
	
	}

}
