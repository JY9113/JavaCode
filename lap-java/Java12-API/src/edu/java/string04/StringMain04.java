package edu.java.string04;

public class StringMain04 {

	public static void main(String[] args) {
		
		// (API : Application Programming Interface)
		
		// length() : 문자열의 길이를 리턴
		String str1 = "abc";
		String str2 = "안녕";
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		// Object 클래스의 equals() 메소드를 override 함
		System.out.println(str1.equals(str2));
		
		// equalsIgnoreCase() : 대소문자 구분 없이 비교
		System.out.println();
		String str3 = "Hello";
		String str4 = "hello";
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
		
		// charAt(int) : 문자열 중에서 해당 인덱스의 문자하나를 리턴
		System.out.println();
		System.out.println(str3.charAt(1));
		
		// indexOf() : 해당 문자 또는 문자열이 몇 번째 인덱스에 있는지 리턴
		System.out.println();
		String str5 = "Hello, world";
		System.out.println(str5.indexOf("d"));
		System.out.println(str5.indexOf("world"));
		System.out.println(str5.lastIndexOf('l'));
		
		// startsWith()
		System.out.println();
		String str6 = "http://www.google.com";
		System.out.println(str6.startsWith("http://")); // 해당 문자열로 시작하면 true
		
		// contains(String) : 문자열을 포함하고 있는지 아닌지
		System.out.println();
		System.out.println(str6.contains("google"));
		
		// split()
		System.out.println();
		String str7 = "2017-01-05";
		String[] result = str7.split("-");
		for (String x : result) {
			System.out.println(x);
		}
		
		String str8 = "04:53:55";
		result = str8.split(":");
		for (String x : result) {
			System.out.println(x);
		}
		
		
		//
		System.out.println();
		String str9 ="2017|01|05 16:55:15";
		result = str9.split("\\||:| ");
		for(String x : result) {
			System.out.println(x);
		}
		
		// compareTo()
		// compareToIgnoreCase()
		String str10 = "abc";
		String str11 = "Abc";
		System.out.println(str10.compareTo(str11));
		System.out.println(str10.compareToIgnoreCase(str11));
		
		//toUpperCase()
		//toLowerCase()
		System.out.println();
		String str12 = "Hello, Java!";
		System.out.println(str12.toUpperCase());
		System.out.println(str12.toLowerCase());
		
		// substring(begin index, end index);
		//	begin index는 포함 end index는 불포함. 0부터 시작
		System.out.println();System.out.println(str12.substring(1, 6));
		
		// concat() : 문자열을 이어주는 메소드
		System.out.println(str12.concat(" world"));
	}

}
