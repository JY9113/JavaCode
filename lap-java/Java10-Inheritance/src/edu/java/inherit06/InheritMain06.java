package edu.java.inherit06;

// 다형성(polymorphism) :
// 실체(인스턴스)를 여러가지 타입으로 부를 수 있는 것.
// 생성된 인스턴스를 가리키는(참조하는) 변수를 선언할 때
// 생성된 인스턴스의 클래스 타입으로 변수를 선언할 수도 있고 ex) HybridCar hc = new HybridCar();
// 또는 그 부모 타입으로 변수를 선언할 수도 있는 것. ex) Car car = HybridCar();

// 다형성의 장점 : 
// 	1. 배열을 사용할 때 부모타입으로만 선언해도 그 배열에는 부모, 자식타입 모두 저장 가능
//	2. 메소드를 정의할 때, 메소드의 매개변수나 리턴타입으로 부모 클래스 타입만 사용해도 부모, 자식타입 모두 매개변수나 리턴 값으로 사용할 수 있다.

public class InheritMain06 {
	
	public static void main(String args[]) {
		// Car 클래스의 인스턴스를 생성
		Car car1 = new Car();
		
		// HybridCar 클래스의 인스턴스 생성 : 하이브리드 차는 하이브리드 차다!
		HybridCar car2 = new HybridCar();
		
		// 다형성(polymorphism) ; 하이브리드 차는 자동차다!
		Car car3 = new HybridCar();
	
		// Child 변수이름 = new Child();
		// Parent 변수이름 = new Parent();
		// Child 변수이름 = new Parent();		=> 불가능!!!!!!!!!!!!
		// 		HybridCar car4 = new Car(); 		=> 자동차는 하이브리드 자동차다! (X)
		
		// Car 타입 배열 선언
		Car[] cars = new Car[3];		//Car 타입 변수를 여러개 저장할 수 있는 배열. 배열의 크기는 3
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		
		for(Car x : cars) {
			x.display();	// Car x 지만 car2, car3은 HybridCar 타입이므로 출력하면 HybridCar의 display 가 호출된다.
			System.out.println("------------------------");
		}
		
		System.out.println();
		System.out.println("------------------------");
		
		for(Car x : cars) {
			CarUtil.drive(x);		// drive 메소드는 static 이므로 객체를 생성하지 않고 사용 가능. (생성자를 호출 안함)
			System.out.println("------------------------");
			// 하이브리드 차, 자동차 모두 drive라는 기능은 같기 때문에 
		}
	}

}
