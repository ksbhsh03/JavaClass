package day10;

public class ExceptionExam2 {
	public int get50thItem(int[]array) throws outindex  {
		return array[49];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExam2 ex = new ExceptionExam2();
		int num = ex.get50Item(new int[30]);
		System.out.println("array 배열의 50번째 요소의 값:+num");
	}

}
