package edu.java.inherit08;

public class EmpUtil {
	
	// Employee
	// ㄴManager (employee를 상속받음)
	public static void printEmpInfo(Employee emp) {
		if (emp instanceof Manager) {
			Manager m = (Manager) emp; 	// 강제 형변환(casting)
			System.out.println("이름 : " + m.getName());
			System.out.println("직책 : " + m.getType());
			// emp랑 m은 주소값을 저장하고 있다. 그 주소값을 찾아가면 manager 크기만큼 메모리 할당되어 있음.
		
		} else if (emp instanceof Employee) {
			System.out.println("이름 : " + emp.getName());
		} else {
			System.out.println("직원이 아닙니다");
		}
		
	}
	
}
