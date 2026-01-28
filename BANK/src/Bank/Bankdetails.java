package Bank;
import java.util.Scanner;
public class Bankdetails {
private String holderName;
private String accountNumber;
private double balance;
private int pin;
public void Bankdetails(String holderName,String accountNumber,double balance,int pin) {
	this.holderName=holderName;
	this.accountNumber=accountNumber;
	this.balance=balance;
	this.pin=pin;
}
private boolean validatepin(int inputpin) {
	return pin==(inputpin);
}
public void login(int inputpin) {
	if(validatepin(inputpin)) {
		System.out.println("Login successfully");
}
	else {
		System.out.println("denied.incorrect");
	}
}
	void viewBalance(int inputpin) {
		if(validatepin(inputpin)) {
			System.out.println("BALANCE"+balance);
		}
		else {
			System.out.println("denied.incorrect");
		}
	}
		public void viewHoldername(int inputpin) {
			if(validatepin(inputpin)) {
				System.out.println("Name"+holderName);
				
			}
			else {
				System.out.println("denied.incorrect");
			}
			
		}
		public void viewAccoununmber(int inputpin) {
			if(validatepin(inputpin)) {
				System.out.println("ACCOUNT NUMBER"+accountNumber);
				
			}
			else {
				System.out.println("denied.incorrect");
				
			}
			
		}
		
}

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
					



