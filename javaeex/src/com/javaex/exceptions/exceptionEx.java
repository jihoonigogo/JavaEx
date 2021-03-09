package com.javaex.exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionEx {

	public static void main(String[] args) {

		//arithExceptionEx();
		//arryExceptionEx();
		//nullPointerExceptionEx();
		throwExceptionEx();
		System.out.println("End of Code ");
	}
	
	private static void throwExceptionEx() {
		//호출된 메서드 내에서 발생한 예외는 가급적
		//호출한 메서드 내에서 예외처리를 해주는 것이 좋다 .
		ThrowsExcept except = new ThrowsExcept();
		//checked  예외처리
	//	try {
			//except.executeChecked(); //checked 예외.
	//	}catch(IOException e) {
	//		System.err.println("호출된 메서드에서 checked 예외발생");
	//		System.err.println("메세지 :"+ e.getMessage());
	//	}
		
		//unchecked 예외 처리 예제
		try{
			//except.executeRuntime();
			except.divide(100, 0);
		}catch (CustomArithmeticException e) {
		    System.err.println("예외 메세지 : "  + e. getMessage());
		    System.err.println("나누어 지는 수 : "+ e.getNum1());
		    System.err.println("나누는 수 : "+ e.getNum2());	
		}catch(RuntimeException e) { // 런타임 익셉션은 모든 unchecked 의 조상 ?
			//호출된 메서드 내에서 발생한 예외를 이곳에서 위임받아 처리한다.
			System.err.println("호출된 메서드에서 unchecked 예외 발생 !   ");
			System.err.println("메세지 : " + e.getMessage());
		} catch( Exception e ) {
			//혹시라도 남아있을수 있는 예외를 위해서 캐치하자.
			e.printStackTrace();
		}finally{
			System.out.println("예외 처리 완료");
		}
	}
	private static void nullPointerExceptionEx() {
		//가장 흔하고 위험한 오류 
		String str =  new String("Hello");
		str = null; // 참조가 해제
		try {
		System.out.println(str.toString()); //nullpointerexception 발생
		}catch(NullPointerException e) {
			System.err.println("에러 메세지 :"+ e.getMessage());
			System.err.println("널 입니다.");
		}
		}
	
	
	private static void arryExceptionEx() {
		int[] intArray = new int[]	{3,6,9};
		
		try {
		System.out.println(intArray[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("에러 메세지 : "+ e.getMessage());
			System.err.println("발생 메세지 : "+ e.getClass().getSimpleName());
		}//finally 블록은 없을 수도 있다.
	}
	private static void arithExceptionEx() {
		//키보드로부터 정수를 입력
		//100을 입력받은 수로 나누어보자
		
		double result = 0;
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		
		try {
		//예외 발생 가능 코드
		num = scanner.nextInt()	; // 예외발생 가능 코드 
		result = 100/num;
		}catch(InputMismatchException e) {
			System.err.println("정수가 아닙니다.");
		}catch(ArithmeticException e) {
			//구체적인 예외를 위쪽에.
			System.err.println("0으로는 나눌 수 없어요");
			System.err.println("메세지 : " + e.getMessage());

		}catch(Exception e)	{ // 모든 예외를 처리할 수 있음 최상위 예외 클래스.
			//구체적인 예외 외 일반적인 예외를 ..
			e.printStackTrace();// 예외코드 전체를 출력 
		}finally {
			System.out.println("Finally"); // 예외 여부에 관계 없이 항상 실행
		}
		
		System.out.println("결과 : " + result);
		scanner.close();
	}
}
