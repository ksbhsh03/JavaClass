package Day4;
import java.util.*;
public class Day4_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        outer :while(true){ // 반복문 2개일때 완전히 끝낼때 outer
         System.out.println("(1)square.");
         System.out.println("(2)square ROOT.");
         System.out.println("(3)iog.");
         System.out.print("choese ? (1~3, 0:doen)>");
         int num = scanner.nextInt();
         
         if(num==0){
         break;
        }else if(1 <= num && num <=3 ){
            int tmp; 
            while(true){
               System.out.println("input number? ( 0=finsh, 99: Done ");
               tmp = scanner.nextInt();

               if(tmp ==0){
                break;

               }else if(tmp ==99){
                break outer;
               }else if(num==1){
                System.out.println("result :"+(tmp *tmp));
               

               }else if(num==2){
                System.out.println("result :"+(Math.sqrt(tmp)));
               } else if(num==3){
                    System.out.println("result :"+(Math.log (tmp)));
              }
         System.out.printf("u choesed number %d\n ", num);
        }

         
        else{
         System.out.printf("u get wrong number");
        }
     }
        System.out.println("done.");
     
        }
    }
}
