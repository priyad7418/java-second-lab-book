package demo;

public class PrintNumberInWord {

	public static void main(String[] args) {
		int number=5;
		//using nested if
		/*if(number==1) {
			System.out.println("the number is one");
			
		}
		else if(number==2){
			System.out.println("the numberis two");
		}
		else if(number==3){
			System.out.println("the numberis three");
		}
		else if(number==4){
			System.out.println("the numberis four");
		}	
		else if(number==5){
			System.out.println("the numberis five");
	}
		else{
			System.out.println("the numberis not found");
		} */
		//using switch
		switch(number) {
		case 1:{
		 System.out.println("the number is one");
		break;
		}
		case 2:{
			System.out.println("the number is two");
			break;	
		}
		case 3:{
			System.out.println("the number is three");
			break;	
		}
		case 4:{
			System.out.println("the number is four");
			break;	
		}
		case 5:{
			System.out.println("the number is five");
			break;	
		}
		default:{
			System.out.println("invalid number");
		}
	}
		





	}

}
	
