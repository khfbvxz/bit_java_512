package net.bit.day06;

public class HomeWork05 {
	public static void main(String[] args) {
		int kor = 90, eng = 85, hap = 0;
		double avg = 0.0;
		String msg = "";
		String grade = "";
		
		hap = kor + eng;
		avg = (double)hap/2.0;
		
		// ���� 1 ��� ���� 100~70 �� ���հ�  0~69�� ����� 
		if (avg<=100 && avg>=70) {msg="���հ�";}
		else {msg="�����";}
		// ���� 2 ��� 100~90 A   0 ~59 F swicth
		switch ((int)avg/10) {
		case 10: case 9 :grade = "A"; break;
		case 8:grade = "B"; break;
		case 7:grade = "C"; break;
		case 6:grade = "D"; break;
		default:grade = "F";
		}
		
		System.out.println("���� = " + hap );
		System.out.println("��� = " + avg );
		System.out.println("��� = " + msg );
		System.out.println("���� = " + grade);
	}
}// class END
