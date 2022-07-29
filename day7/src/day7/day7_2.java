package day7;
import java.util.*;
public class day7_2 {

	public static void main(String[] args) {
		// TODO AutSano-generated method stub
		Scanner sc = new Scanner(System.in);


		 String xString = "";

		 while(true) {
			 System.out.println("월을 입력해주세요.(0을입력하면종료합니다)>");

			 int month = sc.nextInt();


		 switch (month) {
			 case 1: xString = "January";
					 break;
			 case 2: xString = "February";
			 break;
			 case 3: xString = "JMarch";
			 break;
			 case 4: xString = "April";
			 break;
			 case 5: xString = "May";
			 break;
			 case 6: xString = "June";
			 break;
			 case 7: xString = "July";
			 break;
			 case 8: xString = "August";
			 break;
			 case 9: xString = "September";
			 break;
			 case 10: xString = "October";
			 break;
			 case 11: xString = "November";
			 break;
			 case 12: xString = "December";
			 break;
			 default: xString = "Invalid month";
			 break;
			 case 0: xString = "종료합니다.";
				 break;
		 }
		 System.out.println(xString);
		 if(month==0) {
			 break;
		 }
		 }
	}
}
