package edu.java.inherit11;


// final : 최종적인, 변경할 수 없는
// final + 멤버 변수, 지역변수 : 상수(한번 초기화된 값을 변경할 수 없다.)
// final + 메소드 : override 할 수 없는 메소드

class SubClass extends SuperClass {
	@Override
	public void test() {
		System.out.println("override 된 테스트");
	}
	
//	public void testFinal() {		=> SuperClass에서 final 메소드 이기 때문에 override 불가
//		
//	}
}

class SuperClass {
	public void test() {
		System.out.println("테스트");
	}
	
	public final void testFinal() {
		System.out.println("파이널 메소드");
	}
}

final class FinalClass {
	private int x;
}

//class ChildClass extends FinalClass {	=> FinalClass 가 final 이기 때문에 상속받을 수 없다.
//							=> final은 변경할 수 없기 때문에 상속 불가
//	
//}
public class InheritMain11 {
	public static final int MAX = 100; // final 멤버 변수
	

	public static void main(String[] args) {
//		Max = 200;    => 변경 불가
		final int number = 123;
//		number = 456;		=> 변경 불가
		

	}

}
