package edu.java.inherit07;

class ParentClass {
	private int x;
	
	public ParentClass(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}	
}

class ChildClass extends ParentClass {	// class ChildClass extends ParentClass 이렇게만 선언하면 부모 클래스에 디폴트 생성자가 없어서 에러발생!
							// ChildClass 에서 생성자를 만들어주면 에러 발생하지 않음.
	private int y;
	
	public ChildClass(int x, int y) {
		super(x);
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
}

public class InheritMain07 {
	
	public static void main(String args[]) {
		// 다형성 사용과 instanceof 연산자
		ParentClass test1 = new ParentClass(100);
		ParentClass test2 = new ChildClass(10, 20);
		
		System.out.println(test2.getX());
//		System.out.println(test2.getY()); 		=> test2는 ParentClass 타입으로 선언되었기 때문에 
//								        => ChildClass에서 정의한 getY()를 쓸 수 없다.
//									=> 강제 형변환(casting)을 하면, ChildClass가 가지고 있는 메소드 사용 가능
		System.out.println(((ChildClass)test2).getY());
		System.out.println();
		
		// instanceof 클래스이름 :
		// 클래스 타입의 인스턴스이면 true, 아니면 false를 리턴
		// 사용 법 : 참조변수 instanceof 클래스
		if (test2 instanceof ChildClass) {	// test2가 ChildClass의 instance 입니까?
			System.out.println("x = " + test2.getX());
			System.out.println("y = " + ((ChildClass)test2).getY());
		} else {
			System.out.println("x = " + test2.getX());
		}
		
		System.out.println();
		if (test1 instanceof ChildClass) {	// test1가 ChildClass의 instance 입니까? false 이므로 else를 출력
			System.out.println("x = " + test1.getX());
			System.out.println("y = " + ((ChildClass)test1).getY());
		} else {
			System.out.println("x = " + test1.getX());
		}
		
		System.out.println();
		if (test2 instanceof ParentClass) {	//	=> instanceof 를 사용할때 제일 처음 if를 parent로 검사하면 처음 if 에서 모두 걸러지므로 가장 specific 한 것부터
			System.out.println(1);
		} else if (test2 instanceof ChildClass) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
		
		System.out.println();
		if (test2 instanceof ChildClass) {	//	=> instanceof 를 사용할때 제일 처음 if를 parent로 검사하면 처음 if 에서 모두 걸러지므로 가장 specific 한 것부터
			System.out.println(1);
		} else if (test2 instanceof ParentClass) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
		
		System.out.println();
		if (test2 instanceof ChildClass) {	// => general 한 클래스일 수록 아래에서 검사
			System.out.println(1);
		} else if (test2 instanceof ParentClass) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
		
											
	}

}
