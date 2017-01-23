package edu.java.jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

// JDBC : Java Database Connection
// 0. 데이터베이스 라이브러리를 프로젝트에 추가
//		1) 프로젝트에 libs 폴더를 생성
//		2) C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
// 		    폴더에 있는 ojdbc5.jar 파일을 libs 폴더에 복사
//		3) 복사한 jar파일(라이브러리)를 빌드 패스에 추가(Add to build path)
// 1. DB와 연동하기 위해서 필요한 상수들을 정의
// 2. JDBC 드라이버를 메모리에 로드
// 3. DB와 Connection(연결)을 맺음
// 4. Connection 객체를 사용해서 Statement 객체를 생성
// 5. SQL 문장을 작성
// 6. Statement 객체를 사용해서 SQL 문장을 실행 (DB 서버로 SQL 문장을 전송)
// 7. DB 서버가 보내준 결과를 확인 / 처리

public class JDBCMain01 {
	// 1. DB에 사용될 상수들
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";	// localhost 대신 주소를 직접 써줘도 된다. oracle 자리에는 mysql 이나 다른 sql적어줌.
	// 192.168.11.31
	public static final String USER = "scott";
	public static final String PASSWD = "tiger";	
	public static final String TABLE_NAME = "ex_contact";
	public static final String COL_CID = "cid";
	public static final String COL_NAME = "name";
	public static final String COL_PHONE = "phone";
	public static final String COL_EMAIL = "email";
	

	public static void main(String[] args) {
		System.out.println("JDBC 1");

		Connection conn = null;
		Statement stmt = null;
		try {
			// 2. Oracle JDBC 드라이버를 메모리에 로드
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("드라이버 로드 성공");
			
			// 3. DB와 연결
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("DB 연결 성공");
			
			// 4. connection 객체를 사용해서 statement 객체를 생성
			stmt = conn.createStatement();
			
			// 5. SQL 문장 작성
//			String sql_insert = "insert into ex_contact " + "values (contact_pk.nextval, 'asdf', '010-1122-1122', 'asdf@test.com')";
			String sql_insert = "insert into " + TABLE_NAME + " values (contact_pk.nextval, 'aaaa', '010', 'aaaa@test.com')";
			System.out.println(sql_insert);
			
			// 6. SQL 문장 실행 (DB 서버로 SQL 전송)
			int result = stmt.executeUpdate(sql_insert);	// int를 리턴.
			
			// 7. 서버가 보낸 결과 처리
			System.out.println(result + "행이 삽입됐습니다");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 리소스 해제 : connection, statement
			// connection으로 statement를 만들었으므로 stmt 먼저 그다음 conn 닫는다.
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
