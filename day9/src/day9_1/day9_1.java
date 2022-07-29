package day9_1;
interface Predator{
	String getFood();
}

class Animal{
	String name;
	void setName(String name) {
		this.name = name;
	}

	
}
class Tiger extends Animal implements Predator{
	public String getFood() {
		return "apple";
	}
}
class Lion extends Animal implements Predator{
	public String gerFood() {
		return "banana";
	}
}
class ZooKeeper{
//	void feed(Tiger tiger) {// 호랑이가 오면 사과를 던져 준다.
//		System.out.println("feed apple");
//	}
//	void feed(Lion lion) {  // 사자가 오면 바나나를 던져준다.
//		System.out.println("feed banana");
//	}
	void feed(Predator predator) {
		System.out.println("feed"+predator.getFood());
	}
}
public class day9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ZooKeeper zookeeper = new ZooKeeper();
       Tiger tiger = new Tiger();
       Lion lion = new Lion();
       zookeeper.feed(tiger);
       zookeeper.feed(lion);
	}

}
