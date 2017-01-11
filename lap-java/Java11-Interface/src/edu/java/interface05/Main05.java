package edu.java.interface05;

import java.util.Scanner;

public class Main05 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------");
			System.out.println("0. 종료 | 1. 입력 | 2. 검색");
			System.out.println("-------------------------------");
			System.out.print(" 선택 > ");
			
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case Menu.MENU_QUIT:
				run = false;
				break;
			case Menu.MENU_INSERT:
				System.out.println(Menu.STR_INSERT);
				break;
			case Menu.MENU_SELECT:
				System.out.println(Menu.STR_SELECT);
				break;
			default:
				System.out.println(Menu.STR_ERROR);	
			}
			
		}
		sc.close();
		System.out.println(Menu.STR_QUIT);
		

	}

}
