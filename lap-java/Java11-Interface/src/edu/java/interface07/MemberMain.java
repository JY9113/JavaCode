package edu.java.interface07;

import java.util.Scanner;

// MVC 디자인 패턴에서 View 클래스 역할

public class MemberMain {
	
	// main 클래스가 필요한 멤버 변수
	private static Scanner sc;
	private static MemberDAO dao;	// DAO 선언 이유는 DAO 가 가지는 기능을 사용하기 위해.
								// Main 클래스는 DAO 가 가지고 있는 메소드를 호출해서 기능을 사용할 뿐.
								// MemberDAOImple 을 선언해도 되는데(어차피 MemberDAOImple로 생성할거라..) 다형성 때문에 MemberDAO를 선언
	private static String inputID, inputPW, inputEmail;
	
	public static void main(String[] args) {
//		MemberVO member = new MemberVO("aaa", "abcd", "aaa@aaa.com");
//		System.out.println(member);
		
		System.out.println("회원 관리 프로그램");
		 sc = new Scanner(System.in);
		 dao = MemberDAOImple.getInstance();		// 다형성
		 									// 자식 클래스로 생성해놓고 부모 타입에 저장?
		 
		 boolean run = true;
		 
		 while(run) {
			 showMainMenu();					// 메인 메뉴 출력
			 int choice = sc.nextInt();
			 sc.nextLine();
			 
			 switch(choice) {
			 case Menu.QUIT:
				 run = false;
				 break;			
			 case Menu.INSERT :
				 insertMember();
				 break;
			 case Menu.PRINT_ALL_MEMBERS :
				 printAllMembers();
				 break;
			 case Menu.SEARCH_BY_INDEX :
				 searchByIndex();
				 break;
			 case Menu.EDIT_MEMBER :
				 editMember();
				 break;
			 default :
				 System.out.println("          메뉴를 다시 선택해 주세요");
			 }
				 
			 
		 }
		 sc.close();
		 System.out.println("          프로그램을 종료합니다.");
		

	}
	
	private static void showMainMenu(){
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println("|  0. 종료        1. 등록        2. 전체검색        3. 상세검색        4. 수정  |");
		System.out.println("------------------------------------------------------");	
		System.out.print(" 선택 > ");
	}
	
	private static void inputInfo() {
		System.out.print("                           아이디 입력  >  ");
		inputID = sc.nextLine();
		System.out.print("                           비밀번호 입력  >  ");
		inputPW = sc.nextLine();
		System.out.print("                           이메일 입력  >  ");
		inputEmail = sc.nextLine();
	}
	
	private static void insertMember() {
		System.out.println();
		System.out.println("          * 등록 메뉴 ");
		inputInfo();
		
		// UI는 DB 에 직접 insert 하는게 아니라 controller를 통해서 insert
		// DAO의 insert(MemberVO)를 호출
		MemberVO member = new MemberVO(inputID, inputPW, inputEmail);
		
		int result = dao.insert(member);
		if ( result > 0) {
			System.out.println();
			System.out.println("                           회원 등록 성공");
		} else {
			System.out.println();
			System.out.println("                           회원 등록 실패");
		}		
	}
	
	private static void printAllMembers() {
		// DAO 의 select() 메소드 호출 - 배열 리턴 받음
		System.out.println();
		System.out.println("          * 전체 검색 메뉴 ");
		MemberVO[] list = dao.select();
		int count = ((MemberDAOImple) dao).getCount();
		
		for(int i = 0; i < count; i++) {
			System.out.println("회원 정보 [ " + i + "]");
			System.out.println(list[i]);
		}

	}
	
	
	private static void searchByIndex() {
		System.out.println();
		System.out.println("          * 상세 검색 메뉴 ");
		System.out.print("                           인덱스 번호 입력  >  ");
		int indexNum = sc.nextInt();
		int count = ((MemberDAOImple) dao).getCount();
		MemberVO member = dao.select(indexNum);		
//		if(indexNum < count) {
//			System.out.println("회원 정보 [ " + indexNum+ "]");
//			System.out.println(member);
//		} else if(indexNum >= count || indexNum < 0){
//			System.out.println("                           현재 등록된 연락처의 인덱스 번호는 0부터 " + (count - 1) + " 까지 입니다.");
//			System.out.println("                           인덱스 번호를 확인해 주세요");
//			searchByIndex();
//		}			
		if(member != null) {
			System.out.println("                           회원 정보 [ " + indexNum+ "]");
			System.out.println(member);
		} else {
			System.out.println("                           현재 등록된 연락처의 인덱스 번호는 0부터 " + (count - 1) + " 까지 입니다.");
			System.out.println("                           인덱스 번호를 확인해 주세요");
			searchByIndex();
		}	

	}
	
	private static void editMember() {
		System.out.println();
		System.out.println("          * 수정 메뉴 ");
		System.out.print("                           인덱스 번호 입력  >  ");
		int indexNum = sc.nextInt();
		int count = ((MemberDAOImple) dao).getCount();
		int result;
		MemberVO member = dao.select(indexNum);
		if(indexNum < count) {
			System.out.println("                           선택하신 정보는 회원정보 [" + member.getId() + "] 의 정보입니다.");
			System.out.print("                           pw 수정은 1번, email 수정은 2번, 수정을 종료하시려면 0번을 입력해주세요 ");
			int editChoice = sc.nextInt();
			sc.nextLine();			
//			if(editChoice == 1) {
//				inputInfo();				
//				member = new MemberVO(inputID, inputPW, inputEmail);
//				int result = dao.insert(member);
//				if ( result > 0) {
//					System.out.println();
//					System.out.println("                           수정 성공");
//				} else {
//					System.out.println();
//					System.out.println("                           수정 실패");
//				}
//								
//				System.out.println();
//				System.out.println("                           수정된 정보입니다 ");
//				System.out.println(member);
//			} else {
//				System.out.println("                           수정 메뉴를 종료합니다.");
//			}
			switch (editChoice) {
			case 1 :
				System.out.println("변경할 pw를 입력해 주세요");
				inputPW = sc.nextLine();
				member = new MemberVO(null, inputPW, null);				
				break;
			case 2 :
				System.out.println("변경할 email을 입력해 주세요");				
				inputEmail = sc.nextLine();
				member = new MemberVO(null, null, inputEmail);
				break;
			case 0 :
				System.out.println("수정 메뉴를 종료합니다");
				break;				
			}			
			result = dao.update(indexNum, member);
			
			if ( result > 0) {
				System.out.println();
				System.out.println("                           수정된 정보입니다 ");
				System.out.println(dao.select(indexNum));				
			} else {
				System.out.println();
				System.out.println("                           수정 실패");
			}			
		} else {
			System.out.println("                           현재 등록된 연락처의 인덱스 번호는 0부터 " + (count - 1) + " 까지 입니다.");
			System.out.println("                           인덱스 번호를 확인해 주세요");
			editMember();
		}
		
	}

}
