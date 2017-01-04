package edu.java.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		// 매개변수가 있는 생성자를 사용하여 Score 클래스의 인스턴스 생성
		Score score1 = new Score(10, 20, 30);
		System.out.println("국어 : " + score1.kor);
		System.out.println("영어 : " + score1.eng);
		System.out.println("수학 : " + score1.math);
		System.out.println("총점 : " + score1.calcTotal());
		System.out.println("평균 : " + score1.calcAverage());
		
		System.out.println();
		// Student 클래스의 인스턴스 생성
		//생성자가 있기 때문에 디폴트 생성자를 만들 수 없다. ex) Student student = new Student();
		Student std1 = new Student(1, "AAA", score1 );
		std1.displayStudentInfo();
		
		System.out.println();
		Score score2 = new Score(100, 100, 90);
		Student std2 = new Student(2, "BBB", score2);
		std2.displayStudentInfo();

	}

}
