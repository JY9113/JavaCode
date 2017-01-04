package edu.java.array07;

public class ArrayMain07 {

	public static void main(String[] args) {
		// boolean 타입을 저장할 수 있는 배열 선언
		// 그 배열에 {true, false, true, false}를 저장
		
		boolean[] arr1 = {true, false, true, false};
		for(boolean x : arr1) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("----------------------");
		boolean[] arr2 = new boolean[4];
		for(int i = 0; i < arr2.length; i++) {
			
			/*if (i % 2 == 1) {
				arr2[i] = false;
			} else {
				arr2[i] = true;
			}*/
			
			arr2[i] = (i % 2 == 0) ? true : false;
		}
		
		for(boolean y : arr2) {
			System.out.println(y);
		}
		

	}

}
