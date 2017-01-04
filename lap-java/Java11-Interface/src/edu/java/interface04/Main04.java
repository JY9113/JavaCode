package edu.java.interface04;

// 상속받는 인터페이스의 구현(implementation)
// 부모 인터페이스를 구현하는 클래스

class TestImple1 implements ParentInterface {

	@Override
	public void test1() {
		System.out.println(" 부모 인터페이스 메소드 1");
		
	}
	
}

class TestImple2 implements ChildInterface {

	// 자식 인터페이스는 부모것을 물려받기 때문에 부모가 가진 메소드도 override 해줘야한다.
	@Override
	public void test1() {
		System.out.println("부모 메소드2");
		
	}

	@Override
	public void test2() {
		System.out.println("자식 메소드2");
		
	}


	
}

public class Main04 {

	public static void main(String[] args) {
		TestImple1 imple1 = new TestImple1();
		imple1.test1();

	}

}
