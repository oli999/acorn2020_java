package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *  프로그래밍의 목적 : 키보드로 부터 문자열을 입력 받고 싶다.
		 *  입력 받아서 무얼하나? 콘솔창에 출력한다.
		 */
		
		Scanner scan=new Scanner(System.in);
		//키보드로 입력 받기 위해서는 일단 콘솔창을 열리게 해야한다.
		System.out.println("문자열을 입력하세요:");
		//Scanner  객체의 메소드를 이용해서 문자열(String) 입력 받기
		String str=scan.nextLine();
		//입력받은 문자열을 콘솔창에 출력하기 
		System.out.println(str);
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}





