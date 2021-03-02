package com.javaex.basic;



// 클래스 임포트
import java.util.Scanner;
public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //consoleOutEx();
     consoleInputEx();
	}
	//콘솔 입력
	private static void consoleInputEx() {
		
		Scanner scanner = new Scanner(System.in); // 표준 입력방식(키보드)
		System.out.println("이름은 ?");
		String name = scanner.next(); // 문자열 입력 받기
		System.out.println("나이는 ?");
		int age = scanner.nextInt(); // 정수값 입력 받기 
		System.out.println("성별은 ?");
		String haha = scanner.next();
		

		System.out.println("당신의 이름은" + name +"이고 나이는" + age + "이며 성별은 " + haha +"입니다");
		
		//scanner 라는 자원을 사용한 이후이므로 닫아줘야함. 다른 시스템이 이 자원을 사용하지 못하기 떄문 ?
		
		scanner.close();
		
		
		
		
		
	}
	
	
	
    //콘손출력 
	private static void consoleOutEx() {
		//표준 출력 (stdout) : System.out
		//표춘 에러 (stderr) : System.err
		//표춘 입력 : System.in
		
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

		// Scanner 클래스  Scanner scanner = new Scanner(System.in); 클래스가 스스로를 인스턴스 ? 
		//import java.util.Scanner; (알트 쉬프트 o) 입력값은 대개 정수int  실수double 문자열string 단 앞에 next가 붙음 .
		// 예를 들어 int nextInt(); , double next Double(); 이들을 입력소스라고 함.
		// int value = scanner.nextInt(); 의 경우 다음에 입력되는 정수값을 value라는 메서드? 인스턴스에 입력.
		
	}
	
	
}
