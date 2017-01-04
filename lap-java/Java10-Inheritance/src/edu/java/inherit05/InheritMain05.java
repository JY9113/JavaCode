package edu.java.inherit05;

public class InheritMain05 {

	public static void main(String[] args) {
		String str = new String("문자열");
		System.out.println(str);
		System.out.println();
		
		// Person 클래스의 인스턴스 생성
		Person p1 = new Person("aaa");
		System.out.println(p1); // 주소값 출력
		
		//println(Object) :
		// Object 클래스의 toString() 리턴값을 화면 출력
		
		System.out.println();
		Point pt = new Point(1, 1);
		System.out.println(pt); // 주소값이 출력.
		
	
		
		

	}

}
