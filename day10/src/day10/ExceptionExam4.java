package day10;

public class ExceptionExam4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExam5 ex = new ExceptionExam5();
		int[] array = null;
		array = new int[50];
		array[49] = 100;
		System.out.println("array배열의 50번째 요소의 값:"+ ex.get50thItem(array));
		
		array = new int[49];
		array[48] = 100;
		System.out.println("array배열의 50번째 요소의 값:"+ex.get50thItem(array));
	}

}
