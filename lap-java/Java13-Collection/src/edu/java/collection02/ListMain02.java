package edu.java.collection02;

import java.util.ArrayList;

class Student {
	private int stuNo;
	private String name;
	
	public Student(int stuNo, String name) {
		this.stuNo = stuNo;
		this.name = name;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		String str = "번호: " + stuNo + "\n"
				+ "이름: " + name + "\n";
		return str;
	}
	
} 

public class ListMain02 {

	public static void main(String[] args) {
		// Student 타입을 저장할 수 있는 ArrayList 인스턴스 생성
		ArrayList<Student> list = new ArrayList<>();
		
		// 원소 추가 : add()
		Student stu1 = new Student(1, "aaa");
		list.add(stu1);
		list.add(new Student(2, "bbb"));
		
		// 원소 참조(읽기) : get(index)
//		for(Student s : list) {
//			System.out.println(s);
//		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));	// toString() 을 override 했기 때문에 출력 결과처럼 나온다.
										// override 없이 출력하면 참조값이 출력.
		}
		
		// 원소 변경 : set(index, value)
		System.out.println("-------------------------------------");
		list.set(0, new Student(1,"ccc"));
		System.out.println(list.get(0));
		
		for(Student s :list) {
			System.out.println(s);
		}
		
		// 원소 삭제 : remove(index)
		System.out.println("-------------------------------------");
		list.remove(0);
		for(Student s : list) {
			System.out.println(s);
		}
		

	}

}
