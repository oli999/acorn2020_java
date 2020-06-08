package test.main;

import test.mypac.Calculator;

public class MainClass06 {
	public static void main(String[] args) {
		//Calculator 인터페이스를 람다식으로 구현하기 
		Calculator add=(a, b)->a+b;
		Calculator sub=(a, b)->a-b;
		Calculator multi=(a, b)->a*b;
		Calculator divide=(a, b)->a/b;
		
		double result1=add.exec(10, 20);
		double result2=sub.exec(10, 20);
		double resutl3=multi.exec(10, 20);
		double result4=divide.exec(10, 20);
		
		useCalculator((a, b)->a+b);
		useCalculator((a, b)->a-b);
		useCalculator((a, b)->a*b);
		useCalculator((a, b)->a/b);
	}
	
	public static void useCalculator(Calculator c) {
		System.out.println(c.exec(10, 20));
	}
}






