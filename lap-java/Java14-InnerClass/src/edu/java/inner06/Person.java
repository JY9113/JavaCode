package edu.java.inner06;

public class Person {
	private String name; // Person 클래스의 멤버 변수
	
	// Person 클래스의 생성자
	public Person(String name) {
		this.name = name;
	}
	
	// Person 클래스의 메소드
	public PersonInterface setAge(int age) {
		// 지역 클래스(local class)를 정의
		class PersonWithAge implements PersonInterface {
			private int age; // 지역 클래스의 멤버 변수
			
			public PersonWithAge(int age) {
				this.age = age;
			}
			
			public void showInfo() {		// interface 가 가진 메소드를 override
				System.out.println("이름: " + name);
				System.out.println("나이: " + age);
			}
			public void hello() {
				System.out.println("안녕하세요.");
			}
			
		} // end class PersonWithAge
		
		PersonWithAge instance = new PersonWithAge(age);
		
		return instance;
	} // end setAge()

} // end class Person


interface PersonInterface {
	public abstract void showInfo();
	public abstract void hello();	// 여기 선언 안해주면 메인에서 hello 사용 불가.
	
} // end interface PersonInterface


