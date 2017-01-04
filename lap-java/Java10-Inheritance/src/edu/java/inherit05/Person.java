package edu.java.inherit05;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {	//getName 과 비슷..
//		return super.toString();
		// 여기서 super는 Object 클래스
		return name;
	}

	// 자바의 모든 클래스의 java.lang.Object 클래스를 상속받아서 만들어짐.
	// 자바의 모든 클래스는 Object 클래스의 public 메소드를 상속받아서 사용 가능
	// Object 클래스의 toString() 메소드:
	//	패키지이름. 클래스이름@참조값(주소값)" 리턴
	//	이게 아니라 name 을 리턴하도록 바꿈.
	
}
