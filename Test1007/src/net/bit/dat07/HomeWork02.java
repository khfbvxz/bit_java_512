package net.bit.dat07;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork02 {
	public static void main(String[] args) {
		int[] arr = {1,4,5,8,3,7,9,2,6}; // 배열 선언하고 동시 값 할당
		int oddSum = 0 , evenSum = 0 ; //결과가 저장될 변수를 초기화
		
		//문제 홀수의 합계 , 짝수의 합계
//		Arrays.sort(arr);
		for(int temp:arr) {
			System.out.print(temp + " ");
		}System.out.println();
		
//		System.out.println(Arrays.toString(arr));
		
//		System.out.println("-----------");
		for(int temp : arr) {
			if(temp%2==0) { evenSum+=temp;}
			else {oddSum+=temp;}
		}
		
		System.out.println("홀수의 합계 = " + oddSum);
		System.out.println("짝수의 합계 = " +evenSum);
	}// main end
}// class end
