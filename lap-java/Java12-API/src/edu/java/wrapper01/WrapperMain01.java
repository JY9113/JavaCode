package edu.java.wrapper01;

//Wrapper 클래스: 자바의 기본 데이터 타입을 감싸는 클래스
//기본 자료형: boolean, byte, short, int, long, char, float, double
//wrapper 클래스:
//Boolean, Byte, Short, Integer, Long, Character, Float, Double
//wrpper 클래스를 사용하는 이유:
//	1. 클래스의 메소드(기능), 상수(public static final)를 사용하기 위해서
//	2. 매개변수로 Object를 갖는 메소드의 매개변수로 사용하기 위해서
//	. 컬렉션 프레임워크에서 사용하기 위해서

public class WrapperMain01 {

	public static void main(String[] args) {
		// Wrapper 클래스의 상수
		System.out.println("byte 타입의 최소값: " + Byte.MIN_VALUE);
		System.out.println("byte 타입의 최대값: " + Byte.MAX_VALUE);
		System.out.println("int 최소값: " + Integer.MIN_VALUE);
		System.out.println("int 최대값: " + Integer.MAX_VALUE);
		
		System.out.println();
		// wrapper 클래스의 인스턴스 생성과 사용
		int n1 = 123; // 기본 자료형
		Integer num1 = new Integer(123); // wrapper 클래스
		// n1은 stack에 생성
		// Integer는 heap에 생성되고 123하나만 저장 stack에 있는 num1에는 123의 주소값이 들어있다(123은 heap영역에?). 
		
		// wrapper 클래스에 저장된 값을 읽어오는 메소드
				int value1 = num1.intValue();
				System.out.println("value1 = " + value1);
				
				System.out.println();
				Double num2 = new Double(1.23);
				System.out.println("num2 = " + num2);
				
				double value2 = num2.doubleValue();
				System.out.println("value2 = " + value2);
				
				System.out.println("==================");
				System.out.println();
				// wrapper 클래스에 있는 static 메소드를 사용해서 인스턴스 생성
				// valueOf()
				Integer num3 = Integer.valueOf(100);
				System.out.println("num3 = " + num3);
				
				Double num4 = Double.valueOf(3.14);
				System.out.println("num4 = " + num4);
				
				Integer num5 = Integer.valueOf("200");
				System.out.println("num5 = " + num5);
				
				System.out.println("==================");
				System.out.println();
				// parseXxx(): 
				// 문자열을 전달 받아서, 기본 자료형을 리턴해 주는 static 메소드
				int x = Integer.parseInt("123456");
				System.out.println("x = " + x);
				
				double y = Double.parseDouble("3.141592");
				System.out.println("y = " + y);

	} // end main()
}
