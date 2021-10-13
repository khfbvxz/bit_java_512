package net.bit.day13;

public class Store {
	private int pwd = 1234;  //  필드 = 멤버변수 = 전역변수 
	
	public static void main(String[] args) {
		Store.note();
//		Store.book();// 에러 불러올수 없음
		Store yp = new Store();// Store 객체 생성
		yp.book(); //  스태틱 없을 때 이렇게 생성해야함
//		System.out.println(pwd);//에러
	}// main end
	public static void note() { //  static 메소드
		System.out.println("static note 메소드");
//		book(); // 에러 non-static 이여서
//		System.out.println(pwd);
	}// end
	public void book() { // non-static 메소드
		System.out.println("book 메소드");
		note(); // 에러 없음 static 이여서 
		System.out.println(pwd);
	}// end
}
