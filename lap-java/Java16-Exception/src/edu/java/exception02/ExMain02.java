package edu.java.exception02;

public class ExMain02 {

	public static void main(String[] args) {
		int n1 = 123;
		int n2 = 0;
		
		// if-else 구문을 사용해서 예외 상황을 처리
		if (n2 != 0) {
			int result = n1 / n2;
			System.out.println("result = " + result);
		} else {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		
		// 예외 처리: try구문
		// try {
		//    정상적인 실행할 문장들;
		// } catch (예외이름 변수이름) {
		//     예외상황일 때 실행할 문장들;
		// }
		System.out.println();
		try { // 정상적인 경우
			System.out.println("try 내부");
			int result = n1 / n2;
			System.out.println("result = " + result);
			
		} catch (Exception e) { // 예외 상황
			System.out.println("예외 발생!");
		}

		System.out.println("프로그램 종료");
	} // end main()

}
