package net.bit.day13;

class Father{
	private int pwd; //  필드 멤버변수 전역변수
	public Father() {} // 기본 생성자
	public Father(String name) {}// 생성자
	public Father(String name,int age) {}// 생성자
	// 일반 메소드 리턴값 있음
	public String bank(){ String name = "국민은행";return name;}
	// 일반메소드 리턴값 없음
	public void house(){String my = "마이홈";}
	// 일반 메소드 리턴값 없음 매개인자
	public void myCal(int a, int b) {System.out.println("a+b = "+(a+b));}
	//static 메소드 리턴값 있음
	public static int car() {int sell=2500; return sell;}
	//static 메소드 리턴값 없음 매개인자
	public static void color(String kind) {}
}// class Father end
public class Father {
	public static void main(String[] args) {
		Father ft = new Father();
		Father ft2 = new Father("작은아빠");
		Father ft3 = new Father("큰아빠",52);
		String data = ft.bank();
		ft.house();
		int price = Father.car();
		ft.myCal(90,85);
//		System.out.println(ft.bank());
		System.out.println(data);
		System.out.println(ft.car());
		System.out.println("price "+price);
		
		System.out.println("작은 아빠 꺼 ");
		System.out.println(ft2);
		System.out.println(ft2.bank());
		System.out.println(ft2.car());
	}//main end
}//class Test end
