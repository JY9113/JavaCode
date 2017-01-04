package edu.java.array08;

public class ArrayMain08 {
	
	public static void main(String[] args) {
		// 문자열을 저장하는 배열
		String[] subjects = {"국어", "영어", "수학"};
		
		for (int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i]);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------");
		
		for(String s : subjects) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------");
		
		String[] names = new String[3];
		names[0] = "aaa";
		names[1] = "bbb";
		names[2] = "ccc";
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println();
		for(String s : names) {
			System.out.println(s);
		}
	}

}
