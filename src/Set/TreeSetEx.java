package Set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>(Arrays.asList(4, 2, 3, 5, 8, 9, 9));// 초기값 지정
		System.out.println(set); // 전체출력 [2,3,4]
		System.out.println(set.first());// 최소값 출력
		System.out.println(set.last());// 최대값 출력
		System.out.println(set.higher(3));// 입력값보다 큰 데이터중 최소값 출력 없으면 null
		System.out.println(set.lower(3));// 입력값보다 작은 데이터중 최대값 출력 없으면 null
		System.out.println("----------------------");
		
		Iterator iter = set.iterator(); // Iterator 사용
		while (iter.hasNext()) {// 값이 있으면 true 없으면 false
			System.out.printf("%d\t",iter.next());

		}

	}
}
