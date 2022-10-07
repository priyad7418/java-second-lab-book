package demo;

public class Fibonacci {

	public static void main(String[] args) {
		int i=1,n=20,firstterm=0,secondterm=1;
		System.out.println("fibonacci series till"+ n+"terms:");
		
		while(i<=n) {
			System.out.println(firstterm+",");
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
			i++;
		}

	}

}
