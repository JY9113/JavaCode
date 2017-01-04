package edu.java.array05;

public class ArrayMain05 {

	public static void main(String[] args) {
		// 구구단 2단의 결과만 저장하는 배열
		
		int[] gugu = new int[9];
		
		// for 문을 사용해서 초기화
		for (int i = 0; i < gugu.length; i++) {
			gugu[i] = 2 * (i + 1);
		//	System.out.println("2 X "+ (i + 1) + " = " + gugu[i]);
		}
		
		System.out.println();
		System.out.println();
		
		// for-each 구문
		// : 오른쪽 배열의 이름에서 :의 왼쪽 변수에 저장
		for(int x : gugu) {
			System.out.println(x);
		}
		System.out.println();
		for(int x : gugu) { //배열에서 원소를 끄집어 내서 x에 저장. 여기서는 배열의 값을 바꾼게 아니라 x의 값을 바꾼거기 때문에 배열 프린트해도 배열의 원소는 변하지 않음.
			x = 123;
		}
		
		for(int x : gugu) {
			System.out.println(x);
		}
	}

}
