package edu.java.array06;

public class ArrayMain06 {

	public static void main(String[] args) {
		// char 26개를 저장할 수 있는 배열 alphas를 선언
		// for 문을 사용해서 'a' ~ 'z' 까지 저장
		//for-each 문을 사용해서 배열 alphas의 내용을 출력
		
		char[] alphas = new char[26];
		char ch= 'a';
		for(int i = 0; i < alphas.length; i++) {
			alphas[i] = ch;
			ch++;			
		}
		
		
		
		for(int i =0; i < alphas.length; i++) {
			alphas[i] = (char) ('a' + i);
		}
		
		
		
		
		
		
		for(int i = 0; i< alphas.length; i++) {
			System.out.print(" " + alphas[i]);
		}
		System.out.println();
		
		for(char x : alphas) {
			System.out.println(x);
		}
	}

}
