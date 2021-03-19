import java.util.ArrayList;

public class ArrayListex2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i =97;i<=122;i++) {
			list.add(Character.toString((char)i));
		}
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
	