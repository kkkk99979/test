package ExceptionEx;

public class NullPointException {

	public static void main(String[] args) {
		String str = new String("hello");


		try {
			System.out.println(str.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("끝");
	}

}
