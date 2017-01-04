package edu.java.variable10;

import java.util.Scanner;

public class VariableMain10 {
	
	public static void main(String[] args){
		
		System.out.println("초간단 계산기");
		// double 타입의 숫자 2개를 입력 받아서 저장.
		// 두 수의 사칙 연산
		
		double d1, d2;
		double add, mul, sub, div;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력해 주세요");
		d1 = sc.nextDouble();
		System.out.println("두 번째 수를 입력해 주세요");
		d2 = sc.nextDouble();
		
		
		add = d1 + d2;
		mul = d1 * d2;
		sub = d1 - d2;
		div = d1 / d2;
		
		System.out.printf("\n입력하신 수는 %.1f, %.1f 입니다\n", d1, d2);
		System.out.println("두 수의 합은 : " + add);
		System.out.println("두 수의 곱은 : " + mul);
		System.out.println("두 수의 차 : " + sub);
		System.out.println("두 수를 나누면 : " + div);
		sc.close();
		
	}

}
