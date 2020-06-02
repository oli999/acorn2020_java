package test.main;

import java.util.Random;

public class MainClass09 {
	public static void main(String[] args) {
		
		/*  cherry, apple, banana, melon, 7 
		 * 
		 * 	5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해 보세요.
		 *    예)  cherry | apple | cherry
		 *         7 | apple | melon
		 *         7 | 7 | 7
		 *      
		 */
		
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
	}
}





