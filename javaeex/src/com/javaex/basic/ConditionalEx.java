package com.javaex.basic;

import java.util.Scanner;
public class ConditionalEx {

	public static void main(String[] args) {

		//ifEx();
		//ifElse();
		//ifif();
		//ifPractice();
		//switchCase();
		//switchEx2();
		//switchEx3();
		//aaa();
		ifEx4();
	}

	/////////////////////////////////////////////////////////
  private static void ifEx() { // 1. 메서드 ifex 
	  
	  Scanner scanner = new Scanner (System.in); //스캐너 불러옴
	  System.out.println("점수를 입력하시오"); 
	  int score = scanner.nextInt(); //스캐너를 이용한 정수값 입력 설정 
	  if(score >= 60) { // 조건 설정 
		  System.out.println("합격입니다");
	  }else if(score >=40) {
		  System.out.println("불합격입니다");
	  }else {
		  System.out.println("탈락입니다.");
	  }
	  scanner.close();
  } 
  /////////////////////////////////////////////////////////////////////
  private static void ifElse() {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("정수를 입력하세요");
	  int num = scanner.nextInt();
	  if(num >0) {
		  System.out.println("양수 입니다");
	  } else if (num <0) {
		  System.out.println("음수 입니다");
	  } else { 
		  System.out.println("0 입니다");
	  }
	  scanner.close();
  }
///////////////////////////////////////////////////////////////////////////////////////////
  private static void ifif() {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("정수를 입력하세요");
	  int num = scanner.nextInt();
  
 
	  if (num == 0){
		  System.out.println("0입니다");
	  }else {
		  if(num> 0) { 
			  System.out.println("양수 입니다");
		  } else {
			  System.out.println("0 입니다");

		  }
	  }
	  scanner.close(); // if문의 중첩이 3단계 이상이라면 의심을 해봐야함. 2단계 이하로 줄일 수 있음.
}
  ////////////////////////////////////////////////////////////////////////////////////////
  private static void ifPractice() {
	  
	  
	 Scanner scanner = new Scanner (System.in);
	 System.out.println("과목을 선택하세요 " + "\n(1.자바 2.c 3.c++ 4.파이썬)\n" );
	 int classroom = scanner.nextInt();
	 System.out.println( "과목번호"+ classroom);
	 if (classroom ==1) {
		 System.out.println("R"+ classroom + "0"+ classroom +"호 입니다");
	 } else if ( classroom ==2) {
		 System.out.println("R"+ classroom + "0"+ classroom +"호 입니다");
	 } else if ( classroom ==3) {
		 System.out.println("R"+ classroom + "0"+ classroom +"호 입니다");
 	 } else if ( classroom ==4) {
		 System.out.println("R"+ classroom + "0"+ classroom +"호 입니다");
 	 } else {
		 System.out.println("나머지는 상담원에게 문의하세요."); // 조건이 ==로 표현될 때 switch case 사용 
		

 	 } scanner.close();
  }
  //////////////////////////////////////////////////////////////////////////////////////////
  private static void  switchCase(){
	  
	  Scanner scanner = new Scanner (System.in);
		 System.out.println("과목을 선택하세요 " + "\n(1.자바 2.c 3.c++ 4.파이썬)\n" );
		 int classroom = scanner.nextInt();
		 switch(classroom){
		 case 1 : 
			 System.out.println("R"+ classroom + "0"+ classroom +"호 입니다");
             break;
		 case 2 : 
			 System.out.println("R"+ classroom + "0"+ classroom +"호 입니다");
             break;
		 case 3 : 
			 System.out.println("R"+ classroom + "0"+ classroom +"호 입니다");
             break;
		 case 4 : 
			 System.out.println("R"+ classroom + "0"+ classroom +"호 입니다");
             break;
             
            default :
            	System.out.println("상담원에게 문의하세요");
            	break;
		 }
  
  
  scanner.close();
  
  }
  //////////////////////////////////////////////////////////////////////////////////////////
  
