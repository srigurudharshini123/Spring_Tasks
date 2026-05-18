package bean;

public class Transaction {
private Account acc1;

public Transaction(Account acc1) {
	super();
	this.acc1 = acc1;
}
public void TransactionApp() {
	acc1.display();
	acc1.end();
}
public void start() {
	System.out.println("Transaction Initialized...");
}
public void end() {
	System.out.println("Transaction Destroyed...");
}
}
