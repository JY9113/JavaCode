package edu.java.rps02;

import java.util.Scanner;

public class GameMain02 {

	public static void main(String[] args) {
		// 가위바위보 게임
		// 1. 사용자에게 가위(1), 바위(2), 보(3) 중에서 선택하도록 하고, 저장.
		// 2. 컴은 난수(1, 2, 3)을 발생시켜서 저장.
		// 3. 게임의 로직
		//		1) 사람이 가위(1)를 냈을 때
		//			(1) if 컴퓨터가 가위
		//			(2) else if 컴퓨터가 바위
		//			(3) else (컴퓨터가 보)
		//		2) else if 사용자가 바위(2)를 냈을 때
		//		3) else (사용자가 보를 낸 경우)
		
		
		boolean run = true;
		
		while( run != false ) {	
			System.out.println("(1)가위, (2)바위, (3)보 중에 한 가지를 선택하세요");
			Scanner sc = new Scanner(System.in);
			int user = sc.nextInt();				

			double r = Math.random();
			int com = (int)(3 * r + 1);
			
			if (user == 1) {
				System.out.println("사용자 : (1) 가위 ");
				if (com == 1) {
					System.out.println("컴퓨터 : (1) 가위");
					System.out.println("무승부");				
				}
				else if (com == 2) {
					System.out.println("컴퓨터 : (2) 바위");
					System.out.println("Winner = 컴퓨터");
				}
				else {
					System.out.println("컴퓨터 : (3) 보");
					System.out.println("Winner = 유저");
				}
			} else if(user == 2){
				System.out.println("사용자 : (2) 바위 ");
				if (com == 1) {
					System.out.println("컴퓨터 : (1) 가위");
					System.out.println("Winner = 유저");				
				}
				else if (com == 2) {
					System.out.println("컴퓨터  (2) 바위");
					System.out.println("무승부");
				}
				else {
					System.out.println("컴퓨터 : (3) 보");
					System.out.println("Winner = 컴퓨터");
				}
			} else if (user == 3){
				System.out.println("사용자 : (3) 보");
				if (com == 1) {
					System.out.println("컴퓨터 : (1) 가위");
					System.out.println("Winner = 컴퓨터");				
				}
				else if (com == 2) {
					System.out.println("컴퓨터 : (2) 바위");
					System.out.println("Winner = 유저");
				}
				else {
					System.out.println("컴퓨터 : (3) 보");
					System.out.println("무승부");
				}			
			} else if (user == 0) {
				System.out.println("게임을 종료합니다.");	
				run = false;
				sc.close();
			}	
			
		} 	
		
	}	
}
