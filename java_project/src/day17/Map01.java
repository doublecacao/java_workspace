package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Map
		 * 	-값을 2개 저장, key / value 값으로 저장
		 * 	-key는 중복불가, value는 중복가능
		 * 	-HashMap을 가장 많이 사용
		 * 
		 * HashMap<String, Integer> map = new HashMap<String, Integer>();
		 * Map은 값이 2개여서 Iterator를 map 자체로는 사용불가
		 * 향상된 For / Iterator => set으로 key값 추출 후 사용
		 * 
		 * list, set => .add()
		 * map => .put() / keySet(), values() => 추출
		 */
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("햄버거", 7000);		//객체명.put(key,value);
		map.put("피자", 15000);
		map.put("음료", 2000);
		System.out.println(map);
		
		System.out.println(map.keySet());	//set	key값 호출
		System.out.println(map.values());	//collection 	value값 호출
		
		
		
		//key가 햄버거인 가격을 출력
		System.out.println(map.get("햄버거"));//객체명.get(key값) => value값 호출
		
		
		
		//향상된 for문으로 출력
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp));	//key : value 형식으로 출력
		}
		
		
		
		//Iterator 출력
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp+":"+map.get(tmp));
		}
		System.out.println(map.entrySet());
		
		
		
		//entrySet 구성시 : getKey, getValue로 출력
		for(Map.Entry<String, Integer> tmp:map.entrySet()) {
			System.out.println(tmp.getKey()+":"+tmp.getValue());
		}
	}

}
