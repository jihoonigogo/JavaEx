package com.javaex.io.ByteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "img.jpg";
	static final String target = rootPath + "img_buffered_copy.jpg";
	
	public static void main(String[] args) {
		//메인 스트림
		InputStream is = null;
		OutputStream os = null;
		
		//보조스트림
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			is = new FileInputStream(source); 
			os = new FileOutputStream(target);
			
			bis = new BufferedInputStream(is); // 인풋스트림으로부터 값을 받아 부가기능.
			bos = new BufferedOutputStream(os); 
			
			//버퍼기반 이므로 버퍼를 생성해야함
			byte[] data = new byte[1024]	; // 1KB
			int size = 0;  // 받아온 데이터의 리턴은 데이터의 길이 .
			
			System.out.println( " 복사 시작");
			while((size = bis.read(data)) != -1) {
				System.out.println(size+ "바이트 복사했습니다.");
				bos.write(data);
			}
			System.out.println( " 복사 완료");
		}catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못했습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//뭘 닫아야할까 ? 생각해보자 
				//보조스트림은 주 스트림으로부터 입출력 기능을 수행하므로 
				//보조 스트림을 닫으면 주 스트림도 닫히게 된다.  
				//주스트림을 닫을 필요는 없다 하지만 닫으면 어케 될까 ?
				bis.close();
				bis.close();
			}catch(Exception e){
				
			}
		}
	}

}
