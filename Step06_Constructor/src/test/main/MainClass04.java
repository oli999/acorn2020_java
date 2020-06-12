package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  프로그래밍의 목적 : 무작위 정수를 얻어내고 싶다
		 *  얻어내서 무얼하지? 그냥 콘솔창에 출력하고 싶다.
		 */
		//Random 객체를 생성해서 참조값을 지역변수에 담기
		Random ran=new Random();
		//메소드를 호출하고 리턴되는 값을 지역 변수에 담기
		int a=ran.nextInt();
		//콘솔창에 출력해보기
		System.out.println(a);
		
		/*
		 *  또 해결해야 하는 문제 : 원하는 범위 내에서 정수값을 얻어내고 싶다
		 *  범위는 ? 1~45 
		 *  얻어내서 무얼하나? 콘솔창에 출력한다.
		 */
		
		//Random 객체는 이미 생성되어서 ran 이라는 지역변수에 담겨 있다. 
		//다시 생성하지 않고 재 사용하기로~
		int lottoNum=ran.nextInt(45)+1;
		System.out.println(lottoNum);
	}
}







