package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass01 {
	public static void main(String[] args) {
		
		//Phone 클래스로 객체 생성해서 참조값을 지역 변수에 담기 
		Phone p1=new Phone();
		Object p2=new Phone();
		
		//HandPhone 클래스로 객체 생성해서 참조값을 지역 변수에 담기
		HandPhone p3=new HandPhone();
		Phone p4=new HandPhone();
		Object p5=new HandPhone();
		
		//이미 만들어진 객체의 참조값을 다른 type 으로 받아보기
		Phone p6=p3;
		Object p7=p3;
		//String str=p3; //오류!
	}
}








