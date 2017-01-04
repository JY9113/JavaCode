package edu.java.access04;

public class AccessMain04 {

	public static void main(String[] args) {
		
		// 매개변수가 있는 생성자를 사용해서 Contact 클래스의 인스턴스 생성
		Contact c1 = new Contact("AAA" , "01012341234", "AAA@aaa.com");
		
		c1.displayInfo();
		
		System.out.println();
		c1.setName("BBB");
		c1.displayInfo();
		
		System.out.println();
		c1.setEmail("BBB@bbb.com");
		c1.displayInfo();
		
		// 기본 생성자를 사용해서 Contact 클래스의 인스턴스 생성
		System.out.println();
		System.out.println("-----------------------------");
		
		Contact c2 = new Contact();
		c2.displayInfo();
		
		System.out.println();
		c2.setName("CCC");
		c2.setPhone("01099999999");
		c2.setEmail("CCC@CCC.com");
		c2.displayInfo();		

	}

}
