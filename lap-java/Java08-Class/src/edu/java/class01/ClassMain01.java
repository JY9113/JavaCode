package edu.java.class01;


public class ClassMain01 {

	public static void main(String[] args) {
		// 클래스의 "객체(인스턴스)"를 "생성"한다.
		// 클래스이름 변수이름 = new 생성자();
		BasicTv tv = new BasicTv();
		// 기본 생성자를 호출해서 객체를 생성하게 되면
		// 클래스의 멤버 변수들은 기본값으로 초기화됨
		//   숫자(int, double, ...) 타입의 기본값: 0
		//   boolean 타입의 기본값: false
		//   그 외 타입(참조 타입): null
		tv.displayInfo();
		
		// TV의 기능 사용 
		// => BasicTv 클래스가 가지고 있는 메소드를 호출
		// 참조변수이름.메소드이름(매개변수);
		tv.turnOnOff(); // TV 전원 켬
		tv.displayInfo();
		
		tv.channelUp(); // TV 채널 1 증가
		tv.volumeUp(); // TV 볼륨 1 증가
		
		tv.turnOnOff(); // TV 전원 끔
		tv.displayInfo();
		

	} // end main()

} // end class ClassMain01














