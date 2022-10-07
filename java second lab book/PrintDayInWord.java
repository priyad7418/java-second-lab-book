package demo;

public class PrintDayInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		//using nested if
		/*if(number==1) {
			System.out.println("sunday");
			
		}
		else if(number==2){
			System.out.println("monday");
		}
		else if(number==3){
			System.out.println("tuesday");
		}
		else if(number==4){
			System.out.println("wednesday");
		}	
		else if(number==5){
			System.out.println("thursday");
	}
		else if{
			System.out.println("friday");
		} 
		else if{
			System.out.println("saturday");
		} 
		else {
			System.out.println("day not found");
		} */
		//using switch
		switch(number) {
		case 1:{
		 System.out.println("sunday");
		break;
		}
		case 2:{
			System.out.println("monday");
			break;	
		}
		case 3:{
			System.out.println("tuesday");
			break;	
		}
		case 4:{
			System.out.println("wednesday");
			break;	
		}
		case 5:{
			System.out.println("thursday");
			break;	
		}
		case 6:{
			System.out.println("friday");
			break;
		}
		case 7:{
			System.out.println("saturday");
			break;
		}
		default:{
			System.out.println("invalid day");
		}
	}
		
	

	}

}
