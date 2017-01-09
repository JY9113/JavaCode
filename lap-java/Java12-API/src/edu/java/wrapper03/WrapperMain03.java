package edu.java.wrapper03;

import java.util.Scanner;

public class WrapperMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력>");
		int n = sc.nextInt();
		sc.nextLine(); // 숫자 뒤에 입력된 엔터키를 제거
		System.out.println("n = " + n);
		
		System.out.println("문자열 입력>");
		String str = sc.nextLine();
		System.out.println("str = " + str);
		
		System.out.println("=======================");
		System.out.println("정수 입력>");
		String number = sc.nextLine();
		int x = Integer.parseInt(number);
		System.out.println("x = " + x);
		
		System.out.println("문자열 입력>");
		String str2 = sc.nextLine();
		System.out.println("str2 = " + str2);
		
		sc.close();
	} // end main()

}
