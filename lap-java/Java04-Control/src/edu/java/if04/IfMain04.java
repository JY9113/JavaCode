package edu.java.if04;

import java.util.Scanner;

public class IfMain04 {

	public static void main(String[] args) {
		// if - else if - else 연습
			
		//int average = 75;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력해 주세요");
		int average = sc.nextInt();
		
		
		//average가 90점 이상이면 "A"를 출력
		//average가 80점 이상이면 "B"를 출력
		//average가 70점 이상이면 "C"를 출력
		//average가 70점 미만이면 "F"를 출력
		sc.close();
		if (average >= 90) {
			
			System.out.println(" A ");		
		} else if(average >= 80 && average < 90) {
			
			System.out.println(" B ");			
		} else if(average >= 70 && average < 80) {
			
			System.out.println(" C ");			
		} else {
			
			System.out.println(" F ");
		}		

	}

}
