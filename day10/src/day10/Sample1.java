package day10;
class FoolException extends Exception{
	//FoolException이 상속받은 클래스는 RuntimeException이다  Exception은 크게 두가지로 구분된다
	//1.RuntimeException
	//2.Exception
	//RuntimeException은 실행시 발생하는 예외이고 Exception은 컴파일시 발생하는 예외이다 즉 Exception은 프로그램 작성시 이미 예측가능한 예외를 작성할때 사용하고 RuntimeException은 발생할수도 발생 안 할수도 있는 경우에 작성한다.
}
public class Sample1 {
	public void sayNick(String nick) {
		if("fool".contentEquals(nick)) {
			throw new FoolException();	
			}
		System.out.println("당신의 별명은"+nick+"입니다");
	}
	public static void main(String[] args) {
 		// TODO Auto-generated method stub
		Sample1 sample1 = new Sample1();
		sample1.sayNick("fool");
		sample1.sayNick("genious");
	 	
	}

}
