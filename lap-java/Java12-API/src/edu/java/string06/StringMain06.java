package edu.java.string06;

public class StringMain06 {

	public static void main(String[] args) {
		String str = "abc";
		str += "def";
		System.out.println(str);
		
		String result = str.concat("ghi");
		// "abcdef" + "ghi" => "abcdefghi"
		System.out.println(result);
		System.out.println(str);
		
		System.out.println();
		StringBuffer buff = new StringBuffer("ABC");
		StringBuffer result2 = buff.append("DEF");
		System.out.println(result2);
		System.out.println(buff);
		
		System.out.println();
		StringBuffer buff2 = new StringBuffer("AAA");
		buff2.append("BBB").append("CCC");
		System.out.println(buff2);

	}

}
