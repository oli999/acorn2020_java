package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;

public class Quiz03 extends JFrame implements ActionListener{
	//필드
	JTextArea area;
	
	//생성자
	public Quiz03() {
		//프레임의 제목 설정 
		setTitle("나의 파일");
		//프레임의 레이아웃 지정 
		setLayout(new BorderLayout());
		//메뉴 아이템 3개 만들기 
		JMenuItem item_new=new JMenuItem("New");
		JMenuItem item_open=new JMenuItem("Open");
		//default 생성자를 호출해서 객체를 생성한후
		JMenuItem item_save=new JMenuItem();
		//아이템 text 를 메소드를 이용해서 전달도 가능하다 
		item_save.setText("Save");
		
		//아이템에 액션  command  지정하기 
		item_new.setActionCommand("new");
		item_open.setActionCommand("open");
		item_save.setActionCommand("save");
		//아이템에 액션 리스터 등록하기 
		item_new.addActionListener(this);
		item_open.addActionListener(this);
		item_save.addActionListener(this);
		
		//메뉴에 아이템 추가 
		JMenu menu1=new JMenu("File");
		menu1.add(item_new);
		menu1.add(item_open);
		menu1.add(item_save);
		
		JMenu menu2=new JMenu();
		menu2.setText("도움말");
		
		//메뉴바에 메뉴 추가 
		JMenuBar mb=new JMenuBar();
		mb.add(menu1);
		mb.add(menu2);
		//프레임에 메뉴바 장착
		setJMenuBar(mb);
		
		//텍스트 area 를 프레임의 가운데에 배치 
		area=new JTextArea();
		add(area, BorderLayout.CENTER);
		area.setBackground(Color.YELLOW);
		area.setVisible(false);
	}
	// run 했을때 실행순서가 시작 되는 메인 메소드 
	public static void main(String[] args) {
		//프레임을 만들어서 화면에 띄우는 작업을 한다. 
		Quiz03 f=new Quiz03();
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	// File > 메뉴아이템을 클릭하면 호출되는 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		// 눌러진 아이템의 액션 command 를 읽어온다.
		String command=e.getActionCommand();
		if(command.equals("new")) { // 아이템 New 를 눌렀을때
			area.setVisible(true); //JTextArea 를 보이게 하고 
			area.grabFocus(); //포커스를 준다. 
		}else if(command.equals("open")) {// 아이템 Open 을 눌렀을때
			
		}else if(command.equals("save")) {// 아이템 Save 를 눌렀을때 
			
		}
	}
}







