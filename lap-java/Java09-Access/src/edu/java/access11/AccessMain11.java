package edu.java.access11;

public class AccessMain11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Captain 클래스의 인스턴스 생성
		Captain c1 = Captain.getInstance();
		// Captain c1 = new Captain();
		c1.setName("aaa");
		System.out.println(c1);
		System.out.println(c1.getName());
		
		System.out.println("----------------------------------");
		Captain c2 = Captain.getInstance();
		System.out.println(c2);
		System.out.println(c2.getName());
		

	}

}
