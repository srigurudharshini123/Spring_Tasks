package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Mobile;

public class Main_6 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/application.xml");
        Mobile m=context.getBean(Mobile.class);
        m.display();
        
	}

}
