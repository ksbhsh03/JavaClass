package day5;

public class day5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String src = "ABCDE";
     for (int i= 0; i< src.length(); i++) {
    	 char ch = src.charAt(i);
    	 System.out.println("src.charAt("+i+"):" + ch);
    	 
     }
     //char 배열(char[])을출력
     char[] chArr =src.toCharArray();
     System.out.println(chArr);
	}

}
