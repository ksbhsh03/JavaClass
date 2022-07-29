package javaStud;

public class MyClass {
 
	//필드
	RemteControl re = new Television();
  
	
	//생성자
  MyClass(){
	  
  }
  
  MyClass(){
	  MyClass(RemoteControl){
		  this.rc = rc;
		  rc.turnOn();
		  re.setVolume(5);
		  
	  }
  }
  void methodA() {
	  RemoteControl re = new Audio();
	  re.turnOn();
	  re.turnVolume(5);
  }
		  void methodV(RemoteControl rc) {
			  rc.turnOn();
			  rc.setVolume(5);
		  }
}
