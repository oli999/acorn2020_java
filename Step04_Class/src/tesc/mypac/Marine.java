package tesc.mypac;

public class Marine {
	//공격력을 저장하고 있는 static 필드.
	
	//스태틱메모리 영역에는 클래스와 스태틱필드들이 존재한다.
	
	public static int attackPower = 6;
	
	//에너지를 저장하고 있는 non static 필드
	public int energy = 40;
	
	//움직이는 메소드
	public void move()
	{
		System.out.println("마린이 움직여요");
	}
	
	//공격하는 메소드
	public void attack()
	{
		System.out.println("x의 공격력으로 공격을 해요");
	}
	
	public void showEnergy() {
		System.out.println("현재 에너지: " + this.energy);
	}
	
	
}
