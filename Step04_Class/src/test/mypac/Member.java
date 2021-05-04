package test.mypac;

public class Member {
	//non static 필드 정의하기
	public int num;
	public String name;
	public String addr;
	
	//non static 메소드 정의하기
	public void showInfo() {
		System.out.println(num+" | "+this.name+" | "+this.addr);
	}
}






