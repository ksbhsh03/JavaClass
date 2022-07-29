package Day4;

public class Day4_12 {
    public static void main(String[] args) {
        int sum = 0;
        int i =0;
    // i을 1씩 증가시켜서 sum예속 더한다
        while((sum += ++i) <=100){
            System.out.printf("%d - %d%n", i, sum);
        }
    }
    
}
