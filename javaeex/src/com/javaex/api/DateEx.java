package com.javaex.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
	//dateClassEx();
	calenderEx();
	}
	//캘린더객채
	private static void calenderEx() {
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();

		//내부 정보를 얻어올때는 get(날짜상수)
		System.out.printf("현재  : %d년 %d월 %d일%n",
		now.get(Calendar.YEAR),
		now.get(Calendar.MONTH)+1,
		now.get(Calendar.DATE));
		
		//년원일 정보를 알고 있을때
		custom.set(2012,8, 24); //년 월 -1 일 
		System.out.printf("Custom : %d년 %d월 %d일%n",
				custom.get(Calendar.YEAR),
				custom.get(Calendar.MONTH) +1,
				custom.get(Calendar.DATE));
		
		//날짜의 연산 
		Calendar future = Calendar.getInstance(); // 현재 날짜
		// 100일 뒤
		future.add(Calendar.DATE, 100);
		System.out.printf("미래 : %d년 %d월 %d일%n",
				future.get(Calendar.YEAR),
				future.get(Calendar.MONTH)+1,
				future.get(Calendar.DATE));
		
		//이 날은 무슨 요일일까? 
		// Calendar.DAY_OF_WEEK : 1~ 7 일월화수목금토 
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.printf("요일 : ", dow);
		
		String dowStr;
		switch(dow) {
		case Calendar.SUNDAY:
			dowStr = "일요일";
			break;
			
		case Calendar.MONDAY:
			dowStr = " 월요일";
			break;
			
		case Calendar.TUESDAY:
			dowStr = "화요일";
			break;
			
		case Calendar.WEDNESDAY:
			dowStr = "수요일";
			break;
			
		case Calendar.THURSDAY:
			dowStr = "목요일 ";
			break;
			
		case Calendar.FRIDAY:
			dowStr = "금요일";
			break;
			
		case Calendar.SATURDAY:
			dowStr = "토요일";
			break;	
		
		default:
			dowStr = "?";
		}
		System.out.println( dowStr);
	}
	//날짜 시간
	private static void dateClassEx () {
		
	 Date now = new Date();
	 System.out.println("현재 : " + now);
	 //==System.out.println(now.toString());
	 
	 //출력 포맷의 변경
	 // DateFormat 변수 = DateFormat.getInstance(DateFormat:FULL/ LONG /MEDIUM/SHORT)
	 DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
	 System.out.println("FULL : "+ df.format(now));
	 df = DateFormat.getDateInstance(DateFormat.LONG);
	 System.out.println("LONG : "+ df.format(now));
	 df = DateFormat.getDateInstance(DateFormat.MEDIUM);
	 System.out.println("MEDIUM : "+ df.format(now));

	 df = DateFormat.getDateInstance(DateFormat.SHORT);
	 System.out.println("SHORT : "+ df.format(now));

	 // 형식을 내가 지정할때 - > SimpleDateFormat
	 // yyyy년 mm월 dd일 13시 20분  __초
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
	 System.out.println("SDF : "+ sdf.format(now));
	}

}
