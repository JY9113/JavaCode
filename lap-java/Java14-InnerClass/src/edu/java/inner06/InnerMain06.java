package edu.java.inner06;

public class InnerMain06 {

	public static void main(String[] args) {
		// 지역 클래스의 메소드들을 외부에서 사용하는 방법
		// 	1. 지역 클래스의 메소드들을 선언한 인터페이스를 정의
		//	2. 지역 클래스가 인터페이스를 구현하도록 정의한다.
		//	3. 다형성을 사용해서 메소드의 리턴 타입으로 인터페이스를 사용할 수 있음.
		
		Person p = new Person("오쌤");
		PersonInterface instance = p.setAge(20);
		instance.showInfo();
//		instance.hello();
		// interface 안에 hello 메소드 만들기 전에는 에러발생
		
		

	} // end main()

} // end class InnerMain06

