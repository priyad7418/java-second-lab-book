package demo;

import java.util.Scanner;

public class CheckerPattern {

	public static void main(String[] args) {
		int k;
		Scanner in=new Scanner(System.in);
		k=in.nextInt();
		in.close();
		System.out.println("enter the size:");
		for(int row=1;row<=k;row++){
			for(int col=1;col<=k;col++) {
				if(row%2==0) {
					System.out.println("#");
				}
				else {
					System.out.println("#");
				}
			}
			System.out.println();
		}
		

	}

}
