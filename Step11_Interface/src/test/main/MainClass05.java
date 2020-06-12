package test.main;

import test.mypac.Joinner;

public class MainClass05 {
	public static void main(String[] args) {
		Joinner j1=new Joinner() {
			@Override
			public String join(String first, String second) {
				return first+second;
			}
		};
		String result1=j1.join("김", "구라");
		
		Joinner j2=(first, second)->{ 
			return first+second; 
		};
		String result2=j2.join("해", "골");
		
		Joinner j3=(first, second)->first+second;
		String result3=j3.join("원", "숭이");
	}
}






