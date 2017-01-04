package edu.java.variable09;

import java.util.Scanner;

public class VariableMain09 {

	public static void main(String[] args) {
		
		// Ctrl + / : 한줄 주석
		// Ctrl + Shift + \ : 여러줄 주석 해제 /* */
		// Ctrl + Shift + / : 여러줄 주석
		
		System.out.println("초간단 성적 처리 프로그램 \n");
		// 키보드로 국,영,수 점수를 입력받아서
		// 총점과 평균을 출력하는 프로그램	
		
		// 입력 받을 준비 : Scanner를 준비
		Scanner sc = new Scanner(System.in);
		
		// 국여,영어,수학 점수를 int로 입력받아서 저장
		int korean, english, math;
		
		System.out.println("국어 점수 입력하세요");	
		korean = sc.nextInt();
		
		System.out.println("영어 점수 입력하세요");
		english = sc.nextInt();
		
		System.out.println("수학 점수 입력하세요");
		math = sc.nextInt();
		
		// scanner 종료
		sc.close();
		
		System.out.println("\n입력하신 각 과목의 점수는");
		System.out.println("국어 점수 : " + korean);
		System.out.println("영어 점수 : " + english);
		System.out.println("수학 점수 : " + math);
		
		int total;
		total = korean + english + math;
		System.out.println();
		System.out.printf("국어/영어/수학의 총점은 %d점 입니다.", total);		

		double average;
		average = total / 3.0;
		System.out.println();
		System.out.printf("국어/영어/수학의 평균은 %.2f점 입니다.", average);

	}

}
