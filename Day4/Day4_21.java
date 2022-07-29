package Day4;
import java.util.*;
public class Day4_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int retry;
       do{
        System.out.println("정숫값 :");
        int n = scanner.nextInt();
       
        if(n>0){
            System.out.println("양수 입니다");
            
        }else if(n <0){
            System.out.println("음수 입니다");

        }else{
            System.out.println("이 값은 0입니다");
        }
          System.out.println("retry? 1-yes / 0-no");
          retry = scanner.nextInt(); 
         
    }while(retry==1);
    }
    
    
}