	 /*Scanner scanner = new Scanner (System.in);
	 System.out.println("과목을 선택하세요 " + "\n(1.자바 2.c 3.c++ 4.파이썬)\n" );
	 int classroom = scanner.nextInt();
	 System.out.println( "과목번호"+ classroom);
	  switch (classroom){
	  case1 classroom == 1 :System.out.println("R"+ classroom + "0"+ classroom +"호 입니다");
	  break;
	  case classroom == 2 :System.out.println("R"+ classroom + "0"+ classroom +"호 입니다");
	  break;
	  case classroom == 3 :System.out.println("R"+ classroom + "0"+ classroom +"호 입니다");
	  break;
	  case classroom == 4 :System.out.println("R"+ classroom + "0"+ classroom +"호 입니다");
	  break;
	  default : 
	  System.out.println("상담원에게 문의하세요");
	  break}

	 
	 
	  scanner.close();
  //////////////////////////////////////////////////////////////////////
  /* 강사님이 풀어주신 코드임. print 와 println은 뭔 차이일까 ?
   * Scanner scanner = new Scanner (System.in);
   * System.out.print("과목코드(1.c,2.c++,3.java,4.python)");
   * int code = scanner.nextInt();
   * 
   * if (code ==1){
   * System.out.println("R101입니다");
   * } else if ( code ==2 ){
   * System.out.println("R202입니다");
   * } else if (code ==3){
   * System.out.println("R303입니다");
   * } else if (code ==4) {
   * System.out.println("R404입니다");
   * }else { 
   * System.out.println("상담원에게 문의하세요");
   * }
   * scanner.close();
   * }
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   */
  
  private static void switchEx2() {
	  
	  Scanner scanner = new Scanner(System.in);
	  System.out.print("월을 입력하세요");
	  int month = scanner.nextInt();
	  
	  switch( month) {
	  case 1:
	  case 3:
	  case 5:
	  case 7:
	  case 8:
	  case 10:
	  case 12:
		  System.out.println(month + "월은 31일 입니다");
		  
		  break;
		  
	  case 2:
		  System.out.println(month + "월은 28일 입니다");
		  break;
		  
	  case 4:
	  case 6:
	  case 9:
	  case 11:
		  System.out.println(month + "월은 30일입니다");
		  break;
	default:
		System.out.println("?");
	break;
	 
	  }
	  scanner.close();
  }
  
  
  private static void switchEx3(){
	
	  String day = "TUE";
	  String message;
	  // 요일변수에는 지정된 값만 들어와야함, 문자열 사용은 자제하자 enum 데이터타입으로 변경하는게 좋음.
	  switch(day) {
	  case "SUN" :
		  message ="일요일";
		  break;
		  
	  case "MON":
	  case "TUE":
	  case "WED":
	  case "THU":
		  message ="열공";
		  break;
		  
	  case  "FRI":
			  message = "불금";
			  break;
	  case "SAT" :
		  message = "주말";
		  default:
			  message ="?";
			  break;
		 
	 
  }
	  
 System.out.println(day+"에는"+message);
  }
 
 private static void aaa() {
	 
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("점수를 입력하세용");
	 int score = scanner.nextInt();
	 /*
	 if (score%3 ==0) {
		 System.out.println(score +"은 3의 배수 입니다.");
	 }else {
		 System.out.println(score +"은 3의 배수가 아닙니다.");
	 }
	 */
	 
	 System.out.println(score +"는"+ (score%3 == 0? "3의배수 입니다": "3의배수가 아닙니다"));// 이 조건문 엄청 좋다 기억하자. (조건 ? yes : no)
	 scanner.close();

 
 
 
  }
  
  
  private static void ifEx4() {
	  
	  Scanner scanner = new Scanner(System.in);
	  System.out.print("점수를 입력하세요");
	  int score = scanner.nextInt();
	  if (score >=90) {
		  System.out.println("A등급");
	  }else if (score >= 80) {
		  System.out.println("B등급");
	  }else if (score >= 70) {
		  System.out.println("C등급");
	  }else if (score >=60) {
		  System.out.println("D등급");
	  }else {
		  System.out.println("F등급");
	  }
	  scanner.close();
  }
  
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
