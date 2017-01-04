package edu.java.method02;

public class MethodMain02 {
	
	//  메소드 이름 : add
	// 기능 : 두 개의 정수를 매개변수로 전달받아서, 두 정수의 합을 리턴
	// 리턴 타입 : int
	// 매개변수 : int x, int y
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	// 메소드 이름 : sub
	// 기능 : 정수 두 개를 전달 받아서, 그 차를 리턴
	// 리턴 타입 : int
	// 매개변수 : int x, int y
	public static int sub(int x, int y) {
		return x - y;
	}
	
	// 메소드 이름 : mul
	// 기능 : 두 개의 실수(double)를 전달 받아서, 두 수의 곱을 리턴
	// 리턴 타입 : double
	// 매개변수 : double x, double y
	
	public static double mul(double x, double y) {
		return x * y;
	}

	// 메소드 이름 : div
	// 기능 : 두 개의 실수(double)를 전달 받아서, 두 수의 나눈 값을 리턴
	// 리턴 타입 : double
	// 매개변수 : double x, double y
	
	public static double div(double x, double y) {
		return x / y;
	}
	
	public static void main(String[] args) {
		System.out.println("메소드");
		int result = add(1, 2);
		System.out.println(result);
		
		System.out.println();
		result = sub(100, 10);
		System.out.println(result);
		
		
		System.out.println();
		double mresult = mul(1.0, 2.0);	//ctrl 키를 누르고 메소드를 누르면 메소드 정의된 곳으로 링크.
		System.out.println(mresult);
		
		System.out.println();
		mresult = div(1.0, 2.0);
		System.out.println(mresult);

	}
	// 메소드 : 기능을 수행하기 위핸 코드
	// 메소드는 클래스 안에서, 다른 메소드 바깥에서 만듦(정의)
	// (주의) 메소드 안에서 또다른 메소드를 만들 수는 없다!
	// 메소드 정의 :
	//	[수식어] 리턴타입 메소드이름 ([매개변수....]) { 실행문; }
	//		수식어 : public, private, static, ...... - 생략가능
	//		리턴타입 : 자료타입(int, double, String.....), void
	//		매개변수 : 메소드를 호출할 때 전달하는 데이터
	//					전달받는 데이터가 없으면 매개변수 선언이 없어도 됨.
	//					( ) 는 생략할 수 없다!
	//					{ ... } : 메소드 본체 (body)
			
			

}
