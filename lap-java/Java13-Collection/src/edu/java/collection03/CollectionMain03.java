package edu.java.collection03;

import java.util.LinkedList;
import java.util.List;

//Collection<E>: 자료(데이터) 저장하기 위한 generic
//|__ List<E>, Set<E>

// List<E>:
//	1. 자료들이 저장되는 순서가 중요 -> 인덱스 사용
//	2. 중복된 값들의 저장을 허용

// List<E>
//|__ ArrayList<E>, LinkedList<E>

// ArrayList<E>:
//	1. 내부적으로 배열 자료 구조를 사용
//	2. 저장 용량을 늘리는데 많은 시간이 소요 - 단점
//	3. 저장된 데이터를 삭제하는 데도 많은 시간이 소요 - 단점
//	4. 데이터를 참조(검색)할 때 매우 빠름 - 장점

// LinkdedList<E> :
//	1. 내부적으로 Linked list 자료 구조를 사용
// 	2. 저장 용량을 늘리는 과정이 매우 간단 - 장점
//	3. 저장된 데이터를 삭제하는 과정도 매우 간단 - 장점
//	4. 데이터를 참조(검색)하는 시간이 매우 느림 - 단점

// ArrayList<E>, LinkedList<E>에서 사용되는 메소드들 :
//	add(element), get(index), set(index, element), remove(index)
public class CollectionMain03 {

	public static void main(String[] args) {
		// String을 저장할 수 있는 LinkedList 객체 생성
		List<String> list = new LinkedList<>();	// 다형성
//		LinkedList<String> list = new LinkedList<>();	// 같은 코드, 위에건 다형성 사용
		
		// LinkedList에 데이터 추가 : add()
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		
		// LinkedList에서 데이터 검색 : get()
		System.out.println("----------------리스트 검색----------------");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		System.out.println();
		
		// LinkedList에서 데이터 변경 : set()
		System.out.println("------------변경후------------");
		list.set(2, "77777");
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println();
		
		// LinkedList에서 데이터 삭제 : remove()
		list.remove(2);
		System.out.println("---------------삭제후-----------------");
		for(String name : list) {
			System.out.println(name);
		}
		
	}

}
