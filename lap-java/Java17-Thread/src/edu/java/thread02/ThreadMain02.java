package edu.java.thread02;


class MyThread extends Thread {
	private String msg;
	
	public MyThread(String msg){
		this.msg = msg;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i + " : " + msg);
			try {
				sleep(100);	// 100ms = 0.1 초 동안 멈춤
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadMain02 {

	public static void main(String[] args) {
		 Thread th1 = new MyThread("Hello Thread");
		 Thread th2 = new MyThread("안녕.....?");
		 
		 th1.start();
		 th2.start();
		 
		 // join() : 해당 쓰레드가 종료될 때까지 기다린 후 다음 코드 실행하겠다
		 try {
			th1.join();
			th2.join(); 	// th1과 th2가 종료될 때까지 기다린 다음 메인 쓰레드의 작업을 진행하겠다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 System.out.println("<<<<<<메인 스레드 종료>>>>>>");

	}

}
