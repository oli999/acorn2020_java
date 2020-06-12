package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚤어요");
			}
		});
		
		Drill d1=()->{
			System.out.println("벽에 20mm 의 구멍내기");
		};
		
		useDrill(d1);
		useDrill(()->{
			System.out.println("핸드폰에 1mm 구멍내기");
		});
		
	}
	
	public static void useDrill(Drill d) {
		d.hole();
	}
}





