package edu.java.variable03;

public class VariableMain03 {

	public static void main(String[] args) {
		System.out.println("자바의 기본 자료형 \n");
		// 자바의 기본 자료형 :
		// 논리형 : boolean
		// 정수형 : byte(1바이트), short(2바이트), int(4바이트), long(8바이트), char(2바이트)
		// 실수형 : float(4바이트), double(8바이트)
		
		// byte 타입의 변수 n1을 선언하고, 1로 초기화
		byte n1 = 1;
		System.out.println("n1 = " + n1);
		n1 = -1;
		System.out.println("n1 = " + n1);
		// n1 = 128; 이건 안돼! byte가 저장할 수 있는 숫자의 크기를 넘는다. (-128 ~ 127까지)
		
		// short 타입 변수 n2를 선언하고, 1234로 초기화
		short n2 = 1234;
		System.out.println("n2 = " + n2);
		//short 타입에는 -32768 ~ 32767 까지 (2byte기 때문)
		
		

	}

}
