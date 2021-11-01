package net.bit.day12;

import java.util.Scanner;

public class HomeWork02 {
	static Scanner sc = new Scanner(System.in);
	static boolean[] camp = new boolean[5]; // �迭�� newŰ���� �����ϸ� false �ڵ��ʱ�ȭ
	static int sel = 9, num = 0;

	public static void main(String[] args) {
		list(); // camp���� ���� �Լ�ȣ��

		while (true) {
			sel = menu();	
			if(sel==1) {	
				checkIn();
				list(); // camp���� ���� �Լ�ȣ��
			}
			else if(sel==2) {
				checkOut();
				list(); // camp���� ���� �Լ�ȣ��	
			}
			else if(sel==3) {
				list(); // camp���� ���� �Լ�ȣ��
			}
			else if(sel==9) {
				myExit();
				break;
			}else {}
			
		} // while end

		sc.close();
	}// main end

	public static int menu() { // 10��12�� ȭ���� 3���ÿ� �߰�
		System.out.print("\n1.����  2.���  3.����  9.����>>> ");
		int mysel = Integer.parseInt(sc.nextLine());
		return mysel;
	}// end

	public static void myExit() {
		System.out.println("ķ���������α׷��� �����մϴ�");
		System.exit(1);
	}// end

	public static void list() {
		for (int i = 0; i < camp.length; i++) {
			if (camp[i] == true) {
				System.out.println(" " + (i + 1) + "��° ��ķ������ ������Դϴ�");
			} else {
				System.out.println(" " + (i + 1) + "��° ��ķ������ ����ֽ��ϴ�");
			}
		} // for end
	}// end

	public static void checkIn() {
		System.out.print("����ķ�����ȣ �Է�>>>");
		num = Integer.parseInt(sc.nextLine());
		if (num < 1 || num > 5) {
			System.out.println(num + "��ȣ�� ����Ҽ� �����ϴ�");
		}
		if (camp[num - 1] == true) {// ����� �����3�Է��ϸ� �����迭�� 3-1
			System.out.println("�̹� ����� ķ�����̶� �����Ҽ� �����ϴ�\n");
		} else { // �̻���̶� ���డ��
			System.out.println("camp[" + num + "]ķ���� ���� �����߽��ϴ�\n");
			camp[num - 1] = true;
		}
	}// end

	public static void checkOut() {
		System.out.print("���ķ�����ȣ �Է�>>>");
		num = Integer.parseInt(sc.nextLine());
		if (num < 1 || num > 5) {
			System.out.println(num + "��ȣ�� ����Ҽ� �����ϴ�");
		}
		if (camp[num - 1] == true) {// ��Ǽ���
			System.out.println("camp[" + num + "]ķ���� ��� �����߽��ϴ�\n");
			camp[num - 1] = false;
		} else {
			System.out.println("camp[" + num + "]ķ���� ��� �ֽ��ϴ�\n");
		}
	}// end

}// class End
