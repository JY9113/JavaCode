package edu.java.inner04;

public class OuterClass {
	int value;
	static int count = 0; 	// 인스턴스 생성 없이 사용 가능. OuterClass.count 로 사용 가능

	public OuterClass(int value) {
		this.value = value;
	}
	
	// static 내부 클래스(중첩 클래스, nested class)
	static class NestedClass {
		private String name;
		
		public NestedClass(String name) {
			this.name = name;
		}
		
		public void display() {
//			System.out.println("value = " + value);
			// 외부 클래스의 static이 아닌 변수는 참조할 수 없다!
			
			System.out.println("count = " + count);
			// 외부 클래스에서 static으로 선언된 변수는 참조 가능
			
			System.out.println("name = " + name);
			
		}
		
	}
}
