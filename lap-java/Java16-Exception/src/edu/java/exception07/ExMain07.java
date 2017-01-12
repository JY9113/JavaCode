package edu.java.exception07;

public class ExMain07 {

	public static void main(String[] args) {
		// try { 
		//     정상적인 경우에 실행할 코드들;
		// } catch (Exception e) { 
		//     예외 상황일 때 실행할 코드;
		// } finally { 
		//     정상적인 경우이든, 예외 상황이든 상관없이 항상 실행할 코드; 
		// }
		// (주의) try블록이나 catch블록 안에 return;이 있더라도
		// return보다 먼저 finally 블록이 실행되고, 그 후에 return이 실행됨! 
		
		try {
			System.out.println("try 시작");
			int result = 123 / 0;
			System.out.println("try 끝");
			
		} catch (Exception e) {
			System.out.println("예외:" + e.getMessage());
			return; // main() 메소드 종료
		} finally {
			System.out.println("finally: 언제 실행될까요?");
		}
		
		System.out.println("프로그램 종료");
	} // end main()

}
