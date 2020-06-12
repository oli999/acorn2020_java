package test.mypac;

public class SmartPhone extends HandPhone{
	//생성자
	public SmartPhone() {
		
		System.out.println("SmartPhone() 생성자 호출됨");
	}
	
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	//@Override 는 부모의 메소드를 재정의한 메소드라고 표시 해주는 어노테이션
	@Override
	public void takePicture() {
		//super.takePicture();
		System.out.println("1000만 화소의 사진을 찍어요");
	}
}
