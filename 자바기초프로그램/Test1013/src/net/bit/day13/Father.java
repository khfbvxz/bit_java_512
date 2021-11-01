package net.bit.day13;
import java.util.Random;
import java.io.FileReader;

public class Father {
	private int pwd; // 전역변수 = filed= 필드
	
	public Father() {}// 기본 생성자
	public Father(String name) {
		System.out.println(name + " 주인장입니다.");
	} // 생성자
	public Father(String name , int age) {
		System.out.println(name+"입니다. 나이는"+age);
	}
	public String bank(double d) {return "국민은행";}
	public void house() {}
	public void myCal(int a, int b) {System.out.println(a+" "+b +" = "+(a+b));}
	public static int cal() {return 2400;}
	public static void color(String kind) {System.out.println(kind);}
	
}//Father class end
