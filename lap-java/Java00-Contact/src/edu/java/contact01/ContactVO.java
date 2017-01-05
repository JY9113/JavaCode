package edu.java.contact01;

//VO(Value Object) : 데이터를 저장하는 클래스

public class ContactVO {
	// 멤버 변수(필드, 프로퍼티)
	private String name;
	private String phone;
	private String email;

	// 디폴트 생성자
	public ContactVO() {}
	// 매개변수 있는 생성자
	public ContactVO(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	// getter & setter
	public String getName() {
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
		System.out.println("                           이름 : " + name);
		System.out.println("                           전화번호 : " + phone);
		System.out.println("                           이메일 : " + email);
	}
	
}