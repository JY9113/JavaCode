package edu.java.thread01;

// 쓰레드(thread) : 하나의 작업을 순차적으로 진행하는 실행 코드
// 멀티 쓰레드 프로그램 :
// 하나의 프로그램에서 여러개의 쓰레드를 실행시켜서 동작하는 프로그램
// 	( 예 ) 채팅 프로그램 : 채팅 + 파일 전송

// 자바에서 쓰레드를 생성하고 사용하는 방법 1:
//	1. Thread 클래스를 상속받는 새로운 클래스를 정의 (extends Thread)
//	2. 정의한 새로운 클래스 안에서 run() 메소드를 override 
//		-> run() : 쓰레드가 해야 할 기능들을 구현, 이 메소드를 직접 호출하는게 아니라 start() 메소드를 사용.
//	3. 정의한 클래스의 인스턴스를 생성 
//	4. 생성된 인스턴스에서 start() 메소드를 호출
//		-> 쓰레드가 가져야 할 메모리 공간을 확보, 쓰레드를 스케줄링을 위해서 쓰레드를 등록. 
//		-> 그 다음, 쓰레드의 run() 메소드가 자동으로 실행됨


// 1. Thread 클래스를 상속받는 새로운 클래스를 정의
class MyThread extends Thread {
	// 멤버 변수
	private String msg;
	
	// 생성자
	public MyThread(String msg) {
//		super();	// 자식 클래스의 생성자가 호출되면 부모클래스가 먼저 생성된다. 여기서는 Thread 클래스. 굳이 부를 필요없다.
		this.msg = msg;		
	}
	
	// 메소드
	// 2. 부모클래스가 가지는 run() 메소드를 override - Thread가 해야할 기능들을 구현 
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i +" : " + msg);
			
			try {
				sleep(10);		// 10 ms 동안 일을 멈추겠다 = 0.01초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}



public class ThreadMain01 {

	public static void main(String[] args) {
		
		// 3. Thread를 상속받는 클래스(MyThread)의 인스턴스를 생성
		MyThread th1 = new MyThread("안녕하세요~");
		
		// 4, 생성자 인스턴스에서 start()를 호출 -> 새로운 쓰레드가 실행
		th1.start();	// MyThread 에서는 start()를 만든적 없다 -> Thread가 가지고 있는 메소드
		// start()가 run()을 자동으로 호출
		
		Thread th2 = new MyThread("Hello!");		// 다형성
		th2.start();
		
		System.out.println("<<<<<<<메인 쓰레드 종료");
		// th1.run();을 해주면 쓰레드를 만든게 아니라 인스턴스가 가진 메소드를 호출한 것일 뿐.
		// 따라서 "메인 쓰레드 종료"의 문구가 항상 마지막에 나온다.
		// 쓰레드를 두개 만들경우 이 문구가 랜덤으로 표시됨.		
		
		
		

	}

}
