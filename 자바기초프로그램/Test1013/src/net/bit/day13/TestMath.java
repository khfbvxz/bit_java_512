package net.bit.day13;

public class TestMath {
	public static void main(String[] args) {
		double a=4.7, b=9.1, c=67.824, d=67.825;
		
		System.out.println(Math.round(a)+"\t"+Math.round(b));
		System.out.println(Math.ceil(a)+"\t"+Math.ceil(b));
		System.out.println(Math.floor(a)+"\t"+Math.floor(b));
		System.out.println();
		
		c=67.824; d=67.825;
		System.out.printf("c = %f \n",c);
		System.out.printf("d = %f \n",d);
		
		int i = 3, j=5;
		// int �ڷ����� �ڵ����� double �Ǽ� ����. 
//		System.out.println("pow �Լ�" + Math.pow(i, 2));
//		System.out.println("pow �Լ�" + Math.pow(i, 2));
//		System.out.println("pow �Լ�" + Math.pow(i, 3));
//		System.out.println("pow �Լ�" + Math.pow(j, 4));
		System.out.println("pow �Լ�" + (int)Math.pow(i, 2));
		System.out.println("pow �Լ�" + (int)Math.pow(j, 2));
		System.out.println("-------------------------------");
		System.out.println("sqrt �Լ� "+ (int)Math.sqrt(9));
		System.out.println("sqrt �Լ� "+ (int)Math.sqrt(25));
		System.out.println("-------------------------------");
		System.out.println("abs �Լ� "+ Math.abs(-34));
		System.out.println("abs �Լ� "+ Math.abs(-23));
		
		// �迭�� ũ�� ���� , ���� Ÿ�� 
		
		String[] city = new String[5];
		TestLotto[] tt = new TestLotto[5];
		for(int k =0;k<5;k++) {
			System.out.println(city[i]);
		}
	}
}
