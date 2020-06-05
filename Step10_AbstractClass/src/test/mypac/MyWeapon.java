package test.mypac;

public class MyWeapon extends Weapon{
	//상속받은 Weapon 클래스의 추상 메소드를 강제로 오버라이드 해야한다.
	@Override
	public void attack() {
		System.out.println("내가 알아서 공격해요!");
	}
}
