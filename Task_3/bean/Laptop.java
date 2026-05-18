package bean;

public class Laptop {
private String brand;
private double price;
private String storage;
private Processor pro;
public Laptop(String brand, double price, String storage, Processor pro) {
	this.brand = brand;
	this.price = price;
	this.storage = storage;
	this.pro = pro;
	System.out.println("Brand: "+brand+"\nPrice: "+price+"\nStorage: "+storage+"\nProcessor: "+pro);
}

}
