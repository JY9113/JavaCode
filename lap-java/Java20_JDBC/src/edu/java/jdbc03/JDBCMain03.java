package edu.java.jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class JDBCMain03 {

	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER = "scott";
	public static final String PASSWD = "tiger";
	public static final String TABLE_NAME = "ex_contact";
	public static final String COL_CID = "cid";
	public static final String COL_NAME = "name";
	public static final String COL_PHONE = "phone";
	public static final String COL_EMAIL = "email";
	
	public static void main(String[] args) {
		System.out.println("JDBC 3 - select");
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 오라클 드라이버를 메모리에 로드(드라이버 매니저에 등록)
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("드라이버 등록 성공");
			
			// DB에 연결(connection)
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("DB 연결 성공");
			
			// SQL 문장 실행을 위한 statement 객체 생성
			stmt = conn.createStatement();
			
			// SQL 문장을 작성
			String sql_select = "select * from ex_contact order by cid";
			
			// SQL 문장 실행(SQL 문장을 DB 서버로 전송)
			rs = stmt.executeQuery(sql_select);

			// 결과 확인 , 처리
			// ResultSet.next();
			// ResultSet에서 다음 행(row, 레코드)이 있으면
			// true 를 리턴하고, RS에서 가리키는 위치를 다음 위치로 변경
			
			StringBuffer buffer = new StringBuffer();
			while(rs.next()) {	// 레코드가 존재
				int cid = rs.getInt(1); // cid 칼럼
				String name = rs.getString(2); // name 칼럼
				String phone = rs.getString(3); // phone 칼럼
				String email = rs.getString(4); // email 칼럼
				
				buffer.append(cid + "  |  ").append(name + "  |  ").append(phone + "  |  ").append(email + "\n");
			}
//			System.out.println(buffer.toString());
			System.out.println("----------------------------------------------");
			sql_select = "select * from ex_contact where cid=1";
			rs = stmt.executeQuery(sql_select);
			if(rs.next()) {	//첫번째 데이터(레코드)가 있으면
				int cid = rs.getInt(COL_CID);
				String name = rs.getString(COL_NAME);
				String phone = rs.getString(COL_PHONE);
				String email = rs.getString(COL_EMAIL);
				
				System.out.println("인덱스 : " + cid);
				System.out.println("이름 : " + name);
				System.out.println("전화번호 : " + phone);
				System.out.println("이메일 : " + email);		
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 생성된 리소스들을 해제(close)
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}
