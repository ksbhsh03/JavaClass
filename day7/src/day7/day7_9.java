package day7;
import java.util.*;
public class day7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scanner = new Scanner(System.in);
         int value = 0;
         int sum = 0;
	do {
		
	   value = scanner.nextInt();	
		sum += value;
	}while( value <= 100); 
	
	
	System.out.println("sum : "+ sum);
	
	
	}
      
}
