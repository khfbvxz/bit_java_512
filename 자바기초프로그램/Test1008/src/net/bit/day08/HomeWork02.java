package net.bit.day08;

import java.util.Scanner;

public class HomeWork02 {
	public static void main(String[] args) {
		// ��Ģ �Լ� �޼ҵ� ����x
		Scanner sc = new Scanner(System.in);
		boolean[] camp = new boolean[5];
		int sel = 9, num = 0;

		while (true) {
			System.out.println("1�����迭 ķ�ο���10��08�� �ݿ���");
			for (int i = 0; i < camp.length; i++) {
//			System.out.println(camp[i]);
				if (camp[i] == true) {
					System.out.println(" " + (i + 1) + "��° ��ķ������ ����Ǿ��ֽ��ϴ�.");
				} else {
					System.out.println(" " + (i + 1) + "��° ��ķ������ ����ֽ��ϴ�.");
				}
			} // for end
			System.out.print("\n1.����  2.���  3.����  9.����>>");
			sel = Integer.parseInt(sc.nextLine());
			if (sel == 9) {
				System.out.println("ķ���� �������α׷� �����մϴ�");
				break;
			}
			// if else ���� if
			switch (sel) {
			case 1:
				System.out.print("����ķ���� ��ȣ�� �Է��ϼ���");
				num = Integer.parseInt(sc.nextLine());
				try {
					if(camp[num-1]==true) {System.out.print("�̹� ����Ǿ� �ִ� ���Դϴ�\n\n");}
					else {camp[num-1]=true;System.out.printf("%d ������ ����Ǿ����ϴ�.\n",num);}
				}catch(Exception ex){System.out.print("���ȣ�� �߸� �Է��ϼ̽��ϴ�.\n\n");}
				break;
			case 2:
				System.out.println("����� ����ķ���� ��ȣ�� �Է��ϼ���");
				num = Integer.parseInt(sc.nextLine());
				try {
					if(camp[num-1]==false) {System.out.print("�̹� ����Դϴ�.\n\n");}
					else {camp[num-1]=false;System.out.printf("%d ������ ��ǵǾ����ϴ�.\n",num);}
				}catch(Exception ex){System.out.print("���ȣ�� �߸� �Է��ϼ̽��ϴ�.\n\n");}
				break;
			case 3:
				System.out.println("����ķ������ Ȯ���ϼ���");
				break;
			default:
				System.out.println("�Է� ����! �ٽ� �Է� �ϼ���");			
			}
		} // while end

		sc.close();
	}// main end
}// class End
