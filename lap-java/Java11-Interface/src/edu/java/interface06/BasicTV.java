package edu.java.interface06;


// BasicTV has a remote control.
public class BasicTV implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV 켜짐");

	}

	@Override
	public void turnOff() {
		System.out.println("TV 꺼짐");

	}

}
