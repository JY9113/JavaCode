package edu.java.contact04;

import java.util.ArrayList;
import java.io.*;

// array 대신 ArrayList 사용!!!



public class ContactDAOImple implements ContactDAO {

	// singleton 패턴 적용
	// 1. private static 자기자신 타입 멤버 변수 선언
	private static ContactDAOImple instance = null;
	
	// 2. private 생성자
	private ContactDAOImple() { // private 이라 다른 클래스에서 instance 만들 수 없다. 다른 클래스에서 insert 같은 메소드 사용 불가.
		initDataDir();
		initDataFile();
	}
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
	
	private ArrayList<ContactVO> list;
	
	
	
	// 데이터를 저장할 폴더와 파일 이름 정의
	private static final String DATA_DIR = "data"; // 상대 경로
	private static final String DATA_FILE = "contact.data";
	
	// 데이터 폴더와 데이터 파일을 사용하는 File 객체를 선언
	private File dataDir;
	private File dataFile;
	
	// 애플리케이션이 시작될 때 데이터 폴더가 있는 지 검사하고, 없으면 새로 생성
	// private 으로 선언되었으므로 instance가 생성될 때 혹은  생성자가 호출될 때 이 메소드가 호출되면 된다.
	private void initDataDir() {	
		dataDir = new File(DATA_DIR);
		System.out.println("경로 : " + dataDir.getPath());
		System.out.println("절대 경로 : " + dataDir.getAbsolutePath());
		
		if(!dataDir.exists()) {	// 폴더가 없으면
			if(dataDir.mkdir()) {	
				System.out.println("폴더 생성 성공");
			} else {
				System.out.println("폴더 생성 실패");
			}
		} else {	// 폴더가 있으면
			System.out.println("폴더가 이미 존재합니다");
		}
	}
	
	// 데이터 파일이 존재하는 지 검사하고,
	// 없는 경우 ArrayList를 빈 리스트로 생성하고, 
	// 있는 경우, 파일에서 데이터를 읽어서 ArrayList를 채움
	private void initDataFile() {
		String filePath = DATA_DIR + File.separator + DATA_FILE;
		dataFile = new File(filePath);
		System.out.println("파일 경로 : " + dataFile.getPath());
		System.out.println("절대 경로 : " + dataFile.getAbsolutePath());
		
		if(!dataFile.exists()) { 	// 데이터 파일이 없으면
			System.out.println("새로운 데이터 파일 생성");
			list = new ArrayList<>();
			
		} else {
			System.out.println("기존 데이터 있음");
			readDataFromFile();
		}
	}
	
	
	// FileInputStream, BufferedInputStream, ObjectInputStream 사용
	// data\contact.data 파일에서 ArrayList 객체로 데이터를 읽어서 
	// 멤버 변수 list에 저장.
	
	private void readDataFromFile() {
		InputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		
		try {
			in = new FileInputStream(dataFile);
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			list = (ArrayList<ContactVO>) oin.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
	
	// 멤버 변수 list의 내용을 data\contact.data 파일에 씀
	// FileOutputStream, BufferedOutputStream, ObjectOutputStream 사용
	// 메소드 완성 후, insert(), delete(), update() 에서 이 메소드 호출
	private void writeDataToFile() {
		FileOutputStream out = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream oout = null;
		
		try {
			out = new FileOutputStream(dataFile);
			bout = new BufferedOutputStream(out);
			oout = new ObjectOutputStream(bout);
			
			oout.writeObject(list);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	@Override
	public int insert(ContactVO vo) {		
		if (vo != null) {
			list.add(vo);
			writeDataToFile();
			return SUCCESS;
		}
		else 
			return FAIL;
	}

	@Override
	public ArrayList<ContactVO> selectAll() {
		return list;
	}

	@Override
	public ContactVO select(int index) {
		if(index >=0 && index < list.size()) {
			return list.get(index);
		}
		else {
			return null;
		}
	}

	@Override
	public int update(int index, ContactVO vo) {
		// 해당 index에 있는 내용을 vo의 내용을 바꿔준다.
		if (index >= 0 && index < list.size()) {	// 데이터가 있는 부분에서만 수정이 이뤄져야 하기 때문.
			// id는 회원정보에서 수정하지 않기 때문에 하지 않는다.
			if ( vo.getName() == null && vo.getPhone() != null) {
				list.get(index).setPhone(vo.getPhone());
			} else if ( vo.getName() == null && vo.getEmail() != null) {
				list.get(index).setEmail(vo.getEmail());
			} else {
				return FAIL;
			}			
			writeDataToFile();
			return SUCCESS;
		} else { 
			return FAIL;
		}
	}
	
	@Override
	public int delete(int index) {
		if (index >= 0 && index < list.size()) {
			list.remove(index);
			writeDataToFile();
			return SUCCESS;
		}
		return FAIL;
	}

}
