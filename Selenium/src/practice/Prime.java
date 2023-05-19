package practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a positive number :");
		int x=s.nextInt();
		boolean isPrime=true;
		if(x<2) {
			isPrime=false;
		}
		else{
			for(int i=2; i<=Math.sqrt(x); i++) {
				if(x%i==0) {
					isPrime=false;
				}
		}
			
		}
		if(isPrime) {
			System.out.println(x+" is a prime no.");
			}
		else {
			System.err.println(x+" is not a prime no.");
		}
	}

}
