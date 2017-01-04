package edu.java.op01;

public class OpMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[1] 대입 연산자(=)");
		System.out.println();
		// 변수 = 값;
		// 오른쪽의 값을 왼쪽의 변수에 저장하는 연산자
				
		int number = 123; 
		System.out.println("number : " + number);
		
		System.out.println("-----------------------------");
		System.out.println("[2] 산술 연산자(+, -, *, /, %)");
		// (정수) / (정수) : 나눈 몫을 계산
		// (정수) % (정수) : 나눈 나머지를 계산
		// (실수) / (실수), (실수) / (정수), (정수) / (실수) : 실제 나눗셈을 한다
		// 소수점까지 계산하는 나눗셈 결과
		System.out.println();
		System.out.println("정수 나눗셈 몫 : " + (123 / 100));
		System.out.println("정수 나눗셈 나머지 : " + (123 % 100));
		System.out.println("실수 나눗셈 : " + (123 / 100.0));
		
		System.out.println(123 / 0.0);
	}

}
