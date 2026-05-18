package bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Bank {
@Autowired
private Transaction transaction;

public void setTransaction(Transaction transaction) {
	this.transaction = transaction;
}
public void bankProcess() {
	transaction.TransactionApp();
	transaction.end();
}

public void init() {
	System.out.println("Bank Processing Started");
}

public void destroy() {
	System.out.println("Bank processing Destroyed");
}
}


