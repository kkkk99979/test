package IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamEx {

	public static void main(String[] args) throws IOException {
		try {
			String filepath = "C:/Users/1강의실/Desktop/Test.asd";
			FileInputStream fs = null;
			
			fs = new FileInputStream(filepath);
			byte[] temp = new byte[fs.available()];
			while (fs.read(temp) != -1)  {}
				System.out.print(new String(temp));
				fs.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}

}


