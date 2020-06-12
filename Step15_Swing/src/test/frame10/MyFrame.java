package test.frame10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame 
					implements ActionListener, KeyListener{
	//필드
	JTextField inputMsg;
	JLabel lab1;
	
	//default  생성자
	public MyFrame() {
		setLayout(new BorderLayout());
		//문자열 한줄을 입력할수 있는 JTextField
		inputMsg=new JTextField(10);
		inputMsg.addKeyListener(this);
		
		JButton sendBtn=new JButton("전송");
		sendBtn.addActionListener(this);
		
		//JLabel 객체 생성
		lab1=new JLabel("label입니다.");
		
		//JPanel 객체 생성
		JPanel panel=new JPanel();
		//페널도 레이아웃을 지정할수 있다( 기본값은 FlowLayout 가운데 정렬이다 )
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		//JPanel 에 UI 추가 하고 
		panel.add(inputMsg);
		panel.add(sendBtn);
		panel.add(lab1);
		
		//JFrame 에 JPanel 을 북쪽에 배치하기 
		add(panel, BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		//MyFrame 클래스를 이용해서 객체 생성하고 참조값을 지역변수 frame 에 담기 
		MyFrame frame=new MyFrame();
		//프레임의 제목 설정
		frame.setTitle("나의 프레임");
		//프레임을 닫으면 자동으로 프로세스가 종료 되도록 한다.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
	}
	//ActionListener 인터페이스를 구현 해서 강제 오버라이드된 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		//JTextField 에 입력한 문자열을 읽어와야한다.
		String msg=inputMsg.getText();
		//읽어온 문자열을 JLabel 에 추가하기
		lab1.setText(msg);
		//입력창 문자열 삭제 하기 
		inputMsg.setText("");
	}
	//키를 눌렀을때 호출되는 메소드 
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("pressed");
		//눌러진 키보드의 코드값을 읽어온다.
		int code=e.getKeyCode();
		if(code == KeyEvent.VK_ENTER) {//엔터키를 눌렀다면 
			//JTextField 에 입력한 문자열을 읽어와야한다.
			String msg=inputMsg.getText();
			//읽어온 문자열을 JLabel 에 추가하기
			lab1.setText(msg);
			//입력창 문자열 삭제 하기 
			inputMsg.setText("");
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("released");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("typed");
	}
}






