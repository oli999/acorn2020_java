package test.study;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// 지역변수는 선언만 하면 변수가 만들어지지 않고 만들 준비만 한다.
		int num1;
		int num2=0;
		int num3=10;
		// 값이 대입되는 시점에 변수가 만들어진다.
		num1=999;
		System.out.println(num1);
		
		String name;
		String name2=null;
		String name3="윤혜림";
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
