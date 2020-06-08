package test.mypac;
/*
 *   class  클래스명<Generic type>
 *   
 *    - 클래스를 정의할때 Generic type 을 지정해서 특정 type 을 동적으로 지정할수 있다. 
 */
public class FruitBox<T> {
	//필드 
	private T item;
	//메소드
	public void push(T item) {
		this.item=item;
	}
	public T pull() {
		return item;
	}
}
