package net.bit.dat07;

public class Test06String {
	public static void main(String[] args) {
		//https://docs.oracle.com/javase/7/docs/index.html    ==>�ڹ��÷�����������
		//https://docs.oracle.com/javase/7/docs/api/index.html ==> API����
		// char ����
		// �ڹٿ��� String Ŭ���� ����Ÿ��
		
		String a = "hello"; // ���� ���ϰ� ���� ����
		String b = new String("hello");
		char[] c = new char[] {'h','e','l','l','o'};
		String d = new String(c);
		String email = "kimtest123@bit.com";
		
		//���� 1 startsWith("kim") ���Կ���
		boolean ret1 = email.startsWith("kim");
		boolean ret2 = email.endsWith("com"); // gif, jpg, png , pdf 
		
		int ret4 = email.indexOf("123");
		int ret3 = email.indexOf("789"); // @ üũ ����
		System.out.println("���� �� �ּ� " + ret2);
		System.out.println("789���� ���Կ��� " + ret3);  // -1
		System.out.println("123���� ���Կ��� " + ret4);  // 7
		
		String jumin = "951230-2693485";
		//12�� 30�� �����̳׿� ��� subsring(���� , �� +1)
		String m = jumin.substring(2,3+1);
		String day = jumin.substring(4,6);
		System.out.println(m + "�� " + day + " �� ���� �̳׿�");
		
		String jend = jumin.substring(7); // ���� ��ġ�����ϸ� ������ ���
		System.out.println(jend);
		
		String juminLen1 = "951230"; //6�ڸ� ��
		String juminLen2 = "2693485"; //6�ڸ� ��
		
		// ���ڿ� ���� int size1 = juminLen1.length()
		int size1 = juminLen1.length();
		int size2 = juminLen2.length();
		System.out.println(size1);
		System.out.println(size2);
		//�ֹι�ȣ �ڸ��� üũ 
		if ( size1 !=6 || size2 != 7) {
			System.out.println("�ֹι�ȣ �ٽ� �Է»翡��");
		}
		else {
			System.out.println("������ �ֹι�ȣ�Դϴ�\n ���� �̿��� �����մϴ�.");
		}
		
	}
}