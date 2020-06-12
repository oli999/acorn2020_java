package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Info;

public class MainClass05 {
	public static void main(String[] args) {
		//Info  클래스로 객체를 생성해서 참조값을 i1  이라는 지역 변수에 담기
		Info i1=new Info();
		//필드는 public  으로 선언되어 있기 때문에 직접 접근해서 대입연산자로 값을 대입할수 있다.
		i1.num=1;
		i1.name="김구라";
		i1.addr="노량진";
		
		Info i2=new Info();
		i2.num=2;
		i2.name="해골";
		i2.addr="행신동";
		
		//위의 Info type 객체의 참조값을 List 객체에 순서대로 담아 보세요.
		List<Info> list=new ArrayList<>();
		list.add(i1);
		list.add(i2);
		/*
		 *  반복문 for 를 이용해서 List 객체에 담긴 정보를 아래와 같은 형식으로 출력해 보세요.
		 *  
		 *  1 | 김구라 | 노량진
		 *  2 | 해골 | 행신동
		 *  .
		 *  .
		 */
		for(Info tmp: list) {
			//출력할 문자열 구성하기
			String line=tmp.num+" | "+tmp.name+" | "+tmp.addr;
			System.out.println(line);
		}
	}
}













