package test.human;

public class Men extends Person{
	
	//생성자  
	public Men(Blood blood) {
		super(blood); //부모 생성자에 필요한 값을 전달 한다.
	}
	
	public void seeMovie() {
		System.out.println("영화를 봐요");
	}
}








