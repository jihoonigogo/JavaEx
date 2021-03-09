package com.javaex.exceptions;

import java.io.IOException;

public class ThrowsExcept {

	public  void executeChecked() 
			throws IOException{ //안쓰면 컴파일 내부 발생 예외를 호출한 메서드에서 처리할 수 있또록 
		System.err.println("강제 체크드 예외 발생");
		//강제로 예외발생
		throw new IOException("강제 예외"); // throw는 강제예외를 만드는 키워드임 
		//IOException은 checked exception 이므로 반드시 예외처리필요
		//하지만 이곳에서 예외처리를 ㅏ지 않을것.
	}
	public  void executeRuntime() {
		System.err.println("런타임 예외");
		throw new RuntimeException("런타임 익셉션"); //checked 가 아님. 예외처리 강요하지 않음. 
	}
	
	public double divide(int num1, int num2) {
		double result ;
		try{
			result = num1 / num2;
		}catch(ArithmeticException e) {
			//예외 전환: 보다 구체적인 예외로 전환하는 것.
			throw new CustomArithmeticException("사용자 정의 Exception",num1,num2);
			//System.err.println()
		}
		return result;
}
}

