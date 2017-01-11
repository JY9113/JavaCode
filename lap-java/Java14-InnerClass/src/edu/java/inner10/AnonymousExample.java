package edu.java.inner10;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1(); // 승용차가 달립니다 라고 출력.
		
		// Vehicle을 implements 하는 Truck 클래스가 있을 경우
		
//		Vehicle v = new Truck();		// 다형성
//		anony.method2(v);	// 트럭을 파라미터로 넘겨줘야한다.
		anony.method2(new Truck()); 	
		
		
		// 바로 익명클래스를 사용해서 호출.
		anony.method2(new Vehicle() {
			@Override
			public void run() {
				System.out.println(" 트럭이 달립니다");
			}
		});
	}
}

class Truck implements Vehicle {
	// Vehicle 자체로는 생성 못하지만, interface를 상속받는 클래스가 있으면 생성자 사용 가능.
	@Override
	public void run() {
		System.out.println(" 트럭이 달립니다");
	}
}
