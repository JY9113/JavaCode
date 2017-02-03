package edu.java.Project01;
/*	
WINELIST
WINE_ID		NUMBER
WINE_NAME	VARCHAR(200)
WINE_TYPE	VARCHAR(50)
GRAPES		VARCHAR2(100)
REGION		VARCHAR2(200)
		
*/
public class WineVO {
	private int wine_id;
	private String wine_name;
	private String wine_type;
	private String grapes;
	private String region;
	private int alcohol;
	private String body;
	private String sugar_content;
	
	// 생성자
	public WineVO() {}
	
	public WineVO(int wine_id, String wine_name, String wine_type, String grapes, String region, int alcohol,
			String body, String sugar_content) {
		super();
		this.wine_id = wine_id;
		this.wine_name = wine_name;
		this.wine_type = wine_type;
		this.grapes = grapes;
		this.region = region;
		this.alcohol = alcohol;
		this.body = body;
		this.sugar_content = sugar_content;
	}

	public int getWine_id() {
		return wine_id;
	}
	public void setWine_id(int wine_id) {
		this.wine_id = wine_id;
	}
	public String getWine_name() {
		return wine_name;
	}
	public void setWine_name(String wine_name) {
		this.wine_name = wine_name;
	}
	public String getWine_type() {
		return wine_type;
	}
	public void setWine_type(String wine_type) {
		this.wine_type = wine_type;
	}
	public String getGrapes() {
		return grapes;
	}
	public void setGrapes(String grapes) {
		this.grapes = grapes;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}	
	public int getAlcohol() {
		
		return alcohol;
	}
	public void setAlcohol(int alcohol) {
		this.alcohol = alcohol;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSugar_content() {
		return sugar_content;
	}
	public void setSugar_content(String sugar_content) {
		this.sugar_content = sugar_content;
	}
	
//	
//	private int wine_id;
//	private String wine_name;
//	private String wine_type;
//	private String grapes;
//	private String region;
//	private int alcohol;
//	private String body;
//	private String sugar_content;
	@Override
	public String toString() {
		String str = "타입  :  " + wine_type + "\n품종  :  " + grapes + "\n지역  :  " + region +
				"\n도수  :  " + alcohol + "\n바디  :  " + "\n당도  :  " + sugar_content;
		
		return str;
	}

}
