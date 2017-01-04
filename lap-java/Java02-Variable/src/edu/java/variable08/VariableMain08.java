package edu.java.variable08;

import java.util.Scanner;

public class VariableMain08 {

	public static void main(String[] args) {
		//키보드로 숫자를 입력 받아서 변수에 저장
		/*
		 * 1. Scanner 타입의 변수를 선언하고 초기화
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		//국어 점수를 저장하는 변수 선언하고, 입력 받은 값으로 저장
		System.out.println("국어 점수 입력하세요");
		int korean;
		korean = sc.nextInt(); //sc.nextDouble();
		System.out.println("국어 점수 : " + korean);
		
		/*   실수도 scanner 사용 가능
		System.out.println("실수 입력 : ");
		double x = sc.nextDouble();
		System.out.println("x = " + x);
		*/
		
		//사용이 끝난 Scanner를 close
		sc.close();

		
	}

}
