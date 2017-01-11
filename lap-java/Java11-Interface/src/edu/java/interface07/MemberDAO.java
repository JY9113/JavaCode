package edu.java.interface07;

public interface MemberDAO {
	
	// 회원 등록 기능
	public abstract int insert(MemberVO vo);
	
	// 회원 전체 리스트 검색 기능
	public abstract MemberVO[] select();
	
	// 회원 한명에 대한 상세 정보 검색 기능
	// 메소드 오버로딩 ( 메소드 이름은 같은데 매개변수가 다르다)
	public abstract MemberVO select(int index);
	
	// 회원 정보 수정 기능
	public abstract int update(int index, MemberVO vo);
	
}
