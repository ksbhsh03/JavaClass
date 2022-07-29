package Day4;
import java.util.Scanner;
public class Day4_11 {
    public static void main(String[] args) {
        int  num = 0, sum =0;
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String tmp = Scanner.nextLine();
        num = Integer.paeInt(tmp);
        while (num!=0){
            num += num(10);
            System.out.println("num=%3d");
        }

    }
}
