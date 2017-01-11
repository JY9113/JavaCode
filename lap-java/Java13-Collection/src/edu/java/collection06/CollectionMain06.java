package edu.java.collection06;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

// Collection<E> 
// |__Set<E>
//	|__HashSet<E> : 검색을 빠르게, TreeSet<E> : 정렬을 빠르게


public class CollectionMain06 {

	public static void main(String[] args) {
		// TreeSet<String> 객체 생성
		TreeSet<String> set = new TreeSet<>();
//		Set<String> set = new TreeSet<>(); //다형성
		
		// 데이터 저장 : add(element)
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		// Iterator 객체를 사용한 데이터 출력
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		// 데이터 삭제 : remove(element)
		set.remove("One");
		
		// Set<E>은 인덱스가 없기 때문에,
		// 데이터 변경을 위한 set(index, element) 메소드를 제공하지 않음
		// 데이터 변경 => 데이터 삭제(remove) + 데이터 추가(add)
		System.out.println("-----------삭제후-----------");
		for(String s : set) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("------------------------------------");
		// TreeSet<E>인 경우
		// iterator() : 오름차순 Iterator 객체 생성
		// descendingIterator() : 내림차순 Iterator 객체 생성.
		
		Iterator<String> itr2 = set.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		

	}

}
