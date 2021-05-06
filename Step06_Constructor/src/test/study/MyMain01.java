package test.study;

import java.util.Random;

public class MyMain01 {
	public static void main(String[] args) {
		/*
		 *  렌덤한 무작위 숫자를 얻어내고 싶다면 
		 *  Random 객체를 활용해야 한다.
		 *  따라서 new Random() 해서 객체를 생성후
		 *  객체의 메소드를 이용해서 무작위 숫자를 얻어내 보자 
		 */
		Random ran=new Random();
		boolean isRun=ran.nextBoolean();
		System.out.println(isRun);
		// int 범위 안에서 랜덤한 정수 얻어내기
		int num1=ran.nextInt();
		// 0~4 에서 랜덤한 정수 
		int num2=ran.nextInt(5);
		// 10~20 사이의 랜덤한 정수 
		int num3=ran.nextInt(11)+10;
		// 75~100 사이의 랜덤한 정수
		int num4=ran.nextInt(26)+75;
		// -15 ~ 15 사이의 랜덤한 정수
		int num5=ran.nextInt(31)-15;
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
	}
}







