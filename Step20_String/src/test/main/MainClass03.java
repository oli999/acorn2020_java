package test.main;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 입력(영문자로 시작 특수문자 허용하지 않음):");
		String line=scan.nextLine();
		String reg="^[a-zA-Z][\\w]+$";
		//String 객체의 matches() 메소드를 이용하면 문자열을 정규표현식으로 검증해서 매칭 여부를 알수 있다.
		boolean isMatch=line.matches(reg);
		if(isMatch) {
			System.out.println("제대로 입력 했군요");
		}else {
			System.out.println("아이디를 확인하세요");
		}
	}
}
