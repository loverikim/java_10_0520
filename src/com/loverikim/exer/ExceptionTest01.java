package com.loverikim.exer;

public class ExceptionTest01 {
	
	public static void main(String[] args) {
		
		try {
			int a = 10;
			int sum = a/0; // 0 나누기 에러발생!		
			System.out.println(sum);// ArithmeticException 에러 0 나누기 1을 에러			
//		
//		}catch (ArithmeticException e) {
//			System.out.println("0나누기 에러발생! 다시 확인하세요!");//			
//			
//		}catch (NullPointerException e) {
//			System.out.println("null 값을 가리키고 있습니다! 다시 확인하세요!");
//		}
		}catch (Exception e) { // 에러를 처리해주는 클래스의 이름 그 클래스로 e 객체이름을 만들겠다. 
			System.out.println("0나누기 에러발생! 다시 확인하세요!");
			e.printStackTrace();//에러코드 콘솔창에 출력해줌
			
		}finally{
			System.out.println("에러의 발생여부와 상관없이 실행됨!! ");
		}
		
	}
}
