package net.bit.day06;

import java.util.Scanner;

public class Emp01 {
	public static void main(String[] args) {
		String name = "고길동",  city="서울";
		
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력 >>>");
		name = input.nextLine();
		System.out.print("지역 입력 >>>");
		city = input.nextLine();
		
		
		System.out.println();
		System.out.println("이름="+name+" 도시="+city);
	}
}
