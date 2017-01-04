package edu.java.inherit02;

public class InheritMain02 {

	public static void main(String[] args) {
		// Person클래스의 인스턴스 생성
		Person p1 = new Person();
		System.out.println(p1);
		p1.setName("aaaa");
		System.out.println(p1.getName());
		
		System.out.println("--------------------------");
		//BusinessPerson 클래스의 인스턴스 생성
		BusinessPerson p2 = new BusinessPerson(); // 출력해보면 extend 한 Person 생성자가 먼저 호출됨.
		System.out.println("--------------------------");
		BusinessPerson p3 = new BusinessPerson("aaa", "bbb");
		
		

	}

}
