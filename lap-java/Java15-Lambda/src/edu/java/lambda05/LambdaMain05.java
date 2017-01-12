package edu.java.lambda05;

public class LambdaMain05 {
	public static void main(String[] args) {
		
		// Button 객체 생성
		Button btn1 = new Button();
		// 버튼을 클릭했을 때의 기능 구현 - Listener, Handler
		
		Button.OnClickListener l = new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("버튼 1 클릭");
				
			}
		};
		
		// 버튼 클릭 리스너를 버튼 객체에 등록
		btn1.setOnClickListener(l);
		
		// 버튼 클릭 실행 - 메소드 호출
		btn1.click();
	}

}
