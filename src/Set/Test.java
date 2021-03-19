package Set;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		HashSet<Integer> lotto3 = new HashSet<Integer>();
		HashSet<Integer> lotto4 = new HashSet<Integer>();
		boolean run = true;
		while (run) {
			switch (lotto4.size()) {
			case 6: {
				run = false;
				break;
			}
			default: {
				lotto4.add((int) ((Math.random() * 45) + 1));
			}
			}
		}
		for (;;) {
			lotto3.add((int) (Math.random() * 45) + 1);
			if (lotto3.size() == 6) {
				break;
			}
		}
		while (lotto.size() < 6) {
			lotto.add((int) (Math.random() * 45) + 1);
		}
		for (int i = 0; i < 6; i++) {
			int temp = (int) (Math.random() * 45) + 1;
			if (lotto2.add(temp) == true) {
			} else {
				i--;
			}
		}
		System.out.println(lotto);
		System.out.println(lotto2);
		System.out.println(lotto3);
		System.out.println(lotto4);
	}

}
