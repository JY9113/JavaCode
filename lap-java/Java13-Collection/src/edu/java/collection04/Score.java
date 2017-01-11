package edu.java.collection04;

public class Score {
	// 멤버 변수 (필드)
	private int korean;
	private int english;
	
	// 생성자 - 기본 , 매개변수 있는 생성자
	public Score(){}
	public Score(int korean, int english) {
		this.korean = korean;
		this.english = english;
		
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	

}
