package edu.java.string03;

class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x ;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "( " + x + ", " + y + " )";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false; //리턴할 때 사용할 변수
		
//		if (obj instanceof Point) {
//			Point pt = (Point) obj;
//			if (x == pt.x && y == pt.y){
//				return true;
//			} else {
//				return false;
//			}
//		} else {
//			return false;
//		}
		if (obj instanceof Point) {
			Point pt = (Point) obj;
			if (x == pt.x && y == pt.y){
				result = true;
			} 
		}
		return result;
	}
}
public class EqualsTest {

	public static void main(String[] args) {
		Point pt1 = new Point(1, 1);
		System.out.println(pt1);
		
		Point pt2 = new Point(1, 1);
		System.out.println(pt2);
		
		// 비교 연산자(==)
		if (pt1 == pt2) {
			System.out.println("같은 참조");
		} else {
			System.out.println("다른 참조");
		}
		
		// equlas() 메소드 : 객체의 값 비교
		if (pt1.equals(pt2)) {
			System.out.println("같은 좌표");
		} else {
			System.out.println("다른 좌표");
		}

	}
}
