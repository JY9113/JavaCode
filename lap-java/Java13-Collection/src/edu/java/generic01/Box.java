package edu.java.generic01;

// generic 클래스 :
// 클래스의 멤버 변수, 메소드 또는 생성자의 매개변수, 메소드의 리턴 타입 등을
// 지정하지 않고, 일반적으로 정의하는 클래스
// generic 클래스를 정의할 때 사용되는 일반화 변수(T)는 클래스 타입만 사용가능함
//	-> 자바의 기본 자료형 (boolean, int, double...) 을 사용할 수 없음!
//	-> 기본 자료형 대신에 wrapper 클래스를 일반화 변수로 사용하면 됨.

// T가 뭐가 올지 모르기 때문에 어떤 타입이라도 올 수 있다는 표현....? <T>
// T에는 실제로 만들어진 클래스 타입이 들어온다.
public class Box<T> {
	private T content;
	
	public Box(T content) {
		this.content = content;
	}
	//오렌지상자와 사과 상자가 가지는 리턴 타입이 다름.
	public T pullOut() {
		return content;
	}
}
