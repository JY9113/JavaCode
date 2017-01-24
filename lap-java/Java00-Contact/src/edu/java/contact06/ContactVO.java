package edu.java.contact06;

// VO (Value Object) : MVC 디자인 패턴에서 모델에 해당하는 클래스
// DB 테이블의 구조와 동일하게 설계
public class ContactVO {
	private int cid;
	private String name;
	private String phone;
	private String email;
	
	// 생성자
	public ContactVO() {}
	public ContactVO(int cid, String name, String phone, String email) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
		String str = "[" + cid + "] " + name + " | "
				+ phone + " | " + email;
		
		return str;
	}
	

}
