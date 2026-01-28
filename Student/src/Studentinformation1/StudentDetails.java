package Studentinformation1;
import java.util.Scanner;
public class StudentDetails {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Student ID: ");
	        int studentId = sc.nextInt();
	        sc.nextLine(); 
	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Email: ");
	        String email = sc.nextLine();
	        System.out.print("Enter Phone: ");
	        long phone = sc.nextLong();
	        sc.nextLine(); 
	        System.out.print("Enter Department: ");
	        String department = sc.nextLine();
	        System.out.print("Enter Gender: ");
	        String gender = sc.nextLine();
	        System.out.print("Enter City: ");
	        String city = sc.nextLine();
	        System.out.println("\n--- Student Details ---");
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	        System.out.println("Phone: " + phone);
	        System.out.println("Department: " + department);
	        System.out.println("Gender: " + gender);
	        System.out.println("City: " + city);}}


