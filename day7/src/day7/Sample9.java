package day7;

// 100출력 하는법
class Calculator{
	int value;
	
	
	Calculator(){
		this.value = 0;
		
	}
	void add(int val) {
		this.value += val;
	}
	int getValue() {
		return this.value;
	}
	
}

public class Sample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calculator cal = new Calculator();
     cal.add(50);
     cal.add(60);  
     System.out.println(cal.getValue());
     
	}

}
