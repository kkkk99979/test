package IOStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedOutputStreamEx {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedOutputStream bu = null;
		Test temp = new Test();
		try {
			System.out.print("입력>> ");
			temp.setAccount(sc.nextLine());
			System.out.println(temp.showInfo());
			bu = new BufferedOutputStream(new FileOutputStream("C:\\Users\\1강의실\\Desktop\\"+temp.getAccount()+".asd"));
			bu.write(temp.showInfo().getBytes());
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			bu.close();
			sc.close();
		}

	}

}
