package day10;
class FoolException extends Exception{
	
}
public class Sample2 {
	public void sayNick(String nick) {
		try {
			if("fool".equals(nick)) {
				throw new FoolException();
			}catch(FoolException e) {
				System.out.println("FoolException이 발생했습니다.");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 sample2 = new Sample2();
		sample2.sayNick("fool");
		sample2.sayNick("genious");

	}

}
