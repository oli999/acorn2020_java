package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		//인터페이스 type (부모 type)  
		Remocon r1=new MyRemocon();
		//원래 class type 
		MyRemocon r2=new MyRemocon();
	
		useRemocon(r1);
		useRemocon(r2);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}




