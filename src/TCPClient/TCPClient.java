package TCPClient;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		Socket s = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			s = new Socket();
			System.out.println("[클라이언트] 연결 요청");
			s.connect(new InetSocketAddress("192.168.0.28", 10001));
			System.out.println("[클라이언트] 연결 성공");
			OutputStream os = s.getOutputStream();
			while (true) {
				String temp = sc.nextLine();
				if (temp.equals("exit")) {
					String bye = "연결종료";
					os.write(bye.getBytes("UTF-8"));
					os.close();
					break;
				}
				String data = "[클라이언트]" + temp + "\n";
				os.write(data.getBytes("UTF-8"));
				os.flush();
			}
			
		} catch (Exception e) {
			System.out.println("서버연결 실패");
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
