package edu.java.contact06;


// JDBC에서 사용될 상수들, SQL 문장들을 정의
public interface OracleQuery {
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER = "scott";
	public static final String PASSWD = "tiger";
	public static final String TABLE_NAME = "ex_contact";
	public static final String COL_CID = "cid";
	public static final String COL_NAME = "name";
	public static final String COL_PHONE = "phone";
	public static final String COL_EMAIL = "email";
	
	// select * from ex_contact order by cid
	public static final String SQL_SELECT_ALL = "select * from " + TABLE_NAME + " order by " + COL_CID;
	
	// select * from ex_contact where cid = ?
	public static final String SQL_SELECT_BY_CID = "select * from " + TABLE_NAME + " where " + COL_CID + " = ?";
	
	// insert into ex_contact values(contact_pk.nextval, ?, ?, ?)
	public static final String SQL_INSERT = "insert into " + TABLE_NAME + " values (contact_pk.nextval, ?, ?, ?)";
	
	// update ex_contact set name = ?, phone = ?, email = ? where cid = ?
	public static final String SQL_UPDATE = "update " + TABLE_NAME + " set " + COL_NAME + " = ?, "
										+ COL_PHONE + " = ?, " + COL_EMAIL + " =? " + " where "
										+ COL_CID + " = ?";
	// delete from ex_contact where cid = ?
	public static final String sQL_DELETE = "delete from " + TABLE_NAME + " where " + COL_CID + " = ?";
	

}
