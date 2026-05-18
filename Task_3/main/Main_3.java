package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Laptop;

public class Main_3 {
     public static void main(String[]args) {
 
 ApplicationContext context=new ClassPathXmlApplicationContext("resources/application.xml");
 
 
 Laptop l=context.getBean("lap1",Laptop.class);

     }
}
