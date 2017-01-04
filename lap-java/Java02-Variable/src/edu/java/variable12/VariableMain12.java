package edu.java.variable12;

import java.util.Scanner;

public class VariableMain12 {
	
	public static void main(String[] args) {
		
		// Scanner 사용 시 주의할 점
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("나이는 : " + age);
		
		sc.nextLine();
		// nextInt()다음 바로 nextLine()을 쓰면 입력 받기 전에 프로그램 종료된다. nextInt()하고 누른 엔터가 남아있기 때문에
		// 이걸 써주면 입력 버퍼에 남아있던 엔터키를 읽어들이고, 따로 변수에 저장하지 않았으므로 버려진다. (엔터키 버림)
		
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();		
		System.out.println("이름은 : " + name);
		
		
		sc.close();
		
		
		
	}

}
