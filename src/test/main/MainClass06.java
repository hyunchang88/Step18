package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		
		try {
			//	test() 메소드에서 RuntimeException 을 상속 받지않는
			// Exception 을 발생 시키기 때문에
			// try~catch 블럭으로 Exception 을 처리 해야 한다.
			test();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인 메소드가 종료 됩니다.");
	}
	// throw 예약어를 이용해서 Exception 을 던질수도 있다.
	public static void test() throws InterruptedException{
		System.out.println("test() 메소드가 호출되었습니다.");
		Thread.sleep(5000);
	}
}
 