package edu.java.Project01;

import java.util.ArrayList;


public interface WineDAO {
	
	public ArrayList<WineVO> selectWineOrderByRegion();
	public ArrayList<WineVO> selectWineOrderByGrapes();
	public abstract WineVO selectWine(String wineName);
	public abstract int insertWine(WineVO w_vo);
	public abstract int insertPerson(PersonVO p_vo);
	public abstract int updateWine(WineVO w_vo);
	public abstract int updatePerson(PersonVO p_vo);
	public abstract int deleteWine(int wine_id);

}
