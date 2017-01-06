package edu.java.contact03;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactMain02 {
	
	private static Scanner scanner;
	private static ContactDAO dao;
	private static String inputID, inputPW, inputEmail;
	private static final int SUCCESS = 1;
	private static final int FAIL = 0;

	public static void main(String[] args) {
		System.out.println("                                                                                  연락처 Version 0.1");
		scanner = new Scanner(System.in);
		dao = ContactDAOImple.getInstance();
		
		boolean run = true;
		
		while (run) {
			showMainMenu();
			int menuChoice = scanner.nextInt();
			scanner.nextLine();	// 숫자만 가져가고 입력버퍼에 남은 엔터키 지우기
			
			switch (menuChoice) {
			case Menu.QUIT : // 프로그램 종료
				System.out.println("          프로그램을 종료합니다");
				run = false;
				break;
			case Menu.INSERT : //새 연락처 등록
				insertContact();
				break;
			case Menu.PRINT_ALL_CONTACTS : // 전체 검색
				printAllContacts();
				break;
			case Menu.SEARCH_BY_INDEX : // 상세 검색
				searchByIndex();
				break;
			case Menu.EDIT_CONTACT : // 수정
				editContact();
				break;
			default :
				System.out.println("          메뉴를 다시 선택해 주세요");			
			}	
		}

	}

		private static void editContact() {
			System.out.println();
			System.out.println("          * 수정 메뉴 ");
			System.out.print("                           인덱스 번호 입력  >  ");
			int indexNum = scanner.nextInt();
			int count = ((ContactDAOImple) dao).getCount();
			int result;
			ContactVO contact = dao.select((indexNum-1));
			if((indexNum-1) < count) {
				System.out.println("                           선택하신 정보는 [" + contact.getName() + "] 의 정보입니다.");
				System.out.println();
				System.out.println("                           -------------------------------");
				System.out.println("                           |  0. 종료        1. PW        2. Email    |");
				System.out.println("                           -------------------------------");	
				System.out.print("                           선택 > ");	
				int editChoice = scanner.nextInt();
				scanner.nextLine();			
//				if(editChoice == 1) {
//					inputInfo();				
//					member = new MemberVO(inputID, inputPW, inputEmail);
//					int result = dao.insert(contact);
//					if ( result > 0) {
//						System.out.println();
//						System.out.println("                           수정 성공");
//					} else {
//						System.out.println();
//						System.out.println("                           수정 실패");
//					}
//									
//					System.out.println();
//					System.out.println("                           수정된 정보입니다 ");
//					System.out.println(contact);
//				} else {
//					System.out.println("                           수정 메뉴를 종료합니다.");
//				}
				switch (editChoice) {
				case 1 :
					System.out.print("                           변경할 pw를 입력해 주세요");
					inputPW = scanner.nextLine();
					contact = new ContactVO(null, inputPW, null);				
					break;
				case 2 :
					System.out.print("                           변경할 email을 입력해 주세요");				
					inputEmail = scanner.nextLine();
					contact = new ContactVO(null, null, inputEmail);
					break;
				case 0 :
					System.out.println("                           수정 메뉴를 종료합니다");
					break;	
					default : 
						System.out.println("                           메뉴 번호를 확인해 주세요");
						editContact();
				}			
				result = dao.update((indexNum - 1), contact);
				contact = dao.select((indexNum - 1));
				
				if ( result == SUCCESS) {
					System.out.println();
					System.out.println("                           수정된 정보입니다 ");
					System.out.println(contact);				
				} else {
					System.out.println();
					System.out.println("                           수정 실패");
				}			
			} else {
				System.out.println("                           현재 등록된 연락처의 인덱스 번호는 0부터 " + (count) + " 까지 입니다.");
				System.out.println("                           인덱스 번호를 확인해 주세요");
				editContact();
			}
			
		}
		
		private static void searchByIndex() {
			System.out.println();
			System.out.println("          * 상세 검색 메뉴 ");
			System.out.print("                           인덱스 번호 입력  >  ");
			int indexNum = scanner.nextInt();
			int count = ((ContactDAOImple) dao).getCount();
			ContactVO contact = dao.select(indexNum - 1);		
//			if(indexNum < count) {
//				System.out.println("회원 정보 [ " + indexNum+ "]");
//				System.out.println(contact);
//			} else if(indexNum >= count || indexNum < 0){
//				System.out.println("                           현재 등록된 연락처의 인덱스 번호는 0부터 " + (count - 1) + " 까지 입니다.");
//				System.out.println("                           인덱스 번호를 확인해 주세요");
//				searchByIndex();
//			}			
			if(contact != null) {
				System.out.println("                           회원 정보 [ " + (indexNum)+ "]");
				System.out.println(contact);
			} else {
				System.out.println("                           현재 등록된 연락처의 인덱스 번호는 1부터 " + (count) + " 까지 입니다.");
				System.out.println("                           인덱스 번호를 확인해 주세요");
				searchByIndex();
			}	
			
		}
		
		private static void printAllContacts() {
			// DAO 의 select() 메소드 호출 - 배열 리턴 받음
			System.out.println();
			System.out.println("          * 전체 검색 메뉴 ");
			ArrayList<ContactVO> list = dao.selectAll();
			int count = ((ContactDAOImple) dao).getCount();			
			for(int i = 0; i < count; i++) {
				System.out.println("                           회원 정보 [ " + (i + 1) + "]");
				System.out.println(list.get(i));
				System.out.println();
			}			
		}
		
		private static void insertContact() {
			System.out.println();
			System.out.println("          * 등록 메뉴 ");
			inputInfo();
			
			// UI는 DB 에 직접 insert 하는게 아니라 controller를 통해서 insert
			// DAO의 insert(ContactVO)를 호출
			ContactVO contact = new ContactVO(inputID, inputPW, inputEmail);
			
			int result = dao.insert(contact);
			if ( result == SUCCESS) {
				System.out.println();
				System.out.println("                           회원 등록 성공");
			} else {
				System.out.println();
				System.out.println("                           회원 등록 실패");
			}
			
		}
		
		private static void showMainMenu() {
			System.out.println();
			System.out.println("------------------------------------------------------");
			System.out.println("|  0. 종료        1. 등록        2. 전체검색        3. 상세검색        4. 수정  |");
			System.out.println("------------------------------------------------------");	
			System.out.print(" 선택 > ");			
		}
		
		private static void inputInfo() {
			System.out.print("                           아이디 입력  >  ");
			inputID = scanner.nextLine();
			System.out.print("                           비밀번호 입력  >  ");
			inputPW = scanner.nextLine();
			System.out.print("                           이메일 입력  >  ");
			inputEmail = scanner.nextLine();
		}
}

