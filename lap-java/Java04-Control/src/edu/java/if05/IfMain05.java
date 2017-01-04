package edu.java.if05;

import java.util.Scanner;

public class IfMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*char c1 = 'Z';
		System.out.println((int) c1);
		System.out.println('C' < 'Z');*/
		
		// 문자 하나를 입력받아서 그 글자가 
		// 1) A ~ Z이면, "영대문자"라고 출력
		// 2) a ~ z이면, "영소문자"라고 출력
		// 3) 0 ~ 9이면, "숫자"라고 출력
		// 4) 그 외의 경우는, "몰라요"
		
		System.out.println("문자 하나를 입력하세요");

		Scanner sc = new Scanner(System.in);
		char c1 = sc.nextLine().charAt(0);
		sc.close();
		
		System.out.println("입력하신 문자는 : " + c1);
		
		if (c1 >= 'A' && c1 <= 'Z') {
			
			System.out.println("영대문자");
			
		} else if(c1 >= 'a' && c1 <= 'z') {
			
			System.out.println("영소문자");
			
		} else if(c1 >= '0' && c1 <= '9') {
			
			System.out.println("숫자");
			
		} else {
			
			System.out.println("몰라요");
			
		}
		
		
		

	}

}
