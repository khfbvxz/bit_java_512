package net.bit.day06;

public class Bit07sj {

	public static void main(String[] args) {
		int kor = 50, eng = 85, hap = 0;
		double avg = 0.0;
		String msg = "";
//		String grade = "";
		char grade ;
		
		hap = kor + eng;
		avg = (double)hap/2.0;
		
		// ���� 1 ��� ���� 100~70 �� ���հ�  0~69�� �����
		// ���� 4 ��� ���� 70 �� ���� �հ�, ���� 60������ �հ� ������
		// ���� 6 ��� ������ ���� ���� ó�� 100~70 �� �հ�, 0~69 �� ����� ���� ����
//		String pass = (avg >=70)? "pass":"failed";
		if(avg>70) {msg = "�� �հ�";}
		else {msg = "�����";}
		
		//���� 6 
		double result = (avg>=70)? 0.7:0.1;
		
		// ���� 2 ��� 100~90 A   0 ~59 F swicth
		// ���� 5���� if ��� ��� ���� 100~90 �� A 80~ 89 B
		if (avg >=90 ) {grade = 'A';}
		else if (avg >=80 ) {grade = 'B';}
		else if (avg >=70 ) {grade = 'C';}
		else if (avg >=60 ) {grade = 'D';}
		else {grade = 'F';}
		
		
		System.out.println("���� = " + hap );
		System.out.println("��� = " + avg );
		System.out.println("���� = " + grade);
		System.out.println("��� = " + msg + " ������="+(result*avg) );
		System.out.printf("��� = %s ������=%.2f\n", msg ,(result*avg));

	}

}
