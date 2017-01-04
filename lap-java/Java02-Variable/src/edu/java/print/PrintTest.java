package edu.java.print;

public class PrintTest {
	
	public static void main(String args[]) {
		//print(), println(), printf() ....
		
		// print() : 화면에 문자열 출력 후 줄바꿈을 하지 않음.
		System.out.print("안녕하세요");
		System.out.print("하하하");
		
		// println() : 화면에 문자열 출력 후 줄바꿈을 해줌.
		System.out.println("집에 가고 싶다");
		System.out.println("고홈고홈");
		
		// printf() : 문자열 포맷팅해서 출력
		// %d : 정수 출력, %s : 문자열 출력, %f : 실수 출력
		System.out.printf("%d-%d-%d \n", 2016, 12,21); //2016-12-21
		//10:59 출력
		System.out.printf("%d : %d \n", 10, 59);
		System.out.printf("%s, %d, %f \n", "Java", 123, 3.14);
		System.out.printf("%s, %d, %.3f \n", "Java", 123, 3.14);
	}

}
