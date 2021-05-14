package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		//이미 만들어 졌거나 혹은 만들 예정인 파일을 access 할수 있는 File 객체 
		File f1=new File("c:/acorn202104/myFolder/gura.txt");
		try {
			//새로운 파일 만들기 
			f1.createNewFile();
			System.out.println("gura.txt 파일을 만들었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}




