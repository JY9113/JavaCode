package edu.java.Project01;

import java.util.ArrayList;

//
//select *
//from WINELIST A, PERSONAL B
//WHERE A.REGION = B.P_REGION 
//AND A.SUGAR_CONTENT = B.P_SUGAR 
//AND A.WINE_TYPE = B.P_TYPE
//AND A.BODY = B.P_BODY
//AND B.P_NAME= 'ccc'
//ORDER BY A.ALCOHOL;
//
//
//select *
//from WINELIST A, PERSONAL B
//WHERE A.REGION = B.P_REGION 
//AND A.SUGAR_CONTENT = B.P_SUGAR;

public interface WineDAO {
	
	public ArrayList<WineVO> selectWineOrderByRegion();
	public ArrayList<WineVO> selectWineOrderByGrapes();
	public abstract WineVO selectWine(String wineName);
	public abstract WineVO select(String wineName);
	public abstract int insertWine(WineVO w_vo);
	public abstract int insertPerson(PersonVO p_vo);
	public abstract int updateWine(WineVO w_vo);
	public abstract int updatePerson(PersonVO p_vo);
	public abstract int deleteWine(int wine_id);
	public abstract int countWine();
	public abstract int countPerson();
	public ArrayList<WineVO> selectBestWine();
	public abstract void insertImage(int wineID);
}
