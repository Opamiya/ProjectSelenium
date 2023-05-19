package practice;

import java.util.Scanner;

public class CompareThreeNo {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter 1st no");
int a=s.nextInt();
System.out.println("enter 2nd no");
int b=s.nextInt();
System.out.println("enter 3rd no");
int c=s.nextInt();
if(a>b && a>c) {
	System.out.println(a+" is greatest");
}
else if(b>a && b>c){
	System.out.println(b+" is greatest");
}
else {}
System.out.println(c+" is greatest");
	}

}
