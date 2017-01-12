package edu.java.lambda01;

// annotation : 미리 컴파일러에게 알려주는 역할

// FunctionalInterface : 추상메소드를 하나만 갖는 interface
// 람다(Lambda) 표현식은 functional interface만 사용 가능!

@FunctionalInterface
public interface Adder {
	
	public abstract double add(double x, double y);

}
