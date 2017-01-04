package edu.java.inherit09;

import edu.java.inherit10.Test3;

public class InheritMain09 {

	public static void main(String[] args) {
		// Test1 클래스의 인스턴스 생성
		Test1 t1 = new Test1();
		//a 는 private 이므로 바로 사용 불가.
		t1.b = 2;
		t1.c = 3;
		t1.d = 4;
		t1.display();
		
		System.out.println();
		Test2 t2 = new Test2();
		t2.display();
		
		System.out.println();
		Test3 t3 = new Test3();	// main이 있는 패키지는 inherit09 번이고 Test3은 inherit10 번 패키지 이므로 import 해줘야함
		
//		t3.a = 10;	 //private
//		t3.b = 20;	 // package
		t3.c = 30; 	// protected : 같은 패키지 이거나 다른 패키지라도 상속을 받으면 사용 가능.
		t3.display();

	}

}
