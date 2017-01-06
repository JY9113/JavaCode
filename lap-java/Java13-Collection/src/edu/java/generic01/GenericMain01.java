package edu.java.generic01;

public class GenericMain01 {

	public static void main(String[] args) {
		Apple apple = new Apple("충주 사과");
		apple.displayAppleType();
		
		System.out.println();
		AppleBox aBox = new AppleBox(apple);
		aBox.pullOut().displayAppleType();
		
		System.out.println();
		Orange orange = new Orange(12);
		orange.displayOrangeSugar();
		
		OrangeBox oBox = new OrangeBox(orange);
		oBox.pullOut().displayOrangeSugar();	// pullOut() 하면 orange가 나오므로 그 다음 메소드는 orange가 갖고있는 메소드가 나온다.
		
		 System.out.println("--------------------------------");
		 // generic 크래스 Box 인스턴스를 생서
		 Box<Apple> box1 = new Box<Apple>(apple);	// generic 클래스 생성자 부르는 방법. 현재 T 자리에 apple 이므로 사과상자.
		 box1.pullOut().displayAppleType();
		 
		 Box<Orange> box2 = new Box<Orange>(orange);
		 box2.pullOut().displayOrangeSugar();
		 
		 Box<Integer> box3 = new Box<Integer>(123);
		 box3.pullOut().intValue();
		

	}

}
