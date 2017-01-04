package edu.java.variable04;

public class VariableMain04 {

	public static void main(String[] args) {
		System.out.println("정수 리터럴(literal) \n");
		
		//int num1 = 123456789;
		//num1 은 변수 12345679는 리터럴.
		//int num1 = 12345678900 : 12345678900은 int로 저장할 수 있는 리터럴이 아니다.
		
		//int num1 = 12345678900L : L이 있다는 거는 long타입 이라는 뜻. 따라서 mismatch
		//리터럴을 long타입으로 8바이트까지 공간을 확보했는데 int라는 4바이트짜리에 복사하려 하므로 type mismatch=큰타입의 수를 작은 타입에 넣을 수 없다.
		//long num1 = 12345678900L; 으로 해결.
		long num1 = 12345678900L;
		System.out.println("num1 = " + num1);
		
		short x = 12345;
		System.out.println("x = " + x);
		//12345라는 상수를 쓰면 자바는 int라고 인식.
		//원래는 type mismatch라고 에러가 발생해야함. 근데 에러 발생 X
		//예외적으로 자바에서 자동 형변환을 해주는 경우가 존재하기 때문.
		//정수 리터럴을 byte나 short에 저장할 때
		//해당 타입에 저장할 수 있는 범위만 넘지 않으면
		//자동 형(type) 변환을 해줌
		//int -> byte, int -> short
		//long 타입 리터럴(상수)는 자동 형 변환을 해 주지 않는다.
		//int y = 100L;
		
		/*
		 * 리터럴(literal) : 상수(1,2....)
		 * 자바는 정수 타입의 리터럴은 int가 기본 타입. ex 1도 int 100도 int.
		 * 정수 리터럴을 long타입으로 취급하고 싶으면 숫자 뒤에 대문자 L 또는 소문자 l을 붙여준다.
		 * 
		 */


	}

}
