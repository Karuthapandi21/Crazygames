package task5;
import java.util.*;
public class PrimeNumber {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=s.nextInt();
	int count =0,i;
	for(i=1;i<=n;i++) {
		if(n%i==0) {
		count++;
		}
		}
	if(count==2) {
		System.out.println("It is a Prime Number");
	}
	else {
		System.out.println("It is not Prime Number");
	}
	}
}

