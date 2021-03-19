package problem;

import java.io.IOException;

public class PhoneDBApp {

	public static void main(String[] args) throws IOException {
		PhoneDB p = new PhoneDB();
		
		String b = PhoneDB.class.getResource("").getPath();
		System.out.println(b);
		b = java.net.URLDecoder.decode(b, "UTF-8");
		System.out.println(b);
		
	}

}
