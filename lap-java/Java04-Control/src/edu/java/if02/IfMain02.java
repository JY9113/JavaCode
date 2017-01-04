package edu.java.if02;

import java.util.Scanner;

public class IfMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요");
		int x = sc.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int y = sc.nextInt();
		System.out.println("입력한 수 : " +  x + ", " + y);
		
		int big;
		if(x > y) {
			// 조건이 참일 때 실행되는 부분 
			big = x;
			
		} else {
			// 조건이 거짓일 때 실행되는 부분
			big = y;
		}
		
		System.out.println("둘 중 큰 수는 " + big + "입니다");
		
		System.out.println("================================");
		// 삼항 연산자 : (조건식) ? (값1) : (값2)
		// (조건식)이 참이면 (값1)을 선택
		// (조건식)이 거짓이면 (값2)를 선택
		
		int big2 = (x > y) ? x : y; 
		System.out.println("big2 = " + big2);
		
		sc.close();
		
		
	}

}
