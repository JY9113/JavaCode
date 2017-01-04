package edu.java.local;

public class TestMain {

	public static void main(String[] args) {
		// 지역 변수 (local variable)
		//		메소드 안에서 선언하는 변수
		// 지역 변수의 사용 범위
		//		지역 변수는 선언된 시점부터 선언된 블록이 끝날때 까지만 사용 가능.
		//		지역변수가 포함된 블록이 끝나면, 지역변수는 자동으로 소멸 됨. (garbage collector)
		
		
		int x = 100;
		int y = 200;
		
		if (x > y) {
			int diff = x - y;
			System.out.println(diff);
		} else {
			int diff = y - x;	//else로 넘어 왔다는 거는 if안에서 diff가 선언되지 않았다는 것. 따라서 타입 지정해줘야 함.
			System.out.println(diff);  // diff는 지역변수이므로 if밖이나 else 밖에서 diff 사용할 수 없다.
		}
		// System.out.println("diff = " + diff);
		// 컴파일 에러 : diff는 if 블록 안 또는 else 블록 안에서만 사용
	}

}
