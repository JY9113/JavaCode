package edu.java.inherit13;

public class Fish extends Animal {

	public Fish(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println(getName() + "는 스윔스윔.....");

	}

}
