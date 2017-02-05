package edu.java.Project01;

import java.awt.image.BufferedImage;
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

public interface ProjectDAO {
	
	public ArrayList<WineVO> selectWineOrderByRegion() throws Exception;
	public ArrayList<WineVO> selectWineOrderByGrapes() throws Exception;
	public abstract WineVO selectWine(String wineName) throws Exception;
	public abstract WineVO select(String wineName) throws Exception;
	public abstract int insertWine(WineVO w_vo) throws Exception;
	public abstract int insertPerson(PersonVO p_vo);
	public abstract int updateWine(WineVO w_vo) throws Exception;
	public abstract int updatePerson(PersonVO p_vo);
	public abstract int countWine();
	public abstract int countPerson();
	public ArrayList<WineVO> selectBestWine() throws Exception;
	public abstract BufferedImage getImage(int foundID) throws Exception;

}
