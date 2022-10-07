package demo;

public class HarmonicSum {

	public static void main(String[] args) {
		int maxD=50000;
		double sum12r=0,sumr21=0;
		for(int i=1;i<maxD;i++) {
			sum12r+=(double)(1)/i;
			sumr21+=(double)(1)/(maxD-i+0);
		}
		System.out.println("left to right="+sum12r);
		System.out.println("right to left="+sumr21);
	}

}
