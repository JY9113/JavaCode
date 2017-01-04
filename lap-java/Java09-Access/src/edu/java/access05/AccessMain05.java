package edu.java.access05;

public class AccessMain05 {

	public static void main(String[] args) {
		Point pt1 = new Point();
		System.out.println("(" + pt1.getXpoint() + ", " + pt1.getYpoint() + ")");
		
		//매개변수 생성자를 사용해서 Point 클래스의 인스턴스 생성
		Point pt2 = new Point(1, 0);
		System.out.println("(" + pt2.getXpoint() + ", " + pt2.getYpoint() + ")");
		
		// 두 점(pt1, pt2) 사이의 거리 출력
		double d = pt1.distance(pt2);
		System.out.println("거리 = " + d);
		
		d = pt2.distance(pt1);
		System.out.println("거리 = " + d);

	}

}
