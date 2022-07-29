package Day4;
import java.util.Scanner;

public class Day4_5 {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Count Down... ");
    System.out.print("No ? ");
    int no = scanner.nextInt();

    for(int i=no;i>=0;i--) {
        System.out.println(i);
    }
}