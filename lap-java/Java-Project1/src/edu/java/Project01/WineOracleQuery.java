package edu.java.Project01;

public interface WineOracleQuery {	
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
	
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER = "scott";
	public static final String PASSWD = "tiger";
	
	// select * from winelist order by cid
//	public static final String SQL_SELECT_ALL = "select * from " + TABLE_NAME + " order by " + COL_CID;
	public static final String WINE_SELECT_ORDERBY_REGION = "select * from WINELIST order by REGION";
	public static final String WINE_SELECT_ORDERBY_GRAPES = "select * from WINELIST order by GRAPES";
	
	// select * from winelist where cid = ?
	public static final String SELECT_BY_WINENAME = "select * from WINELIST where lower(WINE_NAME) like ?";
//	public static final String SELECT_BY_WINENAME = "select * from WINELIST where WINE_NAME = ?";
	// insert into winelist values(WINE_ID, WINE_NAME, WINE_TYPE, GRAPES, REGION)
	// insert into wineTASTE values(WINE_ID, ALCOHOL, BODY, SUGAR_CONTENT)
	// insert int personal values(person_ID, P_GRAPES, P_REGION, P_ALCOHOL, P_BODY, P_SUGAR)
	public static final String INSERT_WINELIST = "insert into WINELIST values(?, ?, ?, ?, ?, ?, ?, ?)";
	public static final String INSERT_PERSONAL = "insert into PERSONAL values(?, ?, ?, ?, ?, ?)";
	
	// update
	public static final String UPDATE_WINELIST = "update WINELIST set WINE_NAME = ?, " + "WINE_TYPE = ?, " + "GRAPES = ?, " + 
											  "REGION = ? ALCOHOL = ?, BODY = ?, SUGAR_CONTENT= ? where WINE_ID = ?";
	// delete from ex_contact where cid = ?
	public static final String DELETE_WINELIST = "delete from WINELIST where WINE_ID = ?";

}
