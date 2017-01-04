package edu.java.inherit13;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void move() {
		System.out.println(getName() + "는 총총...");
		

	}

}
