package day10;

public class day10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int[]	a = {1,2,3};
		System.out.println(a[3]);
		}catch(ArithmeticException e) {
			System.out.println("에러가 발생했습니다.");
		}finally {
			System.out.println("에러가 생기든 안생기든 항상 처리한다");
		}
	}

}
