package edu.java.lambda01;

public class LambdaMain01 {

	public static void main(String[] args) {
		System.out.println("[1] 인터페이스를 구현하는 클래스 사용");
		
		AdderImple adder1 = new AdderImple();
		double result = adder1.add(2.0, 3.0);
		System.out.println("result = " + result);

		System.out.println();
		System.out.println("[2] 다형성 사용");
		Adder adder2 = new AdderImple();
		result = adder2.add(1.0, 2.0);
		System.out.println("result = " + result);

		
		System.out.println();
		System.out.println("[2] 익명 클래스 사용");
		Adder adder3 = new Adder() {
			@Override
			public double add(double x, double y) {
				return x + y;
			}
		};
		result = adder3.add(1.1, 2.2);
		System.out.println("result = " + result);
		
		// f(x, y) = x + y
		// f : (x, y) -> x + y   	: 람다식
		// f(x) = a*x + b
		// f : (x) -> a*x + b		: 람다식
		
		System.out.println();
		System.out.println("[4] 람다(lambda) 표현식");
		Adder adder4 = (x, y) -> x + y;
		result = adder4.add(1.1,  2.2);
		System.out.println("result = " + result);
	}

}
