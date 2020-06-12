package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass10 {
	public static void main(String[] args) {
		Map<String, Object> map1=new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("isMan", true);
		map1.put("phone", "010-1111-2222");
		
		//이름을 참조 하려면?
		String name=(String)map1.get("name");
		//전화 번호를 수정하려면?
		map1.put("phone", "010-3333-4444"); //동일한 key 값으로 다시 담는다.
		// "isMan" 이라는 키값이 존재 하는지 여부?
		boolean isExist=map1.containsKey("isMan");
		// "num" 이라는 키값으로 저장된값 삭제
		map1.remove("num");
		// 전체 삭제
		map1.clear();
	}
}







