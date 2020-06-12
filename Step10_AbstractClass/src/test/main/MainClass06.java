package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	//staic inner class 로 Weapon 추상 클래스 상속 받기 
	public static class YourWeapon extends Weapon{
		@Override
		public void attack() {
			System.out.println("아무나 공격해요");
		}	
	}
	
	public static void main(String[] args) {
		/*
		 *  useWeapon() 메소드를 호출하는게 목적이다.
		 *  호출하려고 보니 Weapon 추상 클래스 type 객체의 참조값이 필요하다
		 *  따라서 Weapon  추상 클래스를 상속받은 클래스를 파일로 만들어야 된다.
		 *  근데 불금이다보니 만사가 구찮다. 클래스를 파일로 만들기 싫다
		 *  내부클래스(inner class) 로 만들고 싶다. 		 
		 */
		Weapon w1=new YourWeapon();
		useWeapon(w1);
		
		//local inner class 도 이용해 보자
		class OurWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("지겹다 이제 그만 공격하자");
			}
		}
		
		Weapon w2=new OurWeapon();
		useWeapon(w2);
		
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}






