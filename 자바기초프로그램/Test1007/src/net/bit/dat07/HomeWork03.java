package net.bit.dat07;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork03 {
	public static void main(String[] args) {
		// startsWith  endsWith indexOf length  substring
		String jumin = "951230-2693485";
		
		//substring() 이용 for 이용
		String frist = jumin.substring(0,7);
		String second = jumin.substring(0,8);
		System.out.print(frist);
		for(int i=0;i<(jumin.length()-frist.length());i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(second);
		for(int i=0;i<(jumin.length()-second.length());i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("==============");
		System.out.println("951230-*******");
		System.out.println("951230-2******");
		
		/// 강사님 풀이

		 
		String display = jumin.substring(7,8);
		for(int i = 8 ; i<jumin.length() ; i++) {
			display+="*";
		}
		System.out.println(jumin.substring(0,7)+display);
	}
}// class end
