package com.loverikim.exer;

public class ExceptionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {			
			throwTest(10,0);//밑에 만든 메서드 호출
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("0나누기 에러 발생!");
		}
	}
	
	public static void throwTest(int a, int b) throws ArithmeticException{ //예외 떠넘기기
		System.out.println(a/b); // 에러 발생 부분.
	}

}
