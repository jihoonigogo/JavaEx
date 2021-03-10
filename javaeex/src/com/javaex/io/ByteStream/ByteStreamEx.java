package com.javaex.io.ByteStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteStreamEx {

  public static void main(String[] args) {

		//입력 소스
		byte input[] = {0,1,2,3,4,5,6,7,8,9,10};
		//목적지
		byte output[] = null;
		
		System.out.println("원본 "+ Arrays.toString(input));
		//스트림 열기 try블록 바깥에
		InputStream bis = null; //new ByteArrayStream(input);
		OutputStream bos = null;
		try {
			
		bis = new ByteArrayInputStream(input);
		bos = new ByteArrayOutputStream();
		
		//입력을 위한 변수 
		int data = 0;
		while((data =bis.read()) != -1) {			
			//data = bis.read(); //데이터를 한바이트 읽음
			System.out.println("읽은 데이터 " +data);
			 bos.write(data)	;
		}
		 output = ((ByteArrayOutputStream)bos).toByteArray();
		 System.out.println("출력"+ Arrays.toString(output));
		
		
		} catch (IOException e) {
			//IOE예외처리
			e.printStackTrace();
		}finally {
		try{//if(bos != null)
		bos.close();
		//if(bis!=null)
		bis.close();
		}catch(IOException e	) {
			e.printStackTrace();
		}
		}
	}
}
