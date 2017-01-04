package edu.java.interface02;

public class Main02 {

	public static void main(String[] args) {
		// 인터페이스의 상수 사용 : 인터페이스.상수이름
		System.out.println(TestInterface.MAX);
		
		//인터페이스를 구현하는 클래스의 인스턴스 생성
//		TestImple test = new TestImple();
		TestInterface test = new TestImple(); // 두개 같은 결과, 다형성!!
		
		// 추상 메소드(public abstract 메소드) 사용
		test.insert("aaa", "222");

	}

}
