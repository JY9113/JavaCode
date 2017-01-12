package edu.java.exception08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExMain08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		boolean run = true;
//		while(run) {		//run 대신 true
//			try {
//				System.out.println("메뉴 선택 >  ");
//				choice = sc.nextInt();
//				System.out.println("choice : " + choice);
//				run = false;	// break;
//			} catch(InputMismatchException e) {
//				sc.nextLine();
//				System.out.println("숫자를 입력해 주세요");		
//			} 
//		}
		
		while(run) {		//run 대신 true
			try {
				System.out.println("메뉴 선택 >  ");
				choice = Integer.parseInt(sc.nextLine());
				System.out.println("choice : " + choice);
				run = false;	// break;
			} catch(NumberFormatException e) {
				System.out.println("숫자를 입력해 주세요");		
			} 
		}
		System.out.println("메뉴가 선택되었습니다.");
		
		sc.close();
		

	}

}
