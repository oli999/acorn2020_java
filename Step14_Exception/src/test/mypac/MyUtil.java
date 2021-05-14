package test.mypac;

public class MyUtil {
	public static void draw() {
		System.out.println("5초 동안 그림을 그려요");
		//발생하는 Exception 을 메소드 내에서 직접 처리한 경우 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("그림 완성!");
	}
	//메소드 안에서 발생하는 Exception 을 던져 버리는 경우
	public static void send() throws InterruptedException{
		System.out.println("5 초 동안 전송을 해요");
		Thread.sleep(5000);
		System.out.println("전송 완료");
	}
}




