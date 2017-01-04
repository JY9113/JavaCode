package edu.java.class02;

// 같은 패키지에 포함된 클래스는 import 없이 사용 가능
// java.lang 패키지에 포함된 클래스는 import 없이 사용 가능(String, ...)

public class ClassMain02 {

	public static void main(String[] args) {
		// 기본 생성자를 사용해서 MyRectangle 클래스의 인스턴스를 생성
		MyRectangle rect1 = new MyRectangle();
		System.out.println("가로: " + rect1.width);
		System.out.println("세로: " + rect1.height);
		rect1.width = 3.0;
		rect1.height = 4.0;
		System.out.println("면적: " + rect1.calcArea());
		
		System.out.println("==============");
		// 매개변수가 있는 생성자를 호출해서 인스턴스 생성
		MyRectangle rect2 = new MyRectangle(10.0, 2.0);
		System.out.println("가로: " + rect2.width);
		System.out.println("세로: " + rect2.height);
		System.out.println("면적: " + rect2.calcArea());
		
	} // end main()

} // end class ClassMain02


















