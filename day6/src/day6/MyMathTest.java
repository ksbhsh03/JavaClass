package day6;

public class MyMathTest {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L,3L);
		double result4 = mm.divide(5L,3L);  //double대신 long값으로 호출하였다 이 값은 double로 자동 형변환이된다.
		
		
		System.out.println("add(5L,3L) = " +result1);
		System.out.println("substract(5L,3L) = " +result2);
		System.out.println("multiply(5L,3L) = " +result3);
		System.out.println("divide(5L,3L) = " +result4);
	}

}
