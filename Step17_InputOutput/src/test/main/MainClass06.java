package test.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		
		OutputStream os=ps;
		OutputStreamWriter osw=new OutputStreamWriter(os);
		BufferedWriter bw=new BufferedWriter(osw);	
		try {
			bw.write("하나");
			bw.newLine(); //개행 기호 출력
			bw.write("두울");
			bw.newLine();
			bw.write("세엣");
			bw.flush();
			/*
			 *  전체 출력된 내용 :  하나\r\n두울\r\n세엣
			 *  
			 *  위의 내용에서 이클립스의 콘솔창은 \r\n 을 출력하지 않고 해석을 해서 아래와 같이 출력한다.
			 *  
			 *  하나
			 *  두울
			 *  세엣 
			 */
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}










