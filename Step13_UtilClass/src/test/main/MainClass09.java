package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 *  3 명의 회원정보 (번호, 이름, 주소) 를 HashMap 객체에 담고
		 *  
		 *  HashMap 객체의 참조값을 ArrayList 객체에 순서대로 담아 보세요.
		 */
		Map<String, Object> map1=new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("addr", "노량진");
		
		Map<String, Object> map2=new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "해골");
		map2.put("addr", "노량진");
		
		Map<String, Object> map3=new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "원숭이");
		map3.put("addr", "동물원");
		
		List<Map<String, Object>> list=new ArrayList<>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		// 해보세요
		for(Map<String, Object> tmp: list) {
			
			int num=(int)tmp.get("num");
			String name=(String)tmp.get("name");
			String addr=(String)tmp.get("addr");
			
			System.out.println(num+" | "+name+" | "+addr);
		}
		
		//참조 연습
		List<Map<String, Object>> a=list;
		Map<String, Object> b=list.get(0);
		Object c=list.get(0).get("num");
		Object d=list.get(0).get("name");
		Object e=list.get(0).get("addr");
		int f=(int)list.get(0).get("num");
		String g=(String)list.get(0).get("name");
		String h=(String)list.get(0).get("addr");
		
		int i=((String)list.get(0).get("addr")).length();
	}
}








