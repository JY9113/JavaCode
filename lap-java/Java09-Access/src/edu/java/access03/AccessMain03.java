package edu.java.access03;

public class AccessMain03 {

	public static void main(String[] args) {
		// MyNumer 클래스의 인스턴스 생성
		MyNumber num = new MyNumber(100);
		int result = num.add(1);
		System.out.println("result = " + result);
		
		result = num.add(1);
		System.out.println("result = " + result);
		
		System.out.println();
		System.out.println("------------------------------");
		MyNumber x = new MyNumber(0);
		System.out.println("x의 getNumber()를 통해 접근한 number 값 : " + x.getNumber()); //MyNumber의 멤버변수인 number에 간접적으로 접근

		// x를 통해 MyNumber의 number 값 바꾸기
		x.setNumber(50);
		System.out.println("x의 setNumber(50)을 통해 number 값 바꾸기(getNumber로 출력) : " + x.getNumber());
		

	}

}
