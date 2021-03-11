package com.javaex.network.echoserver;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		//1.서버 소켓을 만들자
		ServerSocket serverSocket = null;
		try {
			//2.바인드 ip 연결
			serverSocket = new ServerSocket();
			InetSocketAddress ips = new InetSocketAddress("0.0.0.0",10000); //10000은 포트번호, 포트충돌을 막기위해
			serverSocket.bind(ips);
			
			//시작메세지 
			System.out.println("<서버 시작>");
			System.out.println("SERVER : [연결을 기다립니다]");
			
			//연결대기
			Socket socket = serverSocket.accept();
			
			//클라이언트 정보 확인
			InetSocketAddress socketAddress =
					(InetSocketAddress)socket.getRemoteSocketAddress(); // 캐스팅이유
			System.out.println("SERVER : [클라이언트 연결되었습니다]");
			System.out.println("     클라이어트:"+ socketAddress.getAddress()
			+ ":"+ socketAddress.getPort());
			
			//후처리
			System.out.println("SERVER : [연결을 종료합니다]");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				serverSocket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
