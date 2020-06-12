package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {
		MyObject obj1=new MyObject();
		//getCar() 메소드가 리턴해주는 참조값을 지역변수에 담아보기 
		Car a=obj1.getCar();
		Car b=obj1.getCar();
		Car c=obj1.getCar();
		
		//지역변수에 담긴 객체 사용하기
		a.drive();
		b.drive();
		c.drive();
	}
}





