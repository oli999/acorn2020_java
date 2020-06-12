package test.main;

import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		
		SmartPhone p1=new SmartPhone();
		p1.mobileCall();
		p1.doInternet();
		//SmartPhone 클래스에서 오버라이드된 메소드가 호출된다. 
		p1.takePicture();
	}
}









