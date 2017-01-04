package edu.java.variable01;

public class VariableMain01 {
	
	// 프로그램의 시작점 : main() 메소드
	public static void main(String[] args) { //자바 런타임은 여기서부터 시작
		
		System.out.println("변수(Variable)\n");
		// Ctrl + F11 : 프로그램 실행(Run)
		
		// 변수(Variable) : 데이터를 저장하는 공간
		// 변수를 사용하는 방법1:
		// 		변수타입 변수이름 = 값; (타입 선언 이유는 메모리 공간 확보를 위해, 변수이름은 그 저장공간을 찾아가기 위한 이름)
		int x = 100; //정수만 저장, 4byte, 저장공간의 이름은 x, 여기에는 100이라는 숫자를 저장
		System.out.println("x = " + x);
		
		// 변수를 사용하는 방법2 : 변수를 선언만 하고, 나중에 초기화
		// 		변수타입 변수이름;
		//		변수이름 = 값;
		int y; // 변수를 선언
		y = 200; //변수 초기화(변수값을 저장)
		System.out.println("y = " + y);
		
		x = 123;
		y = 100;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		// z = 111; 이건 불가. 선언이 안 되어있기 때문. 항상 변수 선언 먼저 하고 사용
		System.out.println("x + y = " + (x + y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
		// 정수 / 정수 : 나눈 몫을 계산
		// 정수 % 정수 : 나눈 나머지를 계산
	}

} // end class VariableMain01
