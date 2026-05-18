package bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Mobile {
private int id;
private String brand;
private double price;

@Autowired
private Battery bat;

public void setBat(Battery bat) {
	this.bat = bat;
}
public void setId(int id) {
	this.id = id;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public void setPrice(double price) {
	this.price = price;
}
public void display() {
	System.out.println("Mobile ID: "+id+"\nMobile Brand: "+brand+"\nPrice: "+price+"\nBattery: "+bat);
}
}
