package example4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClientMain extends JFrame implements ActionListener{
	//필드
	JTextField tf_msg;
	//서버와 연결된 Socket 객체의 참조값을 담을 필드
	Socket socket;
	
	//생성자
	public ClientMain() {
		//서버에 소켓 접속을 한다.
		try {
			socket=new Socket("192.168.0.30", 5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//레이아웃을 BorderLayout 으로 지정하기 
		setLayout(new BorderLayout());
		
		//페널
		JPanel panel=new JPanel();
		panel.setBackground(Color.YELLOW);
		//입력창
		tf_msg=new JTextField(10);
		//버튼
		JButton sendBtn=new JButton("전송");
		sendBtn.setActionCommand("send");
		//페널에 입력창과 버튼을 추가
		panel.add(tf_msg);
		panel.add(sendBtn);
		//프레임의 아래쪽에 페널 배치하기
		add(panel, BorderLayout.SOUTH);
		
		//버튼에 리스너 등록
		sendBtn.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		//프레임 객체 생성
		ClientMain f=new ClientMain();
		f.setTitle("쳇팅창");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//전송할 문자열
		String msg=tf_msg.getText();
		try {
			//문자열을 서버에 전송(출력Output) 하기
			OutputStream os=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			osw.write(msg);
			osw.write("\r\n");//개행기호도 출력 (서버에서 줄단위로 읽어낼 예정)
			osw.flush();
		}catch(Exception e2) {
			e2.printStackTrace();
		}
	}
}





