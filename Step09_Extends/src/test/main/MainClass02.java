package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass02 {
	public static void main(String[] args) {
		//SmartPhone 객체를 생성해서 SmartPhone type 의 지역변수 p1 에 담기 
		SmartPhone p1=new SmartPhone(); 
		//p1 에 담긴 참조값을 HandPhone type 지역변수 p2 에 담기
		HandPhone p2=p1;
		//p1 에 담긴 참조값을 Phone type 지역변수 p3 에 담기
		Phone p3=p1;
		//p1 에 담긴 참조값을 Object type 지역변수 p4 에 담기 
		Object p4=p1;
	}
}










