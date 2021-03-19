package TCPServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEx {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.0.28", 10001));
			
			System.out.println("[서버] 연결 대기중 " + serverSocket.getInetAddress());
			Socket socket = serverSocket.accept();
			InetSocketAddress i = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[서버] 연결됨 from " + i.getHostName() + " : "+ i.getPort());
			//출력
			OutputStream os = socket.getOutputStream();
			String data1 = "연결 성공";
			os.write( data1.getBytes( "UTF-8" ) );
			os.flush();
			//입력
			InputStream is = socket.getInputStream();
			while( true ) {
			byte[] buffer = new byte[128];
			int readByteCount = is.read( buffer );
			if( readByteCount < 0 ) {
			System.out.println( "\n[서버] 클라이언트로부터 연결끊김" );
			is.close();	
			socket.close();
			break;
			}
			String data = new String( buffer, 0 ,readByteCount, "UTF-8" );
			System.out.print( data );
			}
		}  catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(serverSocket != null && serverSocket.isClosed() == false) {
				try {
					serverSocket.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	
	}

}
