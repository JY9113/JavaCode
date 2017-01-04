package edu.java.interface04;

//인터페이스는 다른 인터페이스를 상속하는 것이 가능

public interface ChildInterface extends ParentInterface {
	
	//test1()은 물려받아서 사용하고, test2()를 생성
	public abstract void test2();

}
