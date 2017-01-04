package edu.java.loop07;

public class LoopMain07 {

	public static void main(String[] args) {
		// 1 + 2 + 3 + ....... + 99 + 100
		int sum = 0;
		for (int n = 1; n <= 100; n++) {
			sum += n; //sum = sum + n;
		}
		System.out.println("sum = " + sum);
		System.out.println();
		System.out.println();
		
		//sum = 1 + 2 + 3 + ...  >= 100
		//n의 값과 sum의 값을 출력
		
		
		System.out.println("-------------------------------");
		sum = 0;
		for (int n = 1; ; n++) {
			sum += n;
			if(sum >= 100) {
				System.out.println("sum이 100이 넘었을 때");
				System.out.println("sum = " + sum);
				System.out.println("n = " + n);
				break;
			}
		}	
		
		System.out.println("\n----------for문 이용-------------");
		sum = 0;
		int n = 1;
		for (n = 1; sum <= 100; n++) { //조건식이 꼭 초기값의 변수에 대한 조건식일 필요는 없음.
			sum += n;
			System.out.println("n = " + n + "  sum = " + sum);
		}
		
		System.out.println("\n----------for문 무한루프 이용-------------");
		sum = 0;
		n = 1;
		for(;; n++) {
			sum += n;
			System.out.println("n = " + n + "  sum = " + sum);
			if(sum >= 100) {
				break;
			}
			// n++; for문안에 적지 않고 여기다 적어도 된다.
		}
	}

}
