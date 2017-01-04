package edu.java.if08;

public class IfMain08 {

	public static void main(String[] args) {
		// 중첩if문
		
		int num = 22;
		if ( num % 2 == 0) {
			System.out.println("짝수");
			if ( num % 4 == 0) {
				System.out.println("4의배수");
			} else {
				System.out.println("짝수이긴 하지만, 4의 배수는 아님");
			}
		} else { 
			System.out.println("홀수");
		}

	}

}
