package net.bit.day06;

import java.util.Scanner;

public class Emp01 {
	public static void main(String[] args) {
		String name = "��浿",  city="����";
		
		Scanner input = new Scanner(System.in);
		System.out.print("�̸� �Է� >>>");
		name = input.nextLine();
		System.out.print("���� �Է� >>>");
		city = input.nextLine();
		
		
		System.out.println();
		System.out.println("�̸�="+name+" ����="+city);
	}
}
