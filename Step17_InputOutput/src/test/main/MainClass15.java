package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass15 {
	public static void main(String[] args) {
		File memoFile=new File("c:/acorn202104/myFolder/memo.txt");
		//필요한 객체의 참조값을 담을 지역 변수를 미리 만든다.
		FileReader fr=null;
		BufferedReader br=null;
		try {
			if(!memoFile.exists()) {
				System.out.println("파일이 존재 하지 않습니다.");
				return; //메소드 끝내기 
			}
			//파일에서 문자열을 읽어들일 객체의 참조값을 미리 만들어둔 지역 변수에 담는다.
			fr=new FileReader(memoFile);
			br=new BufferedReader(fr);
			while(true) {
				//반복문 돌면서 문자열을 줄단위로(개행기호 기준) 읽어낸다.
				String line=br.readLine();
				if(line==null) {//더이상 읽을 문자열이 없으면
					break;//반복문 탈출
				}
				//읽은 문자열 출력하기 
				System.out.println(line);
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}finally { //예외가 발생하던 안하던 반드시 실행이 보장되는 블럭 
			//마무리 작업을 한다 (보통 열었던 스트림 객체를 닫는 작업을 한다)
			try {
				if(fr!=null)fr.close();
				if(br!=null)br.close();
			} catch (Exception e) {}
		}
	}
}




