package edu.java.inherit13;

public class InheritMain13 {

	public static void main(String[] args) {
		// Animal 배열 저장
		Animal[] animals = new Animal[3];
		
		animals[0] = new Dog("강아지"); // 다형성
		animals[1] = new Kangaroo ("캥거루");
		animals[2] = new Fish("금붕어");
		
		for(Animal a : animals) {
			a.move();
		}

	}

}
