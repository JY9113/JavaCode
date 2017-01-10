package edu.java.inner04;

public class InnerMain04 {

	public static void main(String[] args) {
		// static 멤버 변수 사용: (클래스이름).(변수이름)
		OuterClass.count = 100;
		System.out.println(OuterClass.count);
		
		// 중첩 클래스(static 클래스)
		// (외부클래스 이름).(중첩클래스 이름) 변수이름 =
		//    new (외부클래스 이름).(내부클래스 이름)();
		OuterClass.NestedClass nest = new OuterClass.NestedClass("Hello");
		nest.display();

	} // end main()

}
