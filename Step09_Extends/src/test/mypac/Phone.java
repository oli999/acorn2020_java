package test.mypac;

public class Phone extends Object{ //extends Object 는 생략 가능 
	//생성자
	public Phone() {
		System.out.println("Phone()  생성자 호출됨");
	}
	
	//전화 거는 메소드 
	public void call() {
		System.out.println("전화를 걸어요");
	}
}
