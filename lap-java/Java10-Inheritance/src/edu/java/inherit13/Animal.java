package edu.java.inherit13;

public abstract class Animal {
	// 멤버 변수
	private String name;
	
	// 생성자
	public Animal(String name) {
		this.name = name;
	}
	
	// 메소드
	public String getName() {
		return name;
	}
	
	// 추상 메소드
	public abstract void move();
	
}
