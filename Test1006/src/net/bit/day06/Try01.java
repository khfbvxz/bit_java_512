package net.bit.day06;

import java.util.Scanner;

public class Try01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�����Է�>>>"); // 1~10���� ���� �Է�
		int number = input.nextInt();

		for(int i = 1; i<=number;i++) {
			System.out.print(i+" ");

		}

	}
}
// emp ���� �̸�, �����Է� city  = sc.nextLine();
/* int number = input.nextLine(); // ��������
*	int number = (int) input.nextLine(); // ��������
*
* int number = Integer.parseInt(input.nextLine());
**/