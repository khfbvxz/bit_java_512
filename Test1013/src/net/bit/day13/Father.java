package net.bit.day13;

class Father{
	private int pwd; //  �ʵ� ������� ��������
	public Father() {} // �⺻ ������
	public Father(String name) {}// ������
	public Father(String name,int age) {}// ������
	// �Ϲ� �޼ҵ� ���ϰ� ����
	public String bank(){ String name = "��������";return name;}
	// �Ϲݸ޼ҵ� ���ϰ� ����
	public void house(){String my = "����Ȩ";}
	// �Ϲ� �޼ҵ� ���ϰ� ���� �Ű�����
	public void myCal(int a, int b) {System.out.println("a+b = "+(a+b));}
	//static �޼ҵ� ���ϰ� ����
	public static int car() {int sell=2500; return sell;}
	//static �޼ҵ� ���ϰ� ���� �Ű�����
	public static void color(String kind) {}
}// class Father end
public class Father {
	public static void main(String[] args) {
		Father ft = new Father();
		Father ft2 = new Father("�����ƺ�");
		Father ft3 = new Father("ū�ƺ�",52);
		String data = ft.bank();
		ft.house();
		int price = Father.car();
		ft.myCal(90,85);
//		System.out.println(ft.bank());
		System.out.println(data);
		System.out.println(ft.car());
		System.out.println("price "+price);
		
		System.out.println("���� �ƺ� �� ");
		System.out.println(ft2);
		System.out.println(ft2.bank());
		System.out.println(ft2.car());
	}//main end
}//class Test end
