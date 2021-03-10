package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
    static final String filename = rootPath + "thieves.txt";
    
	public static void main(String[] args) {
		// scanner는 단순 키보드 입력뿐만이 아니라
		//다양한 입력소스로부터 데이터를 입력받는 범용 클래스 

		Scanner scanner = null;
		File f = new File(filename);
		
		try {
			scanner = new Scanner(f);// 파일로부터 받겠다
			
			String name;
			float height;
			float weight;
			
			// 스캐너의 EOS 체크
			while (scanner.hasNextLine()) {
				name = scanner.next(); // 분절된 데이터의 첫 스트링 
				height = scanner.nextFloat();
				weight = scanner.nextFloat();
				System.out.printf("이름 : %s , 키:%.1f , 체중 :%.1f%n", name,height,weight);
				scanner.nextLine(); // ㄴㅏ머지 체크
			}
			
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없어요");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				scanner.close();
			}catch(Exception e){
				
			}
		}
	}

}
