package edu.java.generic01;

public class OrangeBox {
	
	private Orange orange;
	
	public OrangeBox(Orange orange) {
		this.orange = orange;
	}

	public Orange pullOut() {
		return orange;
	}
}
