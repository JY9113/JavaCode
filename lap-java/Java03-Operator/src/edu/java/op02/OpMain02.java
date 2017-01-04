package edu.java.op02;

public class OpMain02 {

	public static void main(String[] args) {
		System.out.println("복합 대입 연산자(+=, -=, *= /=, %=, .....)");
		
		int age = 16;
		age = age + 1; // 연산자는 대입보다 +가 먼저
		
		System.out.println("age = " + age);
		age += 1;
		
		System.out.println("age = " + age);
		
		int x = 123;
		x -= 10;
		System.out.println("x = " + x);
		
		

	}

}
