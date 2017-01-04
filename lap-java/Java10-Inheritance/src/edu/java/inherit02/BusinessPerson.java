package edu.java.inherit02;

// Person 클래스를 상속받는 BusinessPerson 클래스를 선언

public class BusinessPerson extends Person {

	// 멤버 변순
	private String company;
	
	// 생성자
	// 자식 클래스의 생성자가 호출되면, 부모 클래스의 생성자가 먼저 호출되어야 하마.
	// 부모 클래스의 생성자를 명시적으로 호출할 때는 super();
	// 부모 클래스의 생성자를 명시적으로 호출하지 않으면 부모 클래스의 "기본 생성자"가 기본으로 호출됨.
	// 부모 클래스의 매개변수가 있는 생성자가 자동으로 호출 되지 않음!!!!!!!!!!
	// 필요한 경우는 반드시 명시적으로 호출해야 함!!
	// ex) super(name); 이런식으로 호출 해줘야 함.
	
	
	// 자식 클래스에서 부모 클래스의 생성자를 호출할 때는
	// 다른 어떤 코드보다 먼저 부모 클래스를 호출해야만 한다.
	public BusinessPerson() {
		System.out.println("BusinessPerson 생성자");
	}
//	public BusinessPerson() {
//		super(); // 부모클래스의 생성자를 호출
//		System.out.println("BP 호출");
//	}
	
	public BusinessPerson(String name, String Company) {
		// 위의 기본 생성자는 기본적으로 만들어 주기 때문에 상관 없지만
		// 매개변수가 있는 생성자를 사용하기 위해서는 부모 클래스가 먼저 생성되어야 하기 때문에
		// super에 변수 넣어줘야함.
		super(name); // 부모클래스의 매개변수가 있는 생성자를 명시적으으로 호출하겠다. => 생략 불가
		
		//super를 삭제하면 기본 생성자가 불린다. 이때 name은 null 상태.
//		main에서 출력해보면  기본 생성자가 출력되어 "person 생성자" 가 출력된다
//		setName(name); => 부모의 기본생성자 호출 후 부모가 가진 set메소드가 호출되는 경우 
		this.company = company; // 내가 가진 company를 초기화 하겠다.
		System.out.println("BP(name, company) 호출");
	}
	// 이클립스에서 자동으로 만들어주는 생성자를 보면 super 클래스가 존재함을 알 수 있다.
	
	
	// 메소드
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
}
