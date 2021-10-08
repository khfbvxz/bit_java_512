package net.bit.day08;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Bit06 {
	public static void main(String[] args) {
		Date dt = new Date();
		
		System.out.println(dt.toString());
		System.out.println(dt);
		System.out.println(dt.toLocaleString());
		String msg = dt.toLocaleString();
		System.out.println("===================");
		
//		Calendar cal - new Calendar();
		Calendar calA = Calendar.getInstance();  //자기자신을
		Calendar cal2 = new GregorianCalendar();
		int y1 = calA.YEAR;
		int y2 = cal2.YEAR;
		int m1 = calA.MONTH;
		int m2 = cal2.MONTH;
		int day1 = calA.DAY_OF_WEEK_IN_MONTH;
		int day2 = cal2.DAY_OF_MONTH;
//		System.out.println(calA.get(y1)+"년 "+(calA.get(m1)+1)+"월 "+cal2.get(day2)+"일 입니다.");
		System.out.println(calA.get(y1)+"년 "+(calA.get(m1)+1)+"월 "+day1+"일 입니다.");
		System.out.println(calA.get(y2)+"년 "+(calA.get(m2)+1)+"월 "+day2+"일 입니다.");
		
		Random rd = new Random();
		int su = rd.nextInt(5);// 0~4
		System.out.println("난수 발생 숫자 = " + (su+1));// ===> 1~5
		
		double rand = Math.random();//static
		int ran = (int)(Math.random()*3+1); // 1~3 사이 가위바위보
		System.out.println("난수 발생 숫자 = " + rand);
		System.out.println("난수 발생 숫자 = " + ran);
		
	}
}
