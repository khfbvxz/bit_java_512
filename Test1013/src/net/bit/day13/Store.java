package net.bit.day13;

public class Store {
	private int pwd = 1234;  //  �ʵ� = ������� = �������� 
	
	public static void main(String[] args) {
		Store.note();
//		Store.book();// ���� �ҷ��ü� ����
		Store yp = new Store();// Store ��ü ����
		yp.book(); //  ����ƽ ���� �� �̷��� �����ؾ���
//		System.out.println(pwd);//����
	}// main end
	public static void note() { //  static �޼ҵ�
		System.out.println("static note �޼ҵ�");
//		book(); // ���� non-static �̿���
//		System.out.println(pwd);
	}// end
	public void book() { // non-static �޼ҵ�
		System.out.println("book �޼ҵ�");
		note(); // ���� ���� static �̿��� 
		System.out.println(pwd);
	}// end
}
