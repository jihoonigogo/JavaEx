package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "last-leaf.txt";
	static final String target = rootPath + "last-leaf-filtered.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//메인스트림 
		Reader reader = null;
		Writer writer	= null;
		
		//보조스트림
		BufferedReader br = null;
		BufferedWriter bw = null;
	
		try {
			reader = new FileReader(source);
			writer = new FileWriter(target);
		
			br = new BufferedReader(reader);
			bw = new BufferedWriter(writer);
	    //편의기능으로 한줄 단위로 입출력할 수 있다.
		String line  = null;
		System.out.println("");
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}catch(FileNotFoundException e) {
		System.err.println("파일을 찾지 못했ㅇ요");
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		try {
			br.close(); // 보조스트림을 닫으면 주스트림도 닫힌다.
			bw.close();
		}catch (Exception e) {
	}
	}
}
	}
