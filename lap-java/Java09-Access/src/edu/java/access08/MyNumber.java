package edu.java.access08;

public class MyNumber {
	private int data;
	
	// 생성자
	public MyNumber() {}
	
	public MyNumber(int data) {
		this.data = data;
	}
	
	// setter / getter
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}

	// MyNumber 타입을 매개 변수로 전달받아서
	// 내가 가지고 있는 data와 매개변수에 있는 data를 더한 후
	// 자기 자신(this)를 리턴하는 메소드
	public MyNumber add(MyNumber number) {
		data += number.data; // this.data = this.data + number.data;
		
		return this; 
	}
	
	public MyNumber subtract(MyNumber number) {
		data -= number.data;
		
		return this;
	}
}
