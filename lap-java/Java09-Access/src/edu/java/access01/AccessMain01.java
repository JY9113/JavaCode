package edu.java.access01;

public class AccessMain01 {

	public static void main(String[] args) {
		// Test01 클래스의 인스턴스를 생성
		Test01 t1 = new Test01();
		t1.display(); // display는 public이고, test01이라는 클래스안에 display와 n1은 같은 메모리상에 존재하므로 n1 출력은 가능.
//		t1.n1 = 100;   => t1의 n1은 private 이기 때문에 다른 클래스인 여기서는 값 변경을 할 수 없다.
//		private 멤버 변수는 다른 클래스에서는 직접 접근 가능하지 않다. => 값을 변경하거나 읽어오는게 불가능
//		System.out.println(t1.n1); => 직접 읽어올 수 없기 때문에 불가능. public 메소드를 통해서는 가능( 8 번째 라인)
		
		t1.n2 = 200; // (package) : Test01과 Main 클래스가 같은 패키지에 있기 때문에 가능.
		t1.n3 = 300; // protected : 같은 패키지에 있기 때문에 접근 가능
		t1.n4 = 400; // public : 어디에서든 접근 가능.
		t1.display(); // n1은 접근 불가능 했지만 나머지는 값이 바뀐 것을 확인 가능.

	}

}
