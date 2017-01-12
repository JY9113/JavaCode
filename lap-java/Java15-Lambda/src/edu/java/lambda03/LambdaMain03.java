package edu.java.lambda03;

public class LambdaMain03 {

	public static void main(String[] args) {
		Test3 t = new Test3() {
			@Override
			public void printMax(int x, int y) {
//				int max;
//				if(x > y) {
//					max = x;
//				} else {
//					max = y;
//				}
				int max = (x > y) ? x : y;
				System.out.println("최대값 : " + max);
			}
		};
		t.printMax(2, 5);
		
		Test3 t2 = (x, y) -> {
			int max = (x > y) ? x : y;
			System.out.println("최대값 : " + max);
		};
		t2.printMax(100, 500);
		
		System.out.println();
		Test4 t3 = (x, y) -> {
//			int max = (x > y) ? x : y;
//			return max;			
			return (x > y) ? x : y;
		};
		System.out.println("최대값 : " + t3.findMax(200, 345));
		
		System.out.println();
		Test4 t4 = (x, y) -> {
			return (x > y) ? x : y;
		};
		System.out.println(" 최대값 : " + t4.findMax(123, 456));
		
		// 람다 표현식에서 실행문 return문 하나만 있으면
		// { } 와 return 을 생략할 수 있다.
		Test4 t5 = (x, y) -> (x > y) ? x : y;
		System.out.println("최대값 : " + t5.findMax(345, 123));
		
		
		
	}

}

interface Test3 {
	public abstract void printMax(int x, int y);
}

interface Test4 {
	public abstract int findMax(int x, int y);
}
