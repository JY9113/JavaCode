package edu.java.if03;

public class IfMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("if - else if - else 문 \n");
		
		int x = 100;
		if ( x > 0) { // 조건1
			// 조건 1이 참일 때 실행되는 부분
			System.out.println("양수");
			
		} else if(x == 0) { // 조건2
			// 조건 2가 참일 때 실행되는 부분
			System.out.println("0");	
		} else { 
			// 조건1, 조건2가 모두 거짓일 때 실행되는 부분
			System.out.println("음수");
		}
		System.out.println("if, else if, else 끝");

	}

}
