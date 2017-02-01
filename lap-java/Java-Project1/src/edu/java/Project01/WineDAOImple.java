package edu.java.Project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import oracle.jdbc.OracleDriver;
import static edu.java.Project01.WineOracleQuery.*;

public class WineDAOImple implements WineDAO {
	
	private static WineDAOImple instance = null;
	private WineDAOImple() {
		try {
			DriverManager.registerDriver(new OracleDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	public static WineDAOImple getInstance() {
		if(instance == null) {
			instance = new WineDAOImple();
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
	public ArrayList<WineVO> selectWineOrderByRegion() {
		ArrayList<WineVO> winelist = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		/*	
	 	WINETASTE 
		wine_ID		NUMBER
		WINE_NAME	VARCHAR(200)
		WINE_TYPE	VARCHAR(50)
		GRAPES		VARCHAR2(100)
		REGION		VARCHAR2(200)
		ALCOHOL		NUMBER
		BODY		VARCHAR2(50)
		SUGAR_CONTENT	VARCHAR2(50)	
		
		PERSONAL
		PERSON_ID		NUMBER
		P_GRAPES		VARCHAR2(100)
		P_REGION		VARCHAR2(200)
		P_ALCOHOL		NUMBER
		P_BODY			NUMBER
		P_SUGAR			NUMBER			
	*/
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(WINE_SELECT_ORDERBY_REGION);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int w_id = rs.getInt(1);
				String w_name  = rs.getString(2);
				String w_type = rs.getString(3);
				String grapes = rs.getString(4);
				String region = rs.getString(5);
				int alcohol = rs.getInt(6);
				String body = rs.getString(7);
				String sugar = rs.getString(8);
				
				WineVO w_vo = new WineVO(w_id, w_name, w_type, grapes, region, alcohol, body, sugar);
				winelist.add(w_vo);				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources(conn, pstmt, rs);
		}
		
		return winelist;
		
	}
	
	@Override
	public ArrayList<WineVO> selectWineOrderByGrapes() {
		ArrayList<WineVO> winelist = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		/*	
	 	WINETASTE 
		wine_ID		NUMBER
		WINE_NAME	VARCHAR(200)
		WINE_TYPE	VARCHAR(50)
		GRAPES		VARCHAR2(100)
		REGION		VARCHAR2(200)
		ALCOHOL		NUMBER
		BODY		VARCHAR2(50)
		SUGAR_CONTENT	VARCHAR2(50)	
		
		PERSONAL
		PERSON_ID		NUMBER
		P_GRAPES		VARCHAR2(100)
		P_REGION		VARCHAR2(200)
		P_ALCOHOL		NUMBER
		P_BODY			NUMBER
		P_SUGAR			NUMBER			
	*/
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(WINE_SELECT_ORDERBY_GRAPES);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int w_id = rs.getInt(1);
				String w_name  = rs.getString(2);
				String w_type = rs.getString(3);
				String grapes = rs.getString(4);
				String region = rs.getString(5);
				int alcohol = rs.getInt(6);
				String body = rs.getString(7);
				String sugar = rs.getString(8);
				
				WineVO w_vo = new WineVO(w_id, w_name, w_type, grapes, region, alcohol, body, sugar);
				winelist.add(w_vo);				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources(conn, pstmt, rs);
		}
		
		return winelist;
		
	}

	@Override
	public WineVO selectWine(String wineName) {
		WineVO w_vo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(SELECT_BY_WINENAME);
			pstmt.setString(1, wineName);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int w_id = rs.getInt(1);
				String w_name  = rs.getString(2);
				String w_type = rs.getString(3);
				String grapes = rs.getString(4);
				String region = rs.getString(5);
				int alcohol = rs.getInt(6);
				String body = rs.getString(7);
				String sugar = rs.getString(8);
				
				w_vo = new WineVO(w_id, w_name, w_type, grapes, region, alcohol, body, sugar);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources(conn, pstmt, rs);
		}		
		return w_vo;
	}

	@Override
	public int insertWine(WineVO w_vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertPerson(PersonVO p_vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateWine(WineVO w_vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePerson(PersonVO p_vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteWine(int wine_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
