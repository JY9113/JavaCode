package edu.java.loop01;

public class LoopMain01 {

	public static void main(String[] args) {
		System.out.println("break");
		// 반복문(for, while, do-while) 안에서 break를 만나면
		// break가 있는 위치에서 가장 가까운 곳의 반복문을 종료
				
		for(int n = 1; n <= 10; n++) {
			System.out.println(n);
			if (n == 5) {
				break;
			}// end if
		}
		
		System.out.println("----------------------------------");
		int n = 1;
		while(n <= 10) {
			System.out.println(n);
			if (n == 5) {
				break; //반복문(while) 종료
			}
			n++;
		}
		
		System.out.println("----------------------------------");
		

	}

}
