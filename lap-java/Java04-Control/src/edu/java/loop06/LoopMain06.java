package edu.java.loop06;

public class LoopMain06 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던져서 (x, y)와 같은 형식으로 출력
		// 두 개의 주사위가 같은 수가 나올 때까지 반복

		// boolean run = true;	
		
		while(true) {	//while(run)			
			double random1 = Math.random();
			double random2 = Math.random();
			int first = (int)(random1 * 6) + 1;
			int second = (int)(random2 * 6) + 1;
			
			System.out.println(first + " , " + second);
			if(first == second) {
				System.out.println(first + "와 " +second +" 값이 같으므로 종료. \n\n\n");
				break; // run=false;
			}
		}	
		
		System.out.println("-----------------------------------------------");
		for(int i = 1; i > 0; i++) {
			double random1 = Math.random();
			double random2 = Math.random();
			int first = (int)(random1 * 6) + 1;
			int second = (int)(random2 * 6) + 1;
			
			System.out.println(first + " , " + second);
			if(first == second) {
				System.out.println(i + "번째에 "+ first + "와 " +second +" 값이 같으므로 종료.");
				break;
			}			
		}
		System.out.println("\n\n---------------for문을 이용한 무한루프--------------");
		for(;;) {
			double random1 = Math.random();
			double random2 = Math.random();
			int first = (int)(random1 * 6) + 1;
			int second = (int)(random2 * 6) + 1;
			
			System.out.println(first + " , " + second);
			if(first == second) {
				System.out.println(first + "와 " +second +" 값이 같으므로 종료.");
				break;
			}			
		}
		
		System.out.println("\n\n---------------do-while 이용한 무한루프--------------");
		double random1 = Math.random();
		double random2 = Math.random();
		int first;
		int second;
		
		do {			
			first = (int)(random1 * 6) + 1;
			second = (int)(random2 * 6) + 1;
			System.out.println(first + " , " + second);
			if(first == second) {
				System.out.println(first + "와 " +second +" 값이 같으므로 종료.");
			}			
		} while(first != second);
		
		
	}

}

