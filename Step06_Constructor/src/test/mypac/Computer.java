package test.mypac;

public class Computer {
	//필드
	public Cpu cpu;
	//생성자
	public Computer(Cpu cpu) {
		this.cpu=cpu;
	}
	//메소드
	public void doGame() {
		if(this.cpu==null) {
			System.out.println("Cpu 가 없어서 컴퓨터가 동작을 안해요");
			return; //메소드 끝내기
		}
		System.out.println("컴퓨터로 게임을 해요!");
	}
}





