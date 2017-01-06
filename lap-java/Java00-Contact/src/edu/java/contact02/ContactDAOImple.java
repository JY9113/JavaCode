package edu.java.contact02;

public class ContactDAOImple implements ContactDAO {

	// singleton 패턴 적용
	// 1. private static 자기자신 타입 멤버 변수 선언
	private static ContactDAOImple instance = null;
	
	// 2. private 생성자
	private ContactDAOImple() {} // private 이라 다른 클래스에서 instance 만들 수 없다. 다른 클래스에서 insert 같은 메소드 사용 불가.
	
	// 3. public static 자기자신을 리턴하는 메소드 	=> 다른 클래스에서 instance 생성을 위해
	public static ContactDAOImple getInstance() {
		if (instance == null ) {	// 없을때만 새로 생성, 있으면 있는거 그대로 return
			instance = new ContactDAOImple();
		}
		
		return instance;
	}
	
	// 멤버 변수 (필드)
	public static final int MAX = 100;
	public static final int SUCCESS = 1;
	public static final int FAIL = 0;
	
	private ContactVO[] list = new ContactVO[MAX];
	private int count;
	
	public int getCount() {
		return count;
	}
	
	@Override
	public int insert(ContactVO vo) {
		if (vo != null) {
			list[count] = vo;
			count++;
			return SUCCESS;
		}
		else 
			return FAIL;
	}

	@Override
	public ContactVO[] selectAll() {
		return list;
	}

	@Override
	public ContactVO select(int index) {
		if(index >=0 && index < MAX) {
			return list[index];
		}
		else {
			return null;
		}
	}

	@Override
	public int update(int index, ContactVO vo) {
		// 해당 index에 있는 내용을 vo의 내용을 바꿔준다.
		if (index >= 0 && index < count) {	// 데이터가 있는 부분에서만 수정이 이뤄져야 하기 때문.
			// id는 회원정보에서 수정하지 않기 때문에 하지 않는다.
			if ( vo.getName() == null && vo.getPhone() != null) {
				list[index].setPhone(vo.getPhone());
			} else if ( vo.getName() == null && vo.getEmail() != null) {
				list[index].setEmail(vo.getEmail());
			} else {
				return FAIL;
			}
			
			return SUCCESS;
		} else { 
			return FAIL;
		}
	}

}
