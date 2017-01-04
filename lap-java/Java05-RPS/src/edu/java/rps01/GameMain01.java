package edu.java.rps01;

public class GameMain01 {

	public static void main(String[] args) {
		// RPS(Rock, Paper, Scissors)
		// 난수(random number)
		
		double r = Math.random(); //0과 1 사이의 난수를 발생.
		System.out.println(r); // 0 <= r < 1의 값이 출력.
		System.out.println(3 * r); // 0 <= 3r < 3 
		System.out.println(3 * r + 1); // 1 <= 3r + 1 < 4
		
		//double 타입을 강제로 int 타입으로 형 변환.
		int choice = (int) (3 * r + 1);
		System.out.println(choice);
		
		
		
		

	}

}
