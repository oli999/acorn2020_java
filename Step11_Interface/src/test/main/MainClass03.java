package test.main;

import test.mypac.Drill;
import test.mypac.MultiPlayer;
import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		//MultiPlayer 객체는 3가지 type  이 모두 될수 있기 때문에
		MultiPlayer mp=new MultiPlayer();
		//아래의 3개 메소드를 호출하면서 인자로 전달할수 있다. 
		useRemocon(mp);
		useDrill(mp);
		useMultiPlayer(mp);
		
		//만일 Remocon type 으로 받으면
		Remocon r=mp;
		//만일 Drill type 으로 받으면
		Drill d=mp;
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
	
	public static void useDrill(Drill d) {
		d.hole();
	}
	
	public static void useMultiPlayer(MultiPlayer mp){
		mp.up();
		mp.down();
		mp.hole();
	}
}






