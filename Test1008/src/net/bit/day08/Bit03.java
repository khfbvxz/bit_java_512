package net.bit.day08;

import java.util.Scanner;

public class Bit03 {
	public static void main(String[] args) {
		// ���� ���� for�ݺ������� ����� �迭
//		String[] star = {"*","*","*","*","*","*","*","*","*","*"};
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�� ��� �� �� �Է� : ");
//		int n = sc.nextInt();
		char[][] star = {
				{'��'},
				{'��','��'},
				{'��','��','��'},
				{'*','*','*','*',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*','*'},
				{'*','*','*','*','*','*','*'}
		};
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j <star[i].length; j++) {
//				System.out.print("*");
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		for (char row[] : star) {
	         for (char r : row) {
	            System.out.print(r);
	         }
	         System.out.println();
	      }// for i END
	}
}
