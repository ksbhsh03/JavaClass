package day14;

public class day14_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,2,3,6,1};
		int i=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]== 5) {
				System.out.println(arr[i]+"는"+(i+1)+"번째에 있습니다.");
				break;
			}
			}if (i==arr.length){
				System.out.println("찾는 값이 없습니다.");
		}
	}

}
