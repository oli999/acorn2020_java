package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// int type 지역변수를 선언만 하면 만들어 지지 않는다.
		int num1;
		// String type 지역변수를 선언만 하면 만들어 지지 않는다.
		String name1;
		
		//아직 만들어 지지 않았기 때문에 num1  은 참조 불가
		//int result=10+num1;
		
		//아직 만들어 지지 않았기 때문에 name1 은 참조 불가 
		//System.out.println("name1:"+name1);
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}





