package test.main;

import test.human.Blood;
import test.human.Men;

public class MainClass11 {
	public static void main(String[] args) {
		/*
		 *  프로그래밍의 목적 : 영화를 보고 싶다.
		 *  영화를 보는 프로그래밍의 목적을 달성해 보세요.
		 */
		
		Men men=new Men(new Blood("+", "A"));
		men.seeMovie();
		
		Blood b1=new Blood("+", "O");
		Men men2=new Men(b1);
		men2.seeMovie();
		
		new Men(new Blood("-","B")).seeMovie();
		
	}
}
















