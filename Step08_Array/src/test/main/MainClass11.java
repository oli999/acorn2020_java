package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//외형상 무한 루프
		while(true) {
			System.out.print("종료(q) 계속(Enter):");
			String str=scan.nextLine();
			if(str.equals("q")) {//무한 루프 탈출 조건
				break; //while  문 탈출
			}
			//이전 예제에서 작업한 내용을 static 메소드에 이동 시키고 해당 메소드 호출하기 
			MainClass11.doGame();
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
	
	public static void doGame() {
		//렌덤하게 출력할 문자열을 미리 배열에 담아 놓는다. 
		String[] items={"cherry", "apple", "banana", "melon", "7"};
		//렌덤한 숫자를 얻어내기 위한 객체
		Random ran=new Random();
		//렌덤하게 얻어낸 3개의 정수를 저장할 배열
		int[] nums=new int[3];
		//0~4 사이의 렌덤한 정수 3개 얻어내기
		for(int i=0;i<3;i++) {
			//렌덤한 정수를 얻어내서 
			int ranNum=ran.nextInt(5);
			nums[i]=ranNum; //배열에 저장한다 
		}
		//렌덤한 정수 3개 참조
		int one=nums[0];
		int two=nums[1];
		int three=nums[2];
		//출력할 문자열 구성하기
		String line=items[one]+" | "+items[two]+" | "+items[three];
		//출력하기 
		System.out.println(line);
		//부여할 점수를 미리 배열에 담아 놓는다. 
		int[] points= {10, 20, 30, 40, 1000};
		//nums 배열에 있는 3개의 숫자가 모두 같은지 비교해 본다.
		if(nums[0]==nums[1] && nums[1]==nums[2]) {//3개가 모두 같은 경우
			//점수를 부여해야 한다 . 몇점이지?
			//nums  배열에 있는 숫자 3개가 다 같으므로 아무거나 하나를 읽어와서
			//점수를 얻어낸다
			int point=points[nums[0]];
			System.out.println(point+"점 입니다.");
		}else {//하나라도 다른 경우
			// 0 점
			System.out.println("0점 입니다.");
		}		
	}
}








