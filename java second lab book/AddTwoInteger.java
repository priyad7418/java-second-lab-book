package demo;

import java.util.Scanner;

public class AddTwoInteger {

	public static void main(String[] args) {
		int number1,number2,sum;
		Scanner in=new Scanner(System.in);
		System.out.println("enter first integer...:");
		number1=in.nextInt();
		Scanner out=new Scanner(System.in);
		System.out.println("enter second integer...:");
		number2=out.nextInt();
		in.close();
		out.close();
		
		sum=number1+number2;
		System.out.println("sum is..."+sum);


	}

}

