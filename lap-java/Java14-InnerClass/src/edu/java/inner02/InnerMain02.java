package edu.java.inner02;

public class InnerMain02 {

	public static void main(String[] args) {
		// 자동차 객체가 먼저 만들어져야 타이어 객체를 만들 수 있음
		Car car1 = new Car("람보르기니");
		Car.Tire tire1 = car1.new Tire(20);		// car1이 가지는 tire1을 만듦
		tire1.display();
		
		System.out.println();
		Car car2 = new Car("모닝");
		Car.Tire tire2 = car2.new Tire(15);
		tire2.display();
		
		System.out.println();
		Car.Tire tire3 = new Car("제너시스").new Tire(19);
		tire3.display();
		

	}

}
