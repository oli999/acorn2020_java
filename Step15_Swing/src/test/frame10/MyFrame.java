package test.frame10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame 
					implements ActionListener, KeyListener{
	//필드
	JTextField inputMsg;
	JLabel lab1;
	DefaultListModel<String> model;
	JList<String> list;
	
	//static final 상수
	static final String COMMAND_SEND="send";
	static final String COMMAND_REMOVE="remove";
	
	
	//default  생성자
	public MyFrame() {
		setLayout(new BorderLayout());
		//문자열 한줄을 입력할수 있는 JTextField
		inputMsg=new JTextField(10);
		inputMsg.addKeyListener(this);
		
		JButton sendBtn=new JButton("전송");
		sendBtn.setActionCommand(COMMAND_SEND);
		sendBtn.addActionListener(this);
		//삭제 버튼
		JButton removeBtn=new JButton("선택 삭제");
		removeBtn.setActionCommand(COMMAND_REMOVE);
		removeBtn.addActionListener(this);
		//삭제 버튼 하단에 배치하기 
		add(removeBtn, BorderLayout.SOUTH);
		
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
		//페널에 배경색 지정하기 
		panel.setBackground(Color.YELLOW);
		
		//JFrame 에 JPanel 을 북쪽에 배치하기 
		add(panel, BorderLayout.NORTH);
		//목록을 출력할수 있는 JList 
		list=new JList<String>();
		
		//기본 모델 객체 ( 목록에 출력할 data 를 가지고 있는 객체 )
		model=new DefaultListModel<String>();
		model.addElement("김구라1");
		model.addElement("해골2");
		model.addElement("원숭이3");
		
		//목록에 모델 연결하기 
		list.setModel(model);
		
		//스크롤 페널에 목록 넣어주기
		JScrollPane sc=new JScrollPane(list, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		//스크롤 페널을 프레임의 가운데에 배치하기 
		add(sc, BorderLayout.CENTER);
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
		//눌러진 버튼의 command  를 읽어온다.
		String command=e.getActionCommand();
		if(command.equals(COMMAND_SEND)) {//전송 버튼을 눌렀을때
			send();
		}else if(command.equals(COMMAND_REMOVE)) {//삭제 버튼을 눌렀을때
			//JList 객체에게 선택된 item 이 있는지 있다면 몇번째 아이템이 선택되었는지
			//물어 봐야 한다. (메소드를 이용해서 알아낸다)
			int selectedIndex=list.getSelectedIndex();
			if(selectedIndex >= 0) {//선택된 cell 이 있을때 
				//정말로 삭제 할것인지 물어본다.
				int result=JOptionPane.showConfirmDialog(this, "삭제 할겨?");
				if(result==JOptionPane.YES_OPTION) {
					//JList 에 연결된 모델에서 해당 인덱스를 삭제한다. 
					model.remove(selectedIndex);
				}	
			}else {//선택된 cell 이 없을때
				JOptionPane.showMessageDialog(this, "삭제할 cell 을 선택하세요");
			}
		}
	}
	
	//메소드 추가
	public void send() {
		//JTextField 에 입력한 문자열을 읽어와야한다.
		String msg=inputMsg.getText();
		//읽어온 문자열을 JLabel 에 추가하기
		lab1.setText(msg);
		//입력창 문자열 삭제 하기 
		inputMsg.setText("");
		//모델에 입력한 문자열 추가하기
		model.addElement(msg);
	}
	
	//키를 눌렀을때 호출되는 메소드 
	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println("pressed");
		//눌러진 키보드의 코드값을 읽어온다.
		int code=e.getKeyCode();
		if(code == KeyEvent.VK_ENTER) {//엔터키를 눌렀다면 
			send();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		//System.out.println("released");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		//System.out.println("typed");
	}
}






