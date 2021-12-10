package api;

import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		
		Date now = new Date();
		// 현재시스템의 시간으로 객체를 만듦
		// 그 외는 잘 사용하지 않는다.
		System.out.println(now);
		
		// JDK1.0 에서는 Date클래스를 사용하였으나,
		// 윤년 4년에 한번씩 2월29일
		// 오차가 존재 
		// 때문에 JDK 1.1 에서부터 향상된 기능을 추가한 Calendar 클래스를 사용한다.
		
		Calendar cal = Calendar.getInstance();
		// Calendar 클래스는 추상클래스로서 직접 객체를 생성하지 않음.
		// getInstance 메소드는 Calendar 클래스의 객체를 반환
		
		int year = cal.get(Calendar.YEAR);
		
		int month = cal.get(Calendar.MONTH) + 1;
		// 컴퓨터의 월은 0부터 시작을하기 때문에 + 1을 해주어야 한다.
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("오늘의 날짜 : %d년 %d월 %d일\n", year, month, day);
		
		cal.get(Calendar.HOUR); // 12시간제
		int hour = cal.get(Calendar.HOUR_OF_DAY); //24시간제
		
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("현재시간 : %d시 %d분 %d초", hour, minute, second);
		
		
	}

}
