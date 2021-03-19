import java.util.ArrayList;
import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6, 7, 123, 42));

		list.add(123);
		list.add(333);
		list.add(3211);
		list.add(1, 20);

		for (Integer i: list) {
			System.out.println(i);
		}
		System.out.println(list.contains(9));
		System.out.println(list.indexOf(4));
	}

}
