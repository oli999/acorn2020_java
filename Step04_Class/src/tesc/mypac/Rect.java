
package tesc.mypac;

/*
 * 클래스의 용도
 * 1. 객체의 설계도 역할을 한다.
 * 2. 데이터 type의 역할을 한다.
 * 3. static 필드나 static 메소드를 가지고 있는 역할을 한다. 
 * 4. 클래스는 관례상 시작 문자를 대문자로 시작한다.
 * 5. 객체는 어떤 기능과 데이터의 저장소
 * 6. 저장소를 필드라고 하고
 * 7. 기능을 메소드라고한다.
 * 8. 객체는 필드와 메소드로 이루어져있다.
 * 
 */
public class Rect {
	int width;
	int height;
	
	public Rect(int mWidth, int mHeight)
	{
		this.width = mWidth;
		this.height = mHeight;
	}
	
	public int getArea()
	{
		return width*height;
	}
}
