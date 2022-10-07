package demo;

import java.util.Scanner;

public class Swap2Integers {

	public static void main(String[] args) {
		int  number1,number2,temp;
		Scanner in=new Scanner(System.in);
		System.out.println("enter first integer...:");
		number1=in.nextInt();
		Scanner out=new Scanner(System.in);
		System.out.println("enter second integer...:");
		number2=out.nextInt();
		in.close();
		out.close();
	
		//swappping conditon
		
		
		temp= number1;
		
		number1=number2;
		
		number2=temp;
		System.out.println("after swap");
		System.out.println("first integer"+number1);
		System.out.println("second integer"+number2);
		

	}

}
