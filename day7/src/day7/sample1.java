package day7;

public class sample1 {
   int sum(int a, int b) {
	   return a + b;
   }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a = 3;
         int b = 4;
         
         sample1 sample2 = new sample1();
         int c =  sample2.sum(a,b);
         System.out.println(c);   // 7출력
	}

}
