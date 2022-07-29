package day11;



import java.util.*;
public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT = 10;
		String source = "0123456789abcdefghijABCDEFGHIH!@#$%^&*()zzz";
		int length = source.length();
		List list = new ArrayList(length/LIMIT+10);
		for(int i=0;i<length; i+=LIMIT) {
			if(i+LIMIT < length) 
				
				list.add(source.substring(i,i+LIMIT));
			else
				list.add(source.substring(i));
				
		}
		for(int i=0;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
