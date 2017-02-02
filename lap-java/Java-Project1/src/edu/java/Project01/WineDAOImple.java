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
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			DriverManager.registerDriver(new OracleDriver());
			
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(INSERT_WINELIST);
			pstmt.setInt(1, w_vo.getWine_id());
			pstmt.setString(2, w_vo.getWine_name());
			pstmt.setString(3, w_vo.getWine_type());
			pstmt.setString(4, w_vo.getGrapes());
			pstmt.setString(5, w_vo.getRegion());
			pstmt.setInt(6, w_vo.getAlcohol());
			pstmt.setString(7, w_vo.getBody());
			pstmt.setString(8, w_vo.getSugar_content());
			
			result = pstmt.executeUpdate();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources(conn, pstmt);
		}		
		return result;
	}

	@Override
	public int insertPerson(PersonVO p_vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			DriverManager.registerDriver(new OracleDriver());
			
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(INSERT_PERSONAL);
			pstmt.setInt(1, p_vo.getPerson_id());
			pstmt.setString(2, p_vo.getP_name());
			pstmt.setString(3, p_vo.getP_region());
			pstmt.setString(4, p_vo.getP_type());
			pstmt.setString(5, p_vo.getP_body());
			pstmt.setString(6, p_vo.getP_sugar());
			
			result = pstmt.executeUpdate();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources(conn, pstmt);
		}		
		return result;
	}

	@Override
	public int updateWine(WineVO w_vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			DriverManager.registerDriver(new OracleDriver());			
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(UPDATE_WINELIST);
			
			int w_id = w_vo.getWine_id();
			String w_name  = w_vo.getWine_name();
			String w_type = w_vo.getWine_type();
			String grapes = w_vo.getGrapes();
			String region = w_vo.getRegion();
			int alcohol = w_vo.getAlcohol();
			String body = w_vo.getBody();
			String sugar = w_vo.getSugar_content();
			
			
			pstmt.setString(1, w_name);
			pstmt.setString(2, w_type);
			pstmt.setString(3, grapes);
			pstmt.setString(4, region);
			pstmt.setInt(5, alcohol);
			pstmt.setString(6, body);
			pstmt.setString(7, sugar);
			pstmt.setInt(8, w_id);
			
			result = pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources(conn, pstmt);
		}
		
		return result;
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
	
	@Override
	public int countWine() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;		
		try {
			DriverManager.registerDriver(new OracleDriver());
			
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(COUNT_WINE);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	@Override
	public int countPerson() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;		
		try {
			DriverManager.registerDriver(new OracleDriver());
			
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(COUNT_PERSON);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	@Override
	public ArrayList<WineVO> selectBestWine() {
		return null;
	}
	

}
