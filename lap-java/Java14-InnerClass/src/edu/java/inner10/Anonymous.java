package edu.java.inner10;

//			anony.field.run(); 방법1



//class Bicycle implements Vehicle {
//	@Override
//	public void run() {
//		System.out.println(" 자전거가 달립니다");		
//	}
//}
//
//public class Anonymous {
//	Vehicle field = new Bicycle();	// TODO 1
//	// 실제 객체 생성은 자식클래스, 그 자식클래스를 부모라고 부르겠다.
//	
//	
//	void method1() {
//		Vehicle localVariable;	// TODO 2
//		//localVariable.run();
//	}
//	
//	void method2(Vehicle v) {
//		v.run();
//	}
//
//}


//		anony.field.run(); 방법 2

//public class Anonymous {
//	
//	Vehicle field = new Vehicle() {
//	@Override
//	public void run() {
//		System.out.println(" 자전거가 달립니다");
//	}
//};	// TODO 1
//// 실제 객체 생성은 자식클래스, 그 자식클래스를 부모라고 부르겠다.
//	
//	
//	void method1() {
//		Vehicle localVariable;	// TODO 2
//		//localVariable.run();
//	}
//	
//	void method2(Vehicle v) {
//		v.run();
//	}
//	
//}





//		anony.method1(); 방법1
//class Car implements Vehicle {
//	@Override
//	public void run() {
//		System.out.println(" 자동차가 달립니다");
//		
//	}
//}
//
//public class Anonymous {
//	
//	Vehicle field = new Vehicle() {
//	@Override
//	public void run() {
//		System.out.println(" 자전거가 달립니다");
//	}
//};	// TODO 1
//// 실제 객체 생성은 자식클래스, 그 자식클래스를 부모라고 부르겠다.
//	
//	
//	void method1() {
//		Vehicle localVariable = new Car();	// TODO 2
//		localVariable.run();
//	}
//	
//	void method2(Vehicle v) {
//		v.run();
//	}
//	
//}



//anony.method1(); 방법2
public class Anonymous {

	Vehicle field = new Vehicle() {
	@Override
	public void run() {
		System.out.println(" 자전거가 달립니다");
	}
	};	// TODO 1
	//실제 객체 생성은 자식클래스, 그 자식클래스를 부모라고 부르겠다.
	
	
	void method1() {
		Vehicle localVariable = new Vehicle(){ // 메소드가 override 되어 있지 않으므로 바로 생성자 사용할 수 없다. -> 익명 클래스를 만들어서 생성자로 사용
			@Override
			public void run() {
				System.out.println(" 자동차가 달립니다");
			}
		};	
		localVariable.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}

}

