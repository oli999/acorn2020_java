package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {
	public static void main(String[] args) {
		// 1byte 처리 스트림
		InputStream is=System.in;
		// 2byte 처리 스트림
		InputStreamReader isr=new InputStreamReader(is);
		try {
			System.out.println("입력:");
			//한글의 코드값도 읽어들일수 있다. (2 byte 처리)
			int code=isr.read();
			System.out.println("code:"+code);
			char ch=(char)code;
			System.out.println("char:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}







