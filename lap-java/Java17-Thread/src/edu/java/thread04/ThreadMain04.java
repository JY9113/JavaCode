package edu.java.thread04;


class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("Runnable 구현 객체");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class ThreadMain04 {

	public static void main(String[] args) {
		Runnable r1 = new MyRunnable();
//		Thread t1 = new Thread(r1);
		Thread th1 = new Thread(new MyRunnable());
		th1.start();
		
		Thread th2 = new Thread(new Runnable() {	// 익명 클래스
			@Override
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println("익명 클래스");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}); 
		th2.start();
		
		
		
		/////// 람다 포현식을 사용한 Thread 구현
		Thread th3 = new Thread(() -> {
			for(int i = 0; i < 100; i++) {
				System.out.println("Lambda 표현식");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});	// (Run 메소드의 매개변수) -> {실행코드}
		
		System.out.println("<<<<메인 쓰레드 종료>>>>");

	}

}
