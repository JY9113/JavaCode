package edu.java.if09;

public class IfMain09 {

	public static void main(String[] args) {
		// SCE (Short-Circuit Evaluation : 짧은 계산)
		// Lazy Evaluation (게으른 계산)
		// A && B를 계산할 때 A가 false 이면, B를 계산하지 않음
		// A || B를 계산할 때 A가 true 이면, B를 계산하지 않음
		
		int x = 0;
		int y = 0;
		
		if((x += 10) < 0 && (y += 10) > 0){
			System.out.println("1");
		} else {
			System.out.println("2");
		}
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		
		x = 0;
		y = 0;
		
		if((x += 10) > 0 || (y += 10) > 0){ //앞 조건이 true 이므로 OR는 둘중 하나만 true 이면 true 이므로 y 계산하지 않고 if문 으로 간다.
											//ㄸ라서 x는 늘어난 10이지만 y 는 늘어나지 않는다.
			System.out.println("1");
		} else {
			System.out.println("2");
		}
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
