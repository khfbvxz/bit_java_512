package net.bit.day06;

import java.util.Scanner;

public class Emp03jumin {
	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);
		System.out.print("�̸� �Է� >>>");
		int jumin = input.nextInt();
		// ����ó�� �� ���!! ����ó�� �Ф�
		// ����ó�� 1 
//		try {
		System.out.println("����� �ֹι�ȣ�� "+jumin+" �Դϴ�." );
		input.close();

		System.out.println();
			int dan = 7 ;
			for(int i = 1; i<10;i++) {
				System.out.println(jumin + "*"+i+"="+(dan*i));
				try{Thread.sleep(300);}catch(Exception ex) {}
//				Thread.sleep(300);
			}
		System.out.println();
		System.out.println("��Ʈķ��");
		System.out.println("�츮����");
		System.out.println("�ݼ�����");
	}
}