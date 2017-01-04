package edu.java.method01;

public class MethodMain01 {

	public static void main(String[] args) {
		System.out.println("안녕하세요!");
		System.out.println("A 입니다");
		System.out.println("안녕하세요!");
		System.out.println("B 입니다");		
		
		sayHello("C");
		sayHello("D");
		sayAge(10);

	}
	
	public static void sayHello(String name) {
		System.out.println("안녕하세요!");
		System.out.println("저는 " + name + "입니다");
	}

	public static void sayAge(int age) {
		System.out.println("제 나이는 " + age + "입니다");
	}
}
