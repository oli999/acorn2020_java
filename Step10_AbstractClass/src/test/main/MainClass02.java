package test.main;

import test.mypac.Gun;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//여러분이 직접 클래스를 만들고 객체 생성을 해서 
		//아래의 useWeapon() 메소드를 호출해 보세요.
		Weapon g=new Gun();
		MainClass02.useWeapon(g);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}





