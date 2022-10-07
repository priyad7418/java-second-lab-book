package demo;


import java.util.Scanner;

public class SumProductMinMax3 {

	public static void main(String[] args) {
		int number1,number2,number3,min,max,sum,product;
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter first integer...:");
		number1=in.nextInt();
		Scanner out=new Scanner(System.in);
		System.out.println("enter second integer...:");
		number2=out.nextInt();
		Scanner get=new Scanner(System.in);
		System.out.println("enter third integer...:");
		number3=get.nextInt();
		in.close();
		out.close();
		get.close();
		sum=number1+number2+number3;
		System.out.println("sum is..."+sum);
		product=number1*number2*number3;
		System.out.println("product is..."+product);
		
		//compute min
		
		min=number1;
		if(number2<min) {
			min=number2;
		}
		if(number3<min) {
			min=number3;
		}
		
		//compute max
		max=number1;
		if(number2>max) {
			max=number2;
		}
		if(number3>max) {
			max=number3;
		}
		System.out.println("min is..."+min);
		System.out.println("max is..."+max);
		

		

	}

}
