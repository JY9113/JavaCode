package edu.java.interface07;

// DAO(Data Access Object) : MVC 패턴에서 control에 해당하는 클래스

public class MemberDAOImple implements MemberDAO {
	
	
	//////////////////////////////
	// Singleton 디자인 패턴 적용 시작
	
	// 1. private static 자기 자신 타입 멤버 변수
	private static MemberDAOImple instance = null;
	
	// 2. private 생성자
	private MemberDAOImple() {}
	
	// 3. public static 메소드 :인스턴스를 하나만 생성하여 사용하기 위해 private으로 생성자를 선언하고 public 메소드를 줌, 
	//					static 선언 이유는 MemberDAOImple 해서 사용하기 위해(MemberDAOImple 도 static선언)
	public static MemberDAOImple getInstance() {
		if(instance == null) {
			instance = new MemberDAOImple();
			// 처음 instance 선언이 null 이기 때문에 처음에 불렸을때 이 if문에서 걸린다. => 여기서 생성된다
		}
		
		return instance;
		// 처음 instance가 if에 걸려서 생성되고 난 다음은 자기 주소값이 항상 return 된다.
		//getInstance를 몇번 호출하든지 상관없이 항상 하나의 instance가 생성.
	}
	
	// Singleton 디자인 패턴 적용 끝
	//////////////////////////////
	
	public static final int MAX = 100;	// 최대 회원수
	private MemberVO[] list = new MemberVO[MAX];	// 회원 정보를 저장할 배열
	// 캡슐화 : 필요한 정보만 제공.
	// MemberVO[] list를 private으로 지정하고 setter/getter 제공 안하는 이유는 값을 외부에서 변경하면 안되기 때문.
	// 다른 클래스가 값을 변경못하게 하기 위해. count 도 동일. 
	
	private int count; 	// 배열에 insert 될때마다 count가 증가.
	
	public int getCount() {
		return count;
	}
	
	
	@Override
	public int insert(MemberVO vo) {
		// UI 클래스가 전달해 준  회원 정보를 배열에 저장.
		list[count] = vo;
		count++;
		
		// DB 연결한 다음 oracle 에서 리턴되는 값을 그대로 return 해주면 성공/실패 여부 확인 가능.
		return 1;
	}

	@Override
	public MemberVO[] select() {
		return list;
		
	}

	@Override
	public MemberVO select(int index) {
		if(index >= 0 && index < MAX) {
			return list[index];
		} else {
			return null;
		}		
	}

	@Override
	public int update(int index, MemberVO vo) {
		// 해당 index에 있는 내용을 vo의 내용을 바꿔준다.
		if (index >= 0 && index < count) {	// 데이터가 있는 부분에서만 수정이 이뤄져야 하기 때문.
			// id는 회원정보에서 수정하지 않기 때문에 하지 않는다.
			if ( vo.getId() == null && vo.getPw() != null) {
				list[index].setPw(vo.getPw());
			} else if ( vo.getId() == null && vo.getEmail() != null) {
				list[index].setEmail(vo.getEmail());
			} else {
				return 0;
			}
			
			return 1;
		} else { 
			return 0;
		}
	}

}
