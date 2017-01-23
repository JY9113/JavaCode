package edu.java.jdbc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class JDBCMain04 {
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER = "scott";
	public static final String PASSWD = "tiger";
	public static final String TABLE_NAME = "ex_contact";
	public static final String COL_CID = "cid";
	public static final String COL_NAME = "name";
	public static final String COL_PHONE = "phone";
	public static final String COL_EMAIL = "email";

	// update ex_contact
	// set name = ?, phone = ?, email = ?
	// where cid = ?
	public static final String SQL_UPDATE = "update " + TABLE_NAME  +
										" set " + COL_NAME + " = ?, "
										+ COL_PHONE + " = ?, " + COL_EMAIL + " = ? "
										+ " where " + COL_CID + " = ?";
	public static void main(String[] args) {
		System.out.println("JDBC 4 - PreparedStatement");
		
		// 키보드 입력 준비
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// JDBC 드라이버를 등록 (메모리에 로드)
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("드라이버 등록 성공");
			
			// DB연결 (Connection)
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("DB 연결 성공");
			
			// PreaparedStatement 객체 생성
			pstmt = conn.prepareStatement(SQL_UPDATE);
			
			System.out.println("수정할 인덱스 입력");
			int cid = sc.nextInt();
			sc.nextLine();	// 숫자 뒤에 입력된 엔터를 제거
			
			System.out.println("수정할 이름 입력");
			String name = sc.nextLine();
			
			System.out.println("수정할 전화번호 입력");
			String phone = sc.nextLine();
	
			System.out.println("수정할 이메일 입력");
			String email = sc.nextLine();
			
			// SQL 문장 완성, 여기서 변수 앞의 1,2,3,4 는 sql statement 에서의 순서
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, email);
			pstmt.setInt(4, cid);
			
			// SQL 문장  실행(DB 서버로 전송)
			int result = pstmt.executeUpdate();
			
			// 결과 확인
			System.out.println(result + "행이 수정됐습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		sc.close();
		

	}

}
