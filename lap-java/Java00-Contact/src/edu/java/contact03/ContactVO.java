package edu.java.contact03;

// MVC 패턴에서 model 클래스

public class ContactVO {
	
	private String name; // 회원 이름
	private String phone; // 회원 전화번호
	private String email; // 회원 이메일
	
	// TODO : 기본 생성자, 매개변수 생성자
	// TODO : getter / setter 메소드
	// TODO : toString() 메소드 override
	
	public ContactVO() {}
	public ContactVO(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
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
	
	@Override
	public String toString() {
		String str = "                           이름 : " + name + "\n                           전화번호 : " + phone +
				"\n                           이메일 : " + email;
		return str;
	}
	
	

}
