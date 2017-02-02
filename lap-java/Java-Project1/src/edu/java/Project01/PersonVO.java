package edu.java.Project01;

/*	
PERSONAL
PERSON_ID		NUMBER
P_GRAPES		VARCHAR2(100)
P_REGION		VARCHAR2(200)
P_ALCOHOL		NUMBER
P_BODY			NUMBER
P_SUGAR			NUMBER		
P_NAME			VARCHAR2	
*/
public class PersonVO {
	
	private int person_id;
	private String p_name;
	private String p_region;
	private String p_type;
	private String p_body;
	private String p_sugar;
	
	
	public PersonVO(int person_id, String p_name, String p_region, String p_type, String p_body, String p_sugar) {
		super();
		this.person_id = person_id;
		this.p_name = p_name;
		this.p_region = p_region;
		this.p_type = p_type;
		this.p_body = p_body;
		this.p_sugar = p_sugar;
	}
	
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_region() {
		return p_region;
	}
	public void setP_region(String p_region) {
		this.p_region = p_region;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public String getP_body() {
		return p_body;
	}
	public void setP_body(String p_body) {
		this.p_body = p_body;
	}
	public String getP_sugar() {
		return p_sugar;
	}
	public void setP_sugar(String p_sugar) {
		this.p_sugar = p_sugar;
	}
	
	
	
	
	

}
