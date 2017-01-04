package edu.java.inherit09;

public class Test2 extends Test1 {
	
	@Override
	public void display() {
//		System.out.println("a = " + a);		=> private 은 상속을 받아도 사용 불가
		System.out.println("b =" + b);		// package
		System.out.println("c =" + c);		// protected
		System.out.println("d =" + d);		// public
		
	}

}
