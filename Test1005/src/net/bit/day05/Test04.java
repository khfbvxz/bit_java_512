package net.bit.day05;

public class Test04 {
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
		// ���� 2 ��� 100~90 A   0 ~59 F
		if(avg<=100 && avg >=90) 
			grade = "A";
		else if(avg>=80)
			grade = "B";
		else if(avg>=70)
			grade = "C";
		else if(avg>=60)
			grade = "D";
		else 
			grade = "F";
		
		System.out.println("���� = " + hap );
		System.out.println("��� = " + avg );
		System.out.println("��� = " + msg );
		System.out.println("���� = " + grade);
	}
}// class END
