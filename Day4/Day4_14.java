package Day4;
// while은 실행이 안할수도있지만   do while 반드시 한번은 실행시킨다

import java.util.*;
public class Day4_14 {
    int input = 0,  answer =0;
    answer = (int)(Math.random() * 100) + 1;
    Scanner scanner = new Scanner(System.in);
    do   {
        System.out.print("1과 100사이의 정수를 입력하세요.");
        input = scanner.nextInt();
        if(input > answer){
            System.out.println("더 작은 수로 확인해 보세요., ");

        }else if(input < answer){
            System.out.println("더 큰 수로 확인해 보세요");
        }while(input!=answer);
        System.out.println("정답입니다.");
    }
}
