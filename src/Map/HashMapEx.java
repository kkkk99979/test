package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		HashMap<String,String> map2 = new HashMap<>();//new에서 타입 파라미터 생략가능
		HashMap<String,String> map3 = new HashMap<>(map2);//map1의 모든 값을 가진 HashMap생성
		HashMap<String,String> map4 = new HashMap<>(10);//초기 용량(capacity)지정
		HashMap<String,String> map5 = new HashMap<>(10, 0.7f);//초기 capacity,load factor지정
		HashMap<String,String> map6 = new HashMap<String,String>(){{
			put("a","b");
			put("b","c");
			put("c","d");
			put("c","f");
		}};
		HashMap<String,String> map1 = map6;
		
		map.put(1,"사과");
		map.put(2, "바나나");
		map.put(3, "포도");
		map2.put("apple","수박");
		map2.put("banana","바나나");
		map2.put("melon","멜론");
		System.out.println(map2);
		System.out.println("-----------------------------");
		map2.put("apple","사과");
		System.out.println(map2);
		System.out.println(map2.size());
		System.out.println("-----------------------------");
		map6.remove("a");
		System.out.println(map);
		System.out.println(map6);
		System.out.println("-----------------------------");
		
//		for (Entry<Integer, String> entry : map.entrySet()) {
//		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
//		}
//		for (int s :map.keySet()) {
//			System.out.println("[Key]:" + s + " [Value]:" + map.get(s));
//		}
		Iterator<Entry<String,String>> temp = map1.entrySet().iterator();
		System.out.println(temp.hasNext());
		while(temp.hasNext()) {
			HashMap.Entry<String,String> temp1 = temp.next();
			System.out.println("키:"+temp1.getKey()+" 값:"+temp1.getValue());
		}
	}

}
