package test.main;
/*
 *  [ 기본 data type 의 참조 data type ]
 *  
 *  byte   : Byte
 *  short  : Short
 *  int    : Integer
 *  long   : Long
 *  
 *  float  : Float
 *  double : Double
 *  
 *  char   : Character
 *  boolean: Boolean
 */
public class MainClass01 {
	public static void main(String[] args) {
		//기본 데이터 type
		int num1=10;
		//참조 데이터 type
		Integer num2=10;
		
		//참조 데이터 type 이지만 기본 데이터 type 처럼 사용할수 있다.
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		
		// 숫자를 문자로 바꾸기   10 => "10" 
		String strNum=num2.toString();
		
		// 문자를 숫자로 바꾸기
		String strNum2="999";
		int result4=Integer.parseInt(strNum2);
		
	}
}






