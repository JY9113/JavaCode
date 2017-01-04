package edu.java.interface03;

interface Test1 {
	public abstract void test1();
}
interface Test2 {
	public abstract void test2();
}

class TestImple implements Test1, Test2 {

	@Override
	public void test2() {
		System.out.println("테스트2");
		
	}

	@Override
	public void test1() {
		System.out.println("테스트1");
		
	}
	
}
public class Main03 {

	public static void main(String[] args) {
		// TestImple 클래스의 인스턴스 생성
		TestImple imple1 = new TestImple();
		imple1.test1();
		imple1.test2();
		
		// 다형성
		Test1 imple2 = new TestImple();
		imple2.test1();
//		imple2.test2();		=> 사용 불가. 변수를 Test1로 선언했기 때문에 Test2에 있는 test2를 사용할 수 없다.
		((Test2) imple2).test2(); 	// 형변환으로 test2 사용 가능.

	}

}
