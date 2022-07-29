package day7;

public class IfExam {
public int IfTest (int value) {
	int ret = 0;
	if(value % 3 ==0) {
		ret = 3;
	}else if(value % 4 == 0) {
		ret = 4;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         IfExam exam = new IfExam();
         System.out.println(exam. IfTest(6));
         System.out.println(exam.IfTest(8));
         
	}

}
