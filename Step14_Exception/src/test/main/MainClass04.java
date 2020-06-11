package test.main;

import java.util.Random;

import test.mypac.SleepyException;

public class MainClass04 {
	public static void main(String[] args) {
		Random ran=new Random();
		
		for(int i=0; i<100; i++) {
			//0~9 사이의 랜덤한 정수를 발생시킨다.
			int ranNum=ran.nextInt(10);
			if(ranNum==5) {//우연히 랜덤한 정수가 5 가 나오면 예외를 발생 시킨다.
				//throw 예약어와 함께 예외 객체를 생성하면 예외가 발생한다.
				throw new SleepyException("너무 졸려~~");
			}
			
			System.out.println(i+1+" 번째 작업중...");
		}
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}








