package edu.java.generic01;

public class AppleBox {
	private Apple apple;
	
	public AppleBox(Apple apple) {
		this.apple = apple;
	}
	
	public Apple pullOut() {
		return apple;
	}

}
