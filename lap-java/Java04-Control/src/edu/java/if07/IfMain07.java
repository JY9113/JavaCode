package edu.java.if07;

import java.util.Scanner;

public class IfMain07 {
	
	public static void main(String[] args) {
		// 정수 두개를 입력받아서,
		// 두 수의 차를 출력

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력하세요");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 수를 입력하세요");
		int num2 = sc.nextInt();
		
		int result;
		
		if(num1 >= num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		
		sc.close();
		System.out.println("두 수의 차는 " + result + " 입니다.");
		
		System.out.println("---------삼항 연산자 사용---------");
		int result2 = (num1 >= num2) ? (num1-num2) : (num2 - num1);
		System.out.println("두 수의 차는 " + result2 + " 입니다.");
		
		
	}

}
