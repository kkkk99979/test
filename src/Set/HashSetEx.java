package Set;

import java.util.*;


public class HashSetEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		HashSet<Integer>set1 = new HashSet<Integer>();
//		HashSet<Integer>set2 = new HashSet<>();
//		HashSet<Integer>set3 = new HashSet<Integer>(set1);
//		HashSet<Integer>set4 = new HashSet<Integer>(10);
//		HashSet<Integer>set5 = new HashSet<Integer>(10,0.7f);
//		HashSet<Integer>set6 = new HashSet<Integer>(Arrays.asList(5,9,4,3,7,8,2));
//		
//		
//		
//		System.out.println(set6);
//
//		Iterator temp = set6.iterator();
//		
//		while(temp.hasNext()) {
//			System.out.println(temp.next());
//		}
//		
		HashSet<String> setTemp = new HashSet<>();
		setTemp.add("apple");
		setTemp.add("banana");
		setTemp.add("mango");
		System.out.print("추가할 데이터 입력:");
		String temp = sc.next();
		if (setTemp.add(temp)) {
			System.out.println("데이터 입력 성공");
		} else {
			System.out.println("중복 객체가 존재합니다.");
		}
		System.out.print("삭제할 데이터 입력:");
		temp = sc.next();
		if (setTemp.remove(temp)) {
			System.out.println("데이터 삭제 성공");
		} else {
			System.out.println("데이터가 없습니다.");
		}
		Iterator temp1 = setTemp.iterator();
		while (temp1.hasNext()) {
			System.out.println(temp1.next());
		}
		System.out.println(temp1);
		System.out.println(setTemp);
	}

}
