package test.auto;

public class CampingCar extends Car{
	//생성자
	public CampingCar(Engine engine) {
		super(engine);
	}
	//메소드
	public void doCamping() {
		//부모 객체의 메소드 사용 가능 , this. 생략 가능 
		this.drive();
		//부모 객체의 필드 참조 가능 this. 생략 가능 
		Engine e=this.engine;
	}
}
