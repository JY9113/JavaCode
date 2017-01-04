package edu.java.access06;

// 클래스의 접근 권한 수식어 : public, (package) 
// 1. public class : 어디서든지 인스턴스 생성이 가능한 클래스
// 2. class : 같은 패키지에 속한 클래스들에서만 인스턴스 생성이 가능
// ( 주의 )
// 1. public class의 이름은 반드시 java 파일의 이름과 같아야 함 , 일반적인 클래스는 굳이 이름 같지 않아도.......
// 2. 하나의 java 파일에서 여러개의 클래스를 정의하는 것은 가능하지만,
// 같은 파일에서는 public 클래스는 오직 하나만 있어야 함


public class AccessMain06 {

	public static void main(String[] args) {
		// 같은 패키지에 있는 public class의 인스턴스 생성 가능
		TestPublic test1 = new TestPublic();
		System.out.println(test1);	// edu.java.access06.TestPublic@15db9742 라는 주소값이 출력
		
		// 같은 패키지에 있는 class의 인스턴스 생성 가능
		TestPackage test2 = new TestPackage();
		System.out.println(test2); // edu.java.access06.TestPackage@6d06d69c 라는 주소값이 출력

	}

}
