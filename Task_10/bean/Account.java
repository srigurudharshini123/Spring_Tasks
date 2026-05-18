package bean;

public class Account {
private int accno;
private String name;
private double balance;
public Account(int accno, String name, double balance) {
	this.accno = accno;
	this.name = name;
	this.balance = balance;
}
public void display() {
	System.out.println("Account Number: "+accno);
	System.out.println("USer name: "+name);
	System.out.println("Balance: "+balance);
}
public void start() {
	System.out.println("Account Operation Started...");
}
public void end() {
	System.out.println("Account Operation Ended...");
}
}
