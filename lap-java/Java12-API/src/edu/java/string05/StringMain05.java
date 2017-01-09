package edu.java.string05;

// String 클래스 : immutable 클래스 (내용이 바뀌지 않는 클래스)
// StringBuffer, StringBuilder : mutable 클래스 (내용을 바꿀 수 있는 클래스)

// StringBuffer : Java1.0 버전 부터 사용하던 클래스
//			- 속도가 느림
//			- Thread-safe : 쓰레드에 안전한 클래스
// StringBuilder : Java 5 버전부터 사용하게 된 클래스
//			- 속도가 빠름
//			- Thread-unsafe : 쓰레드에 안전하지 않은 클래스
// 그 외에는 모든 기능이 동일( 동일한 기능의 메소드들을 가지고 있음)

public class StringMain05 {

	public static void main(String[] args) {
		// StringBuffer, StringBuilder 클래스
		StringBuffer buff = new StringBuffer("abc");
//		StringBuffer buffer = "abc"; //컴파일 에러
		//StringBuffer, StringBuilder는 반드시 생성자를 사용해서 초기화
		// 문자열 리터럴로 초기화할 수 없음
		System.out.println(buff);
		// toString() 메소드가 override되어서 문자열 내용만 출력
		System.out.println(buff.hashCode());
		
		// append() : 문자열을 덧붙이는 메소드
		buff.append("def");
		System.out.println(buff);
		System.out.println(buff.hashCode());
		

	}

}
