package edu.java.array09;

public class ArrayMain09 {

	public static void main(String[] args) {
		// 2차원 배열 : 1 차원 배열을 원소로 갖는 배열
		
		int[] korean = {10, 20, 30}; // 1차원 배열
		int[] english = {40, 50, 60};
		
		// 2 x 3인 2차원 배열 
		int[][] scores = {
				{10, 20, 30},	// 원소 1
				{40, 50, 60}	// 원소 2, 총 원소가 2개이므로 scores.length는 2
		};
		
		System.out.println(scores[1][1]);
		System.out.println(scores[0][2]);
		
		// 2차원 배열에서 length는 행의 개수
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		
		System.out.println();
		
		for(int x = 0; x < scores.length; x++) {
			for(int y =0; y < scores[x].length; y++) {
				System.out.print(scores[x][y] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		int[][] array = {
				{1, 2, 3},
				{4, 5},
				{6, 7, 8, 9}
		};
		System.out.println(array[1][1]);
		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[1].length);
		
		System.out.println();
		System.out.println("-------------------------------");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(array);
		System.out.println(array[0]);
		String[] names = {"홍길동", "허균"};
		System.out.println(names);
		
		String[][] names2 = {{"홍길동"}, {"허균"}};
		System.out.println(names2);
		

	}

}
