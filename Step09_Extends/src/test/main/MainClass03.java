package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass03 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 HandPhone type 지역변수 p1 에 담기 
		HandPhone p1=new HandPhone();
		//인터넷을 해야 한다. 즉 SmartPhone type  객체가 필요하다
		//p1 안에 있는 값을 이용해서 인터냇을 할수 있을까?
		SmartPhone p2=(SmartPhone)p1; //실행시에 ClassCastException 발생
		//와 신난다 인터냇 하자~
		p2.doInternet();
	}
}









