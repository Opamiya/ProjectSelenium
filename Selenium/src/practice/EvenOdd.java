package practice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter any no");
int a=s.nextInt();
if(a%2==0) {
	System.out.println("It is an even no.");
}
else {
	System.err.println("It is an odd no.");
}
	}

}
