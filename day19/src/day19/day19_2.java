package day19;

public class day19_2 {

	public static void main(String[] args) {
		int[] arrD = {12,25,36,20,30,8,42};
		int[] arrH = new int [11];
		int k = 0;
		for(int i = 0; i<arrD.length;i++) {
			k =arrD[i] % 11;
			if(arrH[k] ==0) {
				arrD[i] = arrH[k];
				break;
				
		}else  {
			k = (k+1) % 11;
			
		}
			System.out.println(arrH);
		}
	
	}

}
