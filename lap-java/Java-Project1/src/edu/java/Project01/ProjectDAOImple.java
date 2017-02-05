	package edu.java.Project01;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import oracle.jdbc.OracleDriver;
import static edu.java.Project01.WineOracleQuery.*;

public class ProjectDAOImple implements ProjectDAO {
	
	private static ProjectDAOImple instance = null;
	private ProjectDAOImple() {
		try {
			DriverManager.registerDriver(new OracleDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	public static ProjectDAOImple getInstance() {
		if(instance == null) {
			instance = new ProjectDAOImple();
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
	public ArrayList<WineVO> selectWineOrderByRegion() throws Exception{
		ArrayList<WineVO> winelist = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

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
				
				InputStream in =rs.getBinaryStream(9);
				BufferedImage bi = ImageIO.read(in);
				
				WineVO w_vo = new WineVO(w_id, w_name, w_type, grapes, region, alcohol, body, sugar, bi);
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
	public ArrayList<WineVO> selectWineOrderByGrapes() throws Exception {
		ArrayList<WineVO> winelist = new ArrayList<>();		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
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
				
				InputStream in =rs.getBinaryStream(9);
				BufferedImage bi = ImageIO.read(in);
				
				WineVO w_vo = new WineVO(w_id, w_name, w_type, grapes, region, alcohol, body, sugar, bi);
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
	public WineVO selectWine(String wineName) throws Exception{
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
				InputStream in =rs.getBinaryStream(9);
				BufferedImage bi = ImageIO.read(in);
				
				
				w_vo = new WineVO(w_id, w_name, w_type, grapes, region, alcohol, body, sugar, bi);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources(conn, pstmt, rs);
		}		
		return w_vo;
	}

	@Override
	public int insertWine(WineVO w_vo) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(INSERT_WINELIST);
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(w_vo.getBi(), "png", baos);
			baos.flush();
			byte[] bytes = baos.toByteArray();
			
			
			pstmt.setInt(1, w_vo.getWine_id());
			pstmt.setString(2, w_vo.getWine_name());
			pstmt.setString(3, w_vo.getWine_type());
			pstmt.setString(4, w_vo.getGrapes());
			pstmt.setString(5, w_vo.getRegion());
			pstmt.setInt(6, w_vo.getAlcohol());
			pstmt.setString(7, w_vo.getBody());
			pstmt.setString(8, w_vo.getSugar_content());
			pstmt.setBytes(9, bytes);
			
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
	public int updateWine (WineVO w_vo) throws Exception{
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
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(w_vo.getBi(), "png", baos);
			baos.flush();
			byte[] bytes = baos.toByteArray();
			
			pstmt.setString(1, w_name);
			pstmt.setString(2, w_type);
			pstmt.setString(3, grapes);
			pstmt.setString(4, region);
			pstmt.setInt(5, alcohol);
			pstmt.setString(6, body);
			pstmt.setString(7, sugar);
			pstmt.setInt(9, w_id);
			pstmt.setBytes(8, bytes);		
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
	public ArrayList<WineVO> selectBestWine() throws Exception {
		ArrayList<WineVO> winelist = new ArrayList<>();		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(SELECT_BESTWINE_ONE);
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
				
				InputStream in =rs.getBinaryStream(9);
				BufferedImage bi = ImageIO.read(in);
				
				WineVO w_vo = new WineVO(w_id, w_name, w_type, grapes, region, alcohol, body, sugar, bi);
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
	public WineVO select(String wineName) throws Exception{
		WineVO w_vo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(SELECT);
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
				
				InputStream in =rs.getBinaryStream(9);
				BufferedImage bi = ImageIO.read(in);
				
				w_vo = new WineVO(w_id, w_name, w_type, grapes, region, alcohol, body, sugar, bi);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources(conn, pstmt, rs);
		}		
		return w_vo;
	}
	
	
	@Override 
	public BufferedImage getImage(int foundID) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BufferedImage bi= null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			pstmt = conn.prepareStatement(DRAW_IMAGE);
			pstmt.setInt(1, foundID);
			rs = pstmt.executeQuery();
			rs.next();
			InputStream in = rs.getBinaryStream(2);
			bi = ImageIO.read(in);
			System.out.println("성공");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			closeResources(conn, pstmt, rs);
		}
		return bi;
	}	
	}
