package edu.java.contact06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import oracle.jdbc.OracleDriver;
import static edu.java.contact06.OracleQuery.*;

public class ContactDAOImple implements ContactDAO {
	
	// Singleton 디자인 패턴 적용
	private static ContactDAOImple instance = null;
	private ContactDAOImple() {
		try {
			// 오라클 드라이버 등록 (메모리 로드)
			DriverManager.registerDriver(new OracleDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static ContactDAOImple getInstance() {
		if(instance == null){
			instance = new ContactDAOImple();
		}
		return instance;
	}
	
	private void closeResources(Connection conn, Statement stmt) {
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void closeResources(Connection conn, Statement stmt, ResultSet rs) {
		// prepareStatement 가 Statement 를 상속받기 때문에 그냥 statement로 선언해놓으면
		// prepareStatement 도 매개변수로 사용 가능.
		try {
			rs.close();
			closeResources(conn, stmt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<ContactVO> selectAll() {
		ArrayList<ContactVO> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// DB와 연결(Connection)
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			
			// preparedStatement 객체 생성
			pstmt = conn.prepareStatement(SQL_SELECT_ALL);
			
			// SQL 실행
			rs = pstmt.executeQuery();
			
			// SQL 실행 결과 확인
			while (rs.next()) {
				int cid = rs.getInt(COL_CID);   //	int cid = rs.getInt(1);
				String name = rs.getString(COL_NAME); 	// rs.getInt(2);
				String phone = rs.getString(COL_PHONE);	// rs.getInt(3);
				String email = rs.getString(COL_EMAIL);	// rs.getInt(4);
				
				ContactVO vo = new ContactVO(cid, name, phone, email);
				list.add(vo);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources(conn, pstmt, rs);
		}
		
		return list;
	}

	@Override
	public ContactVO select(int cid) {
		ContactVO vo = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(SQL_SELECT_BY_CID);
			pstmt.setInt(1,  cid);
			rs = pstmt.executeQuery();
			if(rs.next()) {	// 검색된 데이터(레코드) 있으면
				String name = rs.getString(COL_NAME);
				String phone = rs.getString(COL_PHONE);
				String email = rs.getString(COL_EMAIL);
				
				vo = new ContactVO(cid, name, phone, email);				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return vo;
	}

	@Override
	public int insert(ContactVO vo) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getEmail());
			
			result = pstmt.executeUpdate();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return result;
	}

	@Override
	public int update(ContactVO vo) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(SQL_UPDATE);
			
			int cid =  vo.getCid();
			String name = vo.getName();
			String phone = vo.getPhone();
			String email = vo.getEmail();

			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, email);
			pstmt.setInt(4, cid);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int delete(int cid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(sQL_DELETE);
			
			pstmt.setInt(1, cid);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
}
