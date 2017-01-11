package edu.java.collection08;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

// Map<K, V>
// |__HashMap<K, V>, TreeMap<K, V>

public class CollectionMain08 {

	public static void main(String[] args) {
		// TreeMap<String, String> 객체 생성
		TreeMap<String, String> map = new TreeMap<>();
		
		// Map<K, V>에 데이터 저장, : put(key, value)
		map.put("root",  "root1234");
		map.put("guest", "guest");
		map.put("root2",  "root1234");
		System.out.println("size : " + map.size());
		System.out.println(map);
		
		System.out.println();
		//특정 키의 데이터 검색 : get(key)
		System.out.println(map.get("root"));
		System.out.println();
		//특정 키의 데이터 수정 : put(key,value)
		map.put("root2",  "root!@#$");
		
		System.out.println();
		//특정 키의 데이터 삭제 : remove(key)
		map.remove("root2");
		System.out.println(map);
		
		System.out.println();
		// Map<K, V> 에서 키값들로 이루어진 Set<E> 생성, Set의 element는 Key 값과 같은 타입
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + " = " + map.get(k));
			
		}
		
		System.out.println();
		// Map 의 키들로 이루어진 집합(Set)에서 Iterator 객체 생성
		// 집합의 원소를 가리키는 것이 iterator?
		Iterator<String> itr = keys.iterator();
		while( itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + " = " + map.get(key));
		
//			정상 출력 결과
//			guest = guest
//			root = root1234
			
//			System.out.println(itr.next() + " = " + map.get(itr.next()));
			// itr.next()에서 가지고있던 guest를 넘기고, 위치가 바뀜.
			// 이미 root로 넘어간 상태에서 next() 부르면 root가 리턴되고 위치가 바뀜(공백)
			// 그 상태에서 get을 호출하니까 root의 value인 root1234가 호출.
			// while 안에서 next가 두번 호출됐기 때문에 현재 iterator 의 위치는 공백.
			// while이 false 이므로 Key 값은 guest, value는 root의 value로 한 줄만 출력
		}
		
		
	}

}
