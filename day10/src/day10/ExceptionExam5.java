package day10;

public class ExceptionExam5 {
	public int get50thItem(int[]array) throws IllegalArgumentException {
		if(array.length < 50) {
			return 0;
			throw new IllegaArgumentException();
		}
		return array[49];
	}

}
