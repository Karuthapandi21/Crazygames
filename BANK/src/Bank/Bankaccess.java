package Bank;
import java.util.Scanner;
public class Bankaccess {
	public static void main(String args[]) {
	Bankdetails b=new Bankdetails();
	int pin=1244;
	Scanner s=new Scanner(System.in);
	System.out.println("Bank Details:");
	int n=s.nextInt();
	b.viewBalance(n);
	}
}
