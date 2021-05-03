package test.study;

public class MainClass01 {
	// run 했을때 실행순서가 시작되는 main 메소드 
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		int num1=10;
		num1=20;
		
		byte num2=10;
		num2=20;
		// int type 변수에 byte type 변수 안에 있는 값을 대입하기 
		num1=num2;
		// byte type 변수에 int type 변수 안에 있는 값 대입? 
		//byte num3 = num1; //문법오류 (compile 에러)
		
		// (byte) 는 형변환(casting) 연산자 이다. 
		byte num3 = (byte)num1;
		
		double num4 = 10.1; //묵시적인 double type
		double num5 = 10.1d; //명시적인 double type
		float num6 = 10.1f; //float 는 반드시 명시적으로 만들어야 한다. 
		
		// double type 변수에 float type 변수에 있는 값 대입하기
		num4=num6;
		
		// double type 변수에 있는 값을 float type 에 담을때는 casting 이 필요하다. 
		float num7=(float)num4;
	}
}











