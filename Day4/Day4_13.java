package Day4;
import java.util.*;
public class Day4_13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("합계룰 구할 숫자 입력 ?");
       int num;
       int sum = 0;
       while(true){
        System.out.println(">> ");
         num = scanner.nextInt();

        if(num !=0){
            sum += num;
        else {  // 0을 입력한 경우
            break;
        }
    }
    System.out.println(sum);
       }
      
    }
  

