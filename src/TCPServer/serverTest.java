package TCPServer;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class serverTest {

	public static void main(String[] args) {
		ServerSocket s = null;
		Scanner sc =new Scanner(System.in);
		try {
		s = new ServerSocket();
		s.bind(new InetSocketAddress("192.168.0.28", 10001));
		System.out.println("[서버] 연결 대기중");
		Socket socket =s.accept();
		System.out.println("[서버] 연결됨");
		OutputStream os = socket.getOutputStream();
		String data = "연결 성공";
		os.write(data.getBytes("UTF-8"));
		while(true) {
			String temp = "\n"+sc.nextLine();
			if(temp.equals("exit")) {
				os.close();
				s.close();
				break;
			}
			os.write(temp.getBytes("UTF-8"));
			os.flush();
					}
		} catch (Exception e ) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
