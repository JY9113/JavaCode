package edu.java.while06;

public class WhileMain06 {
	
	public static void main(String[] args) {
		
		int count = 0;
		
		// 1. while 문		
		System.out.println("While 문 ");
		while(count > 0) {
			System.out.println(count); //count 0 이라 while문의 조건을 만족하지 않기 때문에 count 출력안함
			count--; // count는 감소되지 않음.
		}
		System.out.println("count = " + count);
		
		
		//2. do - while 문		
		System.out.println("-----------------------------------------");
		System.out.println("do-while문");
		do {
			System.out.println(count);
			count--;
		}while(count>0);
		System.out.println("count = " + count);
	}

}
