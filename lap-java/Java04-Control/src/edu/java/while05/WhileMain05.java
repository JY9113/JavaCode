package edu.java.while05;

import java.util.Scanner;

public class WhileMain05 {

	public static void main(String[] args) {
		// while 문의 반복 여부 검사
		boolean run = true;
		//예금잔고를 저장할 변수
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		/*while(run) {			
			System.out.println("----------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------");
			System.out.print("선택 > ");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1: //예금
				System.out.print(" 예금액 > ");
				int input_money = sc.nextInt();
				balance += input_money;
				break;
			case 2: //출금
				System.out.print(" 출금액 > ");
				int output_money = sc.nextInt();
				balance -= output_money;
				break;
			case 3: //잔고
				System.out.println(" 잔고 > " + balance);				
				break;
			case 4: //종료
				run = false;
				System.out.println("프로그램이 종료되었습니다");
				break;
			default: //예외
				System.out.println("올바른 메뉴를 선택하세요");
				break;
			}
						
		}*/
		
		
		while(run){
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택 > ");
			
			int num = sc.nextInt();
			if(num == 1) {
				System.out.print(" 예금액 > ");
				int input_money = sc.nextInt();				
				balance += input_money;
				//System.out.println("예금하실 금액 > " + input_money);
			} else if(num == 2) {
				System.out.print(" 출금액 > ");
				int output_money = sc.nextInt();
				balance -= output_money;
				//System.out.println(" 출금하실 금액 > " + output_money);				
			} else if(num == 3) {
				System.out.println(" 잔고 > " + balance);				
			} else if(num == 4) {
				System.out.println("프로그램 종료");
				run = false;
			} else {
				System.out.println("번호를 잘못 선택하셨습니다");
			}
		}
		sc.close();	

	}

}
