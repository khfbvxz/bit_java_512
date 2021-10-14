package net.bit.day14;

public class TestEMP {
	private String title;
	private int number = 9000;
	
	public static void main(String[] args) {
		TestEMP ob = new TestEMP();
		ob.note();
	}// main end
	
	
	public String getTitle() {
//		return title;
		return this.title; // this 멤버변수를 가져온다. 
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void note() {
		int number = 1234;
		System.out.println("지역변수 number= " + number);// 지역변수 1234출력
		System.out.println("전역변수 number= " + this.number);// 지역변수 9000출력
	}// end
	
}// class end
