package com.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLocalIp();
		printServerIp("www.naver.com");//
		printServerIp("www.google.com");//
		//
		
	}
	private static void printServerIp(String hostname) {
		try {
			InetAddress[] adrs = InetAddress.getAllByName(hostname);
			for(InetAddress remote : adrs) {
				System.out.println(hostname + " : ip :" + remote.getHostAddress());
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	//내 컴퓨터가 할당받은 ip(local host)
	private static void printLocalIp() { 
		try {
			// 내 ip주소 확인 
			InetAddress local = InetAddress.getLocalHost();
				System.out.println( "Local IP : " + local.getHostAddress());					
		}catch ( UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
