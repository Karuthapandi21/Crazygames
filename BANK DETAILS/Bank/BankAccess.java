package Bank;
import java.util.Scanner;
public class BankAccess {
public static void main(String args[]) {
	int passCode=1244;
	Account a=new Account("karthi", "9056347890" ,3400,1244);
	Scanner sc=new Scanner(System.in);
	System.out.println("=====BANK DETAILS=====");
	System.out.println("Enter your 4 digit pin");
	int enter=sc.nextInt();
	a.viewAccountdetails(enter);
}
	
}
