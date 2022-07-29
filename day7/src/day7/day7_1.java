package day7;

import java.util.ArrayList;

public class day7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      boolean hasCard = true;
		ArrayList<String> pocket = new ArrayList<String>();
       pocket.add("paper");
       pocket.add("handphone");
       
       
       if(pocket.contains("money")) {
       		System.out.println("택시를 타고 가라");
	}else {
		if (hasCard) {
			System.out.println("택시를 타고가라");
		}else {
			System.out.println("걸어가라");
		}
	}
	}
}

	
