package net.bit.dat07;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork02 {
	public static void main(String[] args) {
		int[] arr = {1,4,5,8,3,7,9,2,6}; // �迭 �����ϰ� ���� �� �Ҵ�
		int oddSum = 0 , evenSum = 0 ; //����� ����� ������ �ʱ�ȭ
		
		//���� Ȧ���� �հ� , ¦���� �հ�
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
		
		System.out.println("Ȧ���� �հ� = " + oddSum);
		System.out.println("¦���� �հ� = " +evenSum);
	}// main end
}// class end
