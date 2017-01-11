package edu.java.collection04;

public class Student {
	
	private String name;
	private Score score;
	
	// 기본 생성자, 매개변수 생성자
	public Student() {}
	public Student(String name, Score score) {
		this.name = name;
		this.score = score;
		
	}
	
	// getters, setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		String str = " 학생 이름 : " + name + "\n 국어 점수 : " + score.getKorean() + "\n 영어 점수 : " + score.getEnglish();
		return str;
	}

	

}
