package IOStream;

import java.io.File;
import java.io.FileReader;

public class InputStreamEx {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\1강의실\\Desktop\\test.asd");
			FileReader file_reader = new FileReader(file);
			int temp = 0;
			while((temp = file_reader.read()) != -1) {
				System.out.print((char)temp);
			}
			file_reader.close();
		}	catch (Exception e) {
			e.getStackTrace();
		}

	}

}
