package edu.java.inherit13;

public class Kangaroo extends Animal {

	public Kangaroo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println(getName() + "는 껑충껑충");

	}

}
