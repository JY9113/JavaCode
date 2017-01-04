package edu.java.inherit03;

public class Phone {
	// 멤버 변수
	private String phoneNo;
	
	// 생성자
	
	// 생성자를 하나라도 정의한 경우, 자바 컴파일러는 기본 생성자를 자동으로 만들어 주지 않음.
	public Phone(String phoneNo) {
		this.phoneNo = phoneNo;
		System.out.println("Phone(PhoneNo) 생성자 호출");
	}
	// 부모 클래스에 기본 생성자가 없으면 이 클래스를 상속받는 클래스에서 super();를 쓸 수 없다.
	
	// 메소드
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setphoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}
