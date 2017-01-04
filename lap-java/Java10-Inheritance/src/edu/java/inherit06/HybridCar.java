package edu.java.inherit06;

public class HybridCar extends Car {
	private int battery;
	
	// HybridCar 는 battery 를 초기화 하는 생성자, (Car을 상속받으므로) fuel을 초기화하는 생성자,
	// fuel과 battery 모두를 초기화 하는 생성자 총 3개가 가능.
	
	public HybridCar() {}
	public HybridCar (int fuel, int battery) {
		// this.fuel = fuel 은 불가. fuel 은 Car 클래스를 상속받는 것이므로(private으로 선언) 직접 초기화 불가능
		// setter 메소드를 사용하거나, 생성자를 통해 생성할 때 초기화 해야 한다.
		super(fuel); //Car 클래스의 매개변수가 있는 생성자가 호출됨
		this.battery = battery;
	}

	public int getBattery() {
		return battery;
	}
	
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	@Override		// Car(부모) 클래스에서도 정의, 자식 클래스에서도 정의.
	public void display() {
		System.out.println("하이브리드 자동차 연료 : " + getFuel());
		System.out.println("하이브리드 자동차 배터리 : " + battery);
	}
}
