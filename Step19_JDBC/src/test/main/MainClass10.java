package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass10 {
	public static void main(String[] args) {
		//만일 MemberDao 객체의 참조값이 필요 하다면?
		//MemberDao dao=new MemberDao(); 직접 객체 생성 불가
		
		//static 메소드를 이용해서 MemberDao 객체의 참조값을 받아올수 있다.
		MemberDao dao=MemberDao.getInstance();
		//새로 추가할 회원의 정보라면 
		MemberDto dto=new MemberDto();
		dto.setName("덩어리");
		dto.setAddr("상도동");
		//MemberDao 객체의 메소드를 활용해서 저장할수 있다. 
		dao.insert(dto);
		//MemberDao a=new MemberDao();
		
		MemberDao dao2=MemberDao.getInstance();
		dao.delete(31);
		// dao 와 dao2 에는 같은 참조값이 들어 있다. 
		boolean result = dao == dao2;
	}
}






