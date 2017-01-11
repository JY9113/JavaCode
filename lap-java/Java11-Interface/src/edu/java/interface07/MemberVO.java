package edu.java.interface07;

// VO(value Object) : MVC 디자인 패턴에서 Model 클래스 , 값을 저장할 때
// DTO(Data Transfer Object) : MVC 디자인 패턴에서 control 클래스, data를 주고 받을 때

public class MemberVO {
	// 멤버 변수(필드, 프로퍼티)
	private String id; // 회원 아이디
	private String pw; // 회원 비밀번호
	private String email; // 회원 이메일
	
	// 생성자
	public MemberVO() {}
	public MemberVO(String id, String pw, String email) {
		this.id = id;
		this.pw = pw;
		this.email = email;
	}
	
	
	// getter & setter
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override	// Object 클래스에 속한 toString을 override
	public String toString() {
		String str = "                           아이디 : " + id + "\n" + 
				"                           비밀번호 : " + pw +  "\n"  + "                           이메일 : " + email +  "\n" ;
		return str;
	}
	
	
	
	
}
