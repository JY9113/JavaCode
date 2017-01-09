package edu.java.wrapper04;

import java.math.BigDecimal;
import java.math.BigInteger;

//BigInteger: 저장할 수 있는 정수값의 한계가 없는 클래스
//BigDecimal: 실수 계산의 오차를 줄이거나 없애기 위해서 만들어진 클래스
//auto boxing과 auto unboxing 기능을 제공하지 않음
//-> 생성자를 호출해서 인스턴스를 생성해야 함
//-> 산술연산(+, -, *, /)은 메소드를 사용해야 함

public class BigMain {
	public static void main(String[] args) {
		//long n = 12345678912345678912L;
		// long 타입도 저장할 수 있는 한계가 존재
		
		// BigInteger 생성자의 매개변수는 문자열
		// 이유: 아주 큰 숫자 리터럴을 저장할 수 있는 기본 타입이 없기 때문에
		BigInteger big1 = new BigInteger("12345678912345678912");
		System.out.println(big1);
		
		// BigInteger의 사칙 연산:
		// add(), subtract(), multiply(), divide() 메소드 사용
		BigInteger a = new BigInteger("10");
		BigInteger b = new BigInteger("20");
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		
		System.out.println("=================");
		double num1 = 1.1;
		double num2 = 0.9;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		
		BigDecimal x = new BigDecimal("1.1");
		BigDecimal y = new BigDecimal("0.9");
		System.out.println(x.add(y));
		System.out.println(x.subtract(y));

	} // end main()
}
