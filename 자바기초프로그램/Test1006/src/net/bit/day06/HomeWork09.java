package net.bit.day06;

import java.util.Scanner;

public class HomeWork09 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = 0;
		while (true) {
			try {
				System.out.print("숫자입력 (1006 입력 종료)>>>"); // 1~10사이 숫자 입력

				number = Integer.parseInt(input.nextLine());
				if (number == 1006) {
					System.out.println("종료");
					break;
				} else if (1 <= number && number >= 10) {
					System.out.println("정수의 범위를 다시 입력하세요 (1~10)");
					continue;
				}
			} catch (Exception e) {
				System.out.println("정수가 아닙니다. 다시 실행하세요");				
				continue;
			}
			for (int i = 1; i <= number; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}
}
// 다시 숫자를 입력하세요 10 보다 크거나 1보다 작으면 다시 숫자 입력
// 정수만 입력 받아라 반복문
// emp 에서 이름, 도시입력 city  = sc.nextLine();
/*
 * int number = input.nextLine(); // 문법에서 int number = (int) input.nextLine();
 * // 문법에서
 *
 * int number = Integer.parseInt(input.nextLine());
 **/