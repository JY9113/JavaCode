package edu.java.string02;

public class StrignMain02 {
	// String literal과 생성자 호출의 차이
	// 생성자는 호출할 때마다 새로운 인스턴스가 생성됨.
	// -> 참조 변수(str1, str2)에는 다른 주소값이 저장됨

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		if(str1 == str2) {
			System.out.println("같은 참조");
		} else {
			System.out.println("다른 참조");
		}
		
		// 문자열 리터럴을 사용해서 초기화 하는 경우
		// 이미 리티럴이 만들어져 있는 경우는
		// 인스턴스를 새로 생성하지 않고, 기존의 인스턴스를 재활용 한다.
		//	=>참조 변수 (str3, str4)은 같은 주소값이 저장
		String str3 = "abc";
		String str4 = "abc";
		if(str3 == str4) {
			System.out.println("같은 참조");
		} else {
			System.out.println("다른 참조");
		}
		

	}

}
