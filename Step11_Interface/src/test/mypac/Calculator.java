package test.mypac;

@FunctionalInterface
public interface Calculator {
	//인자로 전달되는 두 실수값을 연산해서 결과를 리턴해주는 메소드 
	public double exec(double a, double b);
}
