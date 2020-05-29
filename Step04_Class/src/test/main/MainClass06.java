package test.main;

import tesc.mypac.Box;
import tesc.mypac.Car;
import tesc.mypac.Member;
import tesc.mypac.Rect;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("시작");
		String a = Box.car.name;
		System.out.println(Box.car.hashCode());
		System.out.println(Box.car.hashCode());
		System.out.println(Box.car.hashCode());
		
		Member b = Box.mem;
		int test = b.hashCode();
		
		
		if(b != null)
		{
			System.out.println(b.hashCode());
		}
		
		Car c= Box.car;
		
		
		
		 
		 
	}
}
