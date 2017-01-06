package edu.java.collection01;

import java.util.ArrayList;

public class ListMain01 {
	
	public static void main(String args[]) {
		// E는 element라고 생각하면 된다. ex) integer arrayList를 만들경우 E 자리에 Integer, String도 가능
		// 연락처를 만들때???? ArrayList<ContactVO> 라고 해도 된다...???
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println(" 리스트 크기 : " + list.size());
		
		// ArrayList에 원소(element) 추가 : add() 메소드 사용
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		// ArrayList에 있는 원소 참조 (읽기) : get(index) 메소드 사용
		// array랑 동일하게 0번 부터 index 시작.
		
		System.out.println(" 2번째 원소 : " + list.get(0));
		System.out.println(" 2번째 원소 : " + list.get(1));
		
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 위의 for문과 같은 출력 값
		System.out.println();
		for (Integer n : list) {
			System.out.println(n);
		}
		
		// ArrayList에서 특정 인덱스의 원소를 변경 : set(index, value)
		System.out.println();
		list.set(0, 1);
		list.set(2, 123456);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		// ArrayList에서 특정 인덱스의 원소를 삭제 : remove(index)
		// ArrayList에서는 remove를 하면 size도 감소........index 2를 삭제하면 마지막에 있던 400의 index가 3에서 2로 당겨진다.
		System.out.println();
		System.out.println(list.size());
		list.remove(2);
		System.out.println(list.size());
		
		
		
		
		
	}

}
