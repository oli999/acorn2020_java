package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해서 검색할 회원 번호를 입력 받아서
		 *  입력 받은 번호에 해당되는 회원 정보를 얻어와서
		 *  아래와 같은 형식으로 출력해 보세요.
		 *  
		 *  만일 1을 입력한 경우 
		 *  
		 *  1 | 김구라 | 노량진
		 *  
		 *  만일 입력한 번호가 없는 경우
		 *  
		 *  9 번 회원은 존재 하지 않습니다.
		 */
		//Scanner 객체를 이용해서 정수를 입력 받고 
		Scanner scan=new Scanner(System.in);
		System.out.print("검색할 회원 번호 입력:");
		int num=scan.nextInt();
		
		//MemberDao 객체를 이용해서 입력한 회원 정보를 MemberDto 에 담아 온다.
		MemberDao dao=MemberDao.getInstance();
		//입력한 번호에 해당하는 회원 정보가 없으면 null 이 리턴된다.
		MemberDto dto=dao.getData(num);
		
		if(dto == null) {//회원 정보가 없는 경우 
			System.out.println(num+" 번 회원은 존재 하지 않습니다.");
		}else {//회원정보가 있는 경우
			System.out.println(dto.getNum()+" | "+dto.getName()
			+" | "+dto.getAddr());
		}
	}
}










