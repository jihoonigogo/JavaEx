package com.javaex.io.ByteStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	// 바이트 기반 스트림은 기본 데이터 타입을(boolean int ...)  저장할 수 있다 .
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "primitives.txt";
	
	public static void main(String[] args) {
		//exportPrimitives();
		importPrimitives();
		
	}
	private static void importPrimitives() {
		InputStream is = null;
		DataInputStream dis = null	;
		try {
			is = new FileInputStream(filename); 
			dis = new DataInputStream(is);
			
			for(int i =0; i<2 ; i++) { //i쌍의 데이터 불러오기 홍길동김길동
				//순서대로 타입을 불러와야함, 기본 데이터타입별 변수를 정해서 값을 넣어줌.
				String s = dis.readUTF(); //문자열불러오기
				Boolean b = dis.readBoolean(); // 불린불러오기
				int val = dis.readInt();
				float f = dis.readFloat();
				
				//double d = dis.readDouble(); 에러.
				System.out.printf("%s , %b , %d , %f%n",s,b,val,f);
			}
			}catch(FileNotFoundException e) {
				System.err.println("파일을 찾지 못했습니다");
			}catch(IOException e ) {
				e.printStackTrace();
			}finally {
				try {
					dis.close();
				}catch(Exception e) {
					
				}
			}
		}
	

	private static void exportPrimitives() {
		//출력 메인
		OutputStream os = null;
		//출력 보조
		DataOutputStream dos = null;
		try {
			os = new FileOutputStream(filename);
			dos = new DataOutputStream(os);
			
			//기본 타입 출력  문자열 불린 정수 플롯
			dos.writeUTF("홍길동"); // primitives 파일에 문자열을 출력한다.
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.3f);
			
			dos.writeUTF("김길동");
			dos.writeBoolean(false);
			dos.writeInt(30);
			dos.writeFloat(99.9f);
			
			System.out.println("데이터 출련 완료");
		}catch (IOException e) {
			
		}finally {
			try {
				dos.close();
			}catch(Exception e) {
				
			}
		}
	}
}
