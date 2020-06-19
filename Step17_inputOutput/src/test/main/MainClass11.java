package test.main;

import java.io.File;

public class MainClass11 {
	public static void main(String[] args) {
		//c:/acorn2020/myFolder 에 있는 모든 내용(파일 혹은 폴더) 삭제하기
		
		// c:/acorn2020/myFolder 에 access 할수 있는 파일 객체
		File f1=new File("c:/acorn2020/myFolder");
		// File[] 객체 얻어내기
		File[] files=f1.listFiles();
		// 반복문 돌면서 모두 삭제
		for(File tmp:files) {
			tmp.delete();
		}
		System.out.println("c:/acorn2020/myFolder 안에 있는 내용을 모두 삭제했음");
	}
}









