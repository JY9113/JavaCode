package edu.java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		// 기본 생성자를 사용해서, MyCircle 클래스의 인스턴스르 생성
		MyCircle c1 = new MyCircle();
		System.out.println("반지름 : " + c1.radius);
		c1.radius = 1.0;
		System.out.println("면적 : " + c1.calcArea());
		
		System.out.println();
		System.out.println("-----------------------------");
		MyCircle c2 = new MyCircle(2.0);
		System.out.println("반지름 : " + c2.radius);
		System.out.println("면적 : " + c2.calcArea());
		
		System.out.println();
		System.out.println("-----------------------------");
		MyCircle c3 = new MyCircle(10);
		System.out.println("반지름 : " + c3.radius);
		System.out.println("면적 : " + c3.calcArea());
	}

}
