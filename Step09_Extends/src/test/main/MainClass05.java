package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		//SmartPhone 객체를 생성해서 Phone type 지역변수 p1 이라는 지역 변수에 담기
		Phone p1=new SmartPhone();
		//p1 에 들어 있는 참조값을 이용해서 전화를 걸고 싶다면?
		p1.call();
		//p1 에 들어 있는 참조값을 이용해서 이동중에 전화를 걸고 싶다면?
		//p1 에 들어 있는 참조값을 HandPhone type 지역변수에 casting 해서 담는다.
		HandPhone p2=(HandPhone)p1;
		//그러면 이동중에 전화를 걸수 있다.
		p2.mobileCall();
		
		//p1 에 들어 있는 참조값을 이용해서 인터냇을 하고 싶다면?
		SmartPhone p3=(SmartPhone)p1;
		//그러면 인터넷을 할수 있다.
		p3.doInternet();
	}
}











