package edu.java.access05;

// 클래스 : 멤버 변수(성질, 상태, 속성) + 메소드(기능) + 생성자
public class Point {
	// 멤버 변수 (필드, 프로퍼티)	
	private double xpoint;
	private double ypoint;
	
	// 생성자
	
	public Point() {} // heap에 메모리 공간 확보, 멤버 변수 값을 기본값으로 초기화
	public Point(double xpoint, double ypoint) {
		this.xpoint = xpoint;
		this.ypoint = ypoint;
	}
	
	public void setXpoint(double xpoint) {
		this.xpoint = xpoint;
	}
	
	public void setYpoint(double ypoint) {
		this.ypoint = ypoint;
	}
	
	public double getXpoint() {
		return xpoint;
	}

	public double getYpoint() {
		return ypoint;
	}
	
	// 자기 자신과 다른 점 사이의 거리를 리턴하는 메소드
	
	public double distance(Point pt) {
		double xDistance = (this.xpoint) - (pt.xpoint);
		double yDistance = (this.ypoint) - (pt.ypoint);
		double result = Math.sqrt((xDistance*xDistance) + (yDistance*yDistance));
		return result;
	}
}
