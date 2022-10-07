package demo;


import java.util.Scanner;


public class CircleComputation {

	public static void main(String[] args) {
		double radius,diameter,circumference,area;
		
        Scanner in=new Scanner(System.in);
        System.out.println("enter the radius..:");
        radius=in.nextDouble();
        in.close();
       
        //compute diameter
        diameter=2*radius;
        System.out.println("diamter is %.2f\n"+diameter);
        
        //compute circumference
        
        
        circumference=2*3.14*radius;
        System.out.println("circumference is %.2f\n"+circumference);
        
        //compute area
        area=3.14*radius*radius;
        System.out.println("area is %.2f\n"+area);
        
        
        
        
        
	}

}
