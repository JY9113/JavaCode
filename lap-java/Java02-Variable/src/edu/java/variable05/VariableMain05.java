package edu.java.variable05;

public class VariableMain05 {
	
	public static void main(String[] args) {
		//Ctrl + space : 코드 자동 완성
		
		System.out.println("실수 자료형(floating point) \n");
		
		/* float : 4바이트에 저장되는 실수(소수점이 있는 숫자) 타입
		 * double : 8바이트에 저장되는 실수 타입
		 * double 타입은 float 타입보다 더 크고, 
		 * 더 정밀한(소수점 이하 자리수가 더 큼) 수를 표현할 수 있음
		 * 자바에서 실수타입 리터럴(상수)의 기본 타입은 double
		 * 1.23->자바는 double 취급 (float이 아님) 
		 */
		
		double x = 3.14;
		System.out.println("x = " + x);
		
		// float y = 3.14; double을 float으로 바꿀 수 없다! (mismatch)
		float y = 3.14f; //자바는 double을 float으로 자동 형변환 해주지 않는다.
		System.out.println("y = " + y);
		//자바에서 실수 리터럴은 double 취급을 하기 때문에, 
		//float타입이라고 명시하기 위해서는 대문자 F 또는 소문자 f를 숫자 뒤에 붙여줌.
		
		double n1 = 123; // int -> double 자동 형 변환
		double n2 = 100;
		System.out.println("나눗셈 : " + (n1 / n2));
		System.out.printf("나눗셈 : %.3f", (n1 / n2));
		
	}

}
