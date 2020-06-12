package test.mypac;

@FunctionalInterface //  메소드를 하나만 정의 하도록 강제 하는 기능
public interface Joinner {
	//전달 되는 두 문자열을 연결해서 리턴하는 메소드 
	public String join(String first, String second);
}
