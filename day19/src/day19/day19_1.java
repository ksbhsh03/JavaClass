package day19;

public class day19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,13,17,18,23,29,31};
		int head =0;
		int tail = 6;
		int ans = 17;
		while(head <= tail) {
	
		int center =(head +tail) /2;
		if(arr[center] == ans) {
			System.out.println(center + "번째 요소 일치");
		}else if(arr[center] < 17 ) {
			head = center+1;
		}else {
			tail = center-1;
		}
		
		}if(head > tail) {
		System.out.println("찾는 값이 없습니다");
		}
	}

}
	
