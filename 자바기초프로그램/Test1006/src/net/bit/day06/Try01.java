package net.bit.day06;

import java.util.Scanner;

public class Try01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("숫자입력>>>"); // 1~10사이 숫자 입력
		int number = input.nextInt();

		for(int i = 1; i<=number;i++) {
			System.out.print(i+" ");

		}

	}
}
// emp 에서 이름, 도시입력 city  = sc.nextLine();
/* int number = input.nextLine(); // 문법에서
*	int number = (int) input.nextLine(); // 문법에서
*
* int number = Integer.parseInt(input.nextLine());
**/