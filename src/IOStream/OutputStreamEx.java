package IOStream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class OutputStreamEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp1 = "김재현";
		byte[] temp;
		try {
			for(int i =0;i<3;i++) {
			OutputStream output = new FileOutputStream("C:\\Users\\1강의실\\Desktop\\eclipse/"+temp1+".txt");
			System.out.println("입력");
			String str = sc.nextLine();
			temp= str.getBytes();
				output.write(temp);
			}
		}
		catch ( Exception e) {
			e.getStackTrace();
		}
	}

}
