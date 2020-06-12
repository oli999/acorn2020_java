package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass03 {
	public static void main(String[] args) {
		MyObject obj1=new MyObject();
		// .setNum(), .setName(), .useCar()  메소드를 호출해 보세요. 
		obj1.setNum(10);
		obj1.setName("xxx");
		obj1.useCar(new Car());
		
		int a=20;
		String b="김구라";
		Car c=new Car();
		//지역변수에 담긴 값을 이용해서 메소드 호출하면서 전달 할수도 있다. 
		obj1.setNum(a);
		obj1.setName(b);
		obj1.useCar(c);
		
	}
}







