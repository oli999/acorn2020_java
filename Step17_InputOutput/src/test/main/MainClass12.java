package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass12 {
	public static void main(String[] args) {
		//문자열을 저장할 파일을 만들기위한 File 객체
		File memoFile=new File("c:/acorn202104/myFolder/memo.txt");
		try {
			//실제로 파일이 존재하는지 여부 
			boolean isExist=memoFile.exists();
			if(!isExist) {//존재하지 않으면 
				//파일을 실제로 만든다.
				memoFile.createNewFile();
			}
			//파일에 문자열을 출력할 객체
			FileWriter fw=new FileWriter(memoFile);
			fw.write("김구라\r\n");
			fw.write("\t해골\r\n");
			fw.write("원숭이");
			fw.flush();
			fw.close();
			System.out.println("파일에 문자열을 저장 했습니다.");
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}









