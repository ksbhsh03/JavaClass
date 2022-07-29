package day10;

public class ExceptionEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);  //0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
			System.out.println(4);  //실행하지 않는다 이유는 위에서 0으로 나눠 고의로 에러를 발생시켰다.
		}catch(Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}
