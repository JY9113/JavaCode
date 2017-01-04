package edu.java.loop04;

public class LoopMain04 {
	
	public static void main(String[] args) {
		System.out.println("이중 반복문 \n");
		
		for(int dan = 2; dan < 10; dan++){
			System.out.println("구구단 " + dan + "단");
			for(int n = 1; n < 10; n++) {
				System.out.println(dan + " X " + n + " = " + (dan * n));
			}
			System.out.println();
		}
		
		System.out.println("이중 while문 \n");
		int dan = 2;		
		while(dan < 10){
			int n = 1;
			System.out.println("구구단 " + dan + "단");
			while(n < 10) {
				System.out.println(dan + " X " + n + " = " + (dan * n));
				n++;
			}			
			dan++;
		}
		
	}

}
