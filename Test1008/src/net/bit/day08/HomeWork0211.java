package net.bit.day08;

import java.util.Scanner;

public class HomeWork0211 {
	public static void main(String[] args) {
		// ��Ģ �Լ� �޼ҵ� ����x  ����� 
		Scanner sc = new Scanner(System.in);
		boolean[] camp = new boolean[5];
		int sel = 9, num = 0;
		System.out.println("1�����迭 ķ�ο���10��08�� �ݿ���");
		for (int i = 0; i < camp.length; i++) {
//			System.out.println(camp[i]);
			if (camp[i] == true) {
				System.out.println(" " + (i + 1) + "��° ��ķ������ ����Ǿ��ֽ��ϴ�.");
			} else {
				System.out.println(" " + (i + 1) + "��° ��ķ������ ����ֽ��ϴ�.");
			}
		} // for end

		while (true) {
			System.out.print("\n1.����  2.���  3.����  9.����>>");
			sel = Integer.parseInt(sc.nextLine());
			if (sel == 9) {
				System.out.println("ķ���� �������α׷� �����մϴ�");
				break;
			}
			// if else ���� if
			switch (sel) {
			case 1:
				System.out.print("����ķ���� ��ȣ�� �Է��ϼ���>");
				num = Integer.parseInt(sc.nextLine());
				if(num<1 || num>5) {System.out.println(num+"��ȣ�� ����� �� �����ϴ�.");}
				if(camp[num-1]==true) {// �����
					System.out.println("�̹� ����Ǿ��ֽ��ϴ�.");
				}else { // �̻���̶� ���డ�� ��
					System.out.println("camp["+num+"]ķ���� ���� �����߽��ϴ�.\n");
					camp[num-1]=true;
				}
				for (int i = 0; i < camp.length; i++) {
//					System.out.println(camp[i]);
					if (camp[i] == true) {
						System.out.println(" " + (i + 1) + "��° ��ķ������ ����Ǿ��ֽ��ϴ�.");
					} else {
						System.out.println(" " + (i + 1) + "��° ��ķ������ ����ֽ��ϴ�.");
					}
				} // for end
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
				for (int i = 0; i < camp.length; i++) {
//					System.out.println(camp[i]);
					if (camp[i] == true) {
						System.out.println(" " + (i + 1) + "��° ��ķ������ ����Ǿ��ֽ��ϴ�.");
					} else {
						System.out.println(" " + (i + 1) + "��° ��ķ������ ����ֽ��ϴ�.");
					}
				} // for end
				break;
			default:
				System.out.println("ķ���� �������α׷� �����մϴ�.");
				System.exit(1);
				break;
			}//switch end
		} // while end

		sc.close();
	}// main end
}// class End
