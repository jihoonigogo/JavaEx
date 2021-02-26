package com.javaex.basic;

public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     consoleOutEx();
	}
    //콘손출력 ?
	private static void consoleOutEx() {
		//표준 출력 (stdout) : System.out
		//표춘 에러 (stderr) : System.err
		//메서드 print -> 출력후 개행안함
		//메서드 println > 출력후 개행함 
		//printf() > 포맷 출력 > string에서함 
		
		System.out.print("hello"); // 개행 안함 
		System.out.println("Java"); // 개행 함
		System.out.println("New line");
		
		//이스케이프 문자 
		// \n 개행 , \t 탭 , \" 따옴표 , \\ 역슬래시
		
		System.out.println("hello \njava");
		System.out.println("hello \t\tjava");
		System.out.println("hello \"java\"");

		String filePath = "D:\\myfolder\\myfile.txt";
		System.out.println(filePath);

		
	}
}
