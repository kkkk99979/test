import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 20; i++) {
			list.add(i);
		}
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				list.remove(list.indexOf(i));
			}
		}
		for (Integer i : list) {
			System.out.println(i);
		}
	}
}