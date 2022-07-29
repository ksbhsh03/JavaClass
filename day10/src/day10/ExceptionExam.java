package day10;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            try {
             int[] array = new int[10];
            		 array[20] =5;
            }catch(Exception e){
            	
            	System.out.println("배열 범위를 지나쳤어요");
            }
            System.out.println("성공");
	}

}
