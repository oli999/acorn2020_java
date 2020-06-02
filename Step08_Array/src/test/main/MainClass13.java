package test.main;

import java.util.Random;
import java.util.Scanner;

/*
 *  [ 컴퓨터와 가위 바위 보 하기 ]
 *  
 *   가위(s) 바위(r) 보(p) :s
 *   
 *   나 : 가위  vs 컴: 보
 *   win(draw or lose)~
 *  
 */
public class MainClass13 {
	public static void main(String[] args) {
		//가위 바위 보 문자열을 일단 배열에 담아보자
		String[] items= {"가위", "바위", "보"};
		//사용자 입력을 받아야 하니 Scanner  객체를 생성한다.
		Scanner scan=new Scanner(System.in);
		//컴퓨터가 랜덤하게 가위,바위,보를 정해야 하니 Random 객체를 생성한다.
		Random ran=new Random();
		
		//1. 사용자 입력을 받는다. 
		System.out.println("가위(s) 바위(r) 보(p) 입력:");
		String clientInput=scan.nextLine();
		
		//2. "s" 는 0, "r" 은 1, "p" 는 2 로 바꿔 보기로 하자
		int me=0;
		if(clientInput.equals("s")) {
			me=0;
		}else if(clientInput.equals("r")) {
			me=1;
		}else if(clientInput.equals("p")) {
			me=2;
		}
		
		//3. Computer 도 랜덤하게 하나의 숫자를 부여 받는다 (0,1,2  중에 하나)
		int com=ran.nextInt(3);
		//win, draw, lose 문자열을 담을 변수를 미리 만들어 준다.
		String result=null;
		//4. 승패를 판단해야 한다. 
		if( (me==0 && com==2) || (me==1 && com==0) || (me==2 && com==1)) {//내가 이기는 경우는 무엇일까?
			result="win!";
		}else if(me == com) {//요거는 비기는 경우 
			result="draw";
		}else {//나머지는 따져 보지 않아도 내가 진경우 일듯...
			result="lose ㅜㅜ";
		}
		System.out.println("나:"+items[me]+" vs 컴:"+items[com]);
		System.out.println(result);
		
	}
}















