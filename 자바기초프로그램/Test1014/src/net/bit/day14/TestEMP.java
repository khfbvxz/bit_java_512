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
		return this.title; // this ��������� �����´�. 
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void note() {
		int number = 1234;
		System.out.println("�������� number= " + number);// �������� 1234���
		System.out.println("�������� number= " + this.number);// �������� 9000���
	}// end
	
}// class end
