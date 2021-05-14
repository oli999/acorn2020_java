package example1;

import java.net.Socket;

public class ClientMain {
	public static void main(String[] args) {
		Socket socket=null;
		try {
			//객체 생성과 동시에 서버의 5000번 port 로 접속 요청을 하게 된다.
			socket=new Socket("14.63.164.99", 5000);
			System.out.println("Socket 연결 성공!");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket!=null)socket.close();
			}catch(Exception e) {}
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
