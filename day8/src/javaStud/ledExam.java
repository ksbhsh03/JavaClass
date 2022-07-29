package javaStud;

public class ledExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Tv tv = new LedTv();
           tv.turnOn();
           tv.changeVolume(9);
           tv.changeChannle(39);
           tv.turnOff();
           
	}

}

//참조 변수가
//인터페이스가 가진 메서드만 사용할 수 있다.