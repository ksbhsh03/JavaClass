package day7;
class Animal{
String name;

public void setName(String name) {
	this.name = name;
}
}
public class sample {
    public static void main(String[] args) {
    	 Animal cat = new Animal();
        cat.setName("boby");
        System.out.println(cat.name);
        //객체 객체 변수 = 값

        Animal dog = new Animal();
        dog.setName("happy");
        
        System.out.println(cat.name);
        System.out.println(dog.name);
        
    }
}

    	             