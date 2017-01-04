package edu.java.inherit01;

// 상위 클래스 (super class), 부모 클래스 (parent class), 기본 클래스 (base class)
// 하위(sub class) 클래스, 자식(child class) 클래스, 유도(derived class)
// class SubClass extends SupserClass
public class smartTV extends BasicTV {
	// 멤버 변수
	private String ip; //smart TV느 가질 수 있지만 basic TV는 가질 수 없다
	
	
	// 생성자
	public smartTV() {}
	
	// 메소드
	public String getIp () {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

}
