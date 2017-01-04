package edu.java.variable02;

public class VariableMain02 {

	public static void main(String[] args) {
		System.out.println("변수 선언, 초기화 사용 연습 \n");
		
		//국어(korean), 영어(english), 수학(math) 
		//점수를 저장할 수 있는 int 타입을 선언
		int korean, english, math;
		
		//각 변수에 점수를 저장
		korean = 80;
		english = 100;
		math = 70;
		
		//국어/영어/수학 점수를 출력
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		
		//int 타입 변수 total을 선언, 국/영/수 점수의 합계를 저장
		int total;
		total = korean + english + math;
		System.out.println("총점 : " + total );
		
		//int 타입의 변수 average를 선언, 세 과목의 평균을 계산해서 저장
		int average;
		average = total / 3;
		System.out.println("평균 : " + average);

	}

}
