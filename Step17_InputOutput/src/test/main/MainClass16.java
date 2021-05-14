package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass16 {
	public static void main(String[] args) {
		//필요한 참조값을 담을 지역 변수를 미리 만든다.
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			//파일에서 byte 를 읽어낼 객체 
			fis=new FileInputStream("c:/acorn202104/myFolder/1.jpg");
			//읽어낸 byte 를 출력할 객체 
			fos=new FileOutputStream("c:/acorn202104/myFolder/copied.jpg");
			//반복문 돌면서 읽어내기
			while(true) {
				//1 byte 씩 읽어들인다.
				int data=fis.read();
				System.out.println(data);
				if(data==-1) {//더이상 읽을 데이터가 없으면
					break;//반복문 탈출
				}
				//읽은 1 byte  출력
				fos.write(data);
				fos.flush();
			}
			System.out.println("파일을 성공적으로 복사 했습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			}catch(IOException ie) {}
		}
	}
}







