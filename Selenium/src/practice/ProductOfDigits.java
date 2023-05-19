package practice;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Enter a no.:");
int n=s.nextInt();
int prod=1;
while(n!=0)
{
int p=n%10;
prod=prod*p;
n=n/10;
}
System.out.println("product of digits: "+prod);
	}

}
