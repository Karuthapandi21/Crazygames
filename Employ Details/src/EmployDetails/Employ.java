package EmployDetails;
import java.util.Scanner;
public class Employ {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Employ Details");
	int emId=s.nextInt();
	s.nextLine();
	System.out.println("Enter Employee Id:");
	String name=s.nextLine();
	System.out.println("Enter Employee Name:");
	long phoneNumber=s.nextLong();
	System.out.println("Enter Employee Phone Number:");
	s.nextLine();
	String empEmail=s.nextLine();
	System.out.println("Enter Employee  E-mail:");
String gen=s.nextLine();
System.out.println("Enter Employee Gender:");
double salary=s.nextDouble();
System.out.println("Enter Employee Salary:");
s.nextLine();
String city=s.nextLine();
System.out.println("Enter Emplolyee City:");
System.out.println("\n -----Employee Details------");
System.out.println("ID:"+emId);
System.out.println("Name:"+name);
System.out.println("Phone:"+phoneNumber);
System.out.println("Email:"+empEmail);
System.out.println("Gender:"+gen);
System.out.println("Salary:"+salary);
System.out.println("city:"+city);
	
	}
}

