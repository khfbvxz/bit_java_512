package net.bit.dat07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test01 {
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
		 *�迭�� ���� Ÿ������ ���� �迭�� ÷�ڽ��� [0]qjsWo �迭�� length �迭 ��� for, foreach �迭��
		 * �����ϴ� Ŭ���� java.util.Arrays
		 */
		int[] lotto = new int[6];
		lotto[0] = 23;
		lotto[1] = 45;
		lotto[2] = 9;
		lotto[3] = 16;
		lotto[4] = 31;
		lotto[5] = 27;

		String[] city = { "���ֵ�", "������", "�緮��", "���ǵ�", "������", "����" };
		String[] title = new String[] { "�Խ���", "����", "�α���" };
		int[] number = { 23, 45, 9 };
//		System.out.println("lotto�迭 ���� "+ lotto.length);
//		System.out.println("title�迭 ���� "+ title.length);
		for (int i = 0 ; i<lotto.length;i++) {
			System.out.print(lotto[i] + " ");
		}System.out.println();
		
		Arrays.sort(lotto);
		for (int i = 0 ; i<lotto.length;i++) {
			System.out.print(lotto[i] + " ");
		}System.out.println();
		
		System.out.println("-------------------------");
		for(int temp : lotto) {
			System.out.print(temp + " ");
		}System.out.println();

		
	} // main END
}
