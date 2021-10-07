package net.bit.day06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork0911 {
//	public static void main(String[] args) { // 강사님꺼 1
//		Scanner input = new Scanner(System.in);
//		int number = 0;
//		while (true) {
//			System.out.print("숫자입력 (100 입력 종료)>>>"); // 1~10사이 숫자 입력
//
//			number = input.nextInt();
//			if (number < 1 || number > 10) {
//				System.out.println("1~10 사이의 숫자를 입력하세요\n");
//				continue;
//			}
//			break;
//		} // while end
//		for (int i = 1; i <= number; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//	}
//}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		while (true) {
			try {
				System.out.print("숫자입력 (100 입력 종료)>>>"); // 1~10사이 숫자 입력
				number = Integer.parseInt(input.nextLine());
			} catch (Exception e) {
				System.out.println("정수 숫자를 입력");
			}
			if (number < 1 || number > 10) {
				System.out.println("1~10 사이의 숫자를 입력하세요\n");
				continue;
			}
			break;
		} // while end
		for (int i = 1; i <= number; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}