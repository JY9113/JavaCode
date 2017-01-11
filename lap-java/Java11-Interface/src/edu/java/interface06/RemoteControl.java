package edu.java.interface06;

// 상속 : IS-A 관계가 성립할 때 사용
//	스마트 TV는 TV이다. SmartTV is a TV. (O)
//	class SmartTV extends BasicTV { ... }
// 구현(인터페이스) : HAS-A 관계가 성립할 때 사용
//	TV는 리모콘을 가지고 있다. (TV has a remote Control.) (O)
// 	class BasicTV implements RemoteControl { ... }

public interface RemoteControl {
	
	public abstract void turnOn();
	public abstract void turnOff();	

}
