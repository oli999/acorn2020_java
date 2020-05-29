package test.main;

import tesc.mypac.Member;

public class MainClass04 {
public static void main(String[] args) {
	String s = "hello";
	String b = 	changeString(s);
	System.out.println(s); //Immutable하다. 고로. 새로운객체가 생성됐기 때문에 s는 그대로다.
	// Integer, Character, Byte, Boolean, Long, Double, Float, Short 클래스는 
	// 모두 Immutable 이다
	System.out.println(b); //b는 리턴을 하였기 때문에 hello world이다.
	/*
	 * 1. 김구라, 노량진
	 * 
	 * 이라는 int, String, Stirng typ의 값을 객체의 필드에 저장하는 프로그래밍을해보세요
	 * 단 객체를 생성할 클래스의 이름은 Member로 작성하세요.
	 * 
	 */
	Member human1 = new Member(1,"김구라","노량진");
	Member human2 = new Member(2,"최영훈","병방동");
	human2.showInfo();

}

public static String changeString(String param) {
	return    param += " world";
}
}
