package test.main;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz02 extends JFrame{
	//생성자
	public Quiz02() {
		setTitle("나의 프레임");
		setLayout(new BorderLayout());
		
		JPanel topPanel=new JPanel();
		
		JTextField tf_msg=new JTextField(10);
		
		JButton appendBtn=new JButton("추가하기");
		appendBtn.setActionCommand("append");
		
		topPanel.add(tf_msg);
		topPanel.add(appendBtn);
		add(topPanel, BorderLayout.NORTH);
		topPanel.setBackground(Color.YELLOW);
	
	}
	
	public static void main(String[] args) {
		Quiz02 f=new Quiz02();
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}





