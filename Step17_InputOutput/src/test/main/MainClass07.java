package test.main;

import java.io.File;

public class MainClass07 {
	public static void main(String[] args) {
		File myFile=new File("c:/");
		//폴더 혹은 파일의 목록을 String 배열로 얻어내기 
		String[] names=myFile.list();
		//목록 문자열을 콘솔에 출력하기
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
}






