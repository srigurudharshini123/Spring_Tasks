package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Printer;

public class Main_7 {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("resources/application.xml");
	Printer p1=context.getBean("pre1",Printer.class);
	p1.display();
	System.out.println("code: "+p1.hashCode());
	Printer p2=context.getBean("pre1",Printer.class);
	p2.display();
	System.out.println("code: "+p2.hashCode());
	Printer p3=context.getBean("pre2",Printer.class);
	p3.display();
	System.out.println("code: "+p3.hashCode());
	Printer p4=context.getBean("pre2",Printer.class);
    p4.display();
    System.out.println("code: "+p4.hashCode());
}
}
