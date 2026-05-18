package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Bank;

public class Main_10 {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("resources/application.xml");
Bank b1=context.getBean("bank1",Bank.class);
b1.bankProcess();
b1.destroy();

	}

}
