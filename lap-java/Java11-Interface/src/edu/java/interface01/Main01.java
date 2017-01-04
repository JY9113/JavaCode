package edu.java.interface01;

import java.util.Scanner;

public interface Main01 {

	public static void main(String[] args) {
		System.out.println("DB 버젼 : " + DatabaseQuery.DATABASE_VERSION);
		
		// 사용자로부터 id, pw 입력받음
		// 입력받은 데이터를 DB팀이 작성할 insert(id, pw) 메소드를 호출함
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 >");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력 >");
		String pw = sc.nextLine();
		sc.close();
		
//		DummyImple db = new DummyImple();
		DatabaseQuery db = new OracleDatabaseQuery();
		int result = db.insert(id, pw);
		if (result > 0) {
			System.out.println("INSERT 성공");
		} else {
			System.out.println("INSERT 실패");
		}
	}
}
