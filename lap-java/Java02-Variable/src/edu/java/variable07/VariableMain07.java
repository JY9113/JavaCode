package edu.java.variable07;

public class VariableMain07 {

	public static void main(String[] args) {
		
		System.out.println("문자 타입(char)\n");
		
		// char : 문자 하나를 저장하는 데이터 타입, 2바이트를 사용
		// 문자의 유니코드값을 저장하는 타입. (유니코드는 정수, 음수가 아니다)
		// 0~65535 까지 표현 가능. (2^16)
		// 자바는 유니코드를 이용해서 문자를 표현.
		// 문자(character)는 작은 따옴표('')를 사용.
		// 문자열(string)은 큰 따옴표("")를 사용.
		// '한' : 문자(char), '' 도 가능
		// "한글" : 문자열(string), "한" : 문자열, "" 비어있을수도 있다.
		
		char ch1 = 'A';
		System.out.println("ch1 = " + ch1);
		System.out.println("ch1 = " + (int) ch1); //char를 int로 변환해서 출력 (강제 형 변환)
		System.out.println("");
		
		char ch2 = 'B';
		System.out.println("ch2 = " + ch2);
		System.out.println("ch2 = " + (int) ch2);
		System.out.println("");
		
		char ch3 = '1';
		System.out.println("ch3 = " + ch3);
		System.out.println("ch3 = " + (int) ch3);
		System.out.println("");
		
		char ch4 = 1; //''로 묶으면 문자, 묶지 않으면 이건 리터럴. 리터럴은 int로 4바이트이고 char는 2바이트. 자동 형변환
		//원칙적으로는 큰 타입에서 작은 타입으로 형변환 안된다. 그런데 자바가 예외적으로 int는 넘치지만 않으면 작은 타입으로 형변환 가능.
		
		System.out.println("ch4 = " + ch4);
		System.out.println("ch4 = " + (int) ch4);
		System.out.println("");
		
		char ch5 = 54620; //char는 2바이트임에도 불구하고 정수형 타입 중에서 음수가 없는 숫자 타입.
		//2바이트는 3만...까지 가능한데 음수가 없으므로 6만까지 가능.
		System.out.println("ch5 = " + ch5);
		System.out.println("");
		
		char ch6 = '한';
		System.out.println("ch6 = " + ch6);
		System.out.println("");
		
		boolean b1 = 'A' < 'B'; //char는 문자가 가진 코드로 비교. 크기 비교가 가능하다.
		System.out.println("b = " + b1);
		
		boolean b2 = '가' > '나';
		System.out.println("b2 = " +b2);
		System.out.println("");
		
		
		
		
	}

}
