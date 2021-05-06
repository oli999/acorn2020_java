package test.main;

import test.mypac.Car;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass04 {
	public static void main(String[] args) {
		MyObject obj1=new MyObject();
		
		//useSome() 메소드를 호출해 보세요.
		String name="김구라";
		Car c1=new Car();
		
		obj1.useSome(name, c1);
		
		//doSome() 메소드를 호출해 보세요.
		Radio r=new Radio();
		Speaker s=new Speaker();
		
		obj1.doSome(r, s);
	}
}






