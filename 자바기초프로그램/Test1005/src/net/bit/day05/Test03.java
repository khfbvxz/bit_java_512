package net.bit.day05;

public class Test03 {
	public static void main(String[] args) {
		int kor = 90, eng = 85, hap = 0;
		double avg = 0.0;
		String name = "����";
		String mesege = "";
		
		hap = kor + eng;
		avg = (double)hap/2.0;
		
		// ���� 1 ��� ���� 100~70 �� ���հ�  0~69�� ����� 
		if (avg<=100 && avg>=70) {
			mesege="�� �� ��";
		}
		else {
			mesege=" ����� ";
		}
		System.out.println(" ========== test03.java=========");
		System.out.print("�̸� = " + name + "\n");
		System.out.print("���� = " + kor + "\n");
		System.out.print("���� = " + eng + "\n");
		System.out.print("���� = " + hap + "\n");
		System.out.print("��� = " + avg + "\n");
		System.out.print("��� = " + mesege +"\n");
		
	}
}// class END
