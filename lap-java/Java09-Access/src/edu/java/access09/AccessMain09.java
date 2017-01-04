package edu.java.access09;

public class AccessMain09 {

	public static final int MENU_INSERT = 1;
	public static final int MENU_DELETE = 2;
	public static int test = 100;
	
	public static void main(String[] args) {
		// final : 더이상 바꿀 수 없는
		int x = 10;
		final int y = 10;
		
		x = 123; // 일반적인 지역 변수는 초기화 이후에도 언제든지 값을 변경 가능
		// y = 100; // final은 한번 정한 값을 변경할 수 없다
		// final 지역 변수는 처음 초기화된 값을 변경할 수 없음
		
		test = 200;
		// final 이 아닌 멤버 변수는 언제든지 초기값을 변경할 수 있다
//		MENU_INSERT = 10;  => final 멤버 변수는 초기값을 변경할 수 없다
		
		System.out.println((Math.PI));
		
		

	}

}
