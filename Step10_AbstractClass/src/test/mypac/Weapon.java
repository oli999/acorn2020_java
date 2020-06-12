package test.mypac;
/*
 *  미완성된 추상 메소드를 맴버로 가지고 있는 클래스는
 *  abstract 예약어를 붙여서 정의해야한다.  
 */
public abstract class Weapon {
	//무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비 합니다.");
	}
	//미완성된 추상메소드를 만들때는 abstract 예약어를 붙여서 메소드를 정의한다. 
	public abstract void attack();
}






