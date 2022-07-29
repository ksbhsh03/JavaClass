package day20;

public class day20_1 {

	public static void main(String[] args) {
		int[] arr = {12,13,11,14,10};
		int min = 0;
		int temp = 0;
		for(int i = 0; i<arr.length; i++) {
			min = arr[i];
			for(int k =0;k<5; k++) {
				k += 1;
				arr[k] = min;
				temp = min;
				min = arr[i];
				arr[i] = temp;
				
			}if(arr[i] <min) {
				
			}
			System.out.println(arr[i]);
		}

	}

}
