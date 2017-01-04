package edu.java.inherit04;

public class Dog extends Animal{
	
	// 멤버 변수
	private String type;
	
	// 생성자
	public Dog() {}
	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}
	
	// 메소드 재정의(override)
	// Dog는 Animal 을 상속받기 때문에 Animal이 가지고 있는 speak 메소드도 같이 가짐.
	// 여기서 같은 이름의 메소드인 speak()를 재정의 함 => 메소드 오버라이딩
	// 메소드의 리턴 타입, 이름, 매개변수 모두 일치해야함!!!!!!!!!!!!!!!!!!!
	
	// 컴파일하기 전에 재정의 함을 알려주는 annotation
	@Override
	public void speak() {
		System.out.println("멍멍....");
	}
	
	// 이 부분은 오버라이드 된 부분이 아님. 
	// 부모클래스에서는 매개변수를 갖는 speak 메소드가 없음.
	// 따라서 @Override 을 쓸 수 없다.
	public void speak(String str) {
		System.out.println(str);
	}
	

}
