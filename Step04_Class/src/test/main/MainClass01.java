package test.main;

import test.mypac.Car; // Car 클래스 import!

public class MainClass01 {
	// run 했을때 실행 순서가 시작되는 특별한 main() 메소드 
	public static void main(String[] args) {
		//Car 클래스를 이용해서 객체 생성하고 참조값을 지역 변수에 담기
		Car car1=new Car();
		//Car 객체의 메소드 호출하기
		car1.drive();
		//Car 객체의 필드에 값 대입하기
		car1.name="소나타";
		
		//1. Car 클래스를 이용해서 객체를 생성하고 참조값을 car2 라는 이름의 지역변수에 담아보세요.
		Car car2=new Car();
		//2. 메소드를 호출해 보세요.
		car2.drive();
		//3. name 이라는 필드에 차 이름을 담아 보세요.
		car2.name="그랜저";
	}
}








