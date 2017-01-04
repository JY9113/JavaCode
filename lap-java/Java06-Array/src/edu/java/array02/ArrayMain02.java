package edu.java.array02;

public class ArrayMain02 {

	public static void main(String[] args) {
		System.out.println("배열의 선언, 초기화, 출력");
		
		//int 10개를 저장할 수 있는 배열 선언
		int[] arr = new int[10]; //10은 배열의 길이
		System.out.println("배열의 길이 : " + arr.length);
		
		//배열의 index : 0 ~ (length - 1)
		//for 문을 사용한 배열의 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		//for문을 사용한 배열 내용 출력
		System.out.println("\n\n배열 내용 출력");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//배열의 모든 원소들의 합을 저장할 변수
		System.out.println("\n\n배열의 모든 원소들의 합");
		int sum = 0; // sum = arr[0] + arr[1] + arr[2].......
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
	}

}
