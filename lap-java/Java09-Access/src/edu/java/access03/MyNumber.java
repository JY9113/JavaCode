package edu.java.access03;

// 캡슐화(encapsulation)
//	클래스를 설계할 때, 멤버 변수(필드)들을 private으로 선언해서
//	외부 클래스에서 필드들을 직접 접근해서 읽거나 쓰지 못하게 하는 것.
//	필요한 경우에 한해서 public 메소드를 정의해서
//	private 멤버 변수를 간접적으로 읽거나 쓰는 것을 가능하게 할 수 있다

public class MyNumber {
	// 멤버 변수
	private int number;
	
	// 생성자
	public MyNumber(int number) {
		this.number = number;
	}
	
	// 메소드
	public int add(int x) {
		number += x;
		return number;
	}
	
	//private 멤버 변수를 간접적으로 읽어오는 메소드 - getter
	public int getNumber() {
		return number;
	}
	// private 멤버 변수를 간접적으로 변경하는 메소드 - setter
	public void setNumber(int number) {
		this.number = number;
	}
}
