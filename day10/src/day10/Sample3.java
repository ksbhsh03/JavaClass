package day10;
class FoolException extends Exception{
	
}
public class Sample3 {
	public void sayNick(String nick) throws FoolException {
		try {
			if("fool".equals(nick)) {
				throw new FoolException();
			 }
			System.out.println("당신의 별명은 "+nick+"입니다");

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 sample3 = new Sample3();
	
     try {
    		sample3.sayNick("fool");
    		sample3.sayNick("genious");
     }catch(FoolException e) {
		System.err.println("FoolException이 발생했습니다.");
}
	}
	}


