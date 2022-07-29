package day6;

public class ReferenceParamEx3 {
	static void printArr(int[] arr) { // 배열의 모든 요소를 출력
		System.out.println("[");
		for(int i : arr) {
			System.out.println(i+",");
			System.out.println("]");
		}
		
	}
	public void sortArr(int[] arr) { //배열을 오름차순으러 정렬
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr.length-1-j; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp =arr[j];
					arr[j] = arr[j+1];
					tmp = arr[j+1];
				}
			}
		}
	}
	static int sumArr(int[] arr) {
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			return sum;
		}
	}
	public static void main(String[] args) {
		

	}

}
