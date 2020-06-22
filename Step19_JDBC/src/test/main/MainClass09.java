package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass09 {
	public static void main(String[] args) {
		//수정할 회원의 정보
		int num=1;
		String name="이정호";
		String addr="독산동";
		//MemberDto 객체에 수정할 회원의 정보를 담아서 
//		MemberDto dto=new MemberDto();
//		dto.setNum(num);
//		dto.setName(name);
//		dto.setAddr(addr);
		
		MemberDto dto=new MemberDto(num, name, addr);
		//메소드 호출하면서 전달
		update(dto);
	}
	//인자로 MemberDto 객체를 전달 받아서 DB 에 수정 작업을 하는 메소드 
	public static void update(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=new DBConnect().getConn();
			String sql="UPDATE member"
					+ " SET name=?, addr=?"
					+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			pstmt.executeUpdate();
			System.out.println("회원 정보를 수정했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
	}
}











