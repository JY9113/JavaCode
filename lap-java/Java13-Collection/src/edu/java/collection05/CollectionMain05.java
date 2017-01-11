package edu.java.collection05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// |__ : 상속 받는다.

// Collection<E>
// |__Set<E>
//	|__ HashSet<E>, TreeSet<E>
// Set<E> :
//	1. 데이터의 저장 순서가 중요하지 않음 -> 인덱스가 없다.
//	2. 중복된 데이터의 저장을 허용하지 않음.
//		(ex) {1, 2, 3} = {3, 2, 1} 
//		(ex) {1, 2, 2, 3, 3, 3} = {1, 2, 3}

// HashSet<E> : 검색을 빠르게 하기 위한 Hash 알고리듬이 적용된 Set
// TreeSet<E> : 정렬을 빠르게 하기 위한 Tree 알고리듬이 적용된 Set

public class CollectionMain05 {
	
	public static void main(String[] args) {
		// HashSet<Integer> 객체 생성
//		HashSet<Integer> set = new HashSet<>();
		
		Set<Integer> set = new HashSet<>();	// 다형성 (HashSet은 Set이다)
		
		// Set에 데이터 저장 : add(element)
		
		set.add(200);
		set.add(100);
		set.add(300);
		set.add(400);
		set.add(500);
		System.out.println("Set Size : " + set.size());		//add를 4번 했는데 size=3, 200이 중복으로 허용되지 않기때문.
		// 데이터 저장 순서에 따라 저장되는게 아니라 알고리즘을 통해 저장.
		
		// Set<E>은 인덱스로 데이터를 읽어올 수 있는 get() 메소드를 제공하지 않음.	=> for-each 구문으로 전체 출력만 가능.
		
		System.out.println();
		for (Integer x : set) {
			System.out.println(x);
		}
		
		
		
		System.out.println();
		System.out.println("--------------------------------");
		
		// Iterator(반복자)를 사용한 데이터 검색
		// Iterator() : Iterator 객체 생성
		// hasNext() : Iterator 객체가 가리키는 위치에 원소가 있는지(true), 없는 지 (false)를 리턴하는 메소드
		// next() : Iterator 객체가 가리키는 위치를 다음 위치로 이동하고, 원래 가리키고 있던 값을 리턴하는 메소드
		
		Iterator<Integer> itr = set.iterator();	// Integer를 가리키는 Iterator
		while (itr.hasNext()) {	// hasNext() 지금 iterator가 가리키는 위치에서 다음 원소가 있습니까? T/F 리턴
			System.out.println(itr.next());	// next() : iterator가 가리키고 있는 위치 다음을 가리키게 만들고, 원래 자기가 가리키고 있던 값을 리턴. 
		}
		
		System.out.println();
		// Set<E>의 원소를 삭제 : remove()
		// 인덱스가 아니라 값으로 삭제
		
		set.remove(200);
		System.out.println("-----------200 삭제후-------------");
		for(Integer x : set) {
			System.out.println(x);
		}
		
		// Set<E>은 인덱스가 없기 때문에,
		// 데이터 변경을 위한 set(index, element) 메소드를 제공하지 않음
		// 데이터 변경 => 데이터 삭제(remove) + 데이터 추가(add)
		
		set.remove(300);
		set.add(500);
		System.out.println("-----------변경후----------");
		for(Integer x : set) {
			System.out.println(x);
		}
		
		
		
	}

}
