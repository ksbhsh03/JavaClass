package day21;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5,3,4,1,2};
		for(int i =1; i<5; i++) {
			int j = i-1;
			int t = arr[i];
			while(j >=0 && t < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = t;
		}
		for(int each : arr) {
			System.out.print(each + " ");
		}
	}

}
