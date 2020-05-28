package test.main;
/*
 *  [ 연산자 ]
 *  
 *  1. 산술 연산자
 *  
 *  - 종류 : +, -, *, /, %
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num1=5;
		int num2=2;
		
		// + 연산자를 이용해서 두수의 합 구하기
		int sum = 10 + 1;
		int sum2 = num1 + num2;
		int sum3 = 10 + num2;
		
		// 정수 / 정수 => 정수이므로 결과적으로 
		// 5를 3으로 나눈 몫을 얻어낸다.
		int result1 = 5 / 3;
		// 정수 / 정수 => 정수이므로 결과적으로 
		// 5를 2으로 나눈 몫을 얻어낸다.
		int result2 = num1 / num2;	
		
		//정확한 실수값을 얻어내고 싶으면 연산에 참여하는 
		//data 가 하나라도 double type 이면 된다. 
		double result3 = 5 / 3.0;
		double result4 = num1 / (double)num2;
		
		//num1 을 num2 로 나눈 나머지값 얻어내기
		int result5 = num1 % num2;
	}
}













