package net.bit.common;
import net.bit.day13.Father;

public class Dunkin {
	public static void main(String[] args) {
		// 던킨에서 아버지 클래스에서 myCal 이랑 color 가져오기
		System.out.println("net.bit.common 패키지에 던킨 클래스 3:40");
		Father kim = new Father("이순신",52);
		kim.myCal(25,35);
		Father.color("red");
		
	}
	
}
