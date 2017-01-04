package edu.java.access08;

public class AccessMain08 {

	public static void main(String[] args) {
		// 기본 생성자를 사용해서 MyNumber 클래스의 인스턴스를 생성
		MyNumber num1 = new MyNumber();
		System.out.println(num1); // 인스턴스의 참조값(주소) 출력
		System.out.println(num1.getData()); // 인스턴스의 필드 출력
		
		// 매개 변수 생성자를 사용해서 MyNumber 클래스의 인스턴스 생성
		MyNumber num2 = new MyNumber(10);
		System.out.println(num2.getData());
		
		// num1의 매소드 add() 호출
		MyNumber result = num1.add(num2);
		System.out.println(result); //result 도 MyNumber 타입
		System.out.println(result.getData());
		
		MyNumber num3 = new MyNumber(20);
		result = num1.add(num3);
		System.out.println(result.getData());
		
		System.out.println("----------------------------------------");
		
		MyNumber x = new MyNumber(1);
		MyNumber y = new MyNumber(2);
		MyNumber z = new MyNumber(3);
		MyNumber w = new MyNumber(4);
		// MyNumber y = new MyNumber(2);
		// x.add(y);
		
		// x.add(new MyNumber(2)).add(new MyNumber(3)); // x.add(new MyNumber(2)) 이거 전체가  MyNumber타입.
		// x.add(y).add(z); // 윗줄이랑 같은 내용.
		x.add(y).add(z).subtract(w);
		System.out.println(x.getData());

	}

}
