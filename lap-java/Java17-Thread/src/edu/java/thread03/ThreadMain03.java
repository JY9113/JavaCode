package edu.java.thread03;


// 자바는 다중 상속을 허용하지 않기 때문에 다른 클래스를 이미 상속받고 있다면
// Thread 클래스를 상속 받을 수 없다.
// Runnable 인터페이스를 구현해서 Thread를 생성할 수있는 방법을 제공

// 자바에서 쓰레드를 생성하고 사용하는 방법 2:
//	1. Runnable 인터페이스를 구현하는 클래스를 정의한다. (implements Runnable)
//	2. 정의한 클래스에서 run() 메소드를 override 
//		-> 쓰레드가 해야 할 기능 구현
//	3. 정의한 클래스(Runnable 구현 클래스)의 인스턴스를 생성
//	4. Runnable 인스턴스를 매개변수로 해서 Thread 인스턴스를 생성
//		( 예 ) new Thread(runnable);
//	5. Thread 인스턴스에서 start() 메소드를 호출 -> run() 자동 호출


// 1. Runnable 인터페이스를 구현하는 클래스를 정의
class MyRunnable implements Runnable {
	private String msg;
	
	public MyRunnable(String msg) {
		this.msg = msg;
	}
	
	// 2. run() 메소드 override
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i + " : " + msg);
			try {
				Thread.sleep(100);	// 현재 Thread를 상속받는 것이 아니기때문에 Thread소속임을 밝혀줘야 한다
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 	
			
		}
		
	}
}
public class ThreadMain03 {
	
	public static void main(String[] args) {
		// 3. Runnable 구현하는 클래스(MyRunnable) 의 인스턴스 생성
		MyRunnable r1 = new MyRunnable("졸리세요~???");
		Runnable r2 = new MyRunnable("쉬는 시간입니다");	//MyRunnable은 Runnable  타입이다 -> 다형성
		
		// 4. Runnable 인스턴스 (r1)을 매개변수로 해서 Thread를 생성
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);		
		
		// 5. Thread 인스턴스(th1)에서 start()를 호출
		th1.start();
		th2.start();
		
		System.out.println("<<<<<메인 스레드 종료>>>>>");
		
	}

}
