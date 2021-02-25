package com.javaex.basic.types;

public class VarEx {

	public static void main(String[] args) {
		//변수 식별자 규정 
		//문자 숫자 $ _ 조합
		//숫자로 시작 불가
		//에약어 x 
		// 관례 : 어겨도 ㅇㅋ.. 하지만 해주면 좋음 
		// 소문자 작성,단어조합의 경우 뒷 단어의 첫글자는 대문자
		//PascalCaseDemoJihoonigogoJavaExDemo
		/* 
		 * 소문자 CamelCase 
		 * SnakeCase 전부 소문자 +언더바
		 * KebalCase 
		 */
		
		int MyAge; // 데이터타입이 int인 공간을 할당받음 (선언)
		MyAge = 29; // 초기화,값을 할당함
		
		System.out.println("내 나이는"+MyAge);
		
		//한번에 여러 변수 선언할때 
		
		int v1 = 10, v2 = 20 , v3 =30;
		
		// 여러 변수에 동시에 같은 값 설정
		
		v1 = v2 = v3 =40;
		
	}

}
