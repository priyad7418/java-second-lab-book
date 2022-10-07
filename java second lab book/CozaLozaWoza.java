package demo;

public class CozaLozaWoza {

	public static void main(String[] args) {
		int max=110;
		for(int i=1;i<=max;i++) {
			if(i%3==0) {
				System.out.println("coza");
			}
			else if(i%5==0) {
				System.out.println("loza");
			}
			else if(i%7==0) {
				System.out.println("woza");
			}
			else {
				System.out.println(i);
			}
			
			if(i%11==0) {
				System.out.println();
			}
			else {
				System.out.println("");
			}
			
			
	}

	}
}
