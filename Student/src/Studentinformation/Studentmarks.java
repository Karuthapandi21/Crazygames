package Studentinformation;
import java.util.Scanner;
public class Studentmarks {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Student ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter Student Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Mark 1: ");
	        int m1 = sc.nextInt();
	        System.out.print("Enter Mark 2: ");
	        int m2 = sc.nextInt();
	        System.out.print("Enter Mark 3: ");
	        int m3 = sc.nextInt();
	        System.out.print("Enter Mark 4: ");
	        int m4 = sc.nextInt();
	        System.out.print("Enter Mark 5: ");
	        int m5 = sc.nextInt();
	        int total = m1 + m2 + m3 + m4 + m5;
	        double average = total / 5.0;
	        double percentage = (total / 500.0) * 100;
	        System.out.println("\n--- Student Result ---");
	        System.out.println("Student ID: " + id);
	        System.out.println("Student Name: " + name);
	        System.out.println("Total Marks: " + total);
	        System.out.println("Average Marks: " + average);
	        System.out.println("Percentage: " + percentage + "%");

	      
	    }
	}

	
	
	
	
	
	
	
	
	
	

