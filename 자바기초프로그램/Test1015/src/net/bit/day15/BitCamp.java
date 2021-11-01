package net.bit.day15;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class BitCamp {
	private String name="자바의정석";
	public static void main(String[] args) {
		Father kim = new Father();
		int a = kim.bank("농협");
		int b = kim.bank(34);
//		System.out.println(a+"   "+b);
		
//		Calendar cal = null;
//		Calendar cal = new Calendar();//에러
		Calendar gcal = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
//		Mother mm = new Mother(); // 에러 추상클래스여서
		Mother.house(); // 얘는 static이여서 가능 
		
		
		
//		BitCamp bc = new BitCamp();
//		bc.note();
		// static 키워드가 있는 곳에서 this 사용 불가 
	}// main end
	
	public void note() { // Non-static 메소드
		String name = "노트패드";
		System.out.println("전역변수 종류="+this.name);
		System.out.println("지역변수 종류="+name);
		System.out.println();
		String a = this.book();
		double b = this.save();
//		System.out.println("책제목 = " + title);
		System.out.println("책제목 = " + a);
//		System.out.println("책제목 = " + book());
//		System.out.println("포인트 = " + point);
		System.out.println("포인트 = " + b);
//		System.out.println("포인트 = " + save());
	}//end
	
	public String book(){	// Non-static 메소드
		String title="몽블랑";
		
		return title;	
	}//end
	
	public double save() {	// Non-static 메소드
		double point = 7.8;
		return point;
	}
}// class end
