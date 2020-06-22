package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *  3 번 회원을 삭제하는 code 를 작성해 보세요.
		 */
		//DB 연결객체를 담을 지역변수 만들기
		Connection conn=null;
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott", "tiger");
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		//삭제할 회원의 번호 
		int num=3;
		
		PreparedStatement pstmt=null;
		try {
			//실행할 sql 문
			String sql="DELETE FROM member"
					+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			//? 에 값 바인딩
			pstmt.setInt(1, num);
			//sql 문 실행하기 
			pstmt.executeUpdate();
			System.out.println("회원 정보를 삭제 했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			}catch(Exception e) {}
		}
	}
}
