package test.main;

import java.util.Scanner;
/*
 *  RuntimeException 을 상속 받은 Exception 종류는
 *  try ~ catch 블럭으로 묶어주지 않아도 문법 오류가 발생하지 않는다.
 *  따라서 필요시 선택적으로 try ~ catch 블럭으로 묶어주면 된다. 
 */
public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("나눌수 입력:");
		String inputNum1=scan.nextLine();
		System.out.println("나누어 지는수 입력:");
		String inputNum2=scan.nextLine();
		try {
			int num1=Integer.parseInt(inputNum1);
			int num2=Integer.parseInt(inputNum2);
			
			int result=num2/num1; //몫
			int result2=num2%num1; //나머지
			System.out.println(num2+" 를 "+num1+" 으로 나눈 몫 :"+result);
			System.out.println(num2+" 를 "+num1+" 으로 나눈 나머지:"+result2);
		}catch(NumberFormatException nfe) {
			System.out.println("숫자 형식으로 입력 하세요.");
		}catch(ArithmeticException ae) {
			System.out.println("어떤 수를 0으로 나눌수는 없어요");
		}catch(Exception e) {
			System.out.println("Exception 이 발생했습니다.");
		}finally {//예외가 발생 하던 안하던 반드시 실행이 보장되는 블럭
			System.out.println("무언가 마무리 작업을 해요~");
		}
		
		System.out.println("main  메소드가 정상 종료 됩니다.");
	}
}










