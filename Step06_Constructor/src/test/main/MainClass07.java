package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;

public class MainClass07 {
	public static void main(String[] args) {
		//기본 생성자를 호출해서 객체 생성하고 참조값을 지역 변수에 담기 
		Computer com1=new Computer();
		//Cpu type 을 전달받는 생성자를 호출해서 객체 생성하고 참조값을 지역 변수에 담기
		Computer com2=new Computer(new Cpu());
		
		com1.doGame(); //게임 불가
		com2.doGame(); //게임 가능 
	}
}








