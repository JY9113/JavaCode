package edu.java.inner01;

// 클래스 : 멤버 변수( + 생성자) + 메소드 => 데이터타입
public class OuterClass {
	
	private int value1;
	
	public OuterClass(int v) {
		this.value1 = v;
	}
	
	public void display() {
		System.out.println("value1 = " + value1);
	}
	
	
	// 멤버 내부 클래스(member inner class) 
	class InnerClass {
		private int value2;
		
		public InnerClass(int v) {
			this.value2 = v;
		}
	
	
		// 외부 클래스의 멤버 변수는 내부 클래스에서 직접 사용이 가능
		public void setOuterValue(int value) {
			value1 = value;
		}
		
		public void printValues() {
			// 외부 클래스의 멤버변수 출력
			System.out.println("outer value : " + value1);
			// 내부 클래스의 멤버변수 출력
			System.out.println("inner value : " + value2);
		}
	}
}
