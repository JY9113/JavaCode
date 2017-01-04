package edu.java.access11;

// 싱글톤 디자인 패턴(singleton design pattern)

// 클래스의 인스턴스를 오직 하나만 생성할 수 있도록 작성하는 설계 기법
// 1. 클래스 자신 타입의 private static 변수를 선언
// 2. 생성자는 private 으로 선언
// 3. public static 메소드를 제공해서 인스턴스를 생성할 수 있도록 한다. 생성자가 private이라 다른 클래스에서 부를 수 없기 때문.


public class Captain {
	// 멤버 변수
	private String name;
	
	// 1. private static Captain 변수를 선언
	private static Captain instance;
	// 2. private 생성자
	private Captain() {}
	// 3. public static 메소드를 정의
	public static Captain getInstance() {
		if (instance == null ) {
			instance = new Captain();
		}
		return instance;		
	}
	
	// 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
} // end class Captain
