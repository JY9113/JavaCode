package edu.java.access02;

import edu.java.access01.Test01;

public class AccessMain02 {

	public static void main(String[] args) {
		// edu.java.acces01.Test01 클래스의 인스턴스 생성
		Test01 t2 = new Test01();
		t2.display();
		//t2.n1 = 100;  => private -접근 불가
		//t2.n2 = 100; => (package) 다른 패키지에 있으므로 접근 불가
		//t2.n3 = 100; => protected - 다른 패키지에 있으므로 접근 불가
		t2.n4 = 500; // public이라 이것만 가능
		t2.display();
	}

}
