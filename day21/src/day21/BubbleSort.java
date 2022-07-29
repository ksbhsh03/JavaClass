package day21;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 1, 2 };
		int k = 0;
		int i = 4;

		for (k = 0; k < arr.length - 1; k += 1) {
			for (i = 4; i > k; i -= 1) {
				if (arr[i - 1] < arr[i]) {

				} else {
					int t = 0;
					t = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = t;
				}

			}
			for (int each : arr) {
				System.out.print(each+" ");

			}System.out.println();

		}
		System.out.println("배열 후");
		for (int x = 0; x < arr.length; x += 1) {
			System.out.print(arr[x] + " ");
		}
	}

}
