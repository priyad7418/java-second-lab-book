package demo;

public class HillPattern {

	public static void main(String[] args) {
            // incrementing num at each column


        // ending line after each row

     int flag = 0;
    int count = 0;
    
    for (int i= 1; i < 5; i++)
    {
        flag = i;
        count = 0;
        
        for (int j=1; j < 5; j++)
        {
            count ++;
           if(flag == j)
           {
               System.out.print("# ");
               j = 0;
               flag = 0;
           }
           else
           {
               System.out.print(j+" ");
           }
            if (count == 5)
                break;
        }
        System.out.println();
    }
}


	}


