package problem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PhoneDB {
	FileReader fr;
	BufferedReader br;
	File f;
	String s;
	public void read() throws IOException {
		br = new BufferedReader(new FileReader(f));
		while((s = br.readLine()) != null ) {
			String[] temp = s.split(",");
			System.out.println("이름:"+temp[0]+" 휴대폰:"+temp[1]+" 회사:"+temp[2]);
		}
	}
	private String getpath() {
		// TODO Auto-generated method stub
		return null;
	}
}
