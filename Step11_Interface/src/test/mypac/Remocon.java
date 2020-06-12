package test.mypac;
/*
 *  [ interface ]
 *  
 *  - 생성자가 없다 (단독 객체 생성 불가)
 *  - 구현된 메소드는 가질수 없다 ( 추상 메소드만 가질수 있다 )
 *  - 필드는 static final 상수만 가질수 있다.
 *  - data type  의 역활을 할수 있다.
 *  - interface type 의 참조값이 필요하면 구현(implements) 클래스를 만들어서
 *    객체를 생성해야 한다.
 *  - 클래스 상속은 단일 상속이지만, 인터페이스는 다중 구현이 가능하다 
 */
public interface Remocon {
	//필드 (static final 예약어 생략 가능)
	public static final String COMPANY="LG";
	//메소드 (abstract 예약어 생략 가능)
	public abstract void up();
	public abstract void down();
}












