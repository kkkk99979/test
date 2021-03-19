package LinkedList;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.addFirst(1);
		list.addLast(2);
		list.add(3);
		list.add(1, 30);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
	}
	
		
		LinkedList<Point> plist =new LinkedList<Point>();
		
		plist.add(new Point(1,1));
		plist.add(new Point(3,5));
		System.out.println(plist.get(0));
		System.out.println(plist.get(1));
	}
}