package net.bit.day08;

import java.util.Scanner;

public class Bit02 {
	public static void main(String[] args) {
		// 문제 이중 for반복문으로 별출력  배열
//		String[] star = {"*","*","*","*","*","*","*","*","*","*"};
//		Scanner sc = new Scanner(System.in);
//		System.out.print("별 출력 줄 수 입력 : ");
//		int n = sc.nextInt();
		for(int i = 0 ; i<5;i++) {
			for(int j =0 ; j<=i;j++) {
				System.out.print("*");
			}System.out.println();
			}	
	}
}
