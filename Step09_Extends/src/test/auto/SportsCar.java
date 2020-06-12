package test.auto;

// class 예약어 앞에 final 예약어를 붙이면 더 이상 상속이 안된다.
// 마지막 클래스 즉 종단 클래스가 된다. 
public final class SportsCar extends Car{
	//생성자
	public SportsCar(Engine engine) {
		super(engine);
		
	}
	//메소드
	@Override
	public void drive() {
		/*
		 *  재정의(오버라이드) 한 부모 메소드를 호출해야 할지 말지는 
		 *  상황에 따라 다르다. 
		 *  어떤 경우에는 부모의 메소드를 호출해 주지 않으면 객체가 
		 *  제대로 동작을 안하는 경우가 있다.
		 *  그런 경우에는 부모의 메소드를 반드시 호출해 주어야 한다. 
		 */
		super.drive();
		System.out.println("겁나 빨리 달려요!");
	}

}



