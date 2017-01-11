package edu.java.inner09;

class Car {
	// 멤버 내부 클래스
	class Tire{} 
	// static 내부 클래스(중첩 클래스, nested class)
	//	- 외부 클래스의 인스턴스가 없어도 생성 가능
	static class Engine {}

}

public class InnerMain09 {
	public static void main(String[] args) {
		// Car 클래스의 인스턴스 생성
		Car myCar = new Car();
		
		// Tire 객체는 Car안에 Tire 로 존재.
		Car.Tire tire = myCar.new Tire();
		
		// Car.Engine 클래스의 인스턴스	: static 이라 외부 생성자와 관련이 없으므로 바로 new 를 호출.
		Car.Engine engine = new Car.Engine();
	}
}
