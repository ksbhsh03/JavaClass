package day14;

public class day14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {12,13,11,14,10};
		int i =0;
		int max=arr[0];
		
		for(i=1;i<arr.length;i++) {
			if(arr[i]>=max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
