package edu.java.inherit02;

public class Person {
	// 멤버 변수
	private String name;
	
	// 생성자
	public Person() {
		System.out.println("Person 생성자");
	}
	
	public Person(String name) {
		this.name = name; // 생성자 오버로딩
		System.out.println("Person(name) 생성자");
	}
	// 메소드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
