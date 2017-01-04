package edu.java.access10;

// Java Runtime (실행환경, Virtual Machine(가상 머신))이 관리하는 메모리
// 1. Stack (스택) : 지역 변수(매개 변수)를 저장하는 메모리 영역
// 2. Heap (힙) : 인스턴스 (참조 자료형)가 저장되는 메모리 영역
// 3. Method (메소드) : static으로 선언한 변수, 메소드의 실행 코드들이 저장되는 메모리 영역

// static : 멤버 변수 또는 메소드를 선언(정의)할 때 사용
//	- 인스턴스 생성 이전에 프로그램이 처음 시작될 때 static 메모리 영역에 자동으로 생성

// 클래스 변수(static 변수) : static으로서 선언한 멤버 변수
//	- 인스턴스를 생성하지 않아도 사용 가능
//     - static 변수는 생성되는 모든 인스턴스들이 공유하게 됨
//	- 클래스이름.변수이름 의 형식으로 사용 	ex) Math.PI

// 인스턴스 변수 :  static이 붙지 않은 멤버 변수
//	- 인스턴스를 생성한 후에만 사용할 수 있는 변수
//	- 참조변수.변수이름 형식으로 사용

// 클래스 메소드(static 메소드) : static으로 선언한 메소드
//	- 인스턴스를 생성하지 않아도 사용가능한 메소드
//	- 클래스이름.메소드() 형식으로 사용		es) Math.random()

// 인스턴스 메소드 : static이 붙지 않은 메소드
//	- 인스턴스를 생성한 후에만 사용할 수 있는 메소드
//	- 참조변수.메소드() 형식으로 사용

public class TestStatic {
	int num1; // 인스턴스 멤버 변수
	static int num2; // 클래스 멤버 변수
	
	// 인스턴스 메소드
	public void  display1() {
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
	
	// 클래스(static) 메소드
	public static void display2() {
		// System.out.println("num1 = " + num1);	// 멤버변수는 생성자를 만들어야 메모리에 생성. static 안에서는 static 변수만 사용 가능
		// static 메소드는 인스턴스 생성 없이 사용 가능함
		// 인스턴스 멤버 변수는 인스턴스가 생성된 후에만 사용 가능 
		// static 메소드에서 static이 아닌 멤버 변수 접근은 불가
		System.out.println("num2 = " + num2);
	}
	
}
























