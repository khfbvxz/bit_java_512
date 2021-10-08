package net.bit.day08;

import java.util.Arrays;
import java.util.Scanner;

public class Bit04 {
	public static void main(String[] args) {
		// 배열은 선언만 해도 자동 초기화!
		// 2차원에 별 대입
		char[][] star = {{'*'},{'*','*'},{'*','*','*'},{'*','*','*','*'},{'*','*','*','*','*'},};
		int[][] data = {{1,2,3,4},{7,8,9},{10,11},{12}};
		for(char r []:star ) {
			for(char a :r) {
				System.out.print(a);
			}System.out.println();
		}
		for(int r []:data ) {
			for(int a :r) {
				System.out.print(a);
			}System.out.println();
		}
		
		for(int i = 0 ; i<star.length;i++) {
			for(int j = 0 ; j<star[i].length;j++) {
				System.out.print(star[i][j]+" ");
			}System.out.println();
		}
		
		for(int i = 0 ; i<data.length;i++) {
			for(int j = 0 ; j<data[i].length;j++) {
				System.out.print(data[i][j]+" ");
			}System.out.println();
		}
		
		
	}//main end
}// class End
