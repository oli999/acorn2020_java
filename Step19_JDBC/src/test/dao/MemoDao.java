package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemoDto;
import test.util.DBConnect;

/*
 *   DAO (Data Access Object)  의 약자
 *   
 *   - 만드는 방법
 *   
 *   1. 외부에서 객체 생성하지 못하도록 생성자의 접근 지정자를 private 로 지정
 *   2. 자신의 참조값을 저장할수 있는 필드를 private static 로 선언
 *   3. 자신의 참조값을 오직 하나만 생성해서 리턴해주는 static 메소드 만들기 
 *   4. 나머지 기능(select,insert,update,delete)들은 non static 으로 만들기
 *   
 */
public class MemoDao {
	//자신의 참조값을 저장할 private 필드
	private static MemoDao dao;
	
	//외부에서 객체 생성하지 못하도록 한다. 
	private MemoDao() {}
	
	//참조값을 리턴해주는 메소드
	public static MemoDao getInstance() {
		if(dao==null) {//최초 호출되면 null 이므로 
			dao=new MemoDao();//객체를 생성해서 static 필드에 담는다. 
			System.out.println("최초로 사용될 때 MemoDao 객체를 생성 했습니다.");
		}
		return dao;
	}
	//메모 한명의 정보를 리턴해주는 메소드
	public MemoDto getData(int num) {
		//메모 한명의 정보를 담을 MemoDto 
		MemoDto dto=null;
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
			conn=new DBConnect().getConn();
			//실행할 sql 문
			String sql="SELECT content,regdate"
					+ " FROM memo"
					+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			//query 문 수행하고 결과 얻어오기
			rs=pstmt.executeQuery();
			//반복문 돌면서 select 된 메모정보  읽어오기
			while(rs.next()) {
				//MemoDto 객체 생성해서 
				dto=new MemoDto();
				//메모 한명의 정보를 담는다. 
				dto.setNum(num);
				dto.setContent(rs.getString("content"));
				dto.setRegdate(rs.getString("regdate"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//객체를 사용했던 순서 역순으로 닫아준다.
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}		
		
		return dto;
	}
	//메모 목록을 리턴해주는 메소드
	public List<MemoDto> getList(){
		//메모 목록을 담을 객체 생성
		List<MemoDto> list=new ArrayList<>();
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
			conn=new DBConnect().getConn();
			//실행할 sql 문
			String sql="SELECT num,content,TO_CHAR(regdate,'YYYY\"년\"MM\"월\"DD\"일\" AM HH:MI') AS regdate"
					+ " FROM memo"
					+ " ORDER BY num ASC";
			pstmt=conn.prepareStatement(sql);
			//query 문 수행하고 결과 얻어오기
			rs=pstmt.executeQuery();
			//반복문 돌면서 select 된 메모정보  읽어오기
			while(rs.next()) {
				//메모정보를 list 에 담아 보세요.
				int num=rs.getInt("num");
				String content=rs.getString("content");
				String regdate=rs.getString("regdate");
				//MemoDto 객체를 생성해서 메모 한명의 정보를 담는다.
				MemoDto dto=new MemoDto();
				dto.setNum(num);
				dto.setContent(content);
				dto.setRegdate(regdate);
				//MemoDto 객체를 List 에 누적 시킨다.
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//객체를 사용했던 순서 역순으로 닫아준다.
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		return list;
	}
	
	//메모 한명의 정보를 DB 에서 삭제하는 메소드
	public boolean delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="DELETE FROM memo"
					+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			flag=pstmt.executeUpdate();
			System.out.println("메모 정보를 삭제 했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
	
	//메모 정보를 DB 에 저장하는 메소드 (작업의 성공여부가 boolean 으로 리턴된다)
	public boolean insert(MemoDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="INSERT INTO memo"
					+ " (num, content, regdate)"
					+ " VALUES(memo_seq.NEXTVAL, ?, SYSDATE)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getContent());
			// sql 문을 수행하고 변화된  row 의 갯수를 리턴 받는다. (1)
			flag=pstmt.executeUpdate();
			System.out.println("메모 정보를 추가 했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true; //작업 성공이라는 의미에서 true  를 리턴한다.
		}else {
			return false; //작업 실패라는 의미에서 false  를 리턴한다.
		}
	}
	//메모 정보를 DB 에서 수정하는 메소드
	public boolean update(MemoDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="UPDATE memo"
					+ " SET content=?"
					+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getContent());
			pstmt.setInt(2, dto.getNum());
			//update 된 row 의 갯수가 반환 된다. 
			flag=pstmt.executeUpdate();
			System.out.println("메모 정보를 수정했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}	
}






