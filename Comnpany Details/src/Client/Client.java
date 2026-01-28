package Client;
import Company.Company;
public class Client extends Company {
	public void clientName() {
		System.out.println("CLIENT NAME:Karuthapandi");
	}
	public static void main(String args[]) {
		Client c=new Client();
		c.companyName();
		c.clientName();
	}
	
}
