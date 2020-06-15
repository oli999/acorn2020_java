package test.frame11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	//필드
	JTextField tf_num1, tf_num2;
	JLabel label_result;
	
	
	//default  생성자
	public MyFrame() {
		//프레임의 레이아웃 법칙 설정하기 
		setLayout(new BorderLayout());
		
		//JPanel
		JPanel topPanel=new JPanel();
		topPanel.setBackground(Color.YELLOW);
		//Panel 을 북쪽에 배치하기 
		add(topPanel, BorderLayout.NORTH);
		
		//JTextField 객체를 만들에서 JPanel 에 추가하기 
		tf_num1=new JTextField(10);
		topPanel.add(tf_num1);
		//기능 버튼 객체를 만들어서 JPanel 에 추가하기
		JButton plusBtn=new JButton("+");
		JButton minusBtn=new JButton("-");
		JButton multiBtn=new JButton("*");
		JButton divideBtn=new JButton("/");
		topPanel.add(plusBtn);
		topPanel.add(minusBtn);
		topPanel.add(multiBtn);
		topPanel.add(divideBtn);
		//두번째 JTextField  만들어서 페널에 추가 하기 
		tf_num2=new JTextField(10);
		topPanel.add(tf_num2);
		//JLabel
		JLabel label1=new JLabel("=");
		label_result=new JLabel("0");
		//페널에 레이블 추가하기
		topPanel.add(label1);
		topPanel.add(label_result);
		
		//버튼에 리스너 등록하기
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		//버튼에 액션 command 지정하기
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		multiBtn.setActionCommand("multi");
		divideBtn.setActionCommand("divide");
		
	}
	
	public static void main(String[] args) {
		//MyFrame 클래스를 이용해서 객체 생성하고 참조값을 지역변수 frame 에 담기 
		MyFrame frame=new MyFrame();
		//프레임의 제목 설정
		frame.setTitle("계산기");
		//프레임을 닫으면 자동으로 프로세스가 종료 되도록 한다.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
	}
	//ActionListener 인터페이스를 구현 해서 강제 오버라이드된 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			//JTextField 에 입력한 문자열을 읽어와서 숫자(실수)로 바꿔준다.
			double num1=Double.parseDouble(tf_num1.getText());
			double num2=Double.parseDouble(tf_num2.getText());
			//연산의 결과값을 담을 지역 변수
			double result=0;
			//눌러진 버튼의 command 읽어오기
			String command=e.getActionCommand();
			if(command.equals("plus")) {
				result=num1+num2;
			}else if(command.equals("minus")) {
				result=num1-num2;
			}else if(command.equals("multi")) {
				result=num1*num2;
			}else if(command.equals("divide")) {
				result=num1/num2;
			}
			//결과 값을 JLabel 에 출력하기 
			label_result.setText(Double.toString(result));
		}catch(Exception exe) {
			JOptionPane.showMessageDialog(this, "숫자 형식으로 입력해 주세요");
		}
	}
}






