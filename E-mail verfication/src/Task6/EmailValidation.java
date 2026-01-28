package Task6;
import java.util.*;
public class EmailValidation {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		List <String> l=new ArrayList();
		l.add("karuthapandikarthi21@gmail.com");
		l.add("karthikp.2k4@gmail.com");
		l.add("manikandan25@gmail.com");
		l.add("jayaseeli97@gmail.com");
		l.add("kruthu21@gmail.com");
		l.add("subiksha2@gmail.com");
		System.out.println("Enter the email:");
		for(int i=1;i<=l.size();i++) {
			String input=scan.nextLine();
			if(l.contains(input)) {
				System.out.println("The Email is already exist");
				continue;
				}
			else {
				System.out.println("New Email is added successfully");
			}
			System.out.println("Added email lists"+input);
			}
	}
}
