package edu.java.inherit12;


// abstract : 추상적인, 실체가 없는
// abstract 메소드 (추상 메소드) :
//	메소드의 원형(prototype : 리턴 타입, 이름, 매개변수)만 선언하고,
//	메소드의 본체(body)를 구현하지 않은 메소드
//	{...} 이 없음
//	abstract 리턴타입 메소드이름(매개변수, ...); 형식으로 선언
// abstract 클래스 (추상 클래스) :
//	추상 메소드를 하나라도 가지고 있는 클래스
//	abstract class 클래스이름 {...} 형식으로 정의
//	추상 클래스는 인스턴스를 생성할 수 없다. (생성자를 호출할 수 없다!)
//	상속받는 클래스에서 추상 메소드를 override 하면 인스턴스를 생성할 수 있음

abstract class TestAbstract {
	private int x; // 멤버 변수
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	// 추상 메소드 : 본체가 없는 메소드
	public abstract void hello();
}


class TestChild1 extends TestAbstract {

	// 추상 클래스를 상속받는 자식 클래스에서
	// 추상 메소드를 override(재정의)해서 본체를 정의
	@Override
	public void hello() {
		System.out.println("안녕하세요~");
		
	}
	
}

class TestChild2 extends TestAbstract {
	
	@Override
	public void hello() {
		System.out.println("Hello~");
	}
}

public class InheritMain12 {
	
	public static void main(String args[]){
		// 추상 클래스는 인스턴스를 생성할 수 없다!
		// TestAbstract test1= new TestAbstract();	=> 본체가 없는 추상 메소드가 있기 때문.
		
		// TestChild1 클래스 인스턴스 생성
		TestChild1 child1 = new TestChild1();	// 상속받은 부모클래스의 추상메소드를 override 하기 때문
		child1.setX(123);
		System.out.println("x = " + child1.getX());
		child1.hello();
		
		// 다형성
		TestAbstract child2 = new TestChild1();
		child2.hello(); 	
		
		TestAbstract child3 = new TestChild2();
		child3.hello();
		
		TestAbstract child4 = new TestChild2();
		child4.hello();
		
	}
}
