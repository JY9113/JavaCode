package edu.java.inherit03;

public class SmartPhone extends Phone {
	// 멤버 변수
	private String ip;
	
	// 생성자
	// 생성자의 호출 원리 : 
	//	자식 클래스의 생성자가 호출되면,
	//	부모 클래스의 생성자가 먼저 실행된 후, 자식 클래스의 코드들이 실행됨
	//	1) 부모 클래스의 생성자를 명시적으로 호출하지 않을 때는 super() 가 자동으로 호출
	//	2) 부모 클래스의 생성자를 명시적으로 super(); 또는 super(매개변수); 로 호출 할 수 있음.
	//	만약에 부모 클래스가 기본 생성자를 가지고 있지 않은 경우에는 super()가 자동으로 호출될 수 없음.
	//	자식 클래스의 생성자에서 super(매개변수)를 호출하는 코드가 반드시 있어야 됨!
	
	
	
	// 생성자 오버로딩
	public SmartPhone() {
		super(null);	
		System.out.println("smartPhone() 생성자 호출");
	}
	
	public SmartPhone(String phoneNo) {
		super(phoneNo); // 생략하면 안되는 코드
//		setPhoneNo(phoneNo); => 이 코드는 부모클래스에서 기본 생성자가 없기 때문에 쓸 수 없다.
		System.out.println("SmartPhone(phoneNo) 생성자 호출");		
	}
	
	public SmartPhone(String phoneNo, String ip) {
		super(phoneNo);
		this.ip = ip;
		System.out.println("SmartPhone(phoneNo, ip ) 생성자 호출");
	}
}
