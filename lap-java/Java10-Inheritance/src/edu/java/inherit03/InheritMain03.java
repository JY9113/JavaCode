package edu.java.inherit03;

public class InheritMain03 {

	public static void main(String[] args) {
		// 호출해보면 부모클래스의 생성자도 호출된 것을 알 수 있음.
		// phoneNo이 null 인 상태
		SmartPhone phone1 = new SmartPhone();
		System.out.println();
		// 부모클래스의 생성자도 호출되고 자식클래스의 SmartPhone(phoneNo) 생성자도 호출.
		//현재 phoneNo은 "111-111-1111"로 초기화 된 상태. ip는 초기화 안된 상태.
		SmartPhone phone2 = new SmartPhone("111-111-1111");
		System.out.println();
		// 부모클래스의 생성자도 호출되고 자식클래스의 SmartPhone(phoneNo) 생성자도 호출.
		//현재 phoneNo은 "111-111-1111"로 초기화 된 상태. ip도 초기화 안된 상태.
		SmartPhone phone3 = new SmartPhone("111-111-1111", "222-222-222");
		

	}

}
