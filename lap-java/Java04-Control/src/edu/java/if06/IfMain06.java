package edu.java.if06;

import java.util.Scanner;

public class IfMain06 {

	public static void main(String[] args) {

		// 정수 하나를 입력받아서,
		// 입력 받은 정수가 짝수이면, "짝수"라고 출력
		// 홀수이면, "홀수"라고 출력
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("정수를 입력하세요 ");
		int num = sc.nextInt();
		sc.close();
		
		if(num % 2 == 0 ) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		System.out.println("---------삼항 연산자 이용------------");
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
		
	}

}
