package edu.java.string01;

public class StringMain01 {

	public static void main(String[] args) {
		String str1 = "안녕하세요";
		System.out.println(str1);
		System.out.println("문자열 길이 : " + str1.length());
		
		System.out.println();
		String str2 = new String("안녕하세요");
		System.out.println(str2);
		
		// String을 저장하는 참조 변수에는 문자열이 있는 주소값이 저장
		// ==, != ( 비교 연산자) 를 사용하면 단순히 주소값만 비교
		// 	실제 문자열의 내용이 같더라도 '주소값이 다르다' 라는 결과를 줄 수 있음.
		// 문자열의 내용이 같은 지 다른 지 비교할 때는 equals
		
		if(str1 == str2) {
			System.out.println("같은 참조");
		} else {
			System.out.println("다른 참조");
			
		}
		
		System.out.println();
		if(str1.equals(str2)) {
			System.out.println("같은 참조");
		} else {
			System.out.println("다른 참조");
			
		}

	}

}
