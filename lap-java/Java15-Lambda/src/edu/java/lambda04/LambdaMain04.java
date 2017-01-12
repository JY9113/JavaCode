package edu.java.lambda04;

public class LambdaMain04 {

	public static void main(String[] args) {
		MyMath math1 = new MyMath() {
			@Override
			public double operate(double x, double y) {
				return x + y;
			}
		};
		double result = math1.operate(1, 2);
		System.out.println("result = " + result);
		
		
		// 람다 표현식
		// (매개변수 리스트) -> 리턴 값;
		// (매개변수 리스트) -> {실행문; ......return;}
		MyMath math2 = (x, y) -> x - y;
		result = math2.operate(5.0, 1.0);
		System.out.println("result = " + result);
		
		MyMath math3 = (x, y) -> x * y;
		result = math3.operate(1.0, 6.0);
		System.out.println("result = " + result);

	}

}

interface MyMath {
	public abstract double operate(double x, double y);
}