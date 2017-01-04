package edu.java.access10;

public class AccessMain10 {
	
	public static void test1() {
		System.out.println("테스트"); // static 붙이는 이유는 인스턴스 만들지 않으려고
	}
	public void test2() {
		System.out.println("테스트2");
	}

	public static void main(String[] args) {
		 test1();
		AccessMain10.test1();
		
		// test2(); // static 안에서 static이 아닌것을 호출하기 때문에
		AccessMain10 prog = new AccessMain10();
		prog.test2();
		// static 멤버 변수 - 인스턴스 생성 없이 사용 가능
		System.out.println(TestStatic.num2);
		TestStatic.num2 = 123;
		
		// static(클래스) 메소드 - 인스턴스 생성 없이 사용 가능
		TestStatic.display2();

		// TestStatic 클래스의 인스턴스를 생성
		TestStatic test = new TestStatic();
		System.out.println(test.num1);
		test.num1 = 100;
		test.display1();
		
		TestStatic test2 = new TestStatic();
		test2.display1();
		
		TestStatic.num2 = 456;
		test.display1();
		test2.display1();
		
	}

}
