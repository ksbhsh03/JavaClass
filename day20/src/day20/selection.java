package day20;

public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,13,11,14,10};  //정렬의 배열
		System.out.print("정렬전 ");
		for(int each : arr) {
			System.out.print(each + " ");
		}
		System.out.println();
		System.out.println();
		
	
		for(int i = 0; i <4; i++) {
		int	min = i;  //첫 번째값을 임시 최소값으로 가정
			for(int k = i+1; k < 5; k++) {
				// 최소값 찾기 처리
				if(arr[k] < arr[min]) {
					min =k;
					
				}
			}
			// 최소값 변경이 필요할 경우 교환처리
			int temp = arr[min];
				arr[min] =arr[i];
				arr[i] =temp;
			
		for(int each : arr) {
			System.out.print(each + " ");
		}
		System.out.println();
		}
		System.out.println();
		System.out.println("정렬후");
		
		for(int j = 0; j<arr.length;j++) {
			System.out.println(arr[j] + " ");
		}
	}

}
