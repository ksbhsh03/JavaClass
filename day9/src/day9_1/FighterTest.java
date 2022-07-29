package day9_1;

public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Fighter F = new Fighter();
          if ( f instanceof Unit)
        	  System.out.println("f는 Unit클래스의 자손입니다");
          if(f instanceof Fightable)
        	  System.out.println("f는 Fightable인터페이스를 구현 했습니다");
          if(f instanceof Moveable)
        	  System.out.println("f는 Moveable인터페이스를 구현했습니다");
          if(f instanceof Attackable)
        	  System.out.println("f는 Attackable인터페이스를 구현했습니다");
          if(f instanceof Object)
        	  System.out.println("f는 Object클래싀의 자손입니다");
	}

}
