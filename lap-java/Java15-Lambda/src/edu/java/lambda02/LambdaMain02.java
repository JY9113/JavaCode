package edu.java.lambda02;

public class LambdaMain02 {

	public static void main(String[] args) {
		// 익명 클래스, 람다 표현식 연습
		
		// 람다(Lambda) 표현식 : 
		// (매개변수 리스트, .....) -> {실행문; 리턴; };
		// 인터페이스 변수 = 람다 표현식;

		Test1 test1 =  new Test1() {
			@Override
			public void testPrint() {
				System.out.println("익명 클래스");				
			}
		};
		test1.testPrint();

		System.out.println();
		Test1 test2 = () -> {
			System.out.println("람다 표현식 연습..");
		};
		test2.testPrint();
		
		System.out.println();
		Test2 test3 = new Test2() {			
			@Override
			public void testPrint2(int n) {
				System.out.println(" 입력한 숫자는 " + n);
			}
		};
		test3.testPrint2(10);
		
		System.out.println();
		Test2 test4 = (n) -> {
			System.out.println(" 입력한 숫자는 " + n);
		};
		test4.testPrint2(200);
	
		
		
	}
	

}

interface Test1 {	
	public abstract void testPrint();
}

interface Test2 {
	public abstract void testPrint2(int n);
}