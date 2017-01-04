package edu.java.op05;

public class OpMain05 {

	public static void main(String[] args) {
		System.out.println("논리연산자(&&, ||, !)\n");
		// A && B : AND(논리곱) 연산
		//   A와 B가 모두 true 일때만 true이고, 나머지는 false
		// A || B : OR(논리합) 연산
		//   A 또는 B가 true이면 true 이고, A,B 모두 false일때는  false
		// !A : NOT(논리 부정) 연산
		//   A가 true 이면 false, A가 false이면 true
		
		
/*		A  |  B  |  A && B |  A || B
 *    -------------------------------
		T  |  T  |    T    |    T
		T  |  F  |    F    |    T
		F  |  T  |    F    |    T
		F  |  F  |    F    |    F
		
		
		A     !A
		---------
		T   |  F
		F   |  T
*/
		System.out.println(10 > 0 && 10 < 100);
		System.out.println(10 > 0 || 10 < 100);
		System.out.println(10 <= 0 || 10 <= 100);
		System.out.println(10 <= 0 && 10 <= 100);
		System.out.println(!(111>100));

	}

}
