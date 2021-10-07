package net.bit.dat07;

import java.math.BigDecimal;

public class Casting03 {
	public static void main(String[] args) {
		// String Ŭ������ �̿��Ͽ� ���� 10(su1) ���� 20(su2)�� ���ϱ� ����
		String su1 = "10";
		String su2 = "20";
		System.out.println(su1 + su2); // ��°� : 1020  �� Concatenation(����, ����)
		
		int num1 = Integer.parseInt(su1); 	// ���� num1���� ���� 10�� ���� �� Wrapper Class
		int num2 = Integer.parseInt(su2); 	// ���� num2���� ���� 20�� ���� �� Wrapper Class
		System.out.println(num1 + num2); 	// ��°� : 30 �� Wrapper Class : String �� int
		System.out.println(Integer.parseInt(su1) + Integer.parseInt(su2));
		System.out.println();
		
		String su3 = "12.3";
		String su4 = "45.6";
		System.out.println(su3 + su4);		// ������°� : 12.345.6
		
		double num3 = Double.parseDouble(su3);
		double num4 = Double.parseDouble(su4);
		System.out.println(num3 + num4);	// ��°� : 57.900000000000006
		System.out.println();
		
		// �Ǽ�����(double Type) �� BigDecimal Class
		BigDecimal bNum1 = new BigDecimal(su3);
		BigDecimal bNum2 = new BigDecimal(su4);
		System.out.println(bNum1.add(bNum2));  // ��°� : 57.9
	} // main()
} // class