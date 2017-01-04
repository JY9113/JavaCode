package edu.java.loop05;

public class LoopMain05 {

	public static void main(String[] args) {
		System.out.println("\n\n\n과제 ");
		int dan = 2;		
		while(dan < 10){
			int n = 1;
			System.out.println("구구단 " + dan + "단");
			System.out.println("------------------------------");
			while(n < 10) {
				System.out.println(dan + " X " + n + " = " + (dan * n));
				if (dan == n) {
					break;
				}
				n++;
			}			
			dan++;
			System.out.println("\n\n");
		}
		
		System.out.println("\n-------------------------\n");
		dan = 2;
		int n = 1;
		while(dan < 10) {
			n = 1;	//n 이 while문 밖에서 선언됐으므로 초기화다시 해줘야 while 문 수행.
			while(n < 10) {
				System.out.println(dan + " X " + n + " = " + (dan * n));
				if (dan==n) {
					break;
				}
				n++;
			}
			System.out.println();
			dan++;
		}
	}

}
