package edu.java.inherit01;

public class BasicTV {
	// 멤버 변수 (필드, 프로퍼티)
	private boolean powerOn;
	private int channel;
	private int volume;
	
	// 생성자
	public BasicTV() {}
	
	// 메소드
	public void turnOnOff () {
		if(powerOn) {
			powerOn = false;
			System.out.println(" TV가 꺼졌습니다");
		} else {
			powerOn = true;
			System.out.println(" TV On....");
		}
	}

}
