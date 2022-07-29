package day7;

public class Sample2 {
  void sayNick(String nick){
	  if("fool".equals(nick)) {
		  return;
	  }
	  System.out.println("니의별명은"+nick+"입니다");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Sample2 sample2 = new Sample2();
         sample2.sayNick("angel");
         sample2.sayNick("fool");
;        
	}

}
