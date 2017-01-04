package edu.java.inherit08;

public class InheritMain08 {

	public static void main(String[] args) {
		// Employee 클래스 타입의 배열
		Employee[] emps = new Employee[2];
		emps[0] = new Employee("홍길동");
		emps[1] = new Manager("지민", "BTS");
		
		for(Employee e : emps) {
			EmpUtil.printEmpInfo(e);
			System.out.println("--------------------------");
		}
		
		System.out.println();
		emps[0].test();
		emps[1].test();	
		((Manager) emps[1]).test();	// override 되기 때문에 굳이 casting 안해줘도 됨
		

	}

}
