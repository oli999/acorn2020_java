package test.main;
/*
 *  [ 연산자 ]
 *  
 *  4. 논리 연산자
 *  
 *  - boolean type 데이터를 연산 해 주는 연산자 이다.
 *  
 * || : or 연산, 합집합의 개념, 어느 하나라도 true 이면 
 *      결과는 true
 * && : and 연산, 교집합의 개념, 모두 true 일때 결과는 true
 * !  : not 연산, boolean 값을 반전시킨다. 
 *      true => false, false => true 
 */
public class MainClass04 {
	public static void main(String[] args) {
		//or 연산
		boolean result1 = false || false; //false
		boolean result2 = false || true; //true
		boolean result3 = true || false; //true
		boolean result4 = true || true; //true
		
		//and 연산
		boolean result5 = false && false; //false
		boolean result6 = false && true; //false
		boolean result7 = true && false; //false
		boolean result8 = true && true; //true
		
		//not 연산
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




















