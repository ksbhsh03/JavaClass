package javaStud;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
     default int  exac (int i, int j) {
    	 
     }
}
