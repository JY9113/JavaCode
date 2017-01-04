package edu.java.array10;

public class ArrayMain10 {

	public static void main(String[] args) {
		// 2차원 배열 연습
		String[] bts = {"랩몬", "진", "지민", "제이홉", "뷔", "슈가", "정국"};
		String[] exo = {"백현", "세훈", "찬열"};
		
		String[][] idols = {
				{"랩몬", "진", "지민", "제이홉", "뷔", "슈가", "정국"},
				{"백현", "세훈", "찬열"}
		};

		for(int i = 0; i < idols.length; i++) {
			for(int j = 0; j < idols[i].length; j++) {
				System.out.print(idols[i][j] + " ");					
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("--------------------------");
		
		for(String[] group : idols) {
			for(String name : group) {
				System.out.print(name + " ");
			}
			System.out.println();
		}
	}

}
