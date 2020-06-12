package test.mypac;

public class MultiPlayer implements Remocon, Drill{
	@Override
	public void hole() {
		System.out.println("책상에 구멍을 뚤어요");
	}
	@Override
	public void up() {
		System.out.println("온도를 올려요");
	}
	@Override
	public void down() {
		System.out.println("온도를 내려요");
	}
}
