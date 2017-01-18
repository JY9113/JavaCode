package edu.java.contact04;

import java.util.ArrayList;

public interface ContactDAO {

	// 연락처 등록
	public abstract int insert(ContactVO vo);

	// 전체 검색 기능
	public abstract ArrayList<ContactVO> selectAll();
	
	//인덱스 검색 기능
	public abstract ContactVO select(int index);
	
	// 수정 기능
	public abstract int update(int index, ContactVO vo);
	
	// 삭제 기능
	public abstract int delete(int index);
	
}
