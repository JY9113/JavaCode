package edu.java.loop02;

public class LoopMain02 {

	public static void main(String[] args) {
		
		//100보다 작은 7의 배수를 출력
		int n = 1;
		while(n < 100) {
			if(n % 7 == 0) {
				System.out.println(n);
			}
			n++;
		}
		
		System.out.println("------------break 사용-------------");
		n = 1;
		while(true) { //while 문을 무한히 반복하겠다
			int result = 7 * n;
			if(result >= 100) {
				break; // 반복문 종료
			} else {
				System.out.println(result);
			}
			n++;
		}
	}

}
