package Day3;
import java.util.Scanner;

public class Day3_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("*ilnes ?.>");
        
        int star = scanner.nextInt();

        for(int i=1;i<=star;i++) {             // i = 1 2 3
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


