package edu.java.interface06;

public class Main06 {

	public static void main(String[] args) {
		// BasicTV 클래스의 인스턴스 생성
		BasicTV tv1 = new BasicTV();
		tv1.turnOn();
		tv1.turnOff();
		
		System.out.println();
		// Audio 클래스의 인스턴스 생성
		Audio audio1 = new Audio();
		audio1.turnOn();
		audio1.turnOff();
		
		System.out.println();
		//다형성
		RemoteControl rc1 = new BasicTV();	// TV는 리모컨을 가지고 있다.
		rc1.turnOff();

		// 인터페이스 타입의 배열
		RemoteControl[] rc = new RemoteControl[2];
		rc[0] = tv1;
		rc[1] = audio1;
	}

}
