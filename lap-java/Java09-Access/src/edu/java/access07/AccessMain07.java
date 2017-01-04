package edu.java.access07;

// import edu.java.access06.TestPackage;// 불가능! 접근 자체가 안되기 때문에...not visible
// import edu.java.access06.TESTTEST; // 정의하지 않은 클래스에 접근. cannot be resolved => 이러한 클래스가 없다!
import edu.java.access06.TestPublic;

// ctrl + shift + O(대문자 o) : import 문 자동 정리

public class AccessMain07 {

	public static void main(String[] args) {
		// edu.java.access06.TestPublic 의 인스턴스 생성 가능 => public으로 선언한 클래스이기 때문에 생성 가능, 
		TestPublic test1 = new TestPublic(); // 다른 패키지에 속해있기 때문에 import 시켜줘야 한다, 프로젝트가 다르면 안됨
		
		// 다른 패키지에 속한 class를 위치까지 써주면 import 안해도 사용가능
		// edu.java.access06.TestPublic test1 = new edu.java.access06.TestPublic(); 

		System.out.println(test1);
		
		// edu.java.acces06.TestPackage는 (package) class 이기 때문에
		// 다른 패키지에 속한 클래스에서는 인스턴스 생성이 불가능 
		// edu.java.access06.TestPackage() = new edu.java.access06.TestPackage(); // not visible
		

	}

}
