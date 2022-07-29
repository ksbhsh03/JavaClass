package day5;

public class day5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String[] names = {"kim","park","yi"};
          for(int i =0; i <names.length; i++) {
          System.out.printf("names["+i+"] :"+names[i]);
          
          String tmp = names[2];
          System.out.println("tem :"+tmp);
          
          } 
         
          names[0] = "YU";
          for(String str : names) {
        	  System.out.println(str);
          }

}
}
