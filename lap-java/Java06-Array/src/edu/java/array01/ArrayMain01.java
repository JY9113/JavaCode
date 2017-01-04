package edu.java.array01;

public class ArrayMain01 {

	public static void main(String[] args) {
		System.out.println("배열(array)");
/*		int score1 = 100;
		int score2 = 90;
		int score3 = 80;
		
*/
		
		
		System.out.println("--------------------------");
		// 배열의 선언과 초기화
		// 배열타입[] 배열이름 = new 타입이름[배열길이];
		// 배열이름[인덱스] = 값;
		
		int[] koreans = new int[3];
		koreans[0] = 90;
		koreans[1] = 80;
		koreans[2] = 70;
		// System.out.println(koreans[0]);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(koreans[i]);
		}
		
		

	}

}
