package net.bit.day06;

import java.util.Scanner;

public class Emp {
	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		System.out.print("�޿� �Է� >>>");
//		int pay = input.nextInt();
		String pay = input.nextLine();
		System.out.print("�̸� �Է� >>>");
		String name = input.nextLine();
		
		
		System.out.println();
		System.out.println("�̸�="+name+" �޿�="+pay);
	}
}