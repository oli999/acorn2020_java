package test.mypac;
/*
 *  인터페이스는 implements (구현) 해야 한다.
 *  구현 클래스에서는 인터페이스에 정의된 추상 메소드를 반드시 오버라이드 해야한다.
 */
public class MyRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("무언가를 올려요");
	}

	@Override
	public void down() {
		System.out.println("무언가를 내려요");
	}
}



