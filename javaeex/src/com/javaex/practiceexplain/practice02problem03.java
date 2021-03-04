package com.javaex.practiceexplain;

public class practice02problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char b =',';
		char c[] = {'T','H','I','S',' ','I','S',' ','P','E','N','C','I','L'};
		
		for(int i=0;i<c.length;i++) {
			if(c[i]==' ')c[i]=',';
		}
		for ( char c1 :c) {
//c의 ' '을 =b;로 초기화해야함. 머너 공백인 배열을 찾아서 모은 뒤에 b로 값을 초기화해야한다고 생각한다.
			//c[4]=b;
			//c[7]=b;
			System.out.print(c1);
		}
}
}