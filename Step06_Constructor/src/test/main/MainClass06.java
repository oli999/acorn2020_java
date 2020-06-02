package test.main;

import javax.swing.JFrame;

public class MainClass06 {
	public static void main(String[] args) {
		JFrame f=new JFrame("김구라");
		//창의 위치와 폭과 높이 
		f.setBounds(100, 100, 500, 500);
		//창이 화면상에 보이도록 한다. 
		f.setVisible(true);
		//창을 닫았을때 프로세스도 자동으로 종료 되도록 한다. 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}













