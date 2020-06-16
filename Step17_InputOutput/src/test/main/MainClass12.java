package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass12 {
	public static void main(String[] args) {
		//문자열을 저장할 파일을 만들기위한 File 객체
		File memoFile=new File("c:/acorn2020/myFolder/memo.txt");
		try {
			//실제로 파일이 존재하는지 여부 
			boolean isExist=memoFile.exists();
			if(!isExist) {//존재하지 않으면 
				//파일을 실제로 만든다.
				memoFile.createNewFile();
			}
			//파일에 문자열을 출력할 객체
			FileWriter fw=new FileWriter(memoFile);
			fw.write("하나");
			fw.write("\r\n");//개행기호
			fw.write("두울");
			fw.write("\r\n");//개행기호
			fw.write("세엣");
			fw.flush();
			fw.close(); // .close()  시점에 파일이 만들어 진다.
			System.out.println("파일에 문자열을 저장 했습니다.");
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}









