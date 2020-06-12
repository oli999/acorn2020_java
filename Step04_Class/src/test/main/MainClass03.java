package test.main;


import tesc.mypac.Car;
import tesc.mypac.MyUtil;
import tesc.mypac.YourUtil;

public class MainClass03 {

	public static void main(String[] args) {

		//객체를 생성해서 drive()메소드 호출하기
		new Car().drive();
		//car객체를 생성해서 참조값을 car1이라는 지역변수에 담기.
		Car car1 = new Car();
		//지역변수는 스택에 생성된다(참조값이지).
		car1.drive();
		//drive는 힙에서 동작된다.
		//만약 drive안에 지역변수가 생기면 그것은 스택에 쌓이지.
		
		//car2에 들어있는 참조값을 이용해서 dirve() 메소드 호출하기
		Car car2 = new Car();
		car2.drive();
		
		//MyUtil 클래싀 Send() 라는 static 메소드 호출하기.
		MyUtil.Send();
		
		// YourUtil 클래스의 up() 이라는 static 메소드 호출하기.
		YourUtil.up();
		
	}
}
