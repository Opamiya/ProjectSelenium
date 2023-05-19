package practice;

import java.util.Scanner;

public class AvarageOfDigits {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Enter a number:");
int n=s.nextInt();
int sum=0;
int count=0;
while(n!=0)
{
int r=n%10;
count++;
sum=sum+r;
n=n/10;
}
 int avg = sum/count;
 System.out.println("sum of the digits: "+sum);
 System.out.println("no. of digits: "+count);
System.out.println("Avarage of digits is: "+avg);
	}

}
