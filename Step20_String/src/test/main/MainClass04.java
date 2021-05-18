package test.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass04 {
	public static void main(String[] args) {
		String line="2020-05-18 12:10";
		//숫자만 찾을 정규 표현식
		String reg="[0-9]+";  // "[\\d]+"
		//정규표현식을 이용해서 Pattern 객체를 얻어낸다.
		Pattern pat=Pattern.compile(reg);
		//Pattern 객체의 matcher() 메소드를 이용해서 Matcher 객체를 얻어낸다.
		Matcher mat=pat.matcher(line);
		while(mat.find()) {
			String result=mat.group();
			System.out.println(result);
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
