package day10;

public class Sample {
	public void shouldBeRun() {
		System.out.println("ok thanks.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sample = new Sample();
		int c;
		try {
			c = 4 / 0;
			sample.shouldBeRun();
			
		}catch( ArithmeticException e) {
			c = -1;
		}finally {
			sample.shouldBeRun();  //예외에 상관없이 무조건 수행된다.
		}
	}

}
