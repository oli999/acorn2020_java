package test.main;
/*
 *   [ 연산자 ]
 *   
 *   3. 비교 연산자
 *   
 *   종류 : ==, !=, >, >=, <, <=
 *   
 *   - 비교 연산의 결과는 boolean type 으로 나타난다. 
 */
public class MainClass03 {
	public static void main(String[] args) {
		//양쪽에 있는 값이 같은지 비교
		boolean result1 = 10 == 10; //true
		//양쪽에 있는 값이 다른지 비교
		boolean result2 = 10 != 10; //false
		//왼쪽에 있는 값이 큰지 비교
		boolean result3 = 10 > 100; //false;
		//왼쪽에 있는 값이 크거나 같은지 비교
		boolean result4 = 10 >= 10; //true
		//왼쪽에 있는 값이 작은지 비교
		boolean result5 = 10 < 100; //true
		//왼쪽에 있는 값이 작거나 같은지 비교
		boolean result6 = 10 <= 10; //true	
		
		String name=null;
		
		boolean result7 = name == null; //true
		boolean result8 = name != null; //false
	}
}























