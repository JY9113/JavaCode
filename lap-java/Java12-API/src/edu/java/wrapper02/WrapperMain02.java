package edu.java.wrapper02;

public class WrapperMain02 {

	public static void main(String[] args) {
		Integer x = new Integer(100);	// boxing : 포장
		Integer y = new Integer(200);
		// Integer는 클래스기 때문에 이것 자체로 사칙연산을 불가능.
		
		int add = x.intValue() + y.intValue();	// unboxing : wrapper 클래스에서 값을 꺼낸다.
		System.out.println("add = " + add);
		
		int add2 = x + y;
		System.out.println("add2 = " + add2);
		
		Integer z = 300;
		System.out.println("z = " + z);

	}

}
