package edu.java.array03;

import java.util.Scanner;

public class ArrayMain03 {

	public static void main(String[] args) {
		// int 3개를 저장할 수 있는 scores 배열을 선언
		int scores[] = new int[5];
		
		// for문을 사용하고, 입력을 받아서 점수를 배열에 저장.
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) {
			System.out.println("배열에 저장할 숫자를 입력하세요");
			int num = sc.nextInt();
			scores[i] = num;			
		}
		
		//for 문을 사용해서, 입력받은 모든 점수를 출력
		System.out.println("\n배열에 입력된 값");
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}

		// 배열에 있는 모든 점수들의 합계를 출력
		int sum = 0;
		for(int i = 0; i <scores.length; i++) {
			 sum += scores[i];
		}
		System.out.println("\n점수의 총 합계 : " + sum);
		
		// 점수의 평균을 계산해서 출력
		int average = sum / scores.length;
		System.out.println("\n점수의 평균 : " + average);
		
		// 점수의 최대값 출력
		int max = scores[0];	//int max = scores[0];
		for(int i = 0; i < scores.length; i++) {
			
			if(scores[i] > scores[i + 1]) {
				max = scores[i];
			}
		}
		System.out.println("\n배열의 최대값 : " + max);
		
		// 점수의 최소값 출력
		int min = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] < min) {
				min = scores[i];
			}
		}
		System.out.println("\n배열의 최소값 : " + min);
		sc.close();
	}

}
