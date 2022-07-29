package day15;

public class day15_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,4,3,2,1};
		for(int i =0; i<a.length; i++) {
			System.out.println("a["+i+"] =" + a[i]);
		}
	}

}

//import java.util.*;
//class Main {
//  
//
//
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.printf("요소수 =");
//    int a =  sc.nextInt();
//    int arr[] = new int[a];
//
//      for(int i =0; i<a;i++){
//        System.out.println("a["+i+"] =" );
//        int arrno = sc.nextInt();
//        arr[i] = arrno;
//          }
//      System.out.print("a = {");
//    for(int j=0; j<arr.length-1; j++){
//      System.out.print(arr[j]+",");
//    }
//    System.out.println(a[sc=]);
//    
//      
//    
//		
//  }
//}

//import java.util.*;
//class Main {
//  
//
//
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("요소 수:");
//    int a = sc.nextInt();
//    int[] arr = new int[a];
//
//    
//    for(int i= 0; i < a; i++){
//      System.out.println("a["+i+"} =");
//      int num = sc.nextInt();
//       arr[i] = num;
//      
//    }
//
//
//    
//      for(int j=0; j< arr.length; j++){   
//        System.out.print(arr[j]);
//            
//      
//      }
//    
//      System.out.print("찾을 숫자:") ;
//      int b = sc.nextInt();  
//    
//        for(int i=0;i<arr.length; i++){
//           if(arr[i] == b){
//            System.out.print("그값은 a["+i+"] ="+arr[i]);
//             break;
//           }
//
//            if(i>arr.length-1){
//              System.out.println("찾는 값이 없습니다.");
//              break;
//            }
//             
//           }
//        }
//   
//      
//        
//      
//      
//    
//  }