package edu.java.class04;

public class Student {
	// 멤버 변수 (필드, 프로퍼티)
	int stuNo; // 학생 번호
	String name; // 학생 이름
	Score score; //학생의 점수
	
	// 생성자
	public Student(int stuNo, String name, Score score) {
		this.stuNo = stuNo;
		this.name = name;
		this.score = score;		
	}
	
	// 메소드
	public void displayStudentInfo() {
		System.out.println("------ 학생 정보 --------");
		System.out.println("번호 : " + stuNo);
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + score.kor);
		System.out.println("영어 : " + score.eng);
		System.out.println("수학 : " + score.math);
		System.out.println("총점 : " + score.calcTotal());
		System.out.println("평균 : " + score.calcAverage());
		
	}
	
}
