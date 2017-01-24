package edu.java.contact06;

import java.util.ArrayList;

// DAO (Data Access Object):
// MVC 디자인 패턴에서 Controller에 해당하는 클래스

public interface ContactDAO {
	// 전체 검색, 인덱스 검색, 등록, 수정, 삭제
	public abstract ArrayList<ContactVO> selectAll();
	public abstract ContactVO select(int cid);
	public abstract int insert(ContactVO vo);
	public abstract int update(ContactVO vo);
	public abstract int delete(int cid);
}
