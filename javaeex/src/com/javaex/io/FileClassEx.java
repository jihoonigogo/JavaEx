package com.javaex.io;

import java.io.File;
import java.io.IOException;


//파일 클래스 
//파일의 정보를 확인
//파일과 디렉터리 생성 및 삭제는 할수있지만
//실제 파일의 내용을 기록하는 것은 stream이라는 객체에서 담당한다.


public class FileClassEx {

	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	public static void main(String[] args) {

		//file객체 생성 
		File root = new File(rootPath);//파일이 담겨있는 객체의 주소
		//파일이 존재하는 지 확인
		System.out.println(rootPath + " : " + root.exists()); // 파일이 존재하니 ?
		//a 만약 디렉터리가 존재하지 않는다면 
		if(!root.exists()) {
			root.mkdir();
		}
		
		printInfo(root);
		
		//새로운 파일을 생성하고자 할때 
		File file = new File(rootPath + "\\myFile.txt\\");
		System.out.println("myFile.txt 생성");
		if(!file.exists()) {
			try{
				file.createNewFile();// 객체 생성이후 비로소 생성되는것.
			}catch(IOException e) {
				System.err.println("파일을 만들지 못했습니다.");
			}
		}
		printInfo(root);
		
		//파일 삭제 
		System.out.println("=> myFile.txt 삭제");
		file.delete();
		printInfo(root);
	}
	private static void printInfo(File file) {
		System.out.println("--------------");
		//file - > directory - > 파일목록
		//file -> file -> 파일정보
		if(file.isDirectory()) {
			System.out.println("Directory : " + file.getName());
			//파일 목록 
			File[] files = file.listFiles();
			//파일목록 출력 
			for(File f : files) {
				System.out.print(f.isDirectory() ? "d": "f ");
				System.out.println(f.getName() + ":"+ f.length());
			}}else {
				System.out.println("File : " + file.getName()+ ": "+ file.length());
			}
		System.out.println("--------------");
		}
	}
