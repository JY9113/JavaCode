package edu.java.access04;

public class Contact {
	// 멤버 변수 (필드, 프로퍼티)
	private String name;
	private String phone;
	private String email;
	
	// 생성자
	public Contact() {} // 디폴트 생성자 (메모리 확보, 확보된 공간에 디폴트 값으로 초기화)
					//boolean : false, int : 0, 나머지는 null
	public Contact(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	// getter, setter 메소드
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void displayInfo() {
		System.out.println(" -----------연락처 정보-----------");
		System.out.println(" 이름 : " + name); //private 인 멤버변수를 직접 접근 => 같은 클래스에 있으므로 가능
		System.out.println(" 전화번호 : " + phone);
		System.out.println(" 이메일 : " + email);		
	}
}
