package edu.java.interface01;

// 인터페이스(interface) :
// 1. 모든 메소드는 public abstract로 선언
//	-> public abstract 수식어는 생략 가능
// 2. 모든 멤버 변수는 public static final로 선언
//	-> public static final 수식어는 생략 가능
// 3. 인터페이스를 선언할 때는 interface 라는 키워드를 사용
// 4. 인터페이스를 구현(상속)하는	 클래스는 implements 키워드를 사용
// 5. 클래스는 다중 상속이 불가능
//	ex) class Child extends Parent1, Parent2 (X)
// 인터페이스를 구현하는 숫자는 제한이 없음
// 	ex) class Child implements Inter1, Inter2, ..... (O)

public interface DatabaseQuery {
	// 인터페이스의 멤버 변수: public static final
	public static final int DATABASE_VERSION = 1;
	
	// 인터페이스의 메소드: public abstract
	public abstract int insert(String id, String pw);

} // end interface DatabaseQuery

