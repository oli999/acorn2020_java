package test.main;

import test.mypac.Bike;
import test.mypac.Rect;

public class MainClass05 {
	public static void main(String[] args) {
		//1. Rect 객체를 담을수 있는 방 3개짜리 배열객체를 생성해서 참조값을
		// rects 라는 이름의 지역 변수에 담아 보세요.
		Rect[] rects=new Rect[3];
		//2. 배열에 Rect 객체 3개를 순서대로 담아 보세요.
		rects[0]=new Rect(10, 20);
		rects[1]=new Rect(10, 30);
		rects[2]=new Rect(10, 40);
		
		//3. 반복문 for 문을 이용해서 각각 4각형의 면적을 콘솔창에 출력해 보세요.
		for(int i=0; i<rects.length; i++) {
			//배열의 i번째 방에 있는 Rect 객체의 참조값을 불러온다.
			Rect tmp=rects[i];
			int area=tmp.getArea();
			System.out.println(area);
		}
	}
}





