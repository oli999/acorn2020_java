package test.main;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObject 클래스에 정의된 3개의 메소드를 차례로 호출하는 code 를 작성해 보세요.
		MyObject obj1=new MyObject();
		obj1.walk();
		obj1.getNumber();
		obj1.getGreeting();
		
		//메소드가 리턴해주는 데이터를 지역 변수에 담아보기
		int a=obj1.getNumber();
		String b=obj1.getGreeting();
	}
}






