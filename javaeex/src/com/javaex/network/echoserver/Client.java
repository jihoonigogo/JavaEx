package com.javaex.network.echoserver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		 
		Socket socket = null;
		
		try {
			//소켓 객체 만들기
			socket = new Socket();
			
			//시작메세지
			System.out.println("<클라이언트 시작>");
			System.out.println("CLIENT : [연결을 요청합니다]");
			
			//접속시도
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1",10000);//127.0.0.1
			socket.connect(remote);// 원격지 정보 ?
			
			//접속성공
			System.out.println("CLIENT : [서버에 연결되었습니다.]");
			
			//메세지 전송 
			OutputStream os = socket.getOutputStream(); //소켓에서 출력 스트림 획득.
			Writer osw = new OutputStreamWriter(os,"utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			String message = "테스트 메세지";
			bw.write(message);
			System.out.println("CLIENT [전송메세지] :" + message);
			bw.close();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//후처리
			System.out.println("<클라이언트 종료>");
		}catch(ConnectException e) {
			System.err.println("[접속이 거부되었습니다.]");
		}finally {
			try {
				socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
