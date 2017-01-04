package edu.java.rps03;

public class GameMain03 {

	public static void main(String[] args) {
		// 교재 p134 확인문제 3
		// 1 ~ 100 정수들 중에서 3의 배수들의 합
		// sum = 3 + 6 + 9...... + 96 + 99
		// for 문 사용
		// while 문 사용
		
		int sum = 0;
		for ( int i = 1; i <= 100; i++) {
			if ( i % 3 == 0) {
				sum += 1;
			}
		}
		
		System.out.println("sum = " +sum);		
		System.out.println("==================================");		
		sum = 0;

	}

}
