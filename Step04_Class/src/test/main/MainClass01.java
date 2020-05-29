package test.main;

import tesc.mypac.Car;
import tesc.mypac.MyUtil;

public class MainClass01 {
	//힙은 객체가 만들어지는곳. 
	//스택은 지역변수.
	//

	
//run 했을 때 실행순서가 시작되는 특별한 main() 메소드
	public static void main(String[] args) {
		//car 클래스를 이용해서 객체 생성하고 참조값을 지역 변수에 담기.
		Car bentz =  new Car();
		
		bentz.name = "A3";
		bentz.drive();
		
	//1.카 클래스를 이용해서 객체를 생성하고 참조값을 car2라는 이름의 지역변수에 담아보세요.
		Car car2_BMW = new Car();
	//2. 메소드를 호출해 보세요.
		car2_BMW.drive();
	//3. name이라는 필드에 차 이름을 담아 보세요.
		car2_BMW.name = "i8";
		
		System.out.println(MyUtil.version);
		MyUtil.Send();
		}
	Car hyundai = new Car();
//	hyundai.drive();
}
