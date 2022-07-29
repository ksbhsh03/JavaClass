package Day4;
import java.util.*;
public class Day4_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while(true){ 
        System.out.println("(1)square.");
        System.out.println("(2)square ROOT.");
        System.out.println("(3)iog.");
        System.out.print("choese ? (1~3, 0:doen)>");
        int num = scanner.nextInt();

        if(num==0){
        break;
       }else if(1 <= num && num <=3 ){
        System.out.printf("u choesed number %d\n ", num);
       }else{
        System.out.printf("u get wrong number");
       }
    }
       System.out.println("done.");
    }
}
