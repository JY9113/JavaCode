package edu.java.Project01;

/*	
PERSONAL
PERSON_ID		NUMBER
P_GRAPES		VARCHAR2(100)
P_REGION		VARCHAR2(200)
P_ALCOHOL		NUMBER
P_BODY			NUMBER
P_SUGAR			NUMBER			
*/
public class PersonVO {
	
	private int person_id;
	private String p_grapes;
	private String p_region;
	private int p_alcohol;
	private int p_body;
	private int p_sugar;
	
	public PersonVO() {}
	
	public PersonVO(int person_id, String p_grapes, String p_region, int p_alcohol, int p_body, int p_sugar) {
		super();
		this.person_id = person_id;
		this.p_grapes = p_grapes;
		this.p_region = p_region;
		this.p_alcohol = p_alcohol;
		this.p_body = p_body;
		this.p_sugar = p_sugar;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getP_grapes() {
		return p_grapes;
	}

	public void setP_grapes(String p_grapes) {
		this.p_grapes = p_grapes;
	}

	public String getP_region() {
		return p_region;
	}

	public void setP_region(String p_region) {
		this.p_region = p_region;
	}

	public int getP_alcohol() {
		return p_alcohol;
	}

	public void setP_alcohol(int p_alcohol) {
		this.p_alcohol = p_alcohol;
	}

	public int getP_body() {
		return p_body;
	}

	public void setP_body(int p_body) {
		this.p_body = p_body;
	}

	public int getP_sugar() {
		return p_sugar;
	}

	public void setP_sugar(int p_sugar) {
		this.p_sugar = p_sugar;
	}
	
	
	
	
	

}
