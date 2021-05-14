package example4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientMain extends JFrame 
			implements ActionListener, KeyListener{
	//필드
	JTextField tf_msg;
	//서버와 연결된 Socket 객체의 참조값을 담을 필드
	Socket socket;
	BufferedWriter bw;
	JTextArea area;
	
	//생성자
	public ClientMain() {
		//서버에 소켓 접속을 한다.
		try {
			//접속이 성공되면 Socket 객체의 참조값이 반환된다.
			//반환되는 객체의 참조값을 필드에 저장해 놓는다. 
			socket=new Socket("14.63.164.99", 5000);
			//서버에 문자열을 출력할
			//BufferedWriter 객체의 참조값을 얻어내서 필드에 저장해 놓는다. 
			OutputStream os=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			//서버로 부터 메세지를 받을 스레드도 시작을 시킨다.
			new ClientThread().start();
		}catch(Exception e) {//접속이 실패하면 예외가 발생한다.
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
		
		//JTextArea의 참조값을 필드에 저장하기
		area=new JTextArea();
		//문자열 출력 전용으로 사용하기 위해 편집 불가능하도록 설정 
		area.setEditable(false);
		//배경색
		area.setBackground(Color.PINK);
		//스크롤 가능하도록
		JScrollPane scroll=new JScrollPane(area,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		//프레임의 가운데에 배치하기
		add(scroll, BorderLayout.CENTER);
		
		//엔터키로 메세지 전송 가능하게 하기 위해
		tf_msg.addKeyListener(this);
		
	}//생성자 
	
	
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
		sendMessage();
	}
	
	//메세지를 전송하는 메소드
	public void sendMessage() {
		//전송할 문자열
		String msg=tf_msg.getText();
		try {
			//필드에 있는 BufferedWriter 객체의 참조값을 이용해서 서버에 문자열 출력하기 
			bw.write(msg);
			bw.newLine();//개행기호도 출력 (서버에서 줄단위로 읽어낼 예정)
			bw.flush();
		}catch(Exception e2) {
			e2.printStackTrace();
		}
		tf_msg.setText("");
	}
	
	//서버에서 불특정 시점에 도착하는 메세지를 받을 스레드 
	public class ClientThread extends Thread{
		
		@Override
		public void run() {
			try {
				//서버로 부터 입력 받을수 있는 객체의 참조값 얻어오기 
				InputStream is=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(is);
				BufferedReader br=new BufferedReader(isr);
				while(true) {
					//서버로부터 문자열이 전송되는지 대기한다. 
					String msg=br.readLine();
					//JTextArea 에 출력하기
					area.append(msg);
					area.append("\r\n");//개행 기호도 출력하기 
					//최근 추가된 글 내용이 보일수 있도록
					int docLength=area.getDocument().getLength();
					area.setCaretPosition(docLength);
					if(msg==null) {
						break;
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		//눌러진 키의 코드값
		int code=e.getKeyCode();
		if(code == KeyEvent.VK_ENTER) {//만일 엔터키를 눌렀다면 
			sendMessage();
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}










