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

		Scanner scanner = null; // 스캐너 초기화
		File f = new File(filename); //객체 f는 filename이라는 파일 타입?
		
		try {
			scanner = new Scanner(f);// 스캐너 데이터 타입을 참조하는 scanner는 스캐너 클래스를 인스턴스화한 객체로 filename을 참조하는 file 타입 객체 f를 스캔한다 ?
			
			String name; //filename에 입력된 정보를 출력하기 위한 문자열 변수 
			float height;//filename에 입력된 정보를 출력하기 위한 실수형 변수
			float weight;//filename에 입력된 정보를 출력하기 위한 실수형 변수
			
			// 스캐너의 EOS 체크 end of stream.
			while (scanner.hasNextLine()) {
				name = scanner.next(); // 분절된 데이터의 첫 스트링  //분절은 어디서 이루어 졌는가 ? tokenizer가 아닌데 누가 분절을 체크하는지 ? 문자혈 데이터를  저장한 변수 
				height = scanner.nextFloat();//filename에서 실수형 데이터 를 저장한 변수
				weight = scanner.nextFloat(); //filename에서 실수형 데이터 를 저장한 변수  ,값을 정확히 저장한게 아니라 포맷 순서에 따라 나열한 것 뿐.
				System.out.printf("이름 : %s , 키:%.1f , 체중 :%.1f%n", name,height,weight);
				System.out.printf("이름 : %s , 키:%.1f , 체중 :%.1f%n", name,weight	,height);

				scanner.nextLine(); // ㄴㅏ머지 체크 , Enter를 치기 전까지 쓴 문자열을 모두 리턴한다는 것


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
