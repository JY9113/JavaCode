package edu.java.op03;

public class OpMain03 {
	
	public static void main(String[] args) {
		
		System.out.println("증감 연산자(++, --)");
		System.out.println();
		
		int num = 100;
		num++;
		System.out.println("num : " + num);
		
		int num2 = 100;
		num2--;
		System.out.println("num2 : " + num2);
		
		++num2;
		System.out.println("num2 : " + num2);
		
		int num3 = 100;
		int result = ++num3 + 5; //증감 연산자가 먼저 작동하고 +5가 작동.
		System.out.println("num3 : " + num3);
		System.out.println("result : " + result);
		
		int num4 = 100;
		result = num4++ + 5; // +5가 먼저 작동하고 난 다음 증가.
		/*
		 * result = num4 + 5;
		 * num4++;
		 */
		System.out.println("num4 : " + num4);
		System.out.println("result : " + result);
		
/*		증감 연산자는 변수 앞(prefix) 또는 변수 뒤(postfix)에 사용할 수 있다.
		증간 연산자가 단독으로 사용되는 경우는 prefix, postfix 모두 동일한 결과
		x++; ++x; 는 같은 값.
		문제는 증감 연산자가 다른 연산자와 섞여있을 때
		prefix는 다른 연산자보다 먼저 계산이 되고,
		postfix는 다른 연산자보다 나중에 계산 된다.
*/	
		int x = 10;
		result = x++ + 5 + ++x;
		//x + 5 먼저 진행후 x 증가해서 11, 그 다음 ++x이므로 x는 12, 그전에 x+5가 15이므로 결과는 27
		System.out.println(result);
		
		/*	1. x++ + 5
			 (1) x + 5
			 (2) x 증가
			2. 15 + ++x
			 (1) x 증가 (x=12)
			 (2) 15 + 12 = 27
			3. result = 27
		*/
	}

}
