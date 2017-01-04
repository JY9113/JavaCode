package edu.java.while04;

public class WhileMain04 {

	public static void main(String[] args) {
		// 369 게임 결과 출력
		// 1 ~ 100

		for(int n = 1; n <=100; n++) {
			// 1의 자리 수(10으로 나눈 나머지)를 찾음
			int x = n % 10;
			// 10의 자리수(10으로 나눈 몫)를 찾음
			int y = n / 10;
			
			// 출력
			if ((x == 3 || x == 6 || x == 9) && (y == 3 || y == 6 || y == 9)) {
				// 1의 자리수가 3, 6, 9 이면 *를 출력
				System.out.print("// ");
			} else if (y == 3 || y == 6 || y == 9) {
				System.out.print("* ");
			} else if(x == 3 || x == 6 || x == 9){
				System.out.print("* ");
			} else {
				System.out.print(n + " ");
			}
			
			
			// 숫자 10개씩마다 줄바꿈
			if (n % 10 == 0) {
				System.out.println();
			}
			
		}
		
		System.out.println("==================================");
		
		int n = 1;
		while(n <= 100){
			int x = n % 10;
			int y = n / 10;
			
			if(x == 3 || x == 6 || x == 9){
				System.out.print("* ");
			} else if(y == 3 || y == 6 || y == 9) {
				System.out.print("* ");
			} else {
				System.out.print(n + " ");
			}			
			
			if(n % 10 == 0) {
				System.out.println();
			}
			n++;
		}

	}

}
