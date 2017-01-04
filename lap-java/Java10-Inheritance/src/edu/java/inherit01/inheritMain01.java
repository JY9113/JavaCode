package edu.java.inherit01;

public class inheritMain01 {

	public static void main(String[] args) {
		// smartTV 클래스의 인스턴스 생성
		
		smartTV tv1 = new smartTV();
		tv1.turnOnOff(); // 자식 클래스는 부모 클래스의 메소드를 사용 가능
		tv1.turnOnOff();
		tv1.setIp("192.158.11.31");
		System.out.println(tv1.getIp());
		
		BasicTV tv2 = new BasicTV();
	//     tv2.setIp("");   // 부모클래스가 자식 클래스의 메소드를 사용 불가능

	}
	

}
