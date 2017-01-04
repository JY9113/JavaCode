package edu.java.loop03;

public class LoopMain03 {

	public static void main(String[] args) {

		System.out.println("-------------------------------");
		for (int n = 1; n <= 10; n++) {
			if (n % 2 == 1) {
				continue;
			}
			System.out.println(n);
		}
		
		System.out.println("-------------------------------");
		int n = 1;
		while (n <= 10) {
			if (n % 2 == 1) {
				n++; //증가 안 시키면 1인 상태에서 계속 continue
				continue;
			}
			System.out.println(n);
			n++; 
		}

	}

}
