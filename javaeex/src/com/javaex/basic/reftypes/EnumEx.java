package com.javaex.basic.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enumTest();
		enumTest2();
	}
// %s 문자열 %d 10진정수 %n 개행 
	private static void enumTest2() {
		week today = week.WEDNESDAY;
		String message;
		
		switch(today) {
		case SUNDAY: 
			message = "일요일";
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			message = "열공";
			break;
		case FRIDAY:
			message = "불금";
			break;
		case SATURDAY:
			message = "주말";
			break;
			default:
				message="?";
			
		}
		System.out.printf("%s에는 %s%n", today.name(),message);
		
		
	}
	private static void enumTest() {
		week today = week.WEDNESDAY;
		
		System.out.printf("Today is %s(%d)%n", today.name(), //열거상수의 이름
		today.ordinal());//열거상수의 순번
		
		//string -> 열거상수로 변환하고 싶을떄
	
		week other = week.valueOf("FRIDAY");
		System.out.printf("other is %s(%d)%n", other.name(),other.ordinal());
		
		//열거상수 순번비교
		System.out.println(other.compareTo(today)); // 두 열거 상수의 순번차. other과 today의
		
		
		week[] days = week.values(); // week enum 타입의 모든 열거 상수를 반환함.

		for(int i =0; i<days.length; i++) {
			System.out.printf("%s(%d)%n", days[i].name(),days[i].ordinal());
		}
	}
}
