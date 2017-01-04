package edu.java.interface05;

// 인터페이스의 활용 1 : 상수들만 정의하는 타입
//
public interface Menu {
	
	public static final int MENU_QUIT = 0;
	public static final int MENU_INSERT = 1;
	public static final int MENU_SELECT = 2;
	
	// public static final은 생략 가능
	String STR_QUIT = "프로그램 종료";
	String STR_INSERT = "입력 메뉴";
	String STR_SELECT = "검색 메뉴";

	

}
