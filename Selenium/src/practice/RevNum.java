

package practice;

import java.util.Scanner;

public class RevNum {
	

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Enter a number :");
int n=s.nextInt();
int rev=0;
while(n!=0)
{
	int r=n%10;
	rev=rev*10+r;
	n=n/10;
	}
System.out.println("Reverse no. is: "+rev);
	}

}
