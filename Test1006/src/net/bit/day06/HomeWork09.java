package net.bit.day06;

import java.util.Scanner;

public class HomeWork09 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = 0;
		while (true) {
			try {
				System.out.print("�����Է� (1006 �Է� ����)>>>"); // 1~10���� ���� �Է�

				number = Integer.parseInt(input.nextLine());
				if (number == 1006) {
					System.out.println("����");
					break;
				} else if (1 <= number && number >= 10) {
					System.out.println("������ ������ �ٽ� �Է��ϼ��� (1~10)");
					continue;
				}
			} catch (Exception e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �����ϼ���");				
				continue;
			}
			for (int i = 1; i <= number; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}
}
// �ٽ� ���ڸ� �Է��ϼ��� 10 ���� ũ�ų� 1���� ������ �ٽ� ���� �Է�
// ������ �Է� �޾ƶ� �ݺ���
// emp ���� �̸�, �����Է� city  = sc.nextLine();
/*
 * int number = input.nextLine(); // �������� int number = (int) input.nextLine();
 * // ��������
 *
 * int number = Integer.parseInt(input.nextLine());
 **/