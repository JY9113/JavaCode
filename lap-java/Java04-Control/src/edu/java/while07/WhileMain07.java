package edu.java.while07;

public class WhileMain07 {

	public static void main(String[] args) {
		int n = 1;
		// 1.
		System.out.println("for 문");
		for(n = 1; n < 10; n++) {
			System.out.println("7 X " + n + " = " + (7 * n));
		}
		
		// 2.
		System.out.println("-------------------------------");
		System.out.println("While 문");
		n = 1;
		while(n < 10){
			System.out.println("8 X " + n + " = " + (8 * n));
			n++;
		}
		
		// 3.
		System.out.println("-------------------------------");
		System.out.println("do - while 문");
		n = 1;
		do {
			System.out.println("9 X " + n + " = " + (9 * n));
			n++;
		}while(n < 10);
		
	}

}
