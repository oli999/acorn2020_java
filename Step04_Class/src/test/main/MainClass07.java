package test.main;

import test.mypac.Marine;

public class MainClass07 {
	
	public static void main(String[] args) {
		/*
		 *  Marine 객체를 생성해서 참조값을 m1 이라는 지역 변수에 담아 보세요.
		 */
		Marine m1=new Marine();
		m1.move();
		m1.attack();
		m1.showEnergy();
		System.out.println("--- m1 ---");
		
		Marine m2=new Marine();
		m2.move();
		m2.attack();
		m2.showEnergy();
		System.out.println("--- m2 ---");
		
		//Marine 의 공격력을 올려보자 (모든 Marine 객체의 공격력에 영향을 미친다)
		Marine.attackPower += 2;
		m1.attack();
		m2.attack();
		
		//m1 의 에너지 감소 시키기 (m2 의 에너지에는 영향을 주지 않는다)
		m1.energy -= 10;
		m1.showEnergy();
		m2.showEnergy();
	}
}








