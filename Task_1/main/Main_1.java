package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.WelcomeMessage;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/application.xml");

		
		WelcomeMessage w=context.getBean(WelcomeMessage.class);
		w.show();
	}

}
