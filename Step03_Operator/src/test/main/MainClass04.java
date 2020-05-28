package test.main;
/*
 *  4. 논리연산자 테스트
 */
public class MainClass04 {
	public static void main(String[] args) {
		// or 연산 
		boolean result1 = false || false; //false
		boolean result2 = false || true; //true
		boolean result3 = true || false; //true
		boolean result4 = true || true; //true
		// and 연산
		boolean result5 = false && false; //false
		boolean result6 = false && true; //false
		boolean result7 = true && false; //false
		boolean result8 = true && true; //true
		// not 연산
		boolean result9 = !true; //false
		boolean result19 = !false; //true
		
		boolean isRun=false;
		if(isRun != true){
			System.out.println("달리지 않아요");
		}
		
		if(!isRun){
			System.out.println("달리지 않아요2");
		}
	}	
}




















