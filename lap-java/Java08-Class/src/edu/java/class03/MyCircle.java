package edu.java.class03;

// 클래스 : 멤버 변수(속성, 성질, 상태) + 메소드(기능) + 생성자 => 데이터 타입

public class MyCircle {
	
	// 멤버변수
	double radius;

	
	// 생성자
	public MyCircle()  {}  // 생성자는 클래스가 가지고 있는 멤버변수만큼 메모리를 확보.
					   // 따라서 멤버변수가 생성자 밑에 멤버변수가 선언되어도 사용 가능.
	public MyCircle(double r) {
		radius = r;
	}
	
	// 메소드 : 원의 면적을 리턴
	public double calcArea() { //멤버변수에 계산하고자 하는 반지름이 있기 때문에 매개변수 필요 없다.
		return 3.14 * radius * radius;
	}
//	double radius;
}
