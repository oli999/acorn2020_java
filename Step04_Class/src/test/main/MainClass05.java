package test.main;
import tesc.mypac.Rect;

public class MainClass05 {
	public static void main(String[] args) {
		Rect r1 = new Rect(10,20);
		int area = r1.getArea();
		
		Rect r2 = new Rect(5,10);
		int b = r2.getArea();
		
		System.out.println(area);
		System.out.println(b);
		
	}

}
