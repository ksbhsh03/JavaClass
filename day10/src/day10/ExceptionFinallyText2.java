package day10;

public class ExceptionFinallyText2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			startInstall();
			copyFiles();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			deleteTempFiles();
		}
	}
	static void StartInstall() {
		
	}
	static void copyFiles() {
		/*파일들을 복사하는 코드를 적는다. */
	}
	static void deleteTempFiles() {
		/* 임시파일들을 삭제하는 코드를 적는다 */
	}
}
