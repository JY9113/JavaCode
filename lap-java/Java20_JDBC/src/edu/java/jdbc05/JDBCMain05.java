package edu.java.jdbc05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class JDBCMain05 {
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER = "scott";
	public static final String PASSWD = "tiger";
	public static final String TABLE_NAME = "ex_contact";
	public static final String COL_CID = "cid";
	public static final String COL_NAME = "name";
	public static final String COL_PHONE = "phone";
	public static final String COL_EMAIL = "email";
	
	public static final String SQL_DELETE = "delete from " + TABLE_NAME  
										+ " where " + COL_CID + " = ?";
	public static final String SQL_SELECT = "select * from " + TABLE_NAME + " where " + COL_CID + " = ?";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("DB 연결 성공");
			
			// PreaparedStatement 객체 생성
			pstmt = conn.prepareStatement(SQL_DELETE);
			
			System.out.println("삭제할 인덱스 입력   ");
			int cid = sc.nextInt();
			sc.nextLine();	// 숫자 뒤에 입력된 엔터를 제거
			
			pstmt.setInt(1, cid);
			
			// SQL 문장 실행
			// executeUpdate() : insert, update, delete
			// executeQuery() : select
			int result = pstmt.executeUpdate();
			// 결과 확인
			System.out.println(result + "행이 삭제됐습니다.");
			
			System.out.println("--------------------------------------------");
			
			
			pstmt = conn.prepareStatement(SQL_SELECT);
			System.out.println("출력할 인덱스 입력");
			cid = sc.nextInt();
			sc.nextLine();
			pstmt.setInt(1, cid);
			
			result = pstmt.executeUpdate();
			rs = pstmt.executeQuery(SQL_SELECT);
			
			StringBuffer buffer = new StringBuffer();
			while(rs.next()) {	// 레코드가 존재
				cid = rs.getInt(1); // cid 칼럼
				String name = rs.getString(2); // name 칼럼
				String phone = rs.getString(3); // phone 칼럼
				String email = rs.getString(4); // email 칼럼
				
				buffer.append(cid + "  |  ").append(name + "  |  ").append(phone + "  |  ").append(email + "\n");
			}
			System.out.println(buffer.toString());
			
			
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
