package Generic;

public class SimpleArrayListApp {

	public static void main(String[] args) {
//		SimpleArrayList list = new SimpleArrayList();
//		
//		list.add("50");
//		list.add("100");
//			
//		Integer value1 = (Integer) list.get(0);
//		Integer value2 = (Integer) list.get(1);
//		
//		System.out.println(value1 + value2);
//		System.out.println(list.get(1));
//		System.out.println(list.get(0));
//		
//		SimpleArrayListForInteger ilist = new SimpleArrayListForInteger();
//		ilist.add(500);
//		ilist.add(2000);
//		System.out.println(ilist.get(0)+ilist.get(1));
//		
//		SimpleArrayListForString slist = new SimpleArrayListForString();
//		slist.add("50");
//		slist.add("200");
//		System.out.println(slist.get(0)+slist.get(1));
//		
		GenericArrayList<Integer> intlist = new GenericArrayList<>();
		
		intlist.add(1);
		intlist.add(2);
		
		int intValue1 = intlist.get(0);
		int intValue2 = intlist.get(1);
		
	//	String Value =  intlist.get(0); // 컴파일에러
		
		System.out.printf("%d,%d",intValue1,intValue2);
	}
}
