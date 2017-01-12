package edu.java.exception03;

public class ExMain03 {
	public static void main(String[] args) {

		try {
			System.out.println("try 내부");
			int[] array = new int[10];
			array[10] = 100;
			System.out.println(array[9]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 메시지: " + e.getMessage());
		}
		
		System.out.println("프로그램 종료...");
	} // end main()
}
