package edu.java.date01;

import java.util.Date;

public class DateMain01 {

	public static void main(String[] args) {
		// 시스템의 현재 시간 정보
		Date date = new Date();	// 보통 쓰는거는 java.util.Date;
		System.out.println(date);
		System.out.println(date.getTime());
		
		System.out.println();
		// 1970년 1월 1일 0시 0분 0초를 기준으로 삼아서
		// milli-second
		Date date2 = new Date(0L);
		System.out.println(date2);
		Date date3 = new Date(1000L);
		System.out.println(date3);
	}

}
