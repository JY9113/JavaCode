package edu.java.interface01;

// UI 팀에서 임시로 테스트하기 위한 용도로 사용할 클래스
// 인터페이스를 구현할 때는 implements 키워드
public class DummyImple implements DatabaseQuery {

	@Override
	public int insert(String id, String pw) {
		// 임시 테스트 용
		return 0;
	}

} // end class DummyImple










