package com.javaex.network.echoserver5;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import com.javaex.network.echoserver.ServerThread;

public class Server {

	public static void main(String[] args) {
		//	서버 소켓
		ServerSocket serverSocket = null;
		
		try {
			////메인 스레드의 역할.
			//	바인드 - IP 연결
			serverSocket = new ServerSocket();
			InetSocketAddress ips = new InetSocketAddress("0.0.0.0", 10000);
			serverSocket.bind(ips);
			
			//	시작 메시지
			System.out.println("<서버 시작>");
			System.out.println("SERVER: [연결을 기다립니다.]");
			
			//연결 대기
			while(true) {
				Socket socket = serverSocket.accept();
				Thread thread = new ServerThread(socket);
				thread.start();
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}