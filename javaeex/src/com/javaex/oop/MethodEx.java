package com.javaex.oop;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printDivide(5,3);
		printDivide(5,0);
		double result = getSum(4,5);
		System.out.println("4+5="+result); // 리턴타입의 유무 , 매개변수의 유무에 따라 4가지 형태 조내
		System.out.println("getSum:"+ getSum(new double[] {1,2,3,4,5,6,7,8,9,10}));
		System.out.println("getSumMany :" + getSumMany(1,2,3,4,5,6,7,8,9,10));
	}

///////////////////////////////가변인수
    private static double getSumMany(double ...values) {
    	double total =0;
    	for(double value : values) {
    		
    		total += value;
    }
    	return total;
    	//return getSumMany(values);
    }
	
    
    /////////////////매개변수를 모를때 는 배열 지정
		private static double getSum(double[] values) {
		double total = 0;
		for(double value : values) {
                      total += value;
		}
		return total;
	}
	
	
	
	
	/////////////////반환값을 받고자 한다면 리턴 타입지정
	private static double getSum(double num1,double num2) {
		return num1+num2; // 반드시 지정한 리턴 타입과 일치해야함 
	}
	
	
	
	
	
	
	//반환값이 업승ㄹ 경우 void 타입 지정 
	private static void printDivide(int num1, int num2) {
		if(num2==0) {
			System.out.println("0으로나눌수없어요");
			return;
			//리턴문을 만나면 남은 코드를 수행x 호출된 곳으로 돌아감
		}
	System.out.println(num1/num2); //남은코드
	}
}
