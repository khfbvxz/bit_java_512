package net.bit.dat07;

import java.util.Stack;

public class Test04 {
	public static void main(String[] args) {
		// ù��° int ���� 6�� ���� �� �� ����
		int a = 15, b = 54, c = 73, d = 34, e = 48, f = 47;
		String city1 = "���ֵ�";
		String city2 = "������";
		String city3 = "�緮��";
		String city4 = "���ǵ�";
		String city5 = "������";
		String city6 = "����";
		/*
		 * �迭�� ���� ���� [] �迭�� = new Ÿ�� [ũ��] 
		 * �迭 �ʱ� Ÿ�� [] �迭�� = {�ʱⰪ ����}  
		 * �迭 �ʱ� ���� [] �򿭸� = new Ÿ��[]{�ʱⰪ ����} 
		 *�迭�� ���� Ÿ������ ���� �迭�� ÷�ڽ��� [0]
		 *qjsWo �迭�� length 
		 *�迭 ��� for, foreach (
		 * �迭�������ϴ� Ŭ���� java.util.Arrays ��� ������
		 * �迭�� ũ�������� �����ϸ� �ڵ� �ʱ�ȭ  �ڹ� ���� 13~14 ������ 
		 */
		int[] lotto = new int[6];
		boolean[] camp = new boolean[6];
		double[] avg = new double[6];
		String[] city = new String[6];
		Test01[] tt = new Test01[6]; // class Ÿ���� �������̶�� �մϴ�. �������� �ʱ�ȭ null
		System.out.println("�迭�� �ʱ�ȭ Ȯ��");
//		for(int i = 0 ; i<lotto.length ; i++) {System.out.print(lotto[i] + " ");}
//		for(int i = 0 ; i<camp.length ; i++) {System.out.print(camp[i] + " ");}
//		for(int i = 0 ; i<avg.length ; i++) {System.out.print(avg[i] + " ");}
//		for(int i = 0 ; i<city.length ; i++) {System.out.print(city[i] + " ");}
		for(int i = 0 ; i<tt.length ; i++) {System.out.print(tt[i] + " ");}
		
		
	} // main END
} // class END