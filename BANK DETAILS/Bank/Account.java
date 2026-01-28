package Bank;
import java.util.Scanner;
class Account {
private double balance;
private String accountHolderName;
private String accountNumber;
private int passcode;
public Account(String holderName,String uniqNumber,double amount,int uniqCode) {
	this.accountHolderName=holderName;
	this.accountNumber=uniqNumber;
	this.balance=amount;
	this.passcode=uniqCode;	
}
private boolean validatePasscode(int enteredCode) {
	return this.passcode==(enteredCode);
}
public void login(int enteredCode) {
	if(validatePasscode(enteredCode)) {
		System.out.println("Login successfully");
	}
	else {
		System.out.println("Login failed");
	}	
}
public void viewBalance(int enteredCode) {
	if(validatePasscode(enteredCode)) {
		System.out.println("Your Account Balance"+balance);
	}
	else {
		System.out.println("Access denied.Incorrect pin");
	}
}
	public void viewAccountdetails(int enteredCode) {
		if(validatePasscode(enteredCode)) {
			System.out.println("AccountHolder:"+  accountHolderName);
			System.out.println("AccountNumber:"+ accountNumber);
			System.out.println("Balance:"+ balance);
		}
		else {
			System.out.println("Access denied.Incorrectpin");
		}
	}
}

