package demo;
import java.util.Scanner;

public class TriangularPattern {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);	
		
		System.out.print("Enter Right Angled Triangle Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Right Angled Triangle Star Pattern");
		
		for (int i = 1 ; i <= rows; i++ ) 
		{
			for (int j = 1 ; j <= i; j++ ) 	
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}


	}


