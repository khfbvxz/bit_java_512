package net.bit.day13;
import java.util.Random;
import java.io.FileReader;

public class Father {
	private int pwd; // �������� = filed= �ʵ�
	
	public Father() {}// �⺻ ������
	public Father(String name) {
		System.out.println(name + " �������Դϴ�.");
	} // ������
	public Father(String name , int age) {
		System.out.println(name+"�Դϴ�. ���̴�"+age);
	}
	public String bank(double d) {return "��������";}
	public void house() {}
	public void myCal(int a, int b) {System.out.println(a+" "+b +" = "+(a+b));}
	public static int cal() {return 2400;}
	public static void color(String kind) {System.out.println(kind);}
	
}//Father class end
