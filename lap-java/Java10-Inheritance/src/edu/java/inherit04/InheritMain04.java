package edu.java.inherit04;

public class InheritMain04 {
	public static void main(String args[]) {
		// 우리가 넘겨준 name 변수로 초기화.
		Animal a1 = new Animal("aaa");
		a1.speak();
		
		System.out.println();
		Dog dog = new Dog("기쁨이" , "말티즈");
		dog.speak(); //dog 도 speak를 가지고 animal 도 speak를 가지는데 여기서는 dog가 가진 speak 가 불린다.
		
		System.out.println();
		Cat cat = new Cat();
		cat.speak();
	}

}
