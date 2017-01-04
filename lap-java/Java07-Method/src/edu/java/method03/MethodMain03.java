package edu.java.method03;

import java.util.Scanner;

public class MethodMain03 {

	public static void main(String[] args) {
		// 1. 국어, 영어, 수학 점수를 입력받아서 저장
		int korean, english, math;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("국어 성적을 입력하세요  ");
		korean = scanner.nextInt();
		System.out.print("영어 성적을 입력하세요  ");
		english = scanner.nextInt();
		System.out.print("수학 성적을 입력하세요  ");
		math = scanner.nextInt();
		System.out.println();
		scanner.close();
		
		// 2. 입력 받은 정수를 출력
		System.out.println("입력하신 성적은");
		System.out.println("국어 : " + korean + " 점,  영어 : " + english + " 점,  수학 : " + math + " 점 입니다.");
		System.out.println();
		
		// 3. int calcTotal(int korean, int english, int math)
		// 	정의하고, 호출해서 세 과목의 총점을 출력.
		int total = calcTotal(korean, english, math);
		System.out.println("세 과목의 총점은 : " + total + " 점 입니다.");
		System.out.println();
		
		// 4. double calcAverage(int total) 정의하고, 호출해서 세 과목의 평균을 출력
		double avg = calcAverage(total);
		System.out.printf("세 과목의 평균은 : %.2f",avg);
		System.out.println();
		
		// 5. char calcGrade(double avg) 정의하고, 호출해서 성적('A', 'B', 'C', 'F')를 출력.
		//		90이상 A, 80이상 B, 70이상 C, 그 이외에는 F
		char grade = calcGrade(avg);
		System.out.println("학생의 성적은 : " + grade + " 입니다.");
		
	}
	
	public static int calcTotal(int kor, int eng, int mt) {
		return kor + eng + mt;
	}
	
	public static double calcAverage(int total) {
		return total / 3.0;
	}
	
	public static char calcGrade(double avg) {
		if(avg >= 90 && avg <= 100) {
			return 'A';
		} else if(avg >= 80 && avg < 90) {
			return 'B';
		} else if(avg >= 70 && avg < 80) {
			return 'C';
		} else {
			return 'F';
		}
	}

}
