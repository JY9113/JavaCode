package edu.java.array04;

public class ArrayMain04 {

	public static void main(String[] args) {
		// 배열 선언과 초기화
		// 타입[] 변수이름 = new 타입[배열의 길이];
		// 변수이름[인덱스] = 값;
		
		int[] korean = new int[3];
		korean[0] = 100;
		korean[1] = 90;
		korean[2] = 80;
		
		// 배열의 선언과 초기화 2:
		// 타입[] 변수이름 = {값1, 값2........};
		int[] english = {99, 88, 77};
		for (int i = 0; i < english.length; i++) {
			System.out.println(english[i]);
		}
		
		// for-each 구문(향상된 for 구문, enhanced for 구문)
		// for (타입 변수이름 : 배열) {.......}
		// 타입 : 배열의 타입과 동일하게
		
		System.out.println();
		for (int x : english) {
			System.out.println(x);
		}

	}

}
