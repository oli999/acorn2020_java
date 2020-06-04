package test.main;

import test.auto.Car;
import test.auto.Engine;
import test.auto.SportsCar;

public class MainClass09 {
	public static void main(String[] args) {
		//여러분들이 Car 클래스를 상속받아서 만든 클래스로 객체를 생성해서
		//아래의 useCar() 메소드를 호출해 보세요.
		SportsCar c1=new SportsCar(new Engine());
		
		MainClass09.useCar(c1);
	}
	
	public static void useCar(Car car) {
		car.drive();
	}
}




