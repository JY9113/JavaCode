package edu.java.jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class JDBCMain02 {
	
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER = "scott";
	public static final String PASSWD = "tiger";
	public static final String TABLE_NAME = "ex_contact";
	public static final String COL_CID = "cid";
	public static final String COL_NAME = "name";
	public static final String COL_PHONE = "phone";
	public static final String COL_EMAIL = "email";
	
	
	public static void main(String[] args) {
		System.out.println("JDBC2 - update");
		
		Connection conn = null;
		Statement stmt = null;
		try {
			// 드라이버를 메모리에 로드
			DriverManager.registerDriver(new OracleDriver());
			// DB와 연결
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			// statement
			stmt = conn.createStatement();
			
//			String sql_update = "update " + TABLE_NAME + " set phone = '010-456-456', name = 'aaaa', email = 'aaaa@aaa.com'" + " where cid=6";
			String sql_update = "update " + TABLE_NAME 
							+ " set " + COL_NAME + " = '안'," 
							+ COL_PHONE + " = '010-0000-0000', "
							+ COL_EMAIL + " = 'ahn@ahn.com'"
							+ " where " + COL_CID + " = 4";
			
			// SQL 실행
			// executeUpdate();
			// executeQuery();
			int result = stmt.executeUpdate(sql_update);
			System.out.println(result + " 행이 업데이트되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 리소스 해제 : 리소스를 생성한 역순으로 해제
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}

}
