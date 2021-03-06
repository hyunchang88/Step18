package test.main;
/*
 * 		Exception의 종류
 * 	
 * 		1. Checked Exception
 * 		- RuntimeException 클래스를 상속 받지 않은 Exception Type
 * 		- 반드시 try ~ catch 블럭으로 처리하거나 혹은 throws 해야 한다.
 * 
 * 		2. Unchecked Exception
 * 		- RuntimeException 클래스를 상속 받은 Exception Type
 * 		- try ~ catch 블럭으로 처리하지 않아도 컴파일 오류는 발생하지 않으므로 
 * 		   필요시 선택적으로 처리한다.
 *
 */

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인 메소드가 종료 됩니다.");
	}
}
