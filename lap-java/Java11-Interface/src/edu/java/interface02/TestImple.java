package edu.java.interface02;

public class TestImple implements TestInterface {

	@Override
	public int insert(String id, String pw) {
		System.out.println(" DB INSERT 실행");
		return 1;
	}

}
