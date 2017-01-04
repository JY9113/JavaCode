package edu.java.class04;

// 클래스 : 멤버변수(상태, 속성, 성질) + 메소드(기능) + 생성자(데이터 초기화) => 데이터 타입

public class Score {
	// 멤버 변수 (필드, 프로퍼티)
	int kor; // 국어 점수
	int eng; // 영어 점수
	int math; // 수학점수

	// 생성자 오버로딩
	// 같은 클래스 내에서 메소드 이름은 같고, 매개변수가 반드시 다른게 정의하는 것.
	// 오버라이딩 : 다른 클래스에서 메소드 이름, 인자(매개변수), 리턴값이 모두 다르게 정의하는 것.
	public Score() { } // 매개변수가 없는 "디폴트 생성자"
	public Score(int kor, int eng, int math) {	// 매개변수가 있는 생성자 
		this.kor = kor; //this 는 생성된 인스턴스를 얘기, 따라서 this.kor은 Score가 가지고 있는 kor을 의미한다.
		this.eng = eng;
		this.math = math;
	}
	
	// 메소드
	// 세 과목의 총점을 리턴하는 메소드
	public int calcTotal(){
		return kor + eng + math; // 메소드의 매개변수가 따로 지정해 주지 않았기 때문에 멤버 변수를 뜻한다.
		// 정확하게 하려면 this.kor이지만 굳이.....
	}
	// 세 과목의 평균을 리턴하는 메소드
	public double calcAverage(){
		return calcTotal() / 3.0;
		//return (double) calcTotal() / 3; calcTotal이 int이기 때문에 둘 중 하나를 double로 해줘야 한다.
	}
}
