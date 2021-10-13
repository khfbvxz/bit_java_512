package net.bit.dat07;

public class Casting01 {
	public static void main(String[] args) {
		int a = 10;	// ������ ���� a�� �����ϰ�, ��(10)�� �Ҵ� �� �ʱ�ȭ
		double b;	// �Ǽ��� ���� b�� ���� �� ����
		b = a;		// ���� a�� ���� ���� b�� �Ҵ�
		//�ڵ� ����ȯ : ���� Ÿ�� (int)�� ū Ÿ��(double)���� �ڵ����� ��ȯ �� ������ ����ȯ. UpCasting
		System.out.println("���� a�� �� : " + a);
		System.out.println("���� b�� �� : " + b);
		
		int c;				// ������ ���� c�� ���� �� ����
		double d = 34.5;	// �Ǽ��� ���� d�� �����ϰ� ��(34.5)�� �Ҵ� �� �ʱ�ȭ
		//c = d;				// ���� : ū Ÿ��(double)�� ���� Ÿ��(int)�� �Ҵ�
		c = (int)d;			// ���� ����ȯ (double �� int) �� ������ ����ȯ, DownCasting, �Ϲ����� �ǹ��� Casting
		System.out.println("���� c�� �� : " + c);	// ��°� : 34 �� 0.5�� �ս� �߻�
		System.out.println("���� d�� �� : " + d);	// ��°� : 34.5
		
		int x = 128;
		byte y = (byte)x;	// ���� ����ȯ (int �� byte)
		System.out.println("���� x�� �� : " + x);	// ��°� : 128 
		System.out.println("���� y�� �� : " + y);	// ��°� : -128
		
		char i = 'A';
		int j = i;	// �ڵ� ����ȯ (char �� int)
		System.out.println("���� i�� �� : " + i);	// ��°� : A
		System.out.println("���� j�� �� : " + j);	// ��°� : 65 �� ASCII �ڵ尪
		System.out.println("���� j�� �� : " + (char)j); // ��°� : A �� ���� ����ȯ(int �� char)
	} // main()
} // class END