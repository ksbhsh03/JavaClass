package day9_1;

public class RepairabeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		Dropship dropship = new DroPship();
		
		Marine narine = new Narine();
		SCV scv = new SCV();
		scv.repair(tank);
		scv.repair(dropship);
		scv.repair(marine);
		
  
	}

}
