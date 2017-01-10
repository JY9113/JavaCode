package edu.java.inner08;

public class InnerMain08 {

	public static void main(String[] args) {
		// Button 클래스의 인스턴스 생성
		Button btnFinish = new Button();
		
		// FinishListener 클래스의 인스턴스 생성
		Button.OnClickListener finListener = 
				new FinishListener(); // 다형성
		
		btnFinish.setOnClickListener(finListener);
		btnFinish.click();
		
		System.out.println();
		Button btnCancel = new Button();
//		Button.OnClickListener cancel = new CancelListener();
		btnCancel.setOnClickListener(new CancelListener());
		btnCancel.click();

		System.out.println();
		Button btn = new Button();
		Button.OnClickListener l = new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("테스트");
			}
		};
		btn.setOnClickListener(l);
		btn.click();
		
		System.out.println();
		Button btn2 = new Button();
		btn2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("테스트 테스트");
			}
		});
		btn2.click();
		
	} // end main()

} // end class InnerMain08

class FinishListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("<<< 종료 >>>");
	}
	
} // end class FinishListener

class CancelListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("<<< 취소 >>>");
	}

} // end class CancelListener























