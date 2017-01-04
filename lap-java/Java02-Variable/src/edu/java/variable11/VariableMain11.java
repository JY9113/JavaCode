package edu.java.variable11;

import java.util.Scanner;

public class VariableMain11 {

	public static void main(String[] args) {
		
		/*String str = "+";
		System.out.println(str);
		
		String str2 = "안녕하세요";
		System.out.println(str2);*/
		
		String op;
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력하세요");
		num1 = sc.nextInt();		
		
		System.out.println("연산자를 입력하세요");
		op = sc.nextLine();
		/* nextInt() : 정수를 입력받는 메소드
		 nextDouble() : 실수를 입력받는 메소드
		 nextLine() : 문자열 한 줄을 입력받는 메소드 (엔터키 입력 전)*/
		
		System.out.println("두 번째 수를 입력하세요");
		num2 = sc.nextInt();
		sc.close();

	}

}
