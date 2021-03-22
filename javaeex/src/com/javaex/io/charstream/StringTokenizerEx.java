package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
    static final String filename = rootPath + "thieves.txt";
    //static final String target = rootPath + "thieves"
	public static void main(String[] args) {
		//메인 스트림 
		Reader reader = null; // 텍스트라서 리더 가져오기 read는 -1 , readline null
		//보조스트림 
		BufferedReader br = null;
		
	
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			
			String line = null; //한줄씩가져올 문자열 변수 
			
			while((line = br.readLine()) !=	 null) {
			 StringTokenizer st = new StringTokenizer(line,  //분절시킬 문자열
					 ",");//기준으로 삼아 분절시킬 구분자 (명시x = 공백 , 탭 ,개행)
			 while(st.hasMoreTokens()) {//토큰이 더잇어?
				 String token = st.nextToken(); // 토큰을 받고 뒤로이동
				 System.out.print(token + "          ");//받은 토큰을 출력
			 }
			 System.out.println();
			}
		}catch (FileNotFoundException e) {
			System.err.println("표준에러 : 파일을 찾지 못했습니다.");
		}catch(IOException e ) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
