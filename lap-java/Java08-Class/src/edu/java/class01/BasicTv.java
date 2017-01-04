package edu.java.class01;

// 클래스(class):
// 만들고자 하는 대상의 상태(속성) 정보들을 "멤버 변수"로 선언하고,
// 대상이 가져할 기능들을 "메소드"로 정의하는,
// 새로이 만드는 "데이터 타입"

public class BasicTv {
	// TV가 가져야 할 상태(속성, 성질) => 멤버 변수(필드, 프로퍼티)
	boolean powerOn; // TV의 전원 상태(true:on, false:off)
	int channel; // TV 채널 정보
	int volume; // TV 볼륨 정보
	
	// TV가 가져야 할 기능 => 메소드
	// TV를 켜거나 끄는 기능
	public void turnOnOff() {
		if (powerOn) {
			powerOn = false;
			System.out.println("TV가 꺼졌습니다...");
		} else {
			powerOn = true;
			System.out.println("TV가 켜졌습니다...");
		}
		
	} // end turnOnOff()
	
	// 채널 증가 기능
	public void channelUp() {
		if(powerOn) {
			if(channel == 5) {
				channel = 1;
			} else {
				channel++;
			}
			System.out.println("channel up: " + channel);
		}
	} // end channelUp()
	
	// 채널 감소 기능
	public void channelDown() {
		if(powerOn) {
			if(channel == 1) {
				channel = 5;
			} else {
				channel--;
			}
			System.out.println("channel down: " + channel);
		}
		
	} // end channelDown()
	
	// 볼륨 증가 기능
	public void volumeUp() {
		if(powerOn) {
			if( volume != 4) {    //현재 볼륨이 최대값이 아니면
				volume++;
			}		
			System.out.println("volume up: " + volume);
		}
		
	} // end volumeUp()
	
	// 볼륨 감소 기능
	public void volumeDown() {
		if(powerOn) {
			if(volume != 0) {
				volume--;
			}
		}
		System.out.println("volume down: " + volume);
	} // end volumeDown()
	
	public void displayInfo() {
		System.out.println("--- TV 현재 상태 ---");
		System.out.println("전원: " + powerOn);
		System.out.println("채널: " + channel);
		System.out.println("볼륨: " + volume);
		
	} // end displayInfo()
	
} // end class BasicTv















