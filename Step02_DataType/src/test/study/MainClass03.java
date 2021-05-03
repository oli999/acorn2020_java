package test.study;

public class MainClass03 {
	public static void main(String[] args) {
		//기본 데이터 type 지역변수 
		int a=10;
		double b=10.1;
		boolean c=true;
		
		//참조 데이터 type 지역 변수 
		String d="김구라";
		//참조값에 . 찍어서 length() 메소드를 호출하면 문자열의 길이가 int type 으로 리턴된다. 
		int result=d.length();
		//참조값에 . 찍어서 charAt(int index) 메소드를 호출하면 index 해당되는 char 가 리턴된다. 
		char ch1=d.charAt(0);
		char ch2=d.charAt(1);
		char ch3=d.charAt(2);
		//참조값에 . 찍어서 toCharArray() 메소드를 호출하면 char 배열이 리턴된다. 
		char[] chars=d.toCharArray();
	}
}






