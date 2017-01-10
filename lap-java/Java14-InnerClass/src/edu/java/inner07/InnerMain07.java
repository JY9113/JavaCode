package edu.java.inner07;

interface Hello {
	public void hello();
	
} // end interface Hello

class Person implements Hello {

	@Override
	public void hello() {
		System.out.println("안녕하세요~~");
	}
	
} // end class Person

class Dog implements Hello {

	@Override
	public void hello() {
		System.out.println("멍멍...");
	}
	
} // end class Dog

public class InnerMain07 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.hello();
		
		Hello p2 = new Person(); // 다형성
		p2.hello();
		
		Hello dog = new Dog();
		dog.hello();
		
		Hello cat = new Hello() {		// 익명 클래스
			@Override
			public void hello() {
				System.out.println("야옹.....야옹......");
				
			}
		};
		cat.hello();
		
		Hello father = new Hello() {
			@Override
			public void hello() {
				System.out.println("I'm your father....");
				
			}
		};
		father.hello();
		
	} // end main()
}
