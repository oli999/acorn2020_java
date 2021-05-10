package test.study;

import test.mypac.Phone;

public class MyMain04 {
	//run 했을때 실행의 흐름(작업단위) 가 시작되는 특별한 main 메소드 
	public static void main(String[] args) {
		
		Phone p1=new Phone();
		p1.call();
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
