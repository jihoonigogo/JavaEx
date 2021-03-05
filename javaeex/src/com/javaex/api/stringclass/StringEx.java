package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
	//	stringBasic();
		usefulMethods();
	}
	
	 	private static void 		usefulMethods() {
	 		String source = "Java Programming, JavaScript Programming";
	 		System.out.println("원본:" + source);
	 		
	 		//길이 출력 , 인덱스 접근
	 		System.out.println("length"+ source.length());
	 		System.out.println("5번 인덱스의 글자 :"+source.charAt(5));
	 		
	 		//변환 메서드
	 		System.out.println("모두 소문자로 : "+ source.toLowerCase());
	 		System.out.println("모두 대문자로 : "+ source.toUpperCase());

	 		//검색 메서드 ( 중요 )
	 		
	 		int index = 0;
	 		index = source.indexOf("Java");
	 		System.out.println("첫 번째 검색"+ index);
	 		
	 		index +="Java".length(); //인덱스를 4글자 뒤로 이동
	 		index = source.indexOf("Java",index); //검색시작인덱스
	 		System.out.println("두 번째 검색"+ index);
	 		index = source.indexOf("Java",index + "Java".length());
	 		System.out.println("세 번째 검색"+ index); //검색할 내용이 없을때 -1을 반환함

	 		index = source.lastIndexOf("Java"); //음수값이 나오진 않음.
	 		System.out.println("역방향 첫 번째 검색"+ index);
	 		
	 		//추출
	 		//1번 방법 
	 		System.out.println("18번 인덱스부터 끝까지"+ source.substring(18));	 	
	 		//2번 방법
	 		System.out.println("18번 인덱스부터 22번 까지"+ source.substring(18,23));

	 		//치환
	 		System.out.println("Replace:"+ source.replace("Java", "Python"));
	 		
	 		//변환, 치환, 추출이 수행되어도 원본은 멀쩡함.	 		
	 		System.out.println("원본:" + source); //문자열은 불변객체
	 		
	 		// Whitespace 제거 
	 		String s6 = "            Hello       ";
	 		System.out.println("공백을 제거한다면 : ["+ s6.trim()+"]");
	 		
	 		//문자열 분절
	 		String words[] = source.split(" "); // 공백을 기준으로  문자열을 분리해서 배열로 변경함.
	 		
	 		for(String data : words) {
	 			System.out.println("chunk:"+ data);
	 		}
	 		
	 		//문자열비교 
	 		// 0 = 같다  , 1 = > , -1 = <
	 		System.out.println("ABC".compareTo("ABD"));
	 		System.out.println("ABC".compareTo("ABC"));

	 	}
	
		private static void stringBasic() {
			String s1 = "java"; //리터럴
			String s2 = new String("Java");
			String s3 = "java"; //리터럴
			
			System.out .println( "s1 과 s2가 같은 객체 ?"+ (s1==s2));
			System.out .println( "s1 과 s3가 같은 객체 ?"+ (s1==s3));
		//	System.out .println( "s2 과 s3가 같은 객체 ?"+ (s2==s3));

			char letters[] = {'J','a','v','a'};
			String s4 =new String(letters);
			
			String s5 = String.valueOf(3.14159f);
			System.out.println("s5 = "+ s5);
			}
	}


