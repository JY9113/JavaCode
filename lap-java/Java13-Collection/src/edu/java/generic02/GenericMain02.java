package edu.java.generic02;

// 두 개 이상의 일반화 변수를 갖는 generic 클래스
class Test<T, U> {
	// T, U 는 아무런 의미 없다. 
	
	private T item1;
	private U item2;
	
	public Test(T item1, U item2) {
		this.item1 = item1;
		this.item2 = item2;
		
	}
	
	public void display() {
		System.out.println("아이템 1 : " + item1);
		System.out.println("아이템 2 : " + item2);
		
	}
	
}
public class GenericMain02 {

	public static void main(String[] args) {
		Test<Integer, Integer> test1 = new Test<> (111, 222);
		test1.display();
		
		System.out.println();
		Test<Integer, String> test2 =new Test<> (100, "Hello");
		test2.display();

	}

}
